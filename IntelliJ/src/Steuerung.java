import javax.swing.JFrame;
/*
 * bearbeitet von: IhrName
 */

public class Steuerung {
	Klassenarbeit ka;
	JFrame grafik;

	Steuerung() {
		ka = new Klassenarbeit();
		grafik = new JFrame();
	}

	public static void main(String[] args) {
		GUI dieGUI = new GUI();
		dieGUI.setVisible(true);
	}

	public void erfassenKaInfo(String pFach, String pKlasse) {
		ka.setKaInfo(pFach, pKlasse);
	}

	public void erfassenNeueNote(int pNote) {
		ka.setNeueNote(pNote);
	}

	public int getAnzahlErfasst() {
		int temp = ka.getAnzahlEingegebene();
		return temp;
	}

	public double getDurchschnitt() {
		double temp = ka.getDurchschnitt();
		return temp;
	}

	public void aufrufenGrafik() {
		grafik.setSize(400, 300);
		grafik.setTitle("Auswertung - " + ka.getKaInfo());
		grafik.add(new GraphikVerteilung(ka));
		grafik.setVisible(true);
	}

	public void speichereKlassenarbeit() {

	}
}
