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
    //--------------------------------------------------
    public boolean compare(String name, int nummer){
        if(name==e.returnname() && nummer==e.returnnummer()){
            return true;
        }
        return false;
    }
    
    public listenelement returnnext(){
        return this.next;
    }
    
    public boolean delete(String name, int nummer){
        if(this.next instanceof knoten){
            knoten e=(knoten) this.next;
            if(e.compare(name,nummer)){
                this.next=e.returnnext();
                return true;
            } else {
                return e.delete(name,nummer);
            }
        }
        return false;
    }
    
    public String suchename(int nummer){
        if(this.e.returnnummer()==nummer){
            return this.e.returnname();
        } else{
            return next.suchename(nummer);
        }
    }
    
    public int suchenummer(String name){
        if(this.e.returnname()==name){
            return this.e.returnnummer();
        } else{
            return next.suchenummer(name);
        }
    }
}