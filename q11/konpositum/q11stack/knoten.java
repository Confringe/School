public class knoten extends listenelement {
    private char c;
    private listenelement next;
    
    public knoten(char CHAR, listenelement NEXT){
        this.c=CHAR;
        this.next=NEXT;
    }
    
    public listenelement poll(){
        return this.next;
    }
    
    public boolean isEmpty(){
        return false;
    }
    
    public char peek(){
        return this.c;
    }
}
