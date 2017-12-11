valores = input()
valor1 = int(valores.split()[0])
valor2 = int(valores.split()[1])
precos  = [4.00,4.50,5.00,2.00,1.50]
total = precos[valor1 - 1] * valor2
print("Total: R$ %.2f" %total)
