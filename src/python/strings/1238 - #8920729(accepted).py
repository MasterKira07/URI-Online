def juntar_palavras(primeira, segunda):
    tam_pri, tam_sec = len(primeira), len(segunda)
    maior_palavra = ""
    menor_qtd = 0
    if( tam_pri > tam_sec ):
        menor_qtd = tam_sec
        maior_palavra = primeira[menor_qtd:]
    else:
        menor_qtd = tam_pri
        maior_palavra = segunda[menor_qtd:]
    nova_palavra = ""
    for i in range(menor_qtd):
        nova_palavra += primeira[i] + segunda[i]
    nova_palavra += maior_palavra
    return nova_palavra

    
qtd = int(input())
for i in range( qtd ):
    palavras = input().split()
    print( juntar_palavras( palavras[0], palavras[1] ))
