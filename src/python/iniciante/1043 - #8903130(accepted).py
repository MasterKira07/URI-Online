numeros = input()
numeros = numeros.split()
for i in range(len(numeros)):
    numeros[i] = float(numeros[i])

if(abs(numeros[1]-numeros[2]) < numeros[0] and numeros[0] < numeros[1]+numeros[2]):
    print("Perimetro = %.1f" %(numeros[0] + numeros[1] +numeros[2]))
else:
    print("Area = %.1f" %(((numeros[0] + numeros[1]) * numeros[2])/2))
