import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int a=l.nextInt();
while(a!=0){
int suma=0;
for(int i=1;i<=a;i++){
suma+=(i*i);

}
System.out.println(suma);
a=l.nextInt();
}

}

}