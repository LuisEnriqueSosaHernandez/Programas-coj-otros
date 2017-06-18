import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
int N;

N=l.nextInt();
	N=N-(((N-1)/3)+1);

System.out.print(N);
}
}