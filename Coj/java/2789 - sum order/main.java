import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
ArrayList<Integer> total = new ArrayList<Integer>();
String s=l.next();
StringTokenizer st = new StringTokenizer(s,"+");
int aux,i,j;
String y;
 while (st.hasMoreTokens()) {
	  int n=Integer.parseInt(st.nextToken());
         total.add(n);
 }
 for(i=0;i<total.size();i++){
			for(j=i+1;j<total.size();j++){
				if(total.get(i)>total.get(j)){
					aux=total.get(i);
					total.set(i,total.get(j));
					total.set(j,aux);
				}
			}
 }
	 for(i=0;i<total.size();i++){
		
		 y = (""+total.get(i)+"+");
		 if(i==total.size()-1){
			 y = (""+total.get(i)); 
		 }
		 System.out.print(y);
		 
	 }
	 
 

}
}