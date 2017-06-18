import java.util.Scanner;
public class abc{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		int mayor=0;
		int menor=0;
		int B=0;
		int a=l.nextInt();
		if(a>mayor){
			mayor=a;
		}
		menor=a;
		int b=l.nextInt();
		if(b>mayor){
			mayor=b;
		}
		if(b<menor){
		menor=b;
		}
		int c=l.nextInt();
		if(c>mayor){
			mayor=c;
		}
		if(c<menor){
		menor=c;
		}
		
	if(mayor!=a&&menor!=a){
		B=a;
	}	
	if(mayor!=b&&menor!=b){
		B=b;
	}
	if(mayor!=c&&menor!=c){
		B=c;
	}
	
	String s=l.next();
	if(s.equals("ABC")){
		System.out.println(menor+" "+B+" "+mayor);
	}
	if(s.equals("BAC")){
		System.out.println(B+" "+menor+" "+mayor);
	}
	if(s.equals("BCA")){
		System.out.println(B+" "+mayor+" "+menor);
	}
	if(s.equals("CBA")){
		System.out.println(mayor+" "+B+" "+menor);
	}
	if(s.equals("ACB")){
		System.out.println(menor+" "+mayor+" "+B);
	}
	if(s.equals("CAB")){
		System.out.println(mayor+" "+menor+" "+B);
	}
	
		
		
		
		
	}
}