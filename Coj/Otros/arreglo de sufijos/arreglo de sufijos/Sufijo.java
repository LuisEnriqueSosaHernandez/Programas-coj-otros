class Sufijo{
private int indice;
private int rank[];
public void Suffix(){
	rank=new int[2];
}
public void SetIndice(int indice){
this.indice=indice;
}
public void SetRank1(int e){
this.rank[0]=e;
}
public void SetRank0(int p){
this.rank[1]=p;
}

public int getIndice(){
return indice;
}
public int getRank0(){
return rank[0];
}
public int getRank1(){
return rank[1];
}

	

}




