public class abschluss extends snakeelement{
    public snakeelement returnnext(){
        return this;
    }
    
    public snakeelement offer(int posx, int posy){
        return new knoten(posx, posy);
    }
    
    public snakething poll(){
        return null;
    }
    
    public boolean comparedata(snakething input){
        return false;
    }
    
    public snakething getlast(snakething thing){
        return thing;
    }
    
    public snakething get(int pos){
        return null;
    }
    
    public snakething getfirst(){
        return null;
    }
    
    public void setnext(snakeelement next){
        
    }
}
