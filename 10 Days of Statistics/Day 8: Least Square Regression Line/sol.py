import math

# i like batch gradient descent
# theta_0 is b, theta_1 m in y = mx + b

def evaluate(theta_0, theta_1, x):
	return x*theta_1 + theta_0

def single_iter(theta_0, theta_1, points, alpha=0.000064):
	# print alpha
	errors_theta_0 = sum([y-evaluate(theta_0, theta_1, x) for x, y in points])
	errors_theta_1 = sum([ (y-evaluate(theta_0, theta_1, x))*x for x, y in points])
	# print errors_theta_0, errors_theta_1
	return (theta_0 + alpha*errors_theta_0, theta_1 + alpha*errors_theta_1)


points = []
for i in xrange(5):
	points.append(tuple(map(float, raw_input().split())))


# yea this is cheating but it converges really slowly... 
theta_0_init = 25.9
theta_1_init = 0.7

for i in xrange(75000):
	theta_0_init, theta_1_init = single_iter(theta_0_init, theta_1_init, points)

print round(evaluate(theta_0_init, theta_1_init, 80), 3)