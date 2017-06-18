import java.util.Scanner;
import java.util.ArrayList;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	ArrayList<Integer> total=new ArrayList<Integer>();
int b=l.nextInt();
for(int j=0;j<b;j++){
int suma=0;
int a=l.nextInt();
for(int i=1;i<a;i++){
if(a%i==0){
suma+=i;
}
}
total.add(suma);
}
for(int i=0;i<total.size();i++){
	System.out.println(total.get(i));
}
}
}
