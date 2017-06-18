import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
String s=l.next();

double W=1.0;
double H=0.5;
double Q=0.25;
double E=0.125;
double S=0.0625;
double T=0.03125;
double X=0.015625;
	 double sum=0;
int cont=0;
while(s.charAt(0)!='*'){
StringTokenizer st = new StringTokenizer(s,"/");	 
 while (st.hasMoreTokens()) {
	  String y=(st.nextToken());
	  for(int i=0;i<y.length();i++){
		  if(y.charAt(i)=='W'){
			  sum+=W;
		  }
		  if(y.charAt(i)=='H'){
			  sum+=H;
		  }
		  if(y.charAt(i)=='Q'){
			  sum+=Q;
		  }
		  if(y.charAt(i)=='E'){
			  sum+=E;
		  }
		  if(y.charAt(i)=='S'){
			  sum+=S;
		  }
		  if(y.charAt(i)=='T'){
			  sum+=T;
		  }
		  if(y.charAt(i)=='X'){
			  sum+=X;
		  }
		
	  }
	  if(sum==1){
		 cont++; 
	  }
	 
      sum=0;
	  
	  
 }
 System.out.println(cont);
 cont=0; 
 s=l.next();

}
}
}