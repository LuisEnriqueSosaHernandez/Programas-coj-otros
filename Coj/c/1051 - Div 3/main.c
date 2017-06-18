#include <stdio.h>
#include <stdlib.h>

int main()
{
long a;
int i,r=1;
scanf("%ld",&a);
for(i=1;i<=a;i++){
if(i%3==0){
r++;
}
}
printf("%d",r);
}
