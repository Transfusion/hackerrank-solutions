import math

def normal_cdf(x, mean, std_dev):
	return 0.5 * (1 + math.erf((x - mean)/(math.sqrt(2) * std_dev)))

max_tickets = float(raw_input())
students = float(raw_input())
mean_tickets = float(raw_input())
std_dev = float(raw_input())

print round(normal_cdf(max_tickets, mean_tickets*students, std_dev*math.sqrt(students)),4)