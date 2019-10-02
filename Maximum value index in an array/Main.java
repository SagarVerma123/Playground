// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include<limits.h>
// Main function
int main()
{
  // Type your code here 
  int n, max = INT_MIN, index = 0;
  scanf("%d", &n);
  
  int a[n];
  
  for(int i=0; i<n; i++)
  {
    scanf("%d", &a[i]);
    if(a[i]>max)
    {
      max = a[i];
      index = i;
    }
  }
  
  printf("%d", index);
  
   return 0;
}