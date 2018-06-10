public abstract class listenelement
{
    public abstract knoten add(String name, int nummer);
    public abstract int lenght();
    public abstract eintrag get(int pos);
    public abstract eintrag getlast(eintrag data);
    public abstract int searchnummer(String name);
    public abstract String searchname(int nummer);
    public abstract listenelement deletefirst();
}
