elements = int(raw_input())
unq = map(int, raw_input().split())
freqs = map(int, raw_input().split())

tbl = sorted(zip(unq, freqs))
rev_tbl = reversed(tbl)

quartile_size = sum(freqs)/2

def first_quartile_odd(table, median_index):
	sum_freqs = 0;
	first_quart = 0;

	for num, freq in table:
		sum_freqs = sum_freqs + freq
		if sum_freqs >= (median_index + 1):
			first_quart = num
			break
	return first_quart

def first_quartile_even(table, median_index):
	sum_freqs = 0;
	first_quart = 0;

	for i, item in enumerate(table):
		num, freq = item
		sum_freqs = sum_freqs + freq
		if sum_freqs == median_index:
			first_quart = float(num + table[i+1][0])/2
			break
		if sum_freqs > median_index:
			first_quart = num
			break
	return first_quart

med_ind = quartile_size/2
first_quart = 0
third_quart = 0

if quartile_size % 2 == 0:
	first_quart = first_quartile_even(tbl, med_ind)
	third_quart = first_quartile_even(list(rev_tbl), med_ind)
else:
	first_quart = first_quartile_odd(tbl, med_ind)
	third_quart = first_quartile_odd(rev_tbl, med_ind)

print third_quart, first_quart
print third_quart - first_quart