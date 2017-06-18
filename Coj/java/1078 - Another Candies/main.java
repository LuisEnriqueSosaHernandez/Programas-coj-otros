import java.util.Scanner;
//import java.util.ArrayList;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
//ArrayList<String> total = new ArrayList<String>();
int a,c,i,j;

a=l.nextInt();
for(i=0;i<a;i++){
	int b=0;
	char ch = (char) System.in.read();
c=l.nextInt();
for(j=0;j<c;j++){
b+=l.nextInt();
}
if(b%c==0){
	System.out.println("YES");
	//total.add("YES");
}
else{
	System.out.println("NO");
//total.add("NO");
}
}
//for(i=0;i<total.size();i++){
		//	System.out.println(total.get(i));
		//}
}
}
