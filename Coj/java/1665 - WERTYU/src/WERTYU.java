/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author pc
 */
public class WERTYU {
    String palabra2="";
char arreglo[]={'`','1','2','3','4','5','6','7','8','9','0','-','=','Q','W','E','R','T','Y','U','I','O','P','[',']','A','S','D','F','G','H','J','K','L',';','Z','X','C','V','B','N','M',',','.','/'};
    
  public String teclado(String palabra){
      for(int i=0;i<palabra.length();i++){
          for(int j=0;j<arreglo.length;j++){
              if(palabra.charAt(i)==arreglo[j]){
                 palabra2+=arreglo[j-1]; 
              }
          }
          if(palabra.charAt(i)==' '){
              palabra2+=' ';
          }
      }
      return palabra2;
  }
       
    /*char matriz[][]={{'1','2','3','4','5','6','7','8','9','-','=',' ',' '},
        {'Q','W','E','R','T','Y','U','I','O','P','[',']'},
     {'A','S','D','F','G','H','J','K','L',';',' ',' '},
     {'Z','X','C','V','B','N','M',',','.','/',' ',' '}};*/
   /* public String teclado(String palabra){
        for(int i=0;i<palabra.length();i++){
            for(int j=0;j<4;j++){
                for (int k=0;k<12;k++){
                    if(palabra.charAt(i)==matriz[j][k]&&palabra.charAt(i)!=' '){
                        palabra2+=matriz[j][k-1];
                        break;
                    }
                    
                }
            }
            if(palabra.charAt(i)==' '){
                        palabra2+=' ';
                    }
            
            
        }
 return palabra2;
    }*/
    


    public static void main(String[] args) {
        // TODO code application logic here
        WERTYU w=new WERTYU();
        Scanner l=new Scanner(System.in);
        String palabra=l.nextLine();
        System.out.println(w.teclado(palabra));
    }
    
}

