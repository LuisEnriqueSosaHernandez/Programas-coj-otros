#include <iostream>
#include <cstdio>
#include <algorithm>
using namespace std;

int main(){
    int n;
    cin>>n;
    while(n-->0){
        int s,d,x,y;
        cin>>s>>d;
        y=abs(s-d)/2;
        x=s-y;
        if((x+y==s) && (abs(x-y)==d))
            cout<<max(x,y)<<" "<<min(x,y)<<"\n";
        else
            cout<<"impossible\n";

    }

 return 0;

}
