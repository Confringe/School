public class schlaeger
{
    private int hoehe;
    private int breite;
    private int y;
    private int x;
    private String farbe;
    private int vy;
    private RECHTECK e;

    public schlaeger()
    {
        this.hoehe=100;
        this.breite=100;
        this.y=0;
        this.x=0;
        this.farbe="weiss";
        this.vy=5;
        e = new RECHTECK();
        e.setzeFarbe(this.farbe);
        e.setzeGroesse(this.breite, this.hoehe);
        e.setzeMittelpunkt(this.x, this.y);
    }

    public void bewegen()
    {
        this.y=this.y+this.vy;
        e.setzeMittelpunkt(this.x, this.y);
    }
    
    public void erhoehen()
    {
       if (this.vy>0){this.vy=0;}
       else {this.vy++;}
    }
    
    public void setzempunkt(int x, int y)
    {
        this.x=x;
        this.y=y;
        e.setzeMittelpunkt(this.x, this.y);
    }
    
    public void setzegroesse(int breite, int hoehe)
    {
        this.breite=breite;
        this.hoehe=hoehe;
        e.setzeGroesse(this.breite, this.hoehe);
    }
    
    public int nennehoehe()
    {
        return this.hoehe;
    }

    public int nennebreite()
    {
        return this.breite;
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

    public void setzehoehe(int hoehe)
    {
        this.hoehe=hoehe;
        e.setzeGroesse(this.breite, this.hoehe);
    }

    public void setzebreite(int breite)
    {
        this.breite=breite;   
        e.setzeGroesse(this.breite, this.hoehe);
    }
    
    public void setzey(int y)
    {
        this.y=y;
        e.setzeMittelpunkt(this.x, this.y);
    }
    
    public void setzex(int x)
    {
        this.x=x;
        e.setzeMittelpunkt(this.x, this.y);
    }
    
    public void setzefarbe(String farbe)
    {
        this.farbe=farbe;
        e.setzeFarbe(this.farbe);
    }
    
    public void setzevy(int vy)
    {
        this.vy=vy;
    }
}
