#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d", &n);
  int a[n];
  for(int i=0; i<n; i++)
    scanf("%d", &a[i]);
  
  int sum = a[0], max = a[0];
  for(int i=1; i<n; i++)
  {
    if(a[i]<a[i-1])
      sum = 0;
    sum+=a[i];
    if(max<sum)
      max = sum;
  }
  
  printf("%d", sum);
  return 0;
}