public class baum{
	private baumelement erster=new abschluss();
	public baum(){
		this.add(8);
		this.add(4);
		this.add(12);
		this.add(6);
		this.add(2);
		this.add(14);
		this.add(10);
		this.add(3);
		this.add(1);
		this.add(9);
		this.add(11);
		this.add(5);
	}
	public void add(int a){
		this.erster=this.erster.add(a);
	}
	public boolean search(int s){
	       return this.erster.search(s);
	   }
}
