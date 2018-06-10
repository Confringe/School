public class liste{
    private listenelement erster=new abschluss();
    
    public liste(){
        add("a",1);
        add("b",2);
        add("c",3);
        add("d",4);
        add("e",5);
    }
    
    //---------------------------------------------------------------------- 
    
    public void add(String name, int nummer){
        this.erster=this.erster.add(name, nummer);
    }
    
    public void addfirst(String name, int nummer){
        knoten k=new knoten(name, nummer);
        k.setnext(erster);
        this.erster=k; 
    }
    
    public int lenght(){
        return erster.lenght();
    }
    
    public eintrag get(int pos){
        return erster.get(pos);
    }
    
    public eintrag getlast(){
        return erster.getlast(null);
    }
    
    public int searchnummer(String name){
        return erster.searchnummer(name);
    }
    
    public String searchname(int nummer){
        return erster.searchname(nummer);
    }
    
    public void deletefirst(){
        erster=erster.deletefirst();
    }
}