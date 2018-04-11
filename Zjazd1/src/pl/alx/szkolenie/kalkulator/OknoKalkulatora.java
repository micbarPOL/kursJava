/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.alx.szkolenie.kalkulator;

import java.awt.Color;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author kurs
 */
public class OknoKalkulatora extends javax.swing.JFrame {

	/**
	 * Creates new form OknoKalkulatora
	 */
	public OknoKalkulatora() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		PierwszaLiczba = new javax.swing.JTextField();
		DrugaLiczba = new javax.swing.JTextField();
		Dzialanie = new javax.swing.JComboBox<>();
		jButton1 = new javax.swing.JButton();
		Wynik = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Kalkulator ze szkolenia");

		PierwszaLiczba.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
		PierwszaLiczba.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				PierwszaLiczbaActionPerformed(evt);
			}
		});

		DrugaLiczba.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
		DrugaLiczba.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				DrugaLiczbaActionPerformed(evt);
			}
		});

		Dzialanie.setFont(new java.awt.Font("Vivaldi", 1, 72)); // NOI18N
		Dzialanie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));
		Dzialanie.setAlignmentX(3.0F);
		Dzialanie.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
		Dzialanie.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				DzialanieActionPerformed(evt);
			}
		});

		jButton1.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
		jButton1.setText("=");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		Wynik.setEditable(false);
		Wynik.setFont(new java.awt.Font("Wide Latin", 0, 48)); // NOI18N
		Wynik.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
								.addComponent(PierwszaLiczba, javax.swing.GroupLayout.PREFERRED_SIZE, 386,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(Dzialanie, javax.swing.GroupLayout.PREFERRED_SIZE, 119,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
								.addComponent(DrugaLiczba, javax.swing.GroupLayout.PREFERRED_SIZE, 385,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(Wynik)).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(PierwszaLiczba).addComponent(DrugaLiczba)
								.addComponent(Dzialanie, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(Wynik,
								javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void przelicz() {
		try {
			double lewy = Double.parseDouble(PierwszaLiczba.getText());
			double prawy = Double.parseDouble(DrugaLiczba.getText());
			String dzialanie = Dzialanie.getSelectedItem().toString();
			double wynik = Dzialania.Dzialania(lewy, prawy, dzialanie);

			Wynik.setText(Double.toString(wynik));
			Wynik.setForeground(Color.green);
		} catch (NumberFormatException numberFormatException) {
			Wynik.setText("Niepoprawny Numer!!!");
			Wynik.setForeground(Color.red);
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

		przelicz();
	}// GEN-LAST:event_jButton1ActionPerformed

	private void DzialanieActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DzialanieActionPerformed
		przelicz();
	}// GEN-LAST:event_DzialanieActionPerformed

	private void PierwszaLiczbaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_PierwszaLiczbaActionPerformed
		przelicz(); // TODO add your handling code here:
	}// GEN-LAST:event_PierwszaLiczbaActionPerformed

	private void DrugaLiczbaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_DrugaLiczbaActionPerformed
		przelicz(); // TODO add your handling code here:
	}// GEN-LAST:event_DrugaLiczbaActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(OknoKalkulatora.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(OknoKalkulatora.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(OknoKalkulatora.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(OknoKalkulatora.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new OknoKalkulatora().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JTextField DrugaLiczba;
	private javax.swing.JComboBox<String> Dzialanie;
	private javax.swing.JTextField PierwszaLiczba;
	private javax.swing.JTextField Wynik;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	// End of variables declaration//GEN-END:variables
}