
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LESH
 */
public class Main {

   
    public static void main(String[] args) {
      Scanner l=new Scanner(System.in);
      int a;
      ArrayList<String> combis=new ArrayList<>();
      while(l.hasNext()){
          a=l.nextInt();
         if(a==2){
             for(int i=0;i<=99;i++){
                 String s=Integer.toString(i);
                if(s.length()==1){
                    s="0"+Integer.toString(i);   
                }
                double b=Math.pow(s.charAt(0)-'0'+s.charAt(1)-'0',2);
                if(b==i){
                    combis.add(s);
              }
             }
             for(int i=0;i<combis.size();i++){
                 System.out.println(combis.get(i));
             }
             combis.clear();
         }
         if(a==4){
             for(int i=0;i<=9999;i++){
                 String s=Integer.toString(i);
                if(s.length()<=2){
                    s="0"+"0"+Integer.toString(i);   
                }
                if(s.length()==3){
                    s="0"+s;  
                }
                String e=""+s.charAt(0)+s.charAt(1);
               String r=""+s.charAt(2)+s.charAt(3);
               double b=Math.pow(Double.parseDouble(e)+Double.parseDouble(r),2);
                if(b==i){
                    combis.add(s);
              }
             }
             for(int i=0;i<combis.size();i++){
                 System.out.println(combis.get(i));
             }
             combis.clear();
         }
         if(a==6){
             for(int i=0;i<=999999;i++){
                 String s=Integer.toString(i);
                if(s.length()<=2){
                    s="0"+"0"+"0"+"0"+"0"+Integer.toString(i);   
                }
                if(s.length()==3){
                    s="0"+s;  
                }
                String e=""+s.charAt(0)+s.charAt(1);
               String r=""+s.charAt(2)+s.charAt(3);
               double b=Math.pow(Double.parseDouble(e)+Double.parseDouble(r),2);
                if(b==i){
                    combis.add(s);
              }
                 System.out.println(s);
             }
             for(int i=0;i<combis.size();i++){
                 //System.out.println(combis.get(i));
             }
             combis.clear();
         }
      }
    }
    
}
