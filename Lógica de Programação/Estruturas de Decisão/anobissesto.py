ano = int(input("Ano: "))
div4 = ano%4 == 0 
div100 = ano%100 == 0 
div400 = ano%400 == 0 

if div400 or div4 and not div100:
    print("É bissesto")
else: 
    print("Não é bissesto")