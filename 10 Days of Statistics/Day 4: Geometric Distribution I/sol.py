import math
e = map(float, raw_input().split())

f = int(raw_input())

prob_def = e[0]/e[1]
prob_not_def = 1 - prob_def

print round(math.pow(prob_not_def, f-1) * prob_def, 3)
