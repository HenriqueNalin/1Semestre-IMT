def ePrimo(n):
    cont=0
    for i in range(1, n+1):
        if n%i == 0:
            cont=cont+1
    
    if cont==2: return True
    else: return False

def proximoPrimo(n):
    n=n+1
    while True:
        if ePrimo(n): return n
        else: n=n+1

x = int(input("Entre com um número: "))
print(f"O primo depois de {x} é {proximoPrimo(x)}")