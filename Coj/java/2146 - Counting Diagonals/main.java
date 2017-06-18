import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
long d=l.nextLong();
long v=l.nextLong();
if((((v*(v-3))/2)==d)){
	System.out.println("yes");
}else{
	System.out.println("no");
}

}

}