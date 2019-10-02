#include <stdio.h>
int main() {
	//Type your code
  int count,n,sum=0;
  scanf("%d",&n);
  for(count=1;count<=n;count++)
  {
    sum = sum + count;
  }
    printf("%d",sum);
	return 0;
}