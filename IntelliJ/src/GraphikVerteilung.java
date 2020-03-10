import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GraphikVerteilung extends JPanel {
	private Klassenarbeit ka;
	private int balkenbreite = 20;
	private int balkenhoehe = 20;

	public GraphikVerteilung(Klassenarbeit ka) {
		this.ka = ka;
		setSize(350, 250);
	}

	@Override
	public void paintComponent(Graphics g) {
		zeichneKoordinatenSystem(g);
		zeichneXbeschriftung(g);
		zeichneYbeschriftung(g);
		zeichneNoten(g);
	}

	private void zeichneKoordinatenSystem(Graphics g) {
		g.drawLine(20, 230, 20, 50);
		g.drawLine(20, 230, 350, 230);
	}

	private void zeichneXbeschriftung(Graphics g) {
		for (int i = 0; i < 16; i++) { // waagrechte Beschriftung
			g.drawString("" + i, 25 + (balkenbreite * i), 240);
		}
	}

	private void zeichneYbeschriftung(Graphics g) {
		for (int i = 1; i < 5; i++) { // senkrechte Beschriftung
			g.drawString("" + i, 10, 240 - balkenhoehe - (i * balkenhoehe));
		}
	}

	private void zeichneNoten(Graphics g) {
		g.setColor(Color.RED);
		for (int i = 0; i < 6; i++)
			g.fillRect(20 + i * balkenbreite, 230- balkenhoehe * ka.getNotenVerteilung(i), balkenbreite, balkenhoehe * ka.getNotenVerteilung(i));
	}
}
