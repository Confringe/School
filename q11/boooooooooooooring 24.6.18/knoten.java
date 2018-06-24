public class knoten extends element{
    private element next;
    private data dataa;
    public knoten(int posx, int posy){
        this.dataa=new data(posx, posy);
        this.next=new abschluss();
    }
    
    public element add(int posx, int posy){
        this.next=this.next.add(posx, posy);
        return this;
    }
    
    public int length(){
        return this.next.length()+1;
    }
    
    public boolean check(int posx, int posy){
        if(posx==this.dataa.returnposx() && posy==this.dataa.returnposy()){
            return true;
        }
        return this.next.check(posx, posy);
    }
}