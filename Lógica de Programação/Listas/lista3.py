alturas = []
soma = 0
quant = 0 
while True:
    entrada = float(input("Digite a sua altura: "))
    if entrada < 0:
        break
    else:
        alturas.append(entrada)
        soma = soma + entrada
        quant = quant + 1

print(alturas)
media = sum(alturas) / len(alturas)
print(f"A média das alturas vale {media:.1f}")