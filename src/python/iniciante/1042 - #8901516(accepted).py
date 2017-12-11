def insertion_sort(lista):
    for i in range(len(lista)):
        for j in range(len(lista[:i]),0,-1):
            if(lista[i] < lista[i-1]):
                lista[i-1],lista[i] = lista[i],lista[i-1]
                i -= 1
            else:
                break
    return lista      
def exibir(lista):
    for i in lista:
        print(i)

valores = input()
valores = valores.split()
for i in range(len(valores)):
    valores[i] = int(valores[i])
exibir(insertion_sort(valores[:]))
print()
exibir(valores)
