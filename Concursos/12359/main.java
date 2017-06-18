    import java.util.Scanner;
	import java.util.ArrayList;
	import java.util.HashSet;
	public class  Main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		int a,b;
		String x,y,pre,suf;
		ArrayList<String>prefijos=new ArrayList<String>();
	ArrayList<String>sufijos=new ArrayList<String>();
	HashSet<String> combi = new  HashSet<String>();
	while(true){
	a=l.nextInt();
	   b=l.nextInt();
	   if(a==0&&b==0)
		  break;
	
	        for(int i=0;i<a;i++)
		     prefijos.add(l.next());
		
			for(int i=0;i<b;i++)
			sufijos.add(l.next());
	
	for(int i=0;i<a;i++){
		x=prefijos.get(i);
		for(int j=0;j<b;j++){
			y=sufijos.get(j);
			
			pre="";
			for(int f=0;f<x.length();f++){
				pre+=x.charAt(f);
				suf="";
				for(int w= y.length()-1;w>=0;w--){
				suf=y.charAt(w)+suf;
				combi.add(pre+suf);
		
				}		
			}	
		}	
	}	
	System.out.println(combi.size());
	combi.clear();
	prefijos.clear();
	sufijos.clear();
	}
	}
	}