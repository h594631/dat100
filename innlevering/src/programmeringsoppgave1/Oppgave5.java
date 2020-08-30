package programmeringsoppgave1;

import static javax.swing.JOptionPane.*;

public class Oppgave5 {

	public static void main(String[] args) {
		// a) Les inn poengsum (heltall), skriv ut karakter A-F
		// b) Utvid programmet til å lese inn poeng fra 10 studenter
		// c) Kontroller innlesing til å kun tillate verdi fra 0 til 100
		
		for (int i = 0; i < 10; i++) {
			int poengsum = -1;
			
			while (poengsum < 0 || poengsum > 100) {
				poengsum = Integer.parseInt(showInputDialog("Skriv inn poengsum: "));
			}
			
			String karakter = "Karakter: ";
			if (poengsum > 89) {
				karakter += "A";
			}
			else if (poengsum > 79) {
				karakter += "B";
			}
			else if (poengsum > 59) {
				karakter += "C";
			}
			else if (poengsum > 49) {
				karakter += "D";
			}
			else if (poengsum > 39) {
				karakter += "E";
			}
			else {
				karakter += "F";
			}
			showMessageDialog(null, karakter);
			}
	}

}
