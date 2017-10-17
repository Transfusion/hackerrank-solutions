import math
import operator as op
def ncr(n, r):
    r = min(r, n-r)
    if r == 0: return 1
    numer = reduce(op.mul, xrange(n, n-r, -1))
    denom = reduce(op.mul, xrange(1, r+1))
    return numer//denom

def binom(total, desired, prob_success):
	return ncr(total, desired) * math.pow(prob_success, desired) * math.pow(1-prob_success, total - desired)

e = map(float, raw_input().split())
prob_boy = e[0]/(e[0]+e[1])

print round(sum([binom(6, i, prob_boy) for i in xrange(3, 6+1)]), 3)