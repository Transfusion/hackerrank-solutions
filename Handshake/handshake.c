#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int testcases;
    scanf("%d", &testcases);
    int i;
    for(i=0;i<testcases;i++){
        int numberofpeople;
        scanf("%d", &numberofpeople);
        printf("%d\n", (numberofpeople*(numberofpeople-1))/2);
    }
    return 0;
}

