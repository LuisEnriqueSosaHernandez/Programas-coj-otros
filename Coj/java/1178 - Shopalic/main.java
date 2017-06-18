import java.util.Scanner;
import java.util.Arrays;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	int a=l.nextInt();
	for(int j=0;j<a;j++){
int n=l.nextInt();
int sum=0;
int[] arreglo=new int[n];
int cont=0;
for(int i=0;i<n;i++){
arreglo[i]=l.nextInt();
}
Arrays.sort(arreglo);
for(int i=arreglo.length-1;i>=0;i--){
if(cont==2){
sum+=arreglo[i];
}
if(cont==3){
cont=0;
}
cont++;
}
	System.out.println(sum);
	}

}
}