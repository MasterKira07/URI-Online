valores = input()
valores = valores.split()
maior = ( int(valores[0]) + int(valores[1]) + abs(int(valores[0]) - int(valores[1])))/2
maior = ( maior + int(valores[2]) + abs(maior - int(valores[2])))/2
print(int(maior),"eh o maior")
