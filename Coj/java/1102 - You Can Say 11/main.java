import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
ArrayList<String> b = new ArrayList<String>();
BigInteger modulo=new BigInteger("11");
BigInteger a=new BigInteger("0");
BigInteger r=new BigInteger("0");
int i;
do{
	
	a=l.nextBigInteger();
	r=a.mod(modulo);
	if(a.longValue() != 0){
	if(r.longValue() == 0){
		b.add(a+" is a multiple of 11.");
		
	}
	else{
		b.add(a+" is not a multiple of 11.");
	}
	}
	
}while(a.longValue() != 0);
for(i=0;i<b.size();i++){
			
		System.out.println(b.get(i));
		}


}
}