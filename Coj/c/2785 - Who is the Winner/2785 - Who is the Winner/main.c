#include <stdio.h>
#include <stdlib.h>

int main()
{
   int i,a;
   float b;
     scanf("%d",&a);
		for(i=0;i<a;i++){
    scanf("%f",&b);
        b=b+b;
		}
		b=b/a;
		printf("%.2f",b);
}

