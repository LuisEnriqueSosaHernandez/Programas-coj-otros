import java.util.Scanner;

public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	int a=l.nextInt();
	for(int j=0;j<a;j++){
	
int E,F,C,total,cont=0,cont2=0,multi=0;
E=l.nextInt();
F=l.nextInt();
C=l.nextInt();
if(C==1){
	System.out.println("0");
}else{
total=E+F;
while(total!=0){
for(int i=C;i<=total;i+=C){
  cont+=1;
 }
cont2+=cont;
multi=cont*C;
total-=multi;
total+=cont;
cont=0;
multi=0;

if(total<C){
	break;
}
}
System.out.println(cont2);
}
	}

}
}