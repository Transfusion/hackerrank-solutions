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

  int parsedlist[numbersorts];
  int i = 0;
  token = strtok (numberlist, seps);
  while (token != NULL)
  {
    sscanf (token, "%d", &var);
    ar[var]++;
    parsedlist[i] = var;
    i++;
    token = strtok (NULL, seps);
  }
  
  int k;
  
  for(k=1;k<100;k++){
    ar[k] = ar[k]+ar[k-1];
  }

  int sortedlist[numbersorts];
  int c;
  for(c=0;c<numbersorts;c++){
    sortedlist[ar[parsedlist[c]]-1] = parsedlist[c];
    ar[parsedlist[c]]--;
  }

  int j;
  for (j=0;j<numbersorts;j++) {
    printf("%d ", sortedlist[j]);       
  }
  printf("\n");
    
  return 0;
}
