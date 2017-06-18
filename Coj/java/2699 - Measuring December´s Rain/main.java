import java.util.Scanner;
import java.text.DecimalFormat;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
DecimalFormat redondeo = new DecimalFormat("0.000");
double a=0;
for(int i=0;i<30;i++){
a+=l.nextDouble();

}
double r=a/30;
System.out.println(redondeo.format(r+a));
}
}