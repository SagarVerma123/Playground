#include<stdio.h>
int main()
{
  //Type your code here
  int arr_size, a, b, a_index = -1, b_index = -1;
  scanf("%d", &arr_size);
  int arr[arr_size];
  for(int i=0; i<arr_size; i++)
    scanf("%d", &arr[i]);
  scanf("%d %d", &a, &b);
  
  for(int i=0; i<arr_size; i++)
  {
    if(arr[i]==a)
      a_index = i;
    if(arr[i]==b)
      b_index = i;
  }
  printf("%d\n%d", a_index, b_index);
  return 0;
}