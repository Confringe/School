public class snake extends SPIEL {
    private RECHTECK background=new RECHTECK();
    private RECHTECK[][] grid;
    private int dirx;
    private int diry;
    private int dirxx;
    private int diryy;
    private snakeelement erster;
    private snakething apple;
    private int length;
    
    private snakeelement ersterantiapple;
    public snake(){
        super(50);
        this.length=1;
        this.background.setzeMittelpunkt(0, 0);
        this.background.setzeFarbe("schwarz");
        this.background.setzeGroesse(1000, 1000);
        this.grid=new RECHTECK[40][30];
        this.erster=new knoten(grid.length/2,grid[0].length/2);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                grid[i][j]=new RECHTECK();
                grid[i][j].setzeGroesse(800/grid.length-1, 600/grid[0].length-1);
                grid[i][j].setzeMittelpunkt(800/grid.length/2+800/grid.length*i, 600/grid[0].length/2+600/grid[0].length*j);
                grid[i][j].setzeFarbe("grau");
            }
        }
        createnewapple();
        grid[this.apple.returnposx()][this.apple.returnposy()].setzeFarbe("rot");
        
        this.ersterantiapple=new abschluss();
    }
    
    public void createnewapple(){
        snakething data=new snakething((int)(Math.random()*grid.length), (int)(Math.random()*grid[0].length));
        while(!checkall(data, this.erster)){
            data=new snakething((int)(Math.random()*grid.length), (int)(Math.random()*grid[0].length));
        }
        apple=data;
        grid[this.apple.returnposx()][this.apple.returnposy()].setzeFarbe("rot");
    }
    
    public void createnewantiapple(){
        if(length/3!=this.ersterantiapple.length()){
            snakething data=new snakething((int)(Math.random()*grid.length), (int)(Math.random()*grid[0].length));
            int posx=(int)(Math.random()*grid.length);
            int posy=(int)(Math.random()*grid[0].length);
             while(!checkall(data, this.erster) || apple.compare(data)){
                posx=(int)(Math.random()*grid.length);
                posy=(int)(Math.random()*grid[0].length);
                data=new snakething(posx, posy);
            }
            this.ersterantiapple=this.ersterantiapple.offer(posx, posy);
            grid[posx][posy].setzeFarbe("gruen");
        }
    }
    
    public void checkantiapple(){
        for(int i=0; i<this.ersterantiapple.length(); i++){
            if(getlast().compare(get(i, this.ersterantiapple))){
                this.ersterantiapple=this.ersterantiapple.delete(i);
                dedye();
                poll();
                createnewantiapple();
            }
        }
    }
    
    public void offer(int posx, int posy){
        this.erster=this.erster.offer(posx, posy);
    }
    
    public snakething poll(){
        snakeelement k=this.erster;
        this.erster=this.erster.returnnext();
        return k.poll();
    }
    
    public void move(){
        int posx=getlast().returnposx()+dirxx;
        int posy=getlast().returnposy()+diryy;
        if(posx>grid.length-1 || posx<0){
            dye();
            end();
        }
        else if(posy>grid[0].length-1 || posy<0){
            dye();
            end();
        } else {
            poll();
            offer(posx, posy);
        }
    }
    
    public snakething get(int pos, snakeelement thingi){
        return thingi.get(pos);
    }
    
    public snakething getlast(){
        return this.erster.getlast(null);
    }
    
    public snakething getfirst(){
        return this.erster.getfirst();
    }
    
    public void dye(){
        int posx=getlast().returnposx();
        int posy=getlast().returnposy();
        grid[posx][posy].setzeFarbe("weiss");
    }
    
    public void dedye(){
        int posx=getfirst().returnposx();
        int posy=getfirst().returnposy();
        grid[posx][posy].setzeFarbe("grau");
    }

    public void setfirst(snakeelement k){
        snakeelement kk=this.erster;
        this.erster=k;
        k.setnext(kk);
    }
    
    public void eat(){
        if(this.length==1){
            setfirst(new knoten(getfirst().returnposx()-dirxx, getfirst().returnposy()-diryy));
        } else{
            int posx=getfirst().returnposx()+(getfirst().returnposx()-get(1, this.erster).returnposx());
            int posy=getfirst().returnposy()+(getfirst().returnposy()-get(1, this.erster).returnposy());
            setfirst(new knoten(posx, posy));
        }
        length++;
    }
    
    //w==22 s==18 a==0 d==3
    public void tasteReagieren(int code){
        if(code==22 && diry!=1){
            diry=-1;
            dirx=0;
        }
        if(code==18 && diry!=-1){
            diry=1; 
            dirx=0;
        }
        if(code==0 && dirx!=1){
            dirx=-1;
            diry=0;
        }
        if(code==3 && dirx!=-1){
            dirx=1;
            diry=0;
        }
        if(code==4){
            eat();
        }
    }
    
    public boolean checkall(snakething input, snakeelement thing){
        for(int i=0; i<thing.length()-1; i++){
            if(input.compare(get(i, thing))){
                return false;
            }
        }
        return true;
    }
    
    public int checkpos(snakething input, snakeelement thing){
        for(int i=0; i<thing.length()-1; i++){
            if(input.compare(get(i, thing))){
                return i;
            }
        }
        return -1;
    }
    
    public int end(){
        for(int i=0; i<length; i++){
            poll();
        }
        return length;
    }
    
    @Override
    public void tick(){
        if(Math.abs(dirxx)+Math.abs(dirx)==1){
            dirxx=dirx;
        }
        if(Math.abs(diryy)+Math.abs(diry)==1){
            diryy=diry;
        }
        dedye();
        move();
        dye();
        //grid[getfirst().returnposx()][getfirst().returnposy()].setzeFarbe("orange");
        if(getlast().compare(apple)){
            eat();
            createnewapple();
        }
        checkantiapple();
        createnewantiapple();
        if(!checkall(getlast(), this.erster)){
            end();
        }
    }
    
    //to do: anti spawning in snake; snakething spawning outside the grid
}