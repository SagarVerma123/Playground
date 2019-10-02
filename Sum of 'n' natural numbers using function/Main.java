#include<stdio.h>

int sumofnatural(int n)
    {
      int sum;
        sum=n*(n+1)/2;
      return sum;
    }
  int main()
  {
    int n;
    scanf("%d",&n);
    printf("%d",sumofnatural(n));
  	return 0;
}