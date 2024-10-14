dia = int(input("Dia: "))
mes = int(input("Mês: "))
ano = int(input("Ano: "))

if mes > 12:
    print("Data inválida!")
elif (mes == 1 or mes==3 or mes==5 or mes==7 or mes==8 or mes==10 or mes==12):
    if dia > 31: 
        print("Data inválida!")
    else:
        print("Data válida")
elif (mes==4 or mes==6 or mes==9 or mes==11):
    if dia > 30:
        print("Data Inválida!")
    else:
        print("Data válida")
else: #fevereiro
    if ano%400==0 or (ano%4==0 and ano%100==0): 
        if dia>29:
            print("Data inválida!")
    else:
        if dia>28:
            print("Data inválida!")
        else:
            print("Data válida")