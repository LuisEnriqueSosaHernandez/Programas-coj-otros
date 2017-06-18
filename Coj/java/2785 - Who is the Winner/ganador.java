import java.util.Scanner;
import java.text.DecimalFormat;
public class ganador{
public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
		DecimalFormat redondeo = new DecimalFormat("0.00");
		int limite,i;
		double a=0;
		limite=lector.nextInt();
		 for(i=0;i<limite;i++){
			a+=lector.nextDouble();
		}
		a/=limite;
		System.out.print(redondeo.format(a));
}
}
