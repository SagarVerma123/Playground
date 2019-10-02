#include<stdio.h>
int main()
{
  //Type your code here
  int n, count = 0, max = 0;
  scanf("%d", &n);
  
  int a[n];
  for(int i=0; i<n; i++)
    scanf("%d", &a[i]);
  
  for(int i=0; i<n; i++)
  {
    if(a[i]==1)
      count++;
    else
    {
      if(count>max)
        max = count;
      count = 0;
    }
  }
    
    printf("%d", max);
  
  return 0;
}