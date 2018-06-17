public abstract class snakeelement {
    public abstract snakeelement offer(int posx, int posy);
    public abstract snakething poll();
    public abstract snakeelement returnnext();
    public abstract boolean comparedata(snakething input);
    public abstract snakething getlast(snakething thing);
    public abstract snakething get(int pos);
    public abstract snakething getfirst();
    public abstract void setnext(snakeelement next);
}
