import java.util.Scanner;
import java.util.ArrayList;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
String a=l.nextLine();
ArrayList<String>palabra=new ArrayList<String>();
while(!a.equals("#")){
for(int i=0;i<a.length();i++){
	palabra.add(""+a.charAt(i));
}

for(int i=0;i<palabra.size();i++){
if(palabra.get(i).equals(" ")){
	palabra.set(i,"%20");
	
}
if(palabra.get(i).equals("!")){
	palabra.set(i,"%21");
	
}
if(palabra.get(i).equals("$")){
	palabra.set(i,"%24");
}
if(palabra.get(i).equals("%")){
	palabra.set(i,"%25");
}
if(palabra.get(i).equals("(")){
	palabra.set(i,"%28");
}
if(palabra.get(i).equals(")")){
	palabra.set(i,"%29");
}
if(palabra.get(i).equals("*")){
	palabra.set(i,"%2a");
}

}

for(int i=0;i<palabra.size();i++){
	System.out.print(palabra.get(i));
}
System.out.println(" ");
palabra.clear();
a=l.nextLine();

}


}
}
