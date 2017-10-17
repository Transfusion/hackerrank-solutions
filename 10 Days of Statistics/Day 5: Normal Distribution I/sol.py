import math

# yes math.erf exists
def erf(x, terms=70):
	# https://ocw.mit.edu/courses/mathematics/18-01sc-single-variable-calculus-fall-2010/unit-5-exploring-the-infinite/part-b-taylor-series/session-100-operations-on-power-series/MIT18_01SCF10_Ses100e.pdf
	# the taylor expansion of e^x centered on 0 is 1 + x + (1/2)x^2 + (1/6)x^3 + ...
	# substitute -x^2 for x to get 1 - x^2 + t^4/2! - t^6/3! + ...
	# integrate that to get x - x^3/3 + x^5/(5*2!) - x^7/(7-3!)
	# don't forget to multiply by 2/sqrt(pi)
	sum = x
	neg = True
	fac_accum = 1;
	for term in xrange(1, terms):
		odd = term * 2 + 1
		fac_accum = term * fac_accum
		cur_term = math.pow(x, odd) / (odd * fac_accum)
		if neg:
			sum = sum - cur_term
		else:
			sum = sum + cur_term
		neg = not neg

	return sum * (2/math.sqrt(math.pi))

def normal_cdf(x, mean, std_dev):
	return 0.5 * (1 + erf((x - mean)/(math.sqrt(2) * std_dev)))

mean, std_dev = map(float, raw_input().split())
q1 = float(raw_input())
q2_lower, q2_upper = map(float, raw_input().split())
print round(normal_cdf(q1, mean, std_dev),3)
print round(normal_cdf(q2_upper, mean, std_dev) - normal_cdf(q2_lower, mean, std_dev), 3)