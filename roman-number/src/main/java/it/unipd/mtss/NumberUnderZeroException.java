////////////////////////////////////////////////////////////////////
// CARLO ROSSO 2034293 
// LEONARDO BASSO 2042329 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NumberUnderZeroException extends Exception {
    /* Eccezione per i numeri sotto lo zero */
    public NumberUnderZeroException() {
        super("Non esistono numeri romani in negativo.");
    }
}
