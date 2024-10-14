dia = int(input("Digite o dia: "))
mes = int(input("Digite o mês: "))
ano = int(input("Digite o ano: "))

if dia > 31:
    print("Insira um dia válido")
elif mes > 12:
    print("Insira um mês válido")


elif dia >= 30 and mes==2:
    print("Sua data é inválida.")
elif (ano%400==0 or(ano%4==0 and not ano%100==0)) and (dia<=29 and mes==2):
    print("Seu ano é válido e bissesto!")
elif not (ano%400==0 or(ano%4==0 and not ano%100==0)) and (dia<=29 and mes==2):
    print("Sua data é inválida")

elif dia <=31 and mes==1 or 3 or 5 or 7 or 8 or 10 or 12:
    print("Seu ano é válido!")
elif dia <=30 and mes==4 or 6 or 9 or 11:
    print("Seu dia é válido!")
else:
    print("Sua data é inválida!")





