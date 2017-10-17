x = [95, 85, 80, 70, 60]
y = [85, 95, 70, 65, 70]
ax = sum(x)/len(x)
ay = sum(y)/len(y)
sx = 0
n = 0
d = 0
for i in range(len(x)):
    n += (ax-x[i])*(ay-y[i])
    d += (ax-x[i])**2 
slope = (1.0*n)/d
inter = ay - slope*ax
y = slope*80+inter
print (round(y,3))