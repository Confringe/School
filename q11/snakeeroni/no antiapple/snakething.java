public class snakething {
    private int posx;
    private int posy;
    public snakething(int posx, int posy){
        this.posx=posx;
        this.posy=posy;
    }
    
    public int returnposx(){
        return this.posx;
    }
    
    public int returnposy(){
        return this.posy;
    }
    
    public boolean compare(snakething input){
        return input.returnposx()==this.posx && input.returnposy()==this.posy;
    }
}
