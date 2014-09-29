#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <tgmath.h>

int main() {
  int cases;
  scanf("%d", &cases);
  int i;
  for (i=0;i<cases;i++){
    long int nthterm;
    scanf("%ld", &nthterm);
    long long int modulo = pow(10, 9) + 7;
    printf("%lld\n", (long long int)powl((nthterm % modulo) ,2%modulo)%modulo) ;
  }
  return 0;
}

