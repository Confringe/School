public class stack{
    private stackelement erster;
    private int length;
    public stack(){
        this.erster=new abschluss();
        this.length=-1;
        lastin();
        lastin();
        lastin();
        lastin();
        lastin();
        lastin();
        lastin();
        lastin();
        lastin();
        lastin();
    }
    
    public void lastin(){
        this.erster=this.erster.lastin(0);
        length++;
        printeroni();
    }
    
    public stackelement firstout(){
        if(length==-1){
            return null;
        } else if(length==0){
            stackelement k=this.erster;
            this.erster=new abschluss();
            length--;
            printeroni();
            return k;
        }
        length--;
        printeroni();
        return this.erster.firstout(this.length);
    }
    
    public void printeroni(){
        System.out.println("Abschluss ++++++++++++++++++");
        for(int i=length+1; i>0; i--){
            get(i).printerino();
        }
        System.out.println();
    }
    
    public stackelement get(int pos){
        return this.erster.get(pos);
    }
}