#!/bin/python
def partition(ar):    
    lesslist = [];
    morelist = [];
    for i in xrange(m-1):
        if ar[i+1] > ar[0]:
            morelist.append(ar[i+1])
        elif ar[i+1] <= ar[0]:
            lesslist.append(ar[i+1])
    return lesslist+[ar[0]]+morelist

m = input()
ar = [int(i) for i in raw_input().strip().split()]

print " ".join(map(str, partition(ar)))
