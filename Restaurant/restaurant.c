#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int gcd ( int a, int b )
{
  int c;
  while ( a != 0 ) {
     c = a; a = b%a;  b = c;
  }
  return b;
}
/*taken from http://www.math.wustl.edu/~victor/mfmm/compaa/gcd.c */


int main(){
	int testcases;
	scanf("%d", &testcases);
	int i;
	for(i=0; i<testcases;i++){
		int l;
		int b;
		scanf("%d %d", &l, &b);
		printf("%d\n", (l/gcd(l,b)*b/gcd(l,b)));
	}
    return 0;
}
