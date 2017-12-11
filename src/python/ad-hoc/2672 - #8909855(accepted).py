def separar_ip_mascara(valor):
    """Função sera a um string que conte o ip e a mascara
    e os separa em uma lista e essa lista é retornada, ele aceita
    a mascara x.x.x.x e /x """
    index = valor.find(" ")
    lista = 0
    if(index >= 0):
        lista = valor.split()
    else:
        lista = valor.split("/")
    return lista

def dec_bin(decimal):
    """funçãoConverte Decimal em binario"""
    binario = ""
    for i in range(8):
        binario += str(decimal % 2)
        decimal //= 2
    return binario[::-1]

def bin_dec(binario):
    """função Converte binario em decimal"""
    decimal = 0
    multiplicador = 1
    for i in binario[::-1]:
        decimal += int(i) * multiplicador
        multiplicador *= 2
    return decimal
    
    
def converte_endereco_binario(mascara):
    """Função ira converte um bloco de 32bits em numeros binario tbm
    aceita uma mascara no formato /x  e retorna em blocos 32 bits
    xxxxxxxx.xxxxxxxx.xxxxxxxx.xxxxxxxx
    """
    index = mascara.find(".")
    if(index >= 0):
        lista = mascara.split(".")
        mascara = ""
        for i in range(len(lista)):
            mascara += dec_bin(int(lista[i]))
    else:
        valor = int(mascara)
        mascara = ""
        for i in range(32):
            if(valor > 0):
                mascara += "1"
            else:
                mascara += "0"
            valor -= 1
    return bloco_8bits(mascara)

def bloco_8bits(binario):
    """Separa os 32 bits recebidos em 4 Bytes separados com . e retorna
    o bloco """
    palavra = ""
    inicio = 0
    fim = 8
    for i in range(4):
        palavra += binario[inicio:fim]
        if(fim < 32):
            palavra += "."
        inicio,fim = fim,fim + 8
    return palavra


def converte_binario_ip(ip_binario):
    ip = ""
    lista = ip_binario.split(".")
    for i in range(4):
        ip += str(bin_dec(lista[i]))
        if(i < 3):
            ip += "."
    return ip
        
def calcular_ip_rede(ip,mascara):
    ip_binario = converte_endereco_binario(ip).split(".")
    mascara_binario = converte_endereco_binario(mascara).split(".")
    ip_rede = ""
    for i in range(4):
        for j in range(8):
            ip_rede += str(int(mascara_binario[i][j]) and int(ip_binario[i][j]))
        ip_rede += "."
    ip_rede = converte_binario_ip(ip_rede)
    return ip_rede

def calcular_broadcast(ip,mascara):
    ip_binario = converte_endereco_binario(ip).split(".")
    mascara_binario = converte_endereco_binario(mascara).split(".")
    ip_rede = ""
    for i in range(4):
        for j in range(8):
            ip_rede += "1" if(not int(mascara_binario[i][j]) or int(ip_binario[i][j])) else "0"
        ip_rede += "."
    ip_rede = converte_binario_ip(ip_rede)
    return ip_rede
def qtd_repeticoes(caractere,palavra):
    qtd = 0
    for i in palavra:
        if(caractere == i):
            qtd += 1
    return qtd
def calcular_maquinas(mascara):
    mascara = converte_endereco_binario(mascara)
    return  2 ** qtd_repeticoes("0",mascara) - 2

while True:
    try:
       valor = input()
       valor = separar_ip_mascara(valor);
       print("Endereco de rede:",calcular_ip_rede(valor[0],valor[1]))
       print("Endereco de broadcast:",calcular_broadcast(valor[0],valor[1]))
       print("Numero de maquinas:",calcular_maquinas(valor[1]))
       print()
    except EOFError:
        break
