from __future__ import print_function
a = [raw_input(),raw_input().split(),raw_input(),raw_input().split()]
map(print, sorted(map(int, (set(a[3]).difference(set(a[1]))).union(set(a[1]).difference(set(a[3]))))))
