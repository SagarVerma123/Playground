// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>

void rotate(int *a, int n, int k)
{
  int temp, end, end1;
  if(n%2 == 0)
  {
    end = n-2;
    end1 = n-1;
  }
  else
  {
    end = n-1;
    end1 = n-2;
  }
  for(int j=0; j<k; j++)
  {
    temp = a[end];
  	for(int i=end; i>=2; i-=2)
    	a[i] = a[i-2];
    a[0] = temp;
    temp = a[1];
    for(int i=1; i<n-2; i+=2)
      a[i] = a[i+2];
    a[end1] = temp;
  }
}
// Main function
int main()
{
  // Enter your code here 
  int n, k;
  scanf("%d", &n);
  
  int a[n];
  
  for(int i=0; i<n; i++)
    scanf("%d", &a[i]);
  
  scanf("%d", &k);
  
  rotate(a, n, k);
  
  for(int i=0; i<n; i++)
    printf("%d ", a[i]);
  
   return 0;
}