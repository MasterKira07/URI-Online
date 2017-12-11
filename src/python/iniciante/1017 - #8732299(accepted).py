def cal_menor_num(lista,valor):
    lista_valores = []
    for i in lista:
        valor = round(valor,2)
        quantidade = valor // i
        valor %= i
        lista_valores.append(int(quantidade))
    return [lista_valores,valor]

def exibir(lista):
    print("NOTAS:")
    print("%i nota(s) de R$ 100.00" %lista[0])
    print("%i nota(s) de R$ 50.00" %lista[1])
    print("%i nota(s) de R$ 20.00" %lista[2])
    print("%i nota(s) de R$ 10.00" %lista[3])
    print("%i nota(s) de R$ 5.00" %lista[4])
    print("%i nota(s) de R$ 2.00" %lista[5])
    print("MOEDAS:")
    print("%i moeda(s) de R$ 1.00" %lista[6])
    print("%i moeda(s) de R$ 0.50" %lista[7])
    print("%i moeda(s) de R$ 0.25" %lista[8])
    print("%i moeda(s) de R$ 0.10" %lista[9])
    print("%i moeda(s) de R$ 0.05" %lista[10])
    print("%i moeda(s) de R$ 0.01" %lista[11])

valor = float(input())
lista_notas = [100,50,20,10,5,2,1]
retorno =  cal_menor_num(lista_notas,valor)
# Foi multiplicado as moedas por 100 para facilitar o calculo no metodo cal_meno_num
lista_moedas = [50,25,10,5,1]
retorno2 = cal_menor_num(lista_moedas,retorno[1] * 100)
exibir(retorno[0] + retorno2[0])
