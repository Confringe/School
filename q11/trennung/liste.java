public class liste {
    private listenelement erster= new abschluss();
    public void add(String name, int nummer){
        if(this.erster instanceof abschluss){
            this.erster=new knoten(name,nummer);
        } else{
            this.erster.add(name,nummer);
        } 
    }

    public int lenght(){
        return erster.lenght();
    }
    //--------------------------------------------------
    public boolean delete(String name, int nummer){
        if(erster instanceof knoten){
            knoten e=(knoten) erster;
            if(e.compare(name,nummer)){
                erster=e.returnnext();
                return true;
            } else {
                return e.delete(name,nummer);
            }
        }
        return false;
    }
    
    public String suchename(int nummer){
        return erster.suchename(nummer);
    }
    
    public int suchenummer(String name){
        return erster.suchenummer(name);
    }
}