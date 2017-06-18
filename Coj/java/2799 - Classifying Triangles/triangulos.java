import java.util.Scanner;
public class triangulos{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int a,b,c;
a=l.nextInt();
b=l.nextInt();
c=l.nextInt();
if(((a+b+c)!=180)||(a==0||b==0||c==0)){
	System.out.print("Error");
}
else{
	if(a==60&&a==60&&c==60){
		System.out.print("Equilateral");
	}
	if((a==b&&a!=c)||(a==c&&a!=b)||(b==c&&b!=a)){
		System.out.print("Isosceles");
	}
	if(a!=b&&b!=c&&a!=c){
		System.out.print("Scalene");
	}
	
}

}

}