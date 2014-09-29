#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main(){
	int countarray[26] = {0};
	char c = 0;
	while ((c = getchar()) != EOF){
		if(c >= 'A' && c <= 'Z') {
			c = c - 'A'+ 'a';
			countarray[c-97]++;
		}
		else if (c >= 'a' && c <= 'z'){
			countarray[c-97]++;
		}
	}
	int i;
	for (i=0;i<26;i++){
		if(countarray[i] == 0){
			printf("%s", "not pangram");
			return 0;
		}
	}
	printf("%s", "pangram");
    return 0;
}
