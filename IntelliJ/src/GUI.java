import java.io.IOException;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {
	Steuerung dieSteuerung = new Steuerung();

	/**
	 * Creates new form GUI
	 */
	public GUI() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		txfFach = new javax.swing.JTextField();
		btnEinlesen = new javax.swing.JButton();
		txfNote = new javax.swing.JTextField();
		btnAuswerten = new javax.swing.JButton();
		btnSpeichern = new javax.swing.JButton();
		btnBeenden = new javax.swing.JButton();
		txfAnzahl = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		txfDurchschnitt = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		btnInfoEinlesen = new javax.swing.JButton();
		txfKlasse = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Notenverwaltung V1.1");

		jLabel1.setText("Fach:");

		txfFach.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
		txfFach.setText("CT");

		btnEinlesen.setText("Note einlesen");
		btnEinlesen.setMaximumSize(new java.awt.Dimension(71, 23));
		btnEinlesen.setMinimumSize(new java.awt.Dimension(71, 23));
		btnEinlesen.setPreferredSize(new java.awt.Dimension(71, 23));
		btnEinlesen.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnEinlesenActionPerformed(evt);
			}
		});

		txfNote.setForeground(new java.awt.Color(255, 51, 0));
		txfNote.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		btnAuswerten.setText("Auswerten");
		btnAuswerten.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAuswertenActionPerformed(evt);
			}
		});

		btnSpeichern.setText("Speichern");
		btnSpeichern.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnSpeichernActionPerformed(evt);
			}
		});

		btnBeenden.setText("Beenden");
		btnBeenden.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnBeendenActionPerformed(evt);
			}
		});

		txfAnzahl.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

		jLabel2.setText("Anzahl der eingegebenen Noten:");

		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel3.setText("erreichte Notenpunkte:");

		jLabel4.setText("Durchschnitt:");

		btnInfoEinlesen.setText("Info einlesen");
		btnInfoEinlesen.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnInfoEinlesenActionPerformed(evt);
			}
		});

		txfKlasse.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
		txfKlasse.setText("J1");

		jLabel5.setText("Klasse:");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGap(19, 19, 19)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup()
														.addComponent(jLabel1)
														.addGap(18, 18, 18)
														.addComponent(txfFach, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(jLabel5)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(txfKlasse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
														.addComponent(jLabel3)
														.addGap(18, 18, 18)
														.addComponent(txfNote, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGroup(layout.createSequentialGroup()
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel4)
														.addComponent(jLabel2))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
														.addComponent(txfDurchschnitt)
														.addGroup(layout.createSequentialGroup()
																.addComponent(txfAnzahl, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
																.addGap(3, 3, 3)))))
								.addGap(16, 16, 16)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(btnBeenden, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
										.addComponent(btnAuswerten, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
										.addComponent(btnInfoEinlesen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnSpeichern, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
										.addComponent(btnEinlesen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(0, 49, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1)
												.addComponent(txfFach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel5)
												.addComponent(txfKlasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(btnInfoEinlesen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btnEinlesen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel3)
										.addComponent(txfNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(txfAnzahl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnAuswerten)
										.addComponent(jLabel2))
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(txfDurchschnitt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnSpeichern)
										.addComponent(jLabel4))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
								.addComponent(btnBeenden)
								.addContainerGap())
		);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnBeendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeendenActionPerformed
		System.exit(0);
	}//GEN-LAST:event_btnBeendenActionPerformed

	private void btnEinlesenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEinlesenActionPerformed
		try {
			int note = Integer.parseInt(txfNote.getText());
			if (note >= 0 && note <= 15) {
				dieSteuerung.erfassenNeueNote(note);
				txfAnzahl.setText(String.valueOf(dieSteuerung.getAnzahlErfasst()));
			} else
				throw new UngueltigeNoteException();
		} catch (NumberFormatException | UngueltigeNoteException e) {
			JOptionPane.showMessageDialog(this, "Bitte nur ganze Zahlen zwischen 0-15 eingeben", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}//GEN-LAST:event_btnEinlesenActionPerformed

	private void btnAuswertenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuswertenActionPerformed
		txfDurchschnitt.setText(String.valueOf(dieSteuerung.getDurchschnitt()));
		dieSteuerung.aufrufenGrafik();
	}//GEN-LAST:event_btnAuswertenActionPerformed

	private void btnSpeichernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeichernActionPerformed
		dieSteuerung.speichereKlassenarbeit();
	}//GEN-LAST:event_btnSpeichernActionPerformed

	private void btnInfoEinlesenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoEinlesenActionPerformed
		String pFach = txfFach.getText();
		String pKlasse = txfKlasse.getText();
		dieSteuerung.erfassenKaInfo(pFach, pKlasse);
	}//GEN-LAST:event_btnInfoEinlesenActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnAuswerten;
	private javax.swing.JButton btnBeenden;
	private javax.swing.JButton btnEinlesen;
	private javax.swing.JButton btnInfoEinlesen;
	private javax.swing.JButton btnSpeichern;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JTextField txfAnzahl;
	private javax.swing.JTextField txfDurchschnitt;
	private javax.swing.JTextField txfFach;
	private javax.swing.JTextField txfKlasse;
	private javax.swing.JTextField txfNote;
	// End of variables declaration//GEN-END:variables
}
