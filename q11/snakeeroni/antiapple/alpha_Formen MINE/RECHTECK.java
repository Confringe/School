import ea.edu.RechteckE;

/**
 * Diese Klasse stellt ein einfaches Rechteck dar.
 */


public class RECHTECK {
    
    /**
     * Das Symbol, das dieses Rechteck darstellt.
     */
    private RechteckE symbol;
    
    /**
     * Die Farbe dieses Rechtecks
     */
    private String farbe;
    
    /**
     * Gibt an, ob dieses Rechteck sichtbar ist.
     */
    private boolean sichtbar;
    
    /**
     * Breite des Rechtecks
     */
    private int breite;
    
    /**
     * Hoehe des Rechtecks
     */
    private int hoehe;
    
    /**
     * x-Koordinate ds Mittelpunkts
     */
    private int M_x;
    
    /**
     * y-Koordinate des Mittelpunkts
     */
    private int M_y;
    
    /**
     * Konstruktor der Klasse <code>RECHTECK</code>. Erstellt ein neues Rechteck.
     */
    public RECHTECK() {
        this.sichtbar = true;
        this.farbe = "Rot";
        this.breite = 200;
        this.hoehe = 130;
        this.M_x = 250;
        this.M_y = 265;
        this.symbol = new RechteckE();
    }
    
    /**
     * Setzt die Hoehe und Breite dieses Rechtecks neu.
     * @param   breite  Die neue Breite dieses Rechtecks
     * @param   hoehe   Die neue Hoehe dieses Rechtecks
     */
    public void setzeGroesse(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
        this.symbol.masseSetzen(breite, hoehe);
    }
    
    /**
     * Setzt die Farbe dieses Rechtecks neu.
     * @param   farbeNeu    Diese Farbe erhaelt das Rechteck (z.B. "Rot")
     */
    public void setzeFarbe(String farbeNeu) {
        this.farbe = farbeNeu;
        this.symbol.farbeSetzen(farbe);
    }
    
    /**
     * Setzt den Mittelpunkt dieses Rechtecks neu.
     * @param   m_x Die X-Koordinate des neuen Mittelpunktes
     * @param   m_y Die Y-Koordinate des neuen Mittelpunktes
     */
    public void setzeMittelpunkt(int m_x, int m_y) {
        this.M_x = m_x;
        this.M_y = m_y;
        this.symbol.mittelpunktSetzen(m_x, m_y);
    }
    
    /**
     * Setzt, ob dieses Rechteck sichtbar sein soll.
     * @param   sichtbarNeu Ist dieser Wert <code>true</code>, ist nach dem Aufruf dieser Methode dieses Rechteck 
     * sichtbar. Ist dieser Wert <code>false</code>, so ist nach dem Aufruf dieser Methode dieses Rechteck unsichtbar.
     */
    public void setzeSichtbar(boolean sichtbarNeu) {
        this.sichtbar = sichtbarNeu;
        this.symbol.sichtbarSetzen(sichtbarNeu);
    }
    
    /**
     * Verschiebt dieses Rechteck um eine Verschiebung - angegeben durch ein "Delta X" und "Delta Y".
     * @param   deltaX  Der X Anteil dieser Verschiebung. Positive Werte verschieben nach rechts, negative nach links.
     * @param   deltaY  Der Y Anteil dieser Verschiebung. Positive Werte verschieben nach unten, negative nach oben.
     */
    public void verschiebenUm(int deltaX, int deltaY) {
        this.M_x = this.M_x + deltaX;
        this.M_y = this.M_y + deltaY;
        this.symbol.verschieben(deltaX, deltaY);
    }
    
    
    
//     /**
//      * Gibt das Symbol als grafisches Objekt aus.<br />
//      * Diese Methode braucht man nicht nutzen.
//      * @return  Das Symbol dieses Rechtecks. Dies ist ein echtes, grafisches Objekt.
//      */
//     public RechteckE symbol() {
//         return this.symbol;
//     }


    
//     /**
//      * Diese Methode prueft dieses Rechteck und ein weiteres Rechteck auf Kollision.
//      * @param   r   Das Rechteck, auf dessen Ueberschneiden mit dem die Methode ausfuehrenden Rechteck geprueft werden soll.
//      * @return  <code>true</code>, wenn sich die beiden Rechteck ueberlagern - also schneiden - sonst <code>false</code>.
//      */
//     public boolean schneidet(RECHTECK r) {
//         return symbol.schneidet(r.symbol());
//     }
    
//     /**
//      * Diese Methode prueft dieses Rechteck und einen Kreis auf Kollision.
//      * @param   k   Der Kreis, auf dessen Ueberschneiden mit dem die Methode ausfuehrenden Rechteck geprueft werden soll.
//      * @return  <code>true</code>, wenn sich Kreis und Rechteck ueberlagern - also schneiden - sonst <code>false</code>.
//      */
//     public boolean schneidet(KREIS k) {
//         return symbol.schneidet(k.symbol());
//     }
    
//     /**
//      * Diese Methode prueft dieses Rechteck und ein Dreieck auf Kollision.
//      * @param   d   Das Dreieck, auf dessen Ueberschneiden mit dem die Methode ausfuehrenden Rechteck geprueft werden soll.
//      * @return  <code>true</code>, wenn sich Dreieck und Rechteck ueberlagern - also schneiden - sonst <code>false</code>.
//      */
//     public boolean schneidet(DREIECK d) {
//         return symbol.schneidet(d.symbol());
//     }
    
}