def cifra_cesar(palavra,saltos):
    nova_palavra = ""
    for i in palavra:
        valor_ascii = ord(i) - saltos
        if(valor_ascii < 65):
            valor_ascii = 91 - (65 - valor_ascii)
        nova_palavra += chr(valor_ascii)
    return nova_palavra

qtd = int(input())
for i in range(qtd):
    palavra = input()
    saltos = int(input())
    print(cifra_cesar(palavra,saltos))
