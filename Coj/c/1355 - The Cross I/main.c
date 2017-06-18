#include <stdio.h>
#include <stdlib.h>

int main()
{
   double ac,at,m,atotal,a;
   while(scanf("%lf",&a)!=EOF){
    m=a/3.0;
    ac=3.141592653589793*(m*m);
    at=(m*(a/2.0))/2.0;
    at*=4;
    atotal=(a*a)-(ac+at);
    printf("%.4lf\n",atotal);
   }
    return 0;
}
