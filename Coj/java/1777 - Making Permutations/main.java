import java.util.Scanner;
import java.util.HashSet;
public class main{
public static void main(String[]args){
HashSet<Integer> total=new HashSet<Integer>();
Scanner l=new Scanner(System.in);
int n=l.nextInt();
for(int i=0;i<n;i++){
total.add(l.nextInt());
} 
System.out.println(n-total.size());

}


}