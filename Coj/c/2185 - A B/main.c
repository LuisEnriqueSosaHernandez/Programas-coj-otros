#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a,b,s,r,m,mo;
    float d;
    scanf("%d",&a);
    scanf("%d",&b);
    s=a+b;
    r=a-b;
    m=a*b;
    d=a/b;
    mo=a%b;
    printf("\n%d",s);
     printf("\n%d",r);
      printf("\n%d",m);
       printf("\n%.2f",d);
        printf("\n%d",mo);

}
