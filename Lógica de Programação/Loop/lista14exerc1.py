from time import time

divisores = []

num_ok = False
while not num_ok:
  try:
    numero = int(input('Digite um número inteiro positivo: '))
    if numero > 0:
      num_ok = True
    else:
      print('ERRO - O número deve ser inteiro positivo')
  except:
    print('ERRO - O número deve ser inteiro positivo')

inicio = time()
for teste in range(1, numero + 1):
    if numero % teste == 0:
        divisores.append(teste)
fim = time()

print("Lista de divisores de", numero,":")
print(divisores)
tempo = fim - inicio
print("Tempo de execução:", tempo,"segundos.")
