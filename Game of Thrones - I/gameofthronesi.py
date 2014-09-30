import collections
# Write the code to find the required palindrome and then assign the variable 'found' a value of True or False
print "YES" if len(filter(lambda x: x % 2 != 0, map(lambda x: x[1], collections.Counter(raw_input()).items()))) < 2 else "NO"
