import math

val = map(float, raw_input().split())
(a,b) = (val[0], val[1])
print round(160 + 40*(a + math.pow(a,2)),3)
print round(128 + 40*(b + math.pow(b,2)),3)