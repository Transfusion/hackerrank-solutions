from __future__ import print_function
from operator import itemgetter
map(print, ["Mr. "+" ".join([i[0],i[1]]) if i[3]=="M" else "Ms. "+" ".join([i[0],i[1]]) for i in sorted([raw_input().split() for i in xrange(input())], key=itemgetter(2))])
# Long live Haskell
