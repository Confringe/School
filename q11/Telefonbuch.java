/**
 * telefonBuch
 */
public class Telefonbuch {
    private Eintrag erster=null;
    public void add(String name, int nummer) {
        Eintrag e=new Eintrag(nummer, name);
        if (erster==null) {
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

    public int laenge() {
        if (erster==null) {
            return 0;
        } else {
            int pos=1;
            return erster.laenge(pos); 
        }
    }
    
}