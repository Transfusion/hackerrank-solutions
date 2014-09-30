x = [input() for i in xrange(input())]
for a in x:
    print map(lambda x: a%int(x) if int(x) > 0 else 1, [i for i in str(a)]).count(0)
