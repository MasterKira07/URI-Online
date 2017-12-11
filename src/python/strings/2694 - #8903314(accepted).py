def descartar_letras(lista):
    """A função descarta todos as letras da palavra(lista) e faz
    a jconcatenação dos numeros que estao juntos e retorna um nova lista com
    os numeros que pertecem a palavra(lista)"""
    nova_lista = []
    numero = ""
    chave = False
    for i in range(len(lista)):
        if(ord(lista[i]) >= 48 and  ord(lista[i]) <= 57):
            numero += lista[i]
            chave = True
            if((len(lista) - 1) != i):
                continue
        if(chave):
            nova_lista.append(int(numero))
            numero = ""
            chave = False
    return nova_lista

def somar_lista(lista):
    soma = 0
    for i in lista:
        soma += i
    return soma
qtd = int(input())
valores = []
for i in range(qtd):
    valores.append(input())
    valores[i] = somar_lista(descartar_letras(valores[i]))
for i in valores:
    print(i)
