import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		double mayor=0;
		int imprimir=0;
		double temp;
		int a=l.nextInt();
		for(int i=0;i<a;i++){
		temp=l.nextDouble();
		if(temp>=mayor){
		mayor=temp;
		imprimir=(i+1);
		}
		}
		System.out.println(imprimir);
		
	}
	}