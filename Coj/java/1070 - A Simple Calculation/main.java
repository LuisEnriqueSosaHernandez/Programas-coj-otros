import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int cuadrados;
int rectangulos;
while(l.hasNext()){
	int a=l.nextInt();
cuadrados=(a*(a+1)*(2*a+1))/6;
rectangulos=((a*(a+1))/2)*((a*(a+1))/2);

System.out.println(cuadrados+" "+rectangulos);
}
}

}
