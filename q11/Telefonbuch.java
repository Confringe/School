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

    public boolean suche(int nummer, String name) {
        if (erster==null) {
            return false;
        } else if (erster.getName()==name && erster.getNummer()==nummer) {
            return true;            
        } else {
            return erster.suche(nummer,name);
        }
    }
    
}