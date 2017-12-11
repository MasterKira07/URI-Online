coordenadas = input()
coordenadas = coordenadas.split()
coordenadas[0] = float(coordenadas[0])
coordenadas[1] = float(coordenadas[1])

if(coordenadas[0] > 0 and coordenadas[1] > 0):
    print("Q1")
elif(coordenadas[0] < 0 and coordenadas[1] > 0):
    print("Q2")
elif(coordenadas[0] < 0 and coordenadas[1] < 0):
    print("Q3")
elif(coordenadas[0] > 0 and coordenadas[1] < 0):
    print("Q4")
elif(coordenadas[0] == 0 and coordenadas[1] != 0):
    print("Eixo Y")
elif(coordenadas[0] != 0 and coordenadas[1] == 0):
    print("Eixo X")

else:
    print("Origem")
