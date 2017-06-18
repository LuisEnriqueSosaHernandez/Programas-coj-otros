import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int a=l.nextInt();
for(int j=0;j<a;j++){
String s=l.next();
long sum=0;
boolean b=true;
boolean q=true;
if(s.length()==1){
	System.out.println(s);
	q=false;
}
if(s.length()==2){
	if(s.charAt(0)=='-'){
	System.out.println(s.charAt(1));
	q=false;
	}
}
if(q){
if(s.charAt(0)=='-'){
while(s.length()>1){
	sum=0;
	if(b){
for(int i=1;i<s.length();i++){
sum+=s.charAt(i)-'0';	
}
}
if(!b){
	for(int i=0;i<s.length();i++){
sum+=s.charAt(i)-'0';	
}
}
s=Long.toString(sum);
b=false;
}
System.out.println(sum);
}else{
	while(s.length()>1){
	sum=0;
for(int i=0;i<s.length();i++){
sum+=s.charAt(i)-'0';	
}
s=Long.toString(sum);
}
System.out.println(sum);
}
}
}
}
}