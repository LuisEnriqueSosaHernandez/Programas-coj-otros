import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int a=l.nextInt();
for(int i=0;i<a;i++){
int dis1=0,dis2=0;
int x1=l.nextInt();
int x2=l.nextInt();
int y1=l.nextInt();
int y2=l.nextInt();

if(x1>y1){
dis1=x1-y1;
}
else{
dis1=y1-x1;
}
if(x2>y2){
dis2=x2-y2;
}
else{
dis2=y2-x2;
}
int distancia=dis1+dis2;
System.out.println(distancia);
}

}
}