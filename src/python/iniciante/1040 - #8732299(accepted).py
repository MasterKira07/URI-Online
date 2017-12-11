numeros = input()
numeros = numeros.split()
media = (float(numeros[0]) * 2 + float(numeros[1])* 3 + float(numeros[2]) * 4 + float(numeros[3]))/10
print("Media: %.1f" %media)
if(media < 5.0):
    print("Aluno reprovado.")
elif(media >= 7.0):
    print("Aluno aprovado.")
else:
    print("Aluno em exame.")
    nota = float(input())
    print("Nota do exame:",nota)
    nova_media = (media + nota) / 2
    if(nova_media >= 5.0):
        print("Aluno aprovado.")
    else:
        print("Aluno reprovado.")
    print("Media final: %.1f" %nova_media)
