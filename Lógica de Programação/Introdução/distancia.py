def euclidiana(x1, y1, x2, y2):
    distancia = ((x2-x1)**2 + (y2-y1)**2)**0.5
    return distancia 

import math
def haversine(lat1r, lat2r, long1r, long2r):
    a = math.sin((lat2r-lat1r)/2)**2
    b = math.sin((long2r-long1r)/2)**2
    c = math.sqrt(a + math.cos(lat1r)*math.cos(lat2r)*b)
    raio = (6356.752 + 6378.137 + 6399.594 + 6335.439)/4
    lat1r = (math.radians(lat1r))
    long1r = (math.radians(long1r))
    lat2r = (math.radians(lat2r))
    long2r = (math.radians(long2r))
    distancia = 2*raio*math.asin(c)
    return distancia

    
