public class knoten extends listenelement {
    private listenelement next=new abschluss();
    private eintrag e;
    
    public knoten(String name, int nummer){
        this.e=new eintrag(name,nummer);
    }
    
    public void add(String name, int nummer){
        if(this.next instanceof abschluss){
            this.next=new knoten(name,nummer);
        } else{
            this.next.add(name,nummer);
        } 
    }
    
    public int lenght(){
        return 1+next.lenght();
    }
}