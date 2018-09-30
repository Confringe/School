public class ABSCHLUSS extends LISTENELEMENT {
    public LISTENELEMENT add(String l){
        return new KNOTEN(new LIED(l));
    }
    
    public int laenge(int num){
        return num;
    }
    
    public void shuffle(int randy){
    
    }
}