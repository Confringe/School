/**
 * telefonBuch
 */
public class Telefonbuch {
    private Eintrag erster=null;
    public void add(String name, int nummer) {
        Eintrag e=new Eintrag(nummer, name);
        if (erster==null) {
            erster=e;
        } else if (e.getName().compareTo(erster.getName())<=0) {
            e.setNext(erster);
            erster=e;
        } else {
            erster.add(e);
        }
    }
    public boolean delete(String name, int nummer) {
        if (erster==null) {
            return false;
        } else {
            if (erster.getName()==name && erster.getNummer()==nummer) {
                erster=erster.getNext();
                return true;
            } else {
                return erster.delete(name,nummer);
            }
        }
    }

    public int suche(int nummer, String name) {
        if (erster==null) {
            return 0;
        } else if (erster.getName()==name && erster.getNummer()==nummer) {
            return 1;            
        } else {
            int pos=2;
            return erster.suche(nummer,name,pos);
        }
    }

    public String sucheName(int nummer) {
        if (erster==null) {
            return "Nicht vorhanden";
        } else {
            return erster.sucheName(nummer);
        }
    }

    public int sucheNummer(String name) {
        if (erster==null) {
            return -1;
        } else {
            return erster.sucheNummer(name);
        }
    }

    public int laenge() {
        if (erster==null) {
            return 0;
        } else {
            int pos=1;
            return erster.laenge(pos); 
        }
    }

    public int laengx() {
        if (erster==null) {
            return 0;
        } else {
            return erster.laengx();
        }
    }
    
}