def deslocar_letras(palavra):
    nova_palavra = ""
    for i in palavra:
        if((ord(i) >= 65 and ord(i) <= 90) or (ord(i) >= 97 and ord(i) <= 122)):
            nova_palavra += chr(ord(i) + 3)
        else:
            nova_palavra += i
    return nova_palavra

def delocar_esquerda(palavra):
    nova_palavra = palavra[:int(len(palavra)/2)]
    for i in palavra[int(len(palavra)/2):]:
        nova_palavra += chr(ord(i) -1)
    return nova_palavra

def criptografar(palavra):
    palavra = deslocar_letras(palavra)
    palavra = palavra[::-1]
    return delocar_esquerda(palavra)

qtd = int(input())
lista = []
for i in range(qtd):
    lista.append(criptografar(input()))
for i in lista:
    print(i)
