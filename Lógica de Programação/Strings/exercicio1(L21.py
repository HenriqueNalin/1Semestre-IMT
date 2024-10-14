texto = input("Entre com o texto: ")
l1 = input("Entre com a letra a substituir: ")
l2 = input("Entre com a letra substituta: ")
#print(texto.replace(l1, l2))
for letra in texto:
    if letra == l1: print(l2, end='')
    else: print(letra, end='')