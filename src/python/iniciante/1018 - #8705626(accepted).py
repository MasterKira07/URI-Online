def cal_notas(lista,valor):
    qtd_notas = []
    for i in lista:
        notas = valor // i
        valor %= i
        qtd_notas.append(notas)
    return qtd_notas

def exibir(notas):
    print("%i nota(s) de R$ 100,00" %notas[0])
    print("%i nota(s) de R$ 50,00" %notas[1])
    print("%i nota(s) de R$ 20,00" %notas[2])
    print("%i nota(s) de R$ 10,00" %notas[3])
    print("%i nota(s) de R$ 5,00" %notas[4])
    print("%i nota(s) de R$ 2,00" %notas[5])
    print("%i nota(s) de R$ 1,00" %notas[6])

valor = int(input())
notas = [100,50,20,10,5,2,1]
qtd_notas = cal_notas(notas,valor)
print(valor)
exibir(qtd_notas)
