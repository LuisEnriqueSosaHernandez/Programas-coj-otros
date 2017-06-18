#include <iostream>

using namespace std;

int main()
{
    int y;
    int cont=0;
    cin>>y;
    for(int x=1;x<y;x++){
    int v=x%y;
    while(v!=0){
    if(x%v==0&&y%v==0){

        break;
    }else{
    v--;
    }
    }
    if(v==1){
        cont++;
    }
    }
    cout<<cont;
    return 0;
}
