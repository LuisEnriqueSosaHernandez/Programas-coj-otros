import java.util.Scanner;
import java.text.DecimalFormat;
public class vol{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	DecimalFormat redondeo = new DecimalFormat("0.000");
int a=l.nextInt();
double mayor=0;
double vol=0;
double PI = 3.14159;
double R;
double H;
String s;
for(int i=0;i<a;i++){
	s=l.next();
if(s.equals("C")){
R=l.nextDouble();
H=l.nextDouble();
vol=(1.0/3.0)*PI*Math.pow(R,2)*H;
}
if(s.equals("L")){
R=l.nextDouble();
H=l.nextDouble();
vol=PI*Math.pow(R,2)*H;
}
if(s.equals("S")){
R=l.nextDouble();
vol=(4.0/3.0)*PI*Math.pow(R,3);
}
if(vol>mayor){
mayor=vol;
}
}
System.out.print(redondeo.format(mayor));

}
}