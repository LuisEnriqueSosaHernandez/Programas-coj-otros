import java.util.Scanner;
import java.util.ArrayList;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	ArrayList<String> total = new ArrayList<String>();
int i,j,a,b,n,r=0,t=0;
a=l.nextInt();
for(i=0;i<a;i++){
b=l.nextInt();
for(j=0;j<b;j++){	
	n=l.nextInt();
	if(n%2==0){
		r++;
	}
	if(n%2!=0){
		t++;
	}

	
	
}
	
	total.add(r+" even and "+t+" odd.");
	r=0;
    t=0;
}
for(i=0;i<total.size();i++){
			
		System.out.println(total.get(i));
		}

}
}