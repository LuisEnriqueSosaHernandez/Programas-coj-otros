#include <iostream>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(0); cin.tie(0);
 string s,t;
 int pos=0,i,j,cont=0;
while(cin>>s>>t){


    if(s==t){
        cout<<"Yes"<<endl;
    }
    else{
    pos=0;cont=0;
    for(i=0;i<s.size();i++){
        for(j=pos;j<t.size();j++){
         if(s[i]==t[j]){
            cont++;t[j]='*';break;
         }
        }
        pos=j;
    }
    if(cont==s.size()){
       cout<<"Yes"<<endl;
    }
    else{
        cout<<"No"<<endl;
    }
    }

}
    return 0;
}
