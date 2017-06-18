#include <stdio.h>
#include <stdlib.h>


int main()
{
   int a,b,c;

     while(a!=0){
    scanf("%d",&a);

    if(a!=0){
    scanf("%d",&b);


    scanf("%d",&c);

    a=a*a;
    b=b*b;
    c=c*c;
    if(a+b==c||a+c==b||b+c==a){
        printf("right\n");
    }
    else{
        printf("wrong\n");
   }
    }

   }
}
