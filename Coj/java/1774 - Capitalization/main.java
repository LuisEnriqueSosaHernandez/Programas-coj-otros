import java.util.Scanner;
import java.util.ArrayList;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
ArrayList<String> total=new ArrayList<String>();

int r=0;

r=0;
String A=l.next();
if(A.charAt(0)<93){
 for(int j=1;j<A.length();j++){
   if(A.charAt(j)<93){
    r++;
   }
  
 }
 if(r==0){
System.out.println(A);
r=0;
}
}

if(A.charAt(0)>93){
 for(int j=1;j<A.length();j++){
   if(A.charAt(j)<93){
     r++;
   }
}
if(r==0){
System.out.println(A);
}
}
if(r>0){
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
}

}
}