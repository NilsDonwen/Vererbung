
package auto;

/**
 *
 * @author Nils
 */
public class Audi extends Auto {        // Festlegen von welcher Klasse geerbt werden soll
                                       // Audi ist also jetzt eine Unterklasse der Überklasse (Superklasse) Auto
                                      // sprich alle Methoden der Überklasse Auto können verwendet werden

public void reparieren(){
    
    System.out.println("Herzlichen Glückwunsch! Dein AUDI wurde repariert!");      /* Soll in diesem Falle ein anderer Text ausgegeben
                                                                                   werden muss die Methode aufgerufen werden und 
                                                                                   entsprechend geändert werden
                                                                                    --> Die Methode wird also ÜBERSCHRIEBEN*/
                                                                                                        


}

}
