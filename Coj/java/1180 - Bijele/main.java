import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int n=l.nextInt();
for(int j=0;j<n;j++){
int king=l.nextInt();
int queen=l.nextInt();
int rooks=l.nextInt();
int bishops=l.nextInt();
int knigths=l.nextInt();
int pawns=l.nextInt();
int num=0;
if(king!=1){
if(king<1){
for(int i=king;i<1;i++){
num+=1;
}
System.out.print(num+" ");
}
if(king>1){
for(int i=king;i>1;i--){
num-=1;
}
System.out.print(num+" ");
}
}
if(king==1){
System.out.print(num+" ");	
}
num=0;
if(queen!=1){
if(queen<1){
for(int i=queen;i<1;i++){
num+=1;
}
System.out.print(num+" ");
}
if(queen>1){
for(int i=queen;i>1;i--){
num-=1;
}
System.out.print(num+" ");
}
}
if(queen==1){
System.out.print(num+" ");	
}
num=0;
if(rooks!=2){
if(rooks<2){
for(int i=rooks;i<2;i++){
num+=1;
}
System.out.print(num+" ");
}
if(rooks>2){
for(int i=rooks;i>2;i--){
num-=1;
}
System.out.print(num+" ");
}
}
if(rooks==2){
System.out.print(num+" ");	
}
num=0;
if(bishops!=2){
if(bishops<2){
for(int i=bishops;i<2;i++){
num+=1;
}
System.out.print(num+" ");
}
if(bishops>2){
for(int i=bishops;i>2;i--){
num-=1;
}
System.out.print(num+" ");
}
}
if(bishops==2){
System.out.print(num+" ");	
}
num=0;
if(knigths!=2){
if(knigths<2){
for(int i=knigths;i<2;i++){
num+=1;
}
System.out.print(num+" ");
}
if(knigths>2){
for(int i=knigths;i>2;i--){
num-=1;
}
System.out.print(num+" ");
}
}
if(knigths==2){
System.out.print(num+" ");	
}
num=0;
if(pawns!=8){
if(pawns<8){
for(int i=pawns;i<8;i++){
num+=1;
}
System.out.print(num+" ");
}
if(pawns>8){
for(int i=pawns;i>8;i--){
num-=1;
}
System.out.print(num+" ");
}
}
if(pawns==8){
System.out.print(num+" ");	
}
System.out.println("");
}
}
}