import java.util.Scanner;
import java.text.DecimalFormat;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
DecimalFormat redondeo = new DecimalFormat("0.00");
int x=l.nextInt();

String s=l.next();

int n=l.nextInt();

for(int i=0;i<n;i++){
	double puntuacion=0;
String res=l.next();

for(int j=0;j<s.length();j++){
	if(res.charAt(j)=='#'){
puntuacion=puntuacion;
}else{
if(res.charAt(j)!=s.charAt(j)){
puntuacion-=.25;
}

if(res.charAt(j)==s.charAt(j)){
puntuacion+=1;
}
}
}
System.out.println(redondeo.format(puntuacion));
}

}
}
