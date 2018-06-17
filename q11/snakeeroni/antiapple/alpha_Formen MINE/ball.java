public class ball
{
    private int radius;
    private int y;
    private int x;
    private String farbe;
    private int vy;
    private int vx;
    private KREIS k;
    
    public ball()
    {
        this.radius=20;
        this.y=300;
        this.x=400;
        this.farbe="weiss";
        this.vy=5;
        this.vx=5;
        k = new KREIS(); 
        k.setzeFarbe(this.farbe);
        k.setzeMittelpunkt(this.x, this.y);
        k.setzeRadius(this.radius);
    }

    public void setzempunkt(int x, int y)
    {
        this.x=x;
        this.y=y;
        k.setzeMittelpunkt(this.x, this.y);
    }
    
    public void bewegen()
    {
        this.x=this.x+this.vx;
        this.y=this.y+this.vy;
        k.setzeMittelpunkt(this.x, this.y);
    }
    
    public int nenneradius()
    {
        return this.radius;
    }
    
    public int nenney()
    {
        return this.y;
    }
    
    public int nennex()
    {
        return this.x;
    }
    
    public String nennefarbe()
    {
        return this.farbe;
    }
    
    public int nennevy()
    {
        return this.vy;
    }
    
    public int nennevx()
    {
        return this.vx;
    }
    
    public void setzeradius(int radius)
    {
        this.radius=radius;
        k.setzeRadius(this.radius);
    }
    
    public void setzey(int y)
    {
        this.y=y;
        k.setzeMittelpunkt(this.x, this.y);
    }
    
    public void setzex(int x)
    {
        this.x=x;
        k.setzeMittelpunkt(this.x, this.y);
    }
    
    public void setzefarbe(String farbe)
    {
        this.farbe=farbe;
        k.setzeFarbe(this.farbe);
    }
    
    public void setzevy(int vy)
    {
        this.vy=vy;
    }
    
    public void setzevx(int vx)
    {
        this.vx=vx;
    }
}
