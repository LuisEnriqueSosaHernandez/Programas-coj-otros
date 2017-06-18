import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int a=l.nextInt();
int sum=0;
for(int j=0;j<a;j++){
	int n=l.nextInt();
sum=0;	
for(int i=1;i<n;i++){
if(n%i==0){
sum+=i;
}
}
if(sum<n){
System.out.println("Deficient");
}
if(sum==n){
System.out.println("Perfect");
}
if(sum>n){
System.out.println("Abundant");
}


}
}

}