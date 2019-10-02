#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int n,r,s=0,i,sum=0,rem;
  scanf("%d",&n);
  r=n;
  while(r>0)
  {
    s++;
    r=r/10;
  }
  r=n;
  while(r>0)
  {
    rem=r%10;
    sum+=pow(rem,s);
    r=r/10;
  }
  if(sum==n)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}