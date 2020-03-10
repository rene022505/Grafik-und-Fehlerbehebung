import java.util.ArrayList;

public class Klassenarbeit {
	private String fach;
	private String klasse;
	private ArrayList<Integer> notenListe;
	private ArrayList<Integer> notenVerteilung;

	public Klassenarbeit() {
		notenListe = new ArrayList<Integer>();
		notenVerteilung = new ArrayList<Integer>();
		erzeugenNotenVerteilung();
	}

	public void setKaInfo(String pFach, String pKlasse) {
		fach = pFach;
		klasse = pKlasse;
	}

	public String getKaInfo() {
		String temp = klasse + " " + fach;
		return temp;
	}

	public void setNeueNote(int pNote) {
		notenListe.add(pNote);
		notenVerteilung.set(pNote, notenVerteilung.get(pNote) + 1);
		getAnzahlEingegebene();
	}

	public int getNote(int pIndex) {
		int temp = notenListe.get(pIndex);
		return temp;
	}

	public int getNotenVerteilung(int pIndex) {
		int temp = notenVerteilung.get(pIndex);
		return temp;
	}

	public int getNotenVerteilungAnzahl() {
		int temp = notenVerteilung.size();
		return temp;
	}

	public int getAnzahlEingegebene() {
		return notenListe.size();
	}

	public double getDurchschnitt() {
		double summe = 0.0;
		double durchschnitt;
		for (int i = 0; i < notenListe.size(); i++) {
			summe = summe + notenListe.get(i);
		}
		durchschnitt = summe / notenListe.size();
		return durchschnitt;
	}

	private void erzeugenNotenVerteilung() {
		for (int i = 0; i <= 15; i++) {
			notenVerteilung.add(0);
		}
	}
}

