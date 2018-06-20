public class knoten extends stackelement{
    private stackelement next;
    private thing data;
    public knoten(int pos){
        this.next=new abschluss();
        this.data=new thing(pos);
    }
    
    public thing returndata(){
        return data;
    }
    
    public stackelement lastin(int pos){
        this.next=this.next.lastin(this.data.returnpos()+1);
        return this;
    }
    
    public stackelement firstout(int pos){
        if(pos==0){
            stackelement k=this.next;
            this.next=new abschluss();
            return k;
        }
        return this.next.firstout(pos-1);
    }
    
    public void printerino(){
        System.out.println(Integer.toString(this.data.returnpos())+"--------------------------");
    }
    
    public stackelement get(int pos){
        if(pos-1==0){
            return this;
        }
        return this.next.get(pos-1);
    }
}