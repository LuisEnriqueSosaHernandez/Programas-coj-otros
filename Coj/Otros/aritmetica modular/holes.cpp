#include <iostream>
using namespace std;
long long int ar[11];

long long int sq(long long int n){
	return n*n;
}
long long int gcd(long long int a,long long int b){
	if(b==0)return a;
	return gcd(b,a%b);
}
long long int lcm(long long int a, long long int b){
	return a*(b/gcd(a,b));
}
long long int mcm(long long int n, long long int i){
	if(i==(n-1)){
		return ar[i];
	}
	return lcm(ar[i], mcm(n,i+1));
}
long long int gcdN(long long int n, long long int i){
	if(i==(n-1))
		return ar[i];
	return gcd(ar[i],gcdN(n,i+1));
}
int main(int argc, char** argv) {
	long long int casos, n,d;
	cin >> casos;
	while(casos--){
		cin >> n >> d;
		for(int x=0;x<n;x++){
			cin >> ar[x];
			ar[x]-=d;
		}
		cout<<mcm(n,0)<<endl;
		//cout<<"mcm: "<<mcm(n,0)<<endl; //esto lo use para los casos de prueba
		//cout<<"gcd: "<<gcdN(n,0)<<endl;
	}
	return 0;
}
