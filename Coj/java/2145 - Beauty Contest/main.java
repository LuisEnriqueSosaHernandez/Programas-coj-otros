import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int n=l.nextInt();
for(int j=1;j<=n;j++){
	int mayor=0;
int menor=0;
int total=0;
for(int i=0;i<=9;i++){
int x=l.nextInt();
if(x>mayor){
mayor=x;
}
if(i==0){
menor=x;
}
if(x<menor){
menor=x;
}
total+=x;
}
total-=mayor;
total-=menor;
System.out.println(j+" "+total);
}
}
}