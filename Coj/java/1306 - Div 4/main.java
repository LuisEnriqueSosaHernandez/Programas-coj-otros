import java.util.Scanner;
import java.math.BigInteger;
public class main{
public static void main(String[]args){
int a,i;
Scanner l=new Scanner(System.in);
a=l.nextInt();
BigInteger modulo=new BigInteger("4");
BigInteger arreglo[]=new BigInteger[a];
 for(i=0;i<arreglo.length;i++){
			arreglo[i]=l.nextBigInteger();
		}
		for(i=0;i<arreglo.length;i++){
		  arreglo[i]=arreglo[i].mod(modulo);
		  if(arreglo[i].longValue() == 0){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		}


}
}