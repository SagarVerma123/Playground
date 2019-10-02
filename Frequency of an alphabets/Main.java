// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Enter your code here 
  char a[100];
  int *count = (int *)calloc(26, sizeof(int));
  gets(a);
  
  for(int i=0; i<strlen(a); i++)
  {
    if(a[i]>='a' && a[i]<='z')
    	count[a[i]-'a'] += 1;
  }
  
  for(int i=0; i<26; i++)
    if(count[i]>0)
    	printf("%c%d ", i+'a', count[i]);
   return 0;
}