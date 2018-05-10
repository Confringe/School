public class eintrag {
    String name;
    int nummer;

    public eintrag(String name, int nummer){
        this.name=name;
        this.nummer=nummer;
    }

    public int returnNummer() {
        return nummer;
    }

    public String returnName() {
        return name;
    }
}