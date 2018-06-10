public class liste{
    private listenelement erster=new abschluss();
    
    public liste(){
        addsorted("f",6);       
        addsorted("c",3);
        addsorted("a",1);        
        addsorted("d",4);
        addsorted("e",5);
        addsorted("b",2);        
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
    
    public void delete(String name, int nummer){
        this.erster=this.erster.delete(name, nummer);
    }
    
    public void deletelast(){
        this.erster=this.erster.deletelast(lenght()-1);
    }
    
    public void addsorted(String name, int nummer){
        this.erster=this.erster.addsorted(name, nummer);
    }
}