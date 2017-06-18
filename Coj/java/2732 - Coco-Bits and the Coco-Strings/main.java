import java.util.Scanner;
import java.util.ArrayList;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
ArrayList<String> total=new ArrayList<String>();
int m=l.nextInt();
for(int q=0;q<m;q++){
String A=l.next();
for(int i=0;i<A.length();i++){
	char c=A.charAt(i);
if(c<93){
c+=32;
}
else{
c-=32;
}
System.out.print(c);
}
System.out.print("\n");
}

}
}