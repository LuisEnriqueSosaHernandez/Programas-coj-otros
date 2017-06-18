import java .util.Scanner;
import java.util.ArrayList;
public class main{
	public static void main(String[]args){
Scanner l=new Scanner(System.in);
ArrayList<Integer>total=new ArrayList<Integer>();
int a=l.nextInt();
int y=0;
int i,j;
do{
	long n=0;
	long r=0;
	int x=0;
int b=l.nextInt();
int c=l.nextInt();

int[][] matriz=new int[c][b];

for(i=0;i<matriz.length;i++){

	for(j=0;j<matriz[0].length;j++){
		matriz[i][j]=l.nextInt();	
		
}
}
for(j=0;j<matriz[0].length;j++){

	for(i=0;i<matriz.length;i++){
		r+=matriz[i][j];	
 			 }
			 if(r>n){
			x=j+1;
			n=r;
			r=0;
		}
		
}

total.add(x);
n=0;
x=0;
y++;
}while(y<a);
for(i=0;i<total.size();i++){
			
		System.out.println(total.get(i));
		}
	}
}
