import math
sample_size = int(raw_input())
mean = float(raw_input())
std_dev = float(raw_input())
percentage = float(raw_input())
z = float(raw_input())

# "Simply put, a z-score is the number of standard deviations from the mean a data point is."
sample_std_dev = std_dev / math.sqrt(sample_size)
print round(mean - z * sample_std_dev, 2)
print round(mean + z * sample_std_dev,2)