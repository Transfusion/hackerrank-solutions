from __future__ import print_function
a=[raw_input() for i in xrange(input())]
def standardize(phone):
    if phone.startswith("0"):
        return "+91 "+phone[1:6]+" "+phone[6:]
    elif phone.startswith("91"):
        if len(phone) == 10:
            return "+91 "+phone[0:5]+" "+phone[5:]
        else:
            return "+91 "+phone[2:7]+" "+phone[7:]
    elif len(phone) == 10:
        return "+91 "+phone[0:5]+" "+phone[5:]
    else: return phone[0:3]+" "+phone[3:8]+" "+phone[8:]
    
map(print, sorted(map(standardize, a)))
