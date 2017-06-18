import java.util.Scanner;
public class vaca{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
int d=l.nextInt();
int h=l.nextInt();
int m=l.nextInt();
int total=16511;
int x;

x=(d*1440)+(h*60)+m;

if(x<total){
	System.out.println(-1);
}else{
	System.out.println(x-total);
}
}
}


