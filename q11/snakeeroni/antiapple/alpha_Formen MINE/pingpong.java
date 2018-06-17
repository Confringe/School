public class pingpong extends  SPIEL
{
    private schlaeger rechti;
    private schlaeger linki;
    private ball ball; 

    public pingpong()
    {
        rechti=new schlaeger();
        linki=new schlaeger();
        ball=new ball();

        rechti.setzegroesse(10,100);
        rechti.setzempunkt(790,300);
        rechti.setzevy(0);
        linki.setzegroesse(10,100);
        linki.setzempunkt(10,300);
        linki.setzevy(0);
        ball.setzeradius(10);
        ball.setzempunkt(400, 300);
    }

    public void bewegen()
    {
        if(ball.nenney()+ball.nenneradius()>= 600
        || ball.nenney()-ball.nenneradius()<=0
        )
        {
            ball.setzevy(-ball.nennevy());
        }

        linki.bewegen();
        rechti.bewegen();
        ball.bewegen();
    }

    @Override
    public void tick()
    {
        bewegen();
        
        
    }
}
