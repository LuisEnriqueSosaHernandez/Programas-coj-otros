#include <iostream>

using namespace std;

int main()
{
    int a,l,w,h,i;
    cin>>a;
    for(i=1;i<=a;i++){
        cin>>l>>w>>h;
        if(l<=20&&w<=20&&h<=20){
            cout<<"Case "<<i<<": good\n";
        }else{
        cout<<"Case "<<i<<": bad\n";
        }
    }
    return 0;
}
