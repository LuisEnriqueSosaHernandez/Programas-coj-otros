import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int a=l.nextInt();

for(int i=0;i<a;i++){
 String s=l.next();
int r=0;
if(s.charAt(0)=='-'){
	for(int j=1;j<s.length();j++){
r+=s.charAt(j)-'0';
}
}else{
for(int j=0;j<s.length();j++){
r+=s.charAt(j)-'0';

}
}

System.out.println(r);
}

	
}
}
