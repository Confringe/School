public class knoten extends snakeelement{
    private snakeelement next;
    private snakething data;
    public knoten(int posx, int posy){
        this.next=new abschluss();
        this.data=new snakething(posx, posy);
    }
    
    public knoten(snakething data){
        this.next=new abschluss();
        this.data=data;
    }
    
    public snakeelement returnnext(){
        return this.next;
    }
    
    public snakeelement offer(int posx, int posy){
        this.next=this.next.offer(posx, posy);
        return this;
    }
    
    public snakething poll(){
        return this.data;
    }
    
    public boolean comparedata(snakething input){
        if(this.data.compare(input)){
            return true;
        } else {
            return this.next.comparedata(data);
        }
    }
    
    public snakething getlast(snakething thing){
        return this.next.getlast(this.data);
    }
    
    public snakething getfirst(){
        return this.data;
    }
    
    public snakething get(int pos){
        if(pos==0){
            return this.data;
        }
        return this.next.get(--pos);
    }
    
    public void setnext(snakeelement next){
        this.next=next;
    }
    
    public int length(){
        return this.next.length()+1;
    }

    public void setdata(snakething data){
        this.data=data;
    }
    
    public snakeelement getknoten(int pos){
        if(pos==0){
            return this;
        }
        return this.next.getknoten(--pos);
    }
    
    public snakeelement delete(int pos){
        if(pos==0){
            return this.next;
        }
        this.next=this.next.delete(--pos);
        return this;
    }
}
