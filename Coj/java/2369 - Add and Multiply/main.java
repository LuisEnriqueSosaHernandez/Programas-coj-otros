import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	int r=l.nextInt();
	for(int i=0;i<r;i++){
	
long a=l.nextInt();
long b=l.nextInt();
long c=l.nextInt();
long x;

long mayor=0;
long menor;

x=(a+b)*c;
menor=x;
if(x>mayor){
mayor=x;
}

x=(a+c)*b;
if(x<menor){
menor=x;
}
if(x>mayor){
mayor=x;
}

x=(b+c)*a;
if(x<menor){
menor=x;
}
if(x>mayor){
mayor=x;
}
//-----------------------------//

x=(a*b)+c;
if(x<menor){
menor=x;
}
if(x>mayor){
mayor=x;
}

x=(a*c)+b;
if(x<menor){
menor=x;
}
if(x>mayor){
mayor=x;
}

x=(b*c)+a;
if(x<menor){
menor=x;
}
if(x>mayor){
mayor=x;
}

System.out.println(menor+" "+mayor);
	}

}
}