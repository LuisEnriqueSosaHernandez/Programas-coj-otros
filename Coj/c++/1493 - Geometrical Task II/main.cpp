 #include <iostream>
 #include <stdio.h>

using namespace std;

int main()
{
    string s;
    float a,b;
    cin>>s;
    //cout.precision(2);
   switch(s.at(0)){
   //if(s=="circle"){
case 'c':
    cin>> a;
    a=3.14*(a*a);
//cout<<fixed<<(a)<<endl;
    printf("%.2f",a);
  // }
break;
case 't':
//if(s=="triangle"){
    cin>> a>>b;
    a=(a*b)/2;
printf("%.2f",a);
    //cout<<fixed<<(a)<<endl;
//}
break;
case 'r':
//if(s=="rhombus"){
    cin>>a>>b;
    a=(a*b)/2;
    printf("%.2f",a);
   // cout<<fixed<<(a)<<endl;
//}
break;
    //}

}
return 0;
}
