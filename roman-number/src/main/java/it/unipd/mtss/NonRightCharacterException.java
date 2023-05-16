////////////////////////////////////////////////////////////////////
// CARLO ROSSO 2034293 
// LEONARDO BASSO 2042329 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NonRightCharacterException extends Exception {
    public NonRightCharacterException(char c) {
        super("Lettera non accettata: " + c);
    }
}
