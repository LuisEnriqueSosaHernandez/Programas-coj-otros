import java.util.Scanner;
import java.text.DecimalFormat;
public class FinancialManagementII{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	DecimalFormat formato = new DecimalFormat("#,###.00");
int a=l.nextInt();
for(int j=1;j<=a;j++){
double sum=0.00;
for(int i=0;i<12;i++){
sum+=l.nextDouble();
}
sum/=12.00;
System.out.println(j+" $"+formato.format(sum));
}
}
}