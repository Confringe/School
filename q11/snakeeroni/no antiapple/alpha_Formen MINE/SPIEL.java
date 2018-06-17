import ea.*;
import ea.edu.*;
import manager.*;


/**
 * Die Klasse SPIEL stellt Faehigkeiten zur Verfuegung die von vielen Spielen benoetigt werden. So kann die
 * Klasse SPIEL auf Tastendruecke des Benutzers reagieren, zeigt einen Punktestand an und ruft in kurzen 
 * Zeitabstaenden die Methode tick() auf.
 * 
 * @author Benedikt Lindemann
 */
public class SPIEL implements TICKER, TASTENREAGIERBAR
{
    private MANAGER manager;
    protected int i = 0;
    
    /**
     * Konstruktor fuer Objekte der Klasse SPIEL
     */
    public SPIEL() {
        this.manager = new MANAGER();
        this.manager.tickerAnmelden(this,10);
        this.manager.tastenReagierbarAnmelden(this);
    }
    
    public SPIEL(int tickDelay) {
        this.manager = new MANAGER();
        this.manager.tickerAnmelden(this,tickDelay);
        this.manager.tastenReagierbarAnmelden(this);
    }

    @Override
    public void tick() {
        i++;
        String s = "";
        if (i % 2 == 1) {
            s="tick...";
        } else {
            s = "tack...";
        }
        System.out.println(s);
    }

    @Override
    public void tasteReagieren(int code) {
        System.out.println("Taste gedrueckt mit Code: "+code);
    }
    
    /**
     * Die Methode setzePunkteLinks setzt den Punktestand des linken Spielers auf den uebergebenen
     * Wert.
     *
     * @param punkteLinks Der Punktestand des linken Spielers.
     */
    public void setzePunkteLinks(int punkteLinks) {
        this.manager.punkteLinksSetzen(punkteLinks);
    }
    
    /**
     * Die Methode setzePunkteRechts setzt den Punktestand des rechten Spielers auf den uebergebenen
     * Wert.
     *
     * @param punkteRechts Der Punktestand des rechten Spielers.
     */
    public void setzePunkteRechts(int punkteRechts) {
        this.manager.punkteRechtsSetzen(punkteRechts);
    }
}
