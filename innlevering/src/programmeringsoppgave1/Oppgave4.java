package programmeringsoppgave1;

import static javax.swing.JOptionPane.*;

public class Oppgave4 {

	public static void main(String[] args) {
		/* Trinnskatt:
		 * 0 < inntekt < 180800  => ingen trinnskatt
		 * Trinn 1: 180801 < inntekt < 254500 => 1.9% trinnskatt 
		 * Trinn 2: 254501 < inntekt < 639750 => 4.2% trinnskatt
		 * Trinn 3: 639751 < inntekt < 999550 => 13.2% trinnskatt ( 11.2% i Troms & Finnmark )
		 * Trinn 4: inntekt > 999550 => 16.2%
		 */
		
		/*
		 * Les inn bruttoinntekt, beregn, og skriv ut trinnskatt 
		 */
		
		int bruttoinntekt = Integer.parseInt(showInputDialog("Oppgi bruttoinntekt: "));
		double trinnskatt = 0;
		
		
		if (bruttoinntekt < 180800) {
			trinnskatt = 0;
		}
		else if (bruttoinntekt < 254500) {
			trinnskatt = bruttoinntekt * 0.019;
		}
		else if (bruttoinntekt < 639750) {
			trinnskatt = bruttoinntekt * 0.042;
		}
		else if (bruttoinntekt < 999550) {
			trinnskatt = bruttoinntekt * 0.132;
		}
		else {
			trinnskatt = bruttoinntekt * 0.162;
		}
		showMessageDialog(null, "Trinnskatt: " + (int)trinnskatt );
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
