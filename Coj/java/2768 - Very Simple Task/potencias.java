import java.util.Scanner;
 import java.util.ArrayList;
import java.math.BigInteger;
 public class main{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		ArrayList<BigInteger> total = new ArrayList<BigInteger>();
		BigInteger n = new BigInteger("0");
		BigInteger i = new BigInteger("0");
		BigInteger dos = new BigInteger("0");
		BigInteger resultado = new BigInteger("0");
		BigInteger modulo = new BigInteger("1000000007");
	  
        do {
		n = sc.nextBigInteger();
		for(i.longValue()==0 ;i.longValue()<=n;i.longValue()+=1){
             resultado+=dos.pow(i);
		}
            if (n.longValue() != 0)
                resultado.mod(modulo);
				total.add(resultado);
        }while (n.longValue() != 0);
       
        for(int i=0;i<total.size();i++){
			
		System.out.println(total.get(i));
		}
}
 }