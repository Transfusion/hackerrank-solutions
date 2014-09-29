#include <stdio.h>
#include <string.h>

int main() {
  char numbersortsline[100000];
  int numbersorts;
  fgets(numbersortsline, sizeof(numbersortsline), stdin);

  sscanf(numbersortsline, "%d", &numbersorts);
  int ar[100] = {0};

  char numberlist[6000000];
  fgets(numberlist, sizeof(numberlist), stdin);
  char seps[] = " ";
  char* token;
  int var;

  int i = 0;
  token = strtok (numberlist, seps);
  while (token != NULL)
  {
    sscanf (token, "%d", &var);
    ar[var]++;

    token = strtok (NULL, seps);
  }

  int j;
  for (j=0;j<100;j++) {
    printf("%d ", ar[j]);       
  }
  printf("\n");
    
  return 0;
}
