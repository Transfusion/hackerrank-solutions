import math

def normal_cdf(x, mean, std_dev):
	return 0.5 * (1 + math.erf((x - mean)/(math.sqrt(2) * std_dev)))

mean, std_dev = map(float, raw_input().split())
q1 = float(raw_input())
q2 = float(raw_input())

print round( (1-normal_cdf(q1, mean, std_dev))*100, 2)
print round( (1-normal_cdf(q2, mean, std_dev))*100, 2)
print round( normal_cdf(q2, mean, std_dev)*100, 2)