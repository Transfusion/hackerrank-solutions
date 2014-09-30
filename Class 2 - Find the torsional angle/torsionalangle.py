from math import acos, pi
a,b,c,d=map(float, raw_input().split()),map(float, raw_input().split()),map(float, raw_input().split()),map(float, raw_input().split())
ab=[b[i]-a[i] for i in xrange(len(b))]
bc=[c[i]-b[i] for i in xrange(len(c))]
cd=[d[i]-c[i] for i in xrange(len(d))]
x=[ab[1]*bc[2] - ab[2]*bc[1], ab[2]*bc[0] - ab[0]*bc[2], ab[0]*bc[1] - ab[1]*bc[0]]
y=[bc[1]*cd[2] - bc[2]*cd[1], bc[2]*cd[0] - bc[0]*cd[2], bc[0]*cd[1] - bc[1]*cd[0]]
x_y=sum([x[i]*y[i] for i in xrange(len(y))])
absx=pow(x[0]**2+x[1]**2+x[2]**2, 0.5)
absy=pow(y[0]**2+y[1]**2+y[2]**2, 0.5)
print("%.2f"%(acos(x_y/(absx*absy))*180/pi))
