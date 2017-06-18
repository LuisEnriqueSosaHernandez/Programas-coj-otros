#include <iostream>
#include <algorithm>
#include <vector>
#include <cstdio>
using namespace std;
typedef pair<int,int>ii;
typedef vector<ii> vii;
typedef vector<vii>vvii;
vvii listaAdy;

int main()
{
    int v,e,a,b,c,i,j;
    cin>>v>>e;
    listaAdy.assign(v,vii());
    for(i=0;i<e;i++){
        cin>>a>>b>>c;
        listaAdy[a].push_back(ii(b,c));
    }
    for(i=0;i<v;i++){
            cout << i << ": ";
        for(j=0;j<listaAdy[i].size();j++){
            cout<<"("<<listaAdy[i][j].first<<","<<listaAdy[i][j].second<<") ,";
        }
        cout << endl;
    }

    return 0;
}
