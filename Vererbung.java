package auto;

/**
 *
 * @author Nils
 */
public class Vererbung {

    public static void main(String[] args) {

        Audi a6 = new Audi();       //Erstellung von 2 Objekten
        Bmw z3 = new Bmw();
        
        a6.reparieren();        // Methoden können dank Vererbung hier Verwendet werden
        z3.reparieren();
        
        
    }

}
