d = [raw_input().split() for i in xrange(input())]
e = dict(zip([i[0] for i in d], [sum(map(float,i[1:]))/(len(i)-1) for i in d]))
print "%.2f" % e[raw_input()]
# Haskell is love, Haskell is life
