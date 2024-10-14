import math
a = float(input("a : "))
b = float(input("b : "))
c = float(input("c : "))
if a == 0:
    print("Não é uma equação de segundo grau!")
else:
    delta = b**2 - 4*a*c
    if delta < 0:
        print("A equação não possui raízes reais!")
    else:
        x1 = (-b + delta**0.5)/(2*a)
        x2 = ( -b - delta**0.5)/(2*a)
        print("As raízes são", x1,x2)


