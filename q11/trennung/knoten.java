public class knoten extends listenelement {
    private listenelement next;
    private eintrag e;
    
    public knoten(String name, int nummer){
        this.e=new eintrag(name,nummer);
    }
    
    public void add(String name, int nummer){
        if(this.next instanceof abschluss){
            knoten e=new knoten(name,nummer);
            e.setnext(next);
            this.next=e;
        } else{
            this.next.add(name,nummer);
        } 
    }
    
    public void delete(String name,int nummer){
        if(this.next instanceof knoten){
            knoten xd=(knoten)this.next;
            if(xd.returneintrag().returnName()==name && xd.returneintrag().returnNummer()==nummer){
                this.next=xd.returnnext();
            } else{
                this.next.delete(name,nummer);
            }
        } 
    }
    
    public void setnext(listenelement next){
        this.next=next;
    }
    
    public listenelement returnnext(){
        return this.next;
    }
    
    public eintrag returneintrag(){
        return e;
    }
}