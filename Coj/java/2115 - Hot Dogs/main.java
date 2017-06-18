import java.util.Scanner;
import java.text.DecimalFormat;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	DecimalFormat redondeo = new DecimalFormat("0.00");
double r=0;
	while(l.hasNext()){
//r=0;
double b=l.nextDouble();
double c=l.nextDouble();
r=(b/c);
System.out.println(redondeo.format(r));

}
}
}
