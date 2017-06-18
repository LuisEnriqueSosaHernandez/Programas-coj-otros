/*import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int n=l.nextInt();
int perimetro=0;
for(int j=0;j<n;j++){
int a=l.nextInt();
int b=l.nextInt();
int c=l.nextInt();

int sum=a+b+c;
if(j==0){
	perimetro=sum;
}
if(perimetro>sum){
perimetro=sum;
}
}
System.out.println(perimetro);
}
}*/
import java.util.Scanner;
import java.util.Arrays;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	int b=l.nextInt();
	int[] a=new int[b];
	
for(int i=0;i<b;i++){
int q=l.nextInt();
int w=l.nextInt();
int e=l.nextInt();
if(q>0&&w>0&&e>0){
a[i]=(q+w+e);	
}
}	
Arrays.sort(a);
System.out.println(a[0]);
	
}	
	
}