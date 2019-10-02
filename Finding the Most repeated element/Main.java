#include<stdio.h>
int main()
{
  //Type your code here
  int n, max = 0,max_element;
  scanf("%d", &n);
  int a[n];
  for(int i=0; i<n; i++)
    scanf("%d", &a[i]);
  
  for(int i=0; i<n; i++)
  {
    int count = 1;
    for(int j=i+1; j<n; j++)
    {
      if(a[i]==a[j])
        count++;
    }
    if(count > max){
      max = count;
      max_element = a[i];
    }
  }
  
  printf("%d", max_element);
  
  return 0;
}