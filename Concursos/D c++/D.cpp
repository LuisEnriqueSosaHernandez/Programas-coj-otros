#include <iostream>
using namespace std;
int main()
{
    long long a,b,c,d;

    long i;
bool t=true;
while(cin>>a>>b>>c>>d){

        for (i=a;i<=c;i+=a) {
            if((i%b!=0)&&(d%i!=0)) {
                t=false;
                cout<<i;
                break;
            }
        }

     if (t==true) {
            cout<<-1;
            }
}
    return 0;
}
