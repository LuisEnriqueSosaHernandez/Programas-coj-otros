import java.util.Scanner;
import java.math.BigInteger;
import java.lang.Math;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
BigInteger a=new BigInteger("0");
//BigInteger b=new BigInteger("0");
//int a=l.nextBigInteger();
//int b=l.nextBigInteger();
a=l.nextBigInteger();
int b=l.nextInt();
a=a.pow(b);
System.out.println(a);

}
}