#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int comp(const void *i, const void *j) {
	return *(int *)i - *(int *)j;
}
int main(){
	char firstline[100];
	char secondline[1000000];
	unsigned long long int n, k, counter=0, sum=0;
	unsigned long long int pricelist[100000];
	fgets(firstline, sizeof(firstline), stdin);
	sscanf(firstline, "%llu %llu", &n, &k);
	fgets(secondline, sizeof(secondline), stdin);
	char *p;
	p = strtok(secondline, " ");
	int a=0;
	while (p != NULL){
		sscanf(p, "%llu", &pricelist[a++]);
		p = strtok (NULL, " ");
	}
	qsort(pricelist, n, sizeof(unsigned long long int), comp);
	for(a=0; a<n; a++){
		sum += pricelist[a];
		if(sum > k){
			break;
		}
		else {
			counter++;
		}
	}
	printf("%llu\n", counter);
}
