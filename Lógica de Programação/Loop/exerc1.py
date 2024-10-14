N = int(input("N = "))
cont = 0
for i in range(N):
    x=int(input("x = "))
    if x < 0:
        cont = cont + 1 

print("Há", cont, "número negativos")