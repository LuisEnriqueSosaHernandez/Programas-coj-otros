import java.util.Scanner;
public class palabra{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
String a="";
a=Lee.next();
char[] letras = a.toCharArray();
java.util.Arrays.sort(letras);
String aOrdenada = new String(letras);
System.out.println(aOrdenada);
}
}