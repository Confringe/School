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
            knoten xd=(knoten)this.erster;
            if(name==xd.returnname() && nummer==xd.returnnummer()){
                erster=xd.returnnext();
            } else {
                erster.delete(name,nummer);
            }
        }
    }
}