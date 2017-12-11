qtd = int(input())
numeros = []
for i in range(qtd):
   numeros.append(int(input()))
numeros.sort()
pares = []
impares = []
for i in numeros:
    if(i % 2 == 0):
        pares.append(i)
    else:
        impares.append(i)
for i in pares:
    print(i)
index = -1    
for i in impares:
    print(impares[index])
    index -= 1
