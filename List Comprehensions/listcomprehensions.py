a = input()+1
b = input()+1
c = input()+1
d = input()
print [[x,y,z] for x in xrange(a) for y in xrange(b) for z in xrange(c) if sum([x,y,z])!=d]
