num_lista = []
maior = 0
menor = 0
for c in range(0, 5):
    num_lista.append(int(input("Digite um valor para a posição c: ")))
    if c == 0:
        maior = menor = num_lista[c]
    else:
        if num_lista[c] > maior:
            maior = num_lista[c]
        elif num_lista[c]<menor:
            menor = num_lista[c]
print('-'*30)
print(f"Você digitou os valores {num_lista}")
print(f"O maior valor digitado foi: {maior}")
print(f"O menor valor digitado foi: {menor}")