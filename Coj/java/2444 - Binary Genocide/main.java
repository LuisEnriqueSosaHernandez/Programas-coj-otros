import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int r=0,k=0;
String b="";
while(l.hasNext()){
int a=l.nextInt();
k=0;
b = Integer.toString(a, 2);
for(int j=0;j<b.length();j++){
if(b.charAt(j)=='1'){
k++;
}
}
if(k%2==0){
r++;
}
}
System.out.println(r);
}
}