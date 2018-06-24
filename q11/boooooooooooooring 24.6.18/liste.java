public class liste{
    private element erster;
    public liste(){
        this.erster=new abschluss();
        add(1,1);
        add(2,2);
        add(3,3);
        add(1,4);
    }
    
    public void add(int posx, int posy){
        this.erster=this.erster.add(posx, posy);
    }
    
    public int length(){
        return this.erster.length();
    }
    
    public boolean check(int posx, int posy){
        return this.erster.check(posx, posy);
    }
}
