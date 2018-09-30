public class KNOTEN extends LISTENELEMENT {
    private LISTENELEMENT naechster=new ABSCHLUSS();
    private LIED data;
    public KNOTEN(LIED data){
        this.data=data;
    }
    
    public LISTENELEMENT add(String l){
        this.naechster=this.naechster.add(l);
        return this;
    }
    
    public int laenge(int num){
        return naechster.laenge(num+1);
    }
    
    public void shuffle(int randy){
        if(randy==0){
            data.play();
        } else{
            this.naechster.shuffle(randy-1);
        }
    }
}