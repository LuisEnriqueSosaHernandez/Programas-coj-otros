import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
int C,D,sum=0,x;
int inicial,trans;
String s;
int a=l.nextInt();

for(int i=0;i<a;i++){
inicial=l.nextInt();
trans=l.nextInt();
sum+=inicial;
for(int j=0;j<trans;j++){
s=l.next();
x=l.nextInt();
if(s.equals("C")){
sum+=x;
}
if(s.equals("D")){
sum-=x;
}
}
System.out.println(sum);
sum=0;
}
}
}