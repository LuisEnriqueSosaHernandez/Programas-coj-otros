import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
String s=l.next();
int suma=0;
for(int i=0;i<s.length();i++){
suma+=(int)s.charAt(i)-64;

}
System.out.println(suma);

}

}