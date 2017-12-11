valores1 = input()
valores2 = input()
valores1 = valores1.split()
valores2 = valores2.split()
from math import sqrt
distancia = sqrt((float(valores2[0]) - float(valores1[0])) ** 2 + (float(valores2[1]) - float(valores1[1])) ** 2)
print("{0:.4f}".format(distancia))
