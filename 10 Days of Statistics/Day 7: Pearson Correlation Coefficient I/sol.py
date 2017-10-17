# pearson corr. coeff. of two variables is cov(X, Y)/ (sigma_x * sigma_y)
import math

# https://stackoverflow.com/questions/15389768/standard-deviation-of-a-list
def _ss(data):
    """Return sum of square deviations of sequence data."""
    c = sum(data)/len(data)
    ss = sum((x-c)**2 for x in data)
    return ss

def pstdev(data):
    """Calculates the population standard deviation."""
    n = len(data)
    if n < 2:
        raise ValueError('variance requires at least two data points')
    ss = _ss(data)
    pvar = ss/n # the population variance
    return pvar**0.5

elems = int(raw_input())
xs = map(float, raw_input().split())
ys = map(float, raw_input().split())

mean_xs = sum(xs)/elems
mean_ys = sum(ys)/elems

sd_xs = pstdev(xs)
sd_ys = pstdev(ys)

p = sum([ (xs[i] - mean_xs) * (ys[i] - mean_ys) for i in xrange(elems) ])
p = p / (elems * sd_xs * sd_ys)

print round(p, 3)
