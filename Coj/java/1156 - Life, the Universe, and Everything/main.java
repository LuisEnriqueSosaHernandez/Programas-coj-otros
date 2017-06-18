import java.util.Scanner;
 import java.util.ArrayList;
 public class main{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		ArrayList<Integer> total = new ArrayList<Integer>();
        int a,b;
        do {
            a = sc.nextInt();
            if (a != 42)
                
				total.add(a);
        }while (a != 42);
       
        for(int i=0;i<total.size();i++){
			
		System.out.println(total.get(i));
		}
}
 }