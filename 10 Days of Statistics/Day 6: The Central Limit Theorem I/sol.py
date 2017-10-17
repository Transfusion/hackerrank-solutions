# need to find the probability that the sum of the weights of all 49 boxes doesn't exceed 9800
# https://www.dartmouth.edu/~chance/teaching_aids/books_articles/probability_book/Chapter7.pdf
# Example 7.5 It is an interesting and important fact that the convolution of two normal 
# densities with means mu1 and mu2 and variances sigma1 and sigma2 is again a normal density, with mean mu1 + mu2 and variance sigma1 + sigma2.
import math

def normal_cdf(x, mean, std_dev):
	return 0.5 * (1 + math.erf((x - mean)/(math.sqrt(2) * std_dev)))

max_weight = float(raw_input())
boxes = float(raw_input())
single_mean = float(raw_input())
std_dev = float(raw_input())

print round(normal_cdf(max_weight, single_mean*boxes, std_dev*math.sqrt(boxes)),4)