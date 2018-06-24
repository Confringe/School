public class abschluss extends element{
    public element add(int posx, int posy){
        return new knoten(posx, posy);
    }
    
    public int length(){
        return 0;
    }
    
    public boolean check(int posx, int posy){
        return false;
    }
}