import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
public class area{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
 DecimalFormat redondeo = new DecimalFormat("0.00");
String t="";
t=l.next();
double a,b,r=0;

switch(t){
case "circle" : 
	a=l.nextDouble();
	r=3.14*(a*a);
    
	System.out.print(redondeo.format(r));
break;
case "triangle" : 

	a=l.nextDouble();
	b=l.nextDouble();
	r=(a*b)/2;
	
	System.out.print(redondeo.format(r));
break;
case "rhombus" : 
	a=l.nextDouble();
	b=l.nextDouble();
	r=(a*b)/2;
	System.out.print(redondeo.format(r));
	break;
	default:
break;
}	

}
}