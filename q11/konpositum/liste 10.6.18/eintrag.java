public class eintrag{
    private String name;
    private int nummer;
    public eintrag(String name, int nummer){
        this.name=name;
        this.nummer=nummer;
    }
    
    public String returnname(){
        return this.name;
    }
    
    public int returnnummer(){
        return this.nummer;
    }
}