import java.util.Scanner;
import java.util.ArrayList;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
ArrayList<String> total = new ArrayList<String>();
int a;
do{
a=l.nextInt();
if(a>0){
String b = Integer.toString(a, 3);
total.add(b);
}
}while(a>0);
for(int i=0;i<total.size();i++){
			
		System.out.println(total.get(i));
		}
}
}