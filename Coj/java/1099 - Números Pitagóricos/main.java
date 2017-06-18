import java.util.Scanner;
 import java.util.ArrayList;
 public class main{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		ArrayList<String> total = new ArrayList<String>();
        int a,b,c;
        do {
            a = sc.nextInt();
			if(a!=0){
			b = sc.nextInt();
			c = sc.nextInt();
             a=a*a;
             b=b*b;
             c=c*c;
			if(a+b==c||a+c==b||b+c==a){
				System.out.println("right");
			total.add("right");
    }
    else{
		System.out.println("wrong");
        total.add("wrong");
	}
	}
        }while (a != 0);
       
        for(int i=0;i<total.size();i++){
			
		System.out.println(total.get(i));
		}
		}
}
 