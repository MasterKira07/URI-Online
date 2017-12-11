valores = input()
lista = []
for i in valores.split():
    lista.append(float(i))
delta = lista[1] ** 2 - 4 * lista[0] * lista[2]
if(delta > 0 and lista[0] != 0):
    from math import sqrt
    r1 =  (-  lista[1] + sqrt(delta))/ (lista[0] * 2)
    r2 =  (-  lista[1] - sqrt(delta))/ (lista[0] * 2)
    print("R1 =","%.5f" %r1)
    print("R2 =","%.5f" %r2)
else:
    print("Impossivel calcular")
