import java.util.Scanner;
import java.util.ArrayList;
//import java.math.BigInteger;
//import java.math.BigDecimal;
 public class ultimo{
 public static void main(String[]args){
	 Scanner in=new Scanner(System.in);
int k;
int n;
ArrayList<Integer> total = new ArrayList<Integer>();
int d=0,r=0;
int a=in.nextInt();
do{
        n = in.nextInt();
	    k=in.nextInt();
		//BigDecimal p=new BigDecimal(Math.pow(n,k));
	   //p.toBigInteger();
	   String s=Math.pow(n,k);
//String h=Integer.toString(s);
for(int b=0;b<h.length();b++){
	d=Integer.parseInt("" + h.charAt(b));  
}
total.add(d);
r++;
}while(r<a);
 for(int i=0;i<total.size();i++){
			
		System.out.println(total.get(i));
	}
		}

}
