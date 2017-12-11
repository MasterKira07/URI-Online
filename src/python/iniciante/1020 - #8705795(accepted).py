def converte(lista,dias):
    valores = []
    for i in lista:
        valor = dias // i
        dias %= i
        valores.append(valor)
    valores.append(dias)
    return valores

dias = int(input())
lista = [365,30] 
con = converte(lista,dias)
print("%i ano(s)" %con[0])
print("%i mes(es)" %con[1])
print("%i dia(s)" %con[2])
