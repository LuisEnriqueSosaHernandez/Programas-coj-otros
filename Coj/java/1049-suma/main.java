import java.util.Scanner;
public class main{
public static void main(String[] args) {
Scanner lee = new Scanner(System.in);
int numero=lee.nextInt();
int suma=0;

  if (0>numero)
    {
        for(int i=1;i>=numero;i--)
        {
        suma+=i;
      }
    }
else
  {
    for(int i=1;i<=numero;i++)
    {
    suma+=i;
  }
  }
System.out.println(suma);
}}