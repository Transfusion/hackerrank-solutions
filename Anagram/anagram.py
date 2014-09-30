from __future__ import print_function
from collections import Counter
x = [raw_input() for i in xrange(input())]
z = map(lambda y: -1 if len(y) % 2 != 0 else len(list((Counter(y[:len(y)/2])-Counter(y[len(y)/2:])).elements())), x)
map(print, z)
