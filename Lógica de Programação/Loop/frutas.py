from random import choice

frutas = ['maçã', 'banana', 'cereja']
for i in range(10):
  print(f'{i+1}a escolha = {choice(frutas)}')