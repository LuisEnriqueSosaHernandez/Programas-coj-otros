import java.util.Scanner;
import java.util.Arrays;
public class egipto{
	public static void main(String [] arg){
		Scanner l = new Scanner(System.in);
		
		while(true){
			int a=l.nextInt();
			int b=l.nextInt();
			int c=l.nextInt();
		if(a==0 || b==0  || c==0 )
				break;

			int s=a*a+b*b;
			double x= Math.pow(s,.5);
			if(c==x)
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}
}