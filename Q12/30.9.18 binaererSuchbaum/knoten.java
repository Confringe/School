public class knoten extends baumelement{
	private baumelement kleiner=new abschluss();
	private baumelement groesser=new abschluss();
	private int data;
	public knoten(int data){
		this.data=data;	
	}
	public baumelement add(int a){
		if(a<this.data){
			this.kleiner=this.kleiner.add(a);
		}	
		if(a>this.data){
			this.groesser=this.groesser.add(a);
		}
		return this;
	}
	public boolean search(int s){
		if(this.data==s){
			return true;
		} else if(s<this.data){
			return this.kleiner.search(s);
		} else{
			return this.groesser.search(s);
		}

	}
}
