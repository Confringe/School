public class knoten extends listenelement{
    private listenelement next=new abschluss();
    private eintrag data; 
    public knoten(String name, int nummer){
        this.data=new eintrag(name, nummer);
    }
    
    public void setnext(listenelement next){
        this.next=next;
    }
    
    public eintrag returndata(){
        return data;
    }
    
    //---------------------------------------------------------------------- 
    
    public knoten add(String name, int nummer){
        this.next=this.next.add(name, nummer);
        return this;
    }
    
    public int lenght(){
        return 1+next.lenght();
    }
    
    public eintrag get(int pos){
        if(pos==0){
            return this.data;
        } else{
            return this.next.get(pos-1);
        }
    }
    
    public eintrag getlast(eintrag data){
        return next.getlast(this.data);
    }
    
    public int searchnummer(String name){
        if(name==this.data.returnname()){
            return data.returnnummer();
        } else{
            return this.next.searchnummer(name);
        }
    }
    
    public String searchname(int nummer){
        if(nummer==this.data.returnnummer()){
            return data.returnname();
        } else{
            return this.next.searchname(nummer);
        }
    }
    
    public listenelement deletefirst(){
        return this.next;
    }
}