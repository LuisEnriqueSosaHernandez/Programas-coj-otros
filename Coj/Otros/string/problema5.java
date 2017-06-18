import java.util.Scanner;
public class problema5{
public int contar(String a,String b){
int x=0;
for(int i=0;i<a.length();i++){
if(a.charAt(i)==b.charAt(0)){
x++;
}
}
return x;
}
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
problema5 problemita=new problema5();
String x=l.nextLine();
String a=l.next();
System.out.println(problemita.contar(x,a));
}
}