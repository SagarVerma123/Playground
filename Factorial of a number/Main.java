#include <stdio.h>
int main() {
	//Type your code
  int n,count,p=1;
  scanf("%d",&n);
  for(count=1;count<=n;count++)
  {
    p=p*count;
  }
  printf("%d",p);
	return 0;
}