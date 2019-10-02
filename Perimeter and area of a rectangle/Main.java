#include<stdio.h>
int main()
{
  //Type your code here
  int perimeter,area,length = 6,breadth = 9;
  perimeter = 2 * (length + breadth);
  area = length * breadth;
  printf("The perimeter of the rectangle is: %d cm",perimeter);
  printf("\nThe area of the rectangle is: %d sq cm",area);
  return 0;
}