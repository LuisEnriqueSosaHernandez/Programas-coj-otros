import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int a=l.nextInt();
while(a!=0){
String s=l.next();
int y=(s.length()/a);
int x=y;


int g=0;
for(int i=y;i<=s.length();i+=y){
for(int j=x-1;j>=g;j--){
System.out.print(s.charAt(j));
}
x+=y;
g+=y;
}
System.out.println("");
a=l.nextInt();
}


}
}