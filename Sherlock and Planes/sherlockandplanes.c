#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main(){
	int testcases;
	scanf("%d", &testcases);
	int a;
	for(a=0;a<testcases;a++){
		int i;
		int firstpoint[3];
		
		scanf("%d %d %d", &firstpoint[0], &firstpoint[1], &firstpoint[2]);
		int enumerate[3] = {0};
		for(i=0; i<3;i++){	
			int othertestpoint[3];
			scanf("%d %d %d", &othertestpoint[0], &othertestpoint[1], &othertestpoint[2]);
			int j;
			for (j=0;j<3;j++){
				if (othertestpoint[j] == firstpoint[j]){
					enumerate[j]++;
				}
			}
		}
		int j;
        int pointsinplane = 0;
		for (j=0;j<3;j++){
	        //printf("%d", enumerate[j]);
			if(enumerate[j] == 3){
				//printf("%s", "YES");
				//return 0;
                pointsinplane = 1;
			}
		}
        if(pointsinplane == 1){
		    printf("%s\n","YES");
        }
        else {
            printf("%s\n","NO");
        }
	}
	return 0;
}
