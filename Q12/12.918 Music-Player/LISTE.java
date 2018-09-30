public class LISTE {
    private LISTENELEMENT erster=new ABSCHLUSS();
    private int lastsong=-1;
    public LISTE(){
        this.add("despacito");
        this.add("despacitoo");
        this.add("despacitooo");
        this.add("despacitoooo");
        this.add("despacitooooo");
        this.add("despacitoooooo");
        this.shuffle();
        this.shuffle();
        this.shuffle();
        this.shuffle();
        this.shuffle();
        this.shuffle();
        this.shuffle();
        this.shuffle();
        this.shuffle();
        this.shuffle();
        this.shuffle();
        this.shuffle();
        this.shuffle();
        this.shuffle();
        this.shuffle();
        this.shuffle();
    }
    
    public void add(String l){
        this.erster=this.erster.add(l);
    }
    
    public int nennelaenge(){
        return erster.laenge(0);
    }
    
    public void shuffle(){
        int ran=(int)(Math.random() * ((this.nennelaenge()+1)-1));
        while(ran==lastsong){
            ran=(int)(Math.random() * ((this.nennelaenge()+1)-1));
        }
        erster.shuffle(ran);
        lastsong=ran;
    }
}