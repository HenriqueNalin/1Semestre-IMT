N = int(input("N = "))
soma = 0
for i in range(N):
    nome = input("Nome : ")
    salario = float(input("Salário : "))
    if i == 0:
        maior = salario
        resp = nome
    else:
        if salario > maior:
            maior = salario
            resp = nome
            
soma = soma + salario
media = soma/N
print("Média salarial =", media)
print(resp, " é a pessoa com maior salário!")