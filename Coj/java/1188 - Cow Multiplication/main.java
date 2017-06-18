import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
int a,b;
	String A,B;
a=l.nextInt();
b=l.nextInt();
int suma=0;
A=Integer.toString(a);
B=Integer.toString(b);


for(int i=0;i<A.length();i++){
	int c=Integer.parseInt(""+A.charAt(i));
for(int j=0;j<B.length();j++){
	int d=Integer.parseInt(""+B.charAt(j));
	suma+=c*d;
	}	
}
System.out.println(suma);



}

}