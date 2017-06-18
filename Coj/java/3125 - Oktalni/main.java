import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
String s=l.next();

long num=Long.parseLong(s,2);
String octal = Long.toString(num, 8);
System.out.println(octal);

}
}