#include <iostream>

using namespace std;

int main()
{
   int n,agricultores,a,b,c;
   long prima=0;
   cin>>n;
   while(n-->0){
        cin>>agricultores;
        for(int i=0;i<agricultores;i++){
            cin>>a>>b>>c;
            prima+=a*c;
        }
        cout<<prima<<"\n";
        prima=0;
   }
    return 0;
}
