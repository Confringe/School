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

    public Eintrag getNext() {
        return this.next;
    }
    
    public int getNummer() {
        return this.nummer;
    }

    public String getName() {
        return this.name;
    }
}