/**
 * eintrag
 */ 
public class Eintrag {
    private Eintrag next;
    private int nummer;
    private String name;

    public Eintrag(int num, String nam){
        this.nummer=num;
        this.name=nam;
    }
    public void add(Eintrag e) {
        if(this.next==null){
            this.next=e;
        } else if (e.getName().compareTo(this.next.getName())<=0) {
            e.setNext(this.next);
            this.next=e;
        } else{
            this.next.add(e);
        }
    }

    public boolean delete(String name, int nummer) {
        if (this.next==null) {
            return false;
        } else if(this.next.getName()==name && this.next.getNummer()==nummer){
            this.next=this.next.getNext();
            return true;
        } else {
            return this.next.delete(name, nummer);
        }
    }

    public int suche(int nummer, String name, int pos) {
        if (this.next==null) {
            return 0;
        } else if (this.next.getName()==name && this.next.getNummer()==nummer) {
            return pos;
        } else {
            return this.next.suche(nummer, name,++pos);
        }
    }
    
    public String sucheName(int nummer) {
        if (this.nummer==nummer) {
            return this.name;
        } else if (this.next==null) {
            return "Nicht vorhanden";
        } else {
            return this.next.sucheName(nummer);
        }
    }

    public int sucheNummer(String name) {
        if  (this.name==name) {
            return this.nummer;
        } else if (this.next==null) {
            return -1;
        } else {
            return this.next.sucheNummer(name);
        }
    }

    public int laenge(int position) {
        if(this.next==null){
            return position;
        } else {
            return this.next.laenge(++position);
        }
    }

    public int laengx() {
        if(this.next==null){
            return 1;
        } else {
            return 1+this.next.laengx();
        }
    }

    public Eintrag getNext() {
        return this.next;
    }

    public void setNext(Eintrag e) {
        this.next=e;
    }
    
    public int getNummer() {
        return this.nummer;
    }

    public String getName() {
        return this.name;
    }
}