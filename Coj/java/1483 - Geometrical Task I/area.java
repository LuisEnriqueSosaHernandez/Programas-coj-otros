import java.util.Scanner;
public class area{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
String t="";
t=l.next();
int a,b,r;

if(t.equals("square")){
	a=l.nextInt();
	r=a*a;
	System.out.print(r);
}
if(t.equals("rectangle")){
	a=l.nextInt();
	b=l.nextInt();
	r=a*b;
	System.out.print(r);
}
	
}
}