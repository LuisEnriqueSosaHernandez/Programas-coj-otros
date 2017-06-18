#include <iostream>
using namespace std;

int main (){
    int i,j,n,temp,times;
    cin>>times;
    for(i=0;i<times;i++){
            int suma=0;
        cin.get();
        cin>>n;
        for (j=0;j<n;j++){
            cin>>temp;
            suma+=temp;
        }
        if (suma%n==0){
            cout<<"YES"<<endl;
        }
        else{
            cout<<"NO"<<endl;

        }
    }
}
