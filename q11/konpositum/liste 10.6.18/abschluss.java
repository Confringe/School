public class abschluss extends listenelement{
    public knoten add(String name, int nummer){
        return new knoten(name, nummer);
    }
    
    public int lenght(){
        return 0;
    }
    
    public eintrag get(int pos){
        return null;
    }
    
    public eintrag getlast(eintrag data){
        return data;
    }
    
    public int searchnummer(String name){
        return -1;
    }
    
    public String searchname(int nummer){
        return "Kein Kontakt mit der nummer"+Integer.toString(nummer);
    }
    
    public listenelement deletefirst(){
        return this;
    }
    
    public listenelement delete(String name, int nummer){
        return this;
    }
    
    public listenelement deletelast(int las){
        return this;
    }
    
    public listenelement addsorted(String name, int nummer){
        return new knoten(name, nummer);
    }
}