#include <stdio.h>
#include <stdlib.h>

int main()
{
   int a,c,i,j;
int b=0;
scanf("%d",&a);
for(i=0;i<a;i++){
	getch();
scanf("%d",&c);
for(j=0;j<c;j++){
   scanf("%d",&b);
b+=b;
}
if(b%c==0){
	printf("YES");
}
else{
	printf("NO");
}
}
}
