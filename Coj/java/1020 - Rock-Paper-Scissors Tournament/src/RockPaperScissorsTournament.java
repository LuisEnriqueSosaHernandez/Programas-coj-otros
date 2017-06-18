
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LESH
 */
public class RockPaperScissorsTournament {

    
    public static void main(String[] args) {
        Scanner l=new Scanner(System.in);
        int numjugadores,numjuegos,jugador,jugador2;
        String tirada="",tirada2="";
        numjugadores=l.nextInt();
        while(numjugadores!=0){
        numjuegos=l.nextInt();
        int ganadas[]=new int[2];
        for(int i=0;i<numjuegos;i++){
            jugador=l.nextInt();
            if(jugador==1){
            tirada=l.next();
            }else{
                 tirada2=l.next();
            }
            jugador2=l.nextInt();
            if(jugador2==2){
                 tirada2=l.next();
            }else{
                 tirada=l.next();
            }
            
           
            if(tirada.equals("paper")){
                if(tirada2.equals("rock")){
                    ganadas[0]++;
                }
            }
            if(tirada2.equals("paper")){
                if(tirada.equals("rock")){
                    ganadas[1]++;
                }
            }
            if(tirada.equals("rock")){
                if(tirada2.equals("scissors")){
                    ganadas[0]++;
                }
            }
             if(tirada2.equals("rock")){
                if(tirada.equals("scissors")){
                    ganadas[1]++;
                }
            }
             if(tirada.equals("scissors")){
               if(tirada2.equals("paper")){
                   ganadas[0]++;
               }  
             }
              if(tirada2.equals("scissors")){
               if(tirada.equals("paper")){
                   ganadas[1]++;
               }  
             }
            
        }
            System.out.println(ganadas[0]+" "+ganadas[1]);
        numjugadores=l.nextInt();
        }
        
    }
    
}
