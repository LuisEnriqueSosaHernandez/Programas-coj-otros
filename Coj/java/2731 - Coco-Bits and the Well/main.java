import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
DecimalFormat redondeo = new DecimalFormat("0.00");

double x;
double cuadrado;
double circulo;
double total;
int a=l.nextInt();
for(int i=0;i<a;i++){
x=l.nextDouble();
cuadrado=x*x;
x/=2;

circulo=Math.PI*Math.pow(x,2);
total=cuadrado-circulo;




System.out.println(redondeo.format(total));
}
}
}