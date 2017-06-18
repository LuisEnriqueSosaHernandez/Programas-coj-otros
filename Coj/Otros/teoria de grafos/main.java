import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
int[][] matriz;
int a=l.nextInt(),b=l.nextInt();
matriz=new int[a][a];
for(int i=0;i<b;i++){
int c=l.nextInt(),v=l.nextInt(),n=l.nextInt();
matriz[c][v]=n;
}
for(int i=0;i<a;i++){
System.out.println("");
for(int j=0;j<a;j++){
System.out.print(matriz[i][j]+" ");
}
}
}


}