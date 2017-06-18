/*import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;
class main{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
ArrayList<String> total=new ArrayList<String>();
BigInteger factorial=new BigInteger("1");
BigInteger i=new BigInteger("0");
BigInteger quita=new BigInteger("1");
BigInteger a=new BigInteger("0");
Scanner l=new Scanner(System.in);
//int factorial2=-1;
int b=l.nextInt();

//if(a>=0){
	for(int j=0;j<b;j++){
		a=l.nextBigInteger();
for(i=a;i.longValue()>1;i=i.subtract(quita)){
factorial=factorial.multiply(i);
}
System.out.print(factorial);
String s="";
s=factorial.toString();
int x=s.length();
total.add(""+s.length());
	}
	for(int j=0;j<total.size();j++){
		System.out.println(total.get(j));
	}

	
//}
//else{
//for(int i=n;i<-1;i++){
//factorial2=factorial2*i;
//}
//System.out.print("El factorial es : "+factorial2);
//}
}
}*/

import java.util.Scanner;
import java.util.ArrayList;
class main{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
ArrayList<Integer> total=new ArrayList<Integer>();
long factorial=1;
Scanner l=new Scanner(System.in);


int b=l.nextInt();


	for(int j=0;j<b;j++){
		int x;
		long a=l.nextLong();
for(long i=a;i>1;i--){
factorial=factorial*i;
}
String s="";

s=Long.toString(factorial);
x=s.length();
	if(s.charAt(0)=='-'){
		 x-=1;
	}
total.add(x);
	}
	for(int j=0;j<total.size();j++){
		System.out.println(total.get(j));
	}


}
}