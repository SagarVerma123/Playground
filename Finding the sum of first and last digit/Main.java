#include <stdio.h>
int main() {
	//Type your code
  int n,sum=0;
  scanf("%d",&n);
  sum=sum+n%10;
  while(n>10)
  {
    n=n/10;
  }
  sum+=n;
  printf("%d",sum);
	return 0;
}