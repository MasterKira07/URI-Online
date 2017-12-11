def converte(lista,segundos):
    valores = []
    for i in lista:
        valor = segundos // i
        segundos %= i
        valores.append(valor)
    valores.append(segundos)
    return valores

segundos = int(input())
lista = [3600,60] 
con = converte(lista,segundos)
print("%i:%i:%i" %(con[0],con[1],con[2]))
