def codifique(letra):
    cod = ord(letra)
    if cod < ord("A") or (cod > ord("Z") and cod < ord("a")) or cod > ord("z"):
        return letra
    if cod > 119: # 119 é o código ASCII do "w"
        return chr(cod+3-26).upper()
    else: return chr(cod+3).upper()

texto = input("Entre com o texto: ")
for letra in texto:
    print(codifique(letra), end='')