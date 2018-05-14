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
}