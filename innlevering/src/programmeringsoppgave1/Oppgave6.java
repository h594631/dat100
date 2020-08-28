package programmeringsoppgave1;

import static javax.swing.JOptionPane.*;

public class Oppgave8 {
	
	public static int fakultet(int n) {
		if (n <= 1) {
			return 1;
		}
		else {
			return n * fakultet( n - 1);
		}
	}

	public static void main(String[] args) {
		// Oppgave 6 - Obligatorisk innlevering
		
		int heltall = 0;
		while (heltall < 1) {
			heltall = Integer.parseInt(showInputDialog("Skriv inn heltall > 0: "));
		}
		
		// Les inn heltall n > 0, beregn verdi n fakultet
		showMessageDialog(null, fakultet(heltall));
		
	}

}
