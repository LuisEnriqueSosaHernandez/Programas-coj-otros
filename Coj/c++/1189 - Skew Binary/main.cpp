#include <iostream>
#include <math.h>
using namespace std;

int main()
{

    string skew;
    cin>>skew;
    while(skew[0]!='0'){
    long r=0;
   int l=skew.length();
    for(int i=0;i<skew.length();i++){

     r+=(skew[i]-'0')*(pow(2,l)-1);
     l--;
    }
    cout<<r<<endl;
    cin>>skew;
    }
    return 0;
}
