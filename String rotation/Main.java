#include<stdio.h>
#include<string.h>
char * Rotation_check(char *str1, char *str2)
{
  //Type your code here
  char *temp;
  temp = strcat(str1, str1);
  for(int i=0; i<strlen(temp)-strlen(str2)+1; i++)
  {
    int match = 1;
    for(int j=0; j<strlen(str2); j++)
    {
      if(temp[i+j] != str2[j])
        match = 0;
    }
    if(match == 1)
      return "Yes";
  }
    return "No";
}
int main()
{
  char st1[20], st2[20];
  //Type your code here
  gets(st1);
  gets(st2);
  
  char *result = Rotation_check(st1, st2);
  
  printf("%s", result);
  
  return 0;
}