////////////////////////////////////////////////////////////////////
// CARLO ROSSO 2034293 
// LEONARDO BASSO 2042329 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
	public static String print(int num) throws NumberUnderZeroException, NumberAEFiveThousand { 
		return printAsciiArt(IntegerToRoman.convert(num));
	}
	private static String printAsciiArt(String romanNumber) {
		//TODO
		return null;
	}
}
