#include <stdio.h>
#include <string.h>

int main(int argc, char *argv[])
{
 char numbercountline[10];
 int numbercount;
 fgets(numbercountline, sizeof(numbercountline), stdin);
 sscanf(numbercountline, "%d", &numbercount);
 //printf("\n%d\n", numbercount);

 char tokenstring[100000];
 fgets(tokenstring, sizeof(tokenstring), stdin);
 char seps[] = " ";
 char* token;
 int var;
 int input[numbercount];

 int i = 0;
 token = strtok (tokenstring, seps);
 while (token != NULL)
 {
    sscanf (token, "%d", &var);
    input[i++] = var;

    token = strtok (NULL, seps);
 }

 int counter = 0;
 int c,d,t,j;

 for (c = 1 ; c <= numbercount - 1; c++) {
    d = c;
    while ( d > 0 && input[d] < input[d-1]) {
        t = input[d];
        input[d] = input[d-1];
        input[d-1] = t;
        d--;
        
        counter++;
    }
    for (j=0;j<numbercount;j++) {
       printf("%d ", input[j]);       
    }
    printf("\n");
 }
 //printf("%d\n", counter);
 return 0; 
}
