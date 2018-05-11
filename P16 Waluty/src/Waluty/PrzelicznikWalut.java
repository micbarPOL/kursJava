package Waluty;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.awt.event.ActionEvent;

public class PrzelicznikWalut {

    private Tabela tabela;
    
    private JFrame frame;
    private JTextField txtKwota;
    private JTextField txtWynik;
    private JComboBox<String> comboBox;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PrzelicznikWalut window = new PrzelicznikWalut();
                    window.frame.setVisible(true);
                    window.pobierzKursy();
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
    private void pobierzKursy() {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {

            protected Void doInBackground() throws Exception {
                // to będzie wykonane "w tle" (w oddzielnym wątku)
                tabela = ObslugaNBP.pobierzBiezaceKursy();
                return null;
            }
            
            protected void done() {
                // co ma się stać z oknem, gdy operacja w tle zostanie zakończona
                comboBox.setModel(new DefaultComboBoxModel<>(tabela.getKodyWalut()));
            }
        };
        
        worker.execute();
    }
    

    /**
     * Create the application.
     */
    public PrzelicznikWalut() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 598, 398);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        txtKwota = new JTextField();
        txtKwota.setText("kwota");
        txtKwota.setColumns(10);
        
        JLabel lblPodajKwot = new JLabel("Podaj kwotę w złotych");
        
        JLabel lblWybierzWalut = new JLabel("Wybierz walutę");
        
        comboBox = new JComboBox<>();
        
        JButton btnOblicz = new JButton("Oblicz");
        btnOblicz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BigDecimal kwota = new BigDecimal(txtKwota.getText());
                String kod = (String) comboBox.getSelectedItem();
                
                Waluta waluta = tabela.znajdz(kod);
                BigDecimal wynik = waluta.zloteNaWalute(kwota);
                
                txtWynik.setText(wynik.toString());
            }
        });
        
        JLabel lblKwotaWWalucie = new JLabel("Kwota w walucie");
        
        txtWynik = new JTextField();
        txtWynik.setText("wynik");
        txtWynik.setColumns(10);
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
                            .addComponent(btnOblicz, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtKwota, Alignment.LEADING)
                            .addComponent(lblPodajKwot, Alignment.LEADING)
                            .addComponent(lblWybierzWalut, Alignment.LEADING)
                            .addComponent(comboBox, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(lblKwotaWWalucie)
                        .addComponent(txtWynik, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(452, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(50)
                    .addComponent(lblPodajKwot)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(txtKwota, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18)
                    .addComponent(lblWybierzWalut)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18)
                    .addComponent(btnOblicz)
                    .addGap(18)
                    .addComponent(lblKwotaWWalucie)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(txtWynik, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(111, Short.MAX_VALUE))
        );
        frame.getContentPane().setLayout(groupLayout);
    }
}