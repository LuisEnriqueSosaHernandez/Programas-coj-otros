import java.util.Scanner;
//import java.util.ArrayList;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
//ArrayList<String> total = new ArrayList<String>();
int a=l.nextInt();
for(int i=0;i<a;i++){
String s=l.next();
int c=Integer.parseInt(""+s.charAt(s.length()-1));
	if(c%2==0){
	System.out.println("even");
	}
else{
	System.out.println("odd");

}
}

}

}
