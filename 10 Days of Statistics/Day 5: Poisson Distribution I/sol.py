import math

avg = float(raw_input())
actual = float(raw_input())

def poisson(actual, avg):
	return math.pow(avg, actual) * math.pow(math.e, -avg) / math.factorial(actual)


print poisson(actual, avg)