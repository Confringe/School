public class liste {
    private listenelement erster= new abschluss();
    public void add(String name, int nummer){
        if(erster instanceof abschluss){
            knoten e=new knoten(name,nummer);
            e.setnext(erster);
            erster=e;
        } else{
            erster.add(name,nummer);
        }
    }

    public void delete(String name, int nummer){
        if(erster instanceof knoten){
            erster.delete(name,nummer);
        } 
    }
}