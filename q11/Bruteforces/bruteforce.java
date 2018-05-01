/**
 * bruteforce
 */
public class bruteforce {
    static char[] target;
    static char[] atm;


    public static void main(String[] args) {
        force("Nimm mein Geld mit");
    }

    public static void force(String wow) {
        target=wow.toCharArray();
        atm=new char[target.length];
        int i=0;
        while (i<target.length) {
            for (int j = 0; j < atm.length; j++) {
                System.out.print(atm[j]);    
            }
            System.out.println("");
            int rnd=(int) (Math.random()*94)+32;
            atm[i]=(char)rnd;
            if ((char)rnd==target[i]) {
                i++;
            for (int j = 0; j < atm.length; j++) {
                System.out.print(atm[j]);    
            }
            System.out.println("");
            }
        try {
            Thread.currentThread().sleep(6);    
        } catch (Exception e) {
            
        }       
        }
    }
}