def qtd_carry(primeiro, segundo):
    qtd = 0
    if(len(primeiro) < len(segundo)):
        primeiro,segundo = segundo,primeiro
    for i in range(primeiro-1,-1,-1):
        if(int(primeiro[i]) + int(segundo[i]) >= 10):
            
            qtd += 1
    if(qtd == 0):
        return "No carry operation."
    elif(qtd == 1):
        return "1 carry operation."
    else:
        return str(qtd) + " carry operations."


while(True):
    valores = input()
    valores = valores.split()
    if(valores[0] != "0" or valores[1] != "0"):
        print( qtd_carry(valores[0], valores[1]) )
    else:
        break
