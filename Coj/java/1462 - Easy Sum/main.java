import java.util.Scanner;
import java.math.BigInteger;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
BigInteger r=new BigInteger("0");
BigInteger t=new BigInteger("0");
BigInteger mod=new BigInteger("128");

int a=l.nextInt();
 for(int i=0;i<a;i++){ 
 r=l.nextBigInteger();
 t=t.add(r);
        }
			System.out.println(t.mod(mod));
		

}
}









