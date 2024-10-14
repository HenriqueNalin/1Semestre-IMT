pa = [5]
r = 5
step = 0

while step < 7: 
    pa.append(pa[step] + r)
    step += 1
print(pa)

pg = [2]
q = 5
step = 0

while step < 4:
    pg.append(pg[step] * q)
    step += 1
print(pg)

juntas = []
i = 0 
while i < len(pa):
    if pa[i] in pg:
        juntas.append(pa[i])
    i += 1
print(juntas)