import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
Calendar cumpleCal = Calendar.getInstance();
int a=l.nextInt();
for(int i=0;i<a;i++){
int ano=l.nextInt();
String mes=l.next();
int dia1=l.nextInt();
int mes1=0;
String imprime="";
if(mes.equals("JANUARY")){
	mes1=0;
}
if(mes.equals("FEBRUARY")){
	mes1=1;
}
if(mes.equals("MARCH")){
	mes1=2;
}
if(mes.equals("APRIL")){
	mes1=3;
}
if(mes.equals("MAY")){
	mes1=4;
}
if(mes.equals("JUNE")){
	mes1=5;
}
if(mes.equals("JULY")){
	mes1=6;
}
if(mes.equals("AUGUST")){
	mes1=7;
}
if(mes.equals("SEPTEMBER")){
	mes1=8;
}
if(mes.equals("OCTOBER")){
	mes1=9;
}
if(mes.equals("NOVEMBER")){
	mes1=10;
}
if(mes.equals("DECEMBER")){
	mes1=11;
}

cumpleCal.set(ano,mes1,dia1);
int dia = cumpleCal.get(Calendar.DAY_OF_WEEK);
if(dia==1){
	imprime="SUNDAY";
}
if(dia==2){
	imprime="MONDAY";
}
if(dia==3){
	imprime="TUESDAY";
}
if(dia==4){
	imprime="WEDNESDAY";
}
if(dia==5){
	imprime="THURSDAY";
}
if(dia==6){
	imprime="FRIDAY";
}
if(dia==7){
	imprime="SATURDAY";
}
System.out.println(imprime);
}
}
}