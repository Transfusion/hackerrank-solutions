import math

elems = int(raw_input())
xs = map(float, raw_input().split())
ys = map(float, raw_input().split())

seq_xs = sorted(set(xs))
rank_xs = [seq_xs.index(i)+1 for i in xs]

seq_ys = sorted(set(ys))
rank_ys = [seq_ys.index(i)+1 for i in ys]

di2 = sum([(x-y)**2 for x, y in zip(rank_xs, rank_ys)])
print round(1 - (float(6*di2)/( elems * (elems**2 - 1)  )), 3)