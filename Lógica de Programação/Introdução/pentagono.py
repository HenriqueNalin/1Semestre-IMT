import math
lado = float(input("Encontre o lado do pentágono: "))
area = (5*lado**2)/(4*math.tan(math.radians(36)))
print("A área do pentágono é igual a", area)