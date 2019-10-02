#include <stdio.h>
int main() {
	//Type your code
  int n,count;
  scanf("%d",&n);
  for(count=1;count<=2*n;count+=2)
    printf("%d\n",count);
	return 0;
}