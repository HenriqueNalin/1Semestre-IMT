import math
lat1 = -23.647955
long1 = -46.5768199
lat2 = -23.585578
long2 = -46.6122539
raio = (6356.752 + 6378.137 + 6399.594 + 6335.439)/4

lat1r = (math.radians(lat1))
long1r = (math.radians(long1))
lat2r = (math.radians(lat2))
long2r = (math.radians(long2 ))

a = math.sin((lat2r-lat1r)/2)**2
b = math.sin((long2r-long1r)/2)**2
c = math.sqrt(a + math.cos(lat1r)*math.cos(lat2r)*b)
distancia = 2*raio*math.asin(c)
print("A distãncia é : ", distancia)

