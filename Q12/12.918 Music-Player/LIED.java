public class LIED {
    private String songName;
    public LIED(String name){
        this.songName=name;
    }
    
    public void play(){
        System.out.println("Now playing: "+this.songName);
    }
}