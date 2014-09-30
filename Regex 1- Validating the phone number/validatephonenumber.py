import re
a=[raw_input() for i in xrange(input())]
b=map(lambda x: len(re.findall(r"^[7-9]\d{9}$", x)), a)
for i in b:
    print 'YES' if i == 1 else 'NO'
