
package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.InterfaceDuzenleyici;
import gui.ayarlar.TextAyarlari;
import javax.swing.JOptionPane;


public class ayarlarEkrani extends javax.swing.JFrame implements InterfaceDuzenleyici{

    public ayarlarEkrani() {
        initComponents();
        getEdit();
        
    }
     @Override
    public void getEdit() {
     
        this.setLocationRelativeTo(null);
        ayarlarPanel.setFocusable(true);
        TextAyarlari.ayarlasadecesayi(telnoText);
        TextAyarlari.ayarlaMaxLimit(telnoText, 11);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ayarlarPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        geriButton = new javax.swing.JButton();
        mesajTelNoLabel = new javax.swing.JLabel();
        telnoText = new javax.swing.JTextField();
        TelNoicon = new javax.swing.JLabel();
        mesajSifreLabel = new javax.swing.JLabel();
        sifreText = new javax.swing.JTextField();
        SifreDegistiricon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AYARLAR EKRANI");

        ayarlarPanel.setBackground(new java.awt.Color(0, 51, 51));

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(0, 0, 102));
        kullaniciAdiSoyadiLabel.setText("Sayın [KULLANICI ADI SOYADI ]");

        geriButton.setText("GERİ");
        geriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriButtonMouseClicked(evt);
            }
        });

        mesajTelNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajTelNoLabel.setForeground(java.awt.Color.cyan);
        mesajTelNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajTelNoLabel.setText("TELEFON NUMARANIZ : ");

        telnoText.setEnabled(false);

        TelNoicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/settingicon.png"))); // NOI18N
        TelNoicon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TelNoicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelNoiconMouseClicked(evt);
            }
        });

        mesajSifreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajSifreLabel.setForeground(java.awt.Color.cyan);
        mesajSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajSifreLabel.setText("ŞİRENİZ:");

        sifreText.setText("**************");
        sifreText.setEnabled(false);

        SifreDegistiricon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/settingicon.png"))); // NOI18N
        SifreDegistiricon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SifreDegistiriconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ayarlarPanelLayout = new javax.swing.GroupLayout(ayarlarPanel);
        ayarlarPanel.setLayout(ayarlarPanelLayout);
        ayarlarPanelLayout.setHorizontalGroup(
            ayarlarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ayarlarPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(ayarlarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ayarlarPanelLayout.createSequentialGroup()
                        .addGroup(ayarlarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ayarlarPanelLayout.createSequentialGroup()
                                .addGroup(ayarlarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ayarlarPanelLayout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(geriButton))
                                .addGap(50, 50, 50))
                            .addComponent(SifreDegistiricon))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(ayarlarPanelLayout.createSequentialGroup()
                        .addGroup(ayarlarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ayarlarPanelLayout.createSequentialGroup()
                                .addComponent(mesajSifreLabel)
                                .addGap(18, 18, 18)
                                .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ayarlarPanelLayout.createSequentialGroup()
                                .addComponent(mesajTelNoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telnoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TelNoicon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        ayarlarPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {mesajTelNoLabel, sifreText, telnoText});

        ayarlarPanelLayout.setVerticalGroup(
            ayarlarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ayarlarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriButton)
                .addGap(18, 18, 18)
                .addComponent(kullaniciAdiSoyadiLabel)
                .addGroup(ayarlarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ayarlarPanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(ayarlarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mesajTelNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telnoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ayarlarPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(TelNoicon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(ayarlarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ayarlarPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(ayarlarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mesajSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(SifreDegistiricon, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        ayarlarPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {mesajTelNoLabel, sifreText, telnoText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ayarlarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriButtonMouseClicked

        ActionAyarlari.setVisible(this, new HesapEkranii());
    }//GEN-LAST:event_geriButtonMouseClicked
private int clickCounter=0;

    private void TelNoiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelNoiconMouseClicked
if(this.clickCounter==0){// daha önce tıklanma olmadıysa
        telnoText.setEnabled(true);
clickCounter++;

}
else{
    telnoText.setEnabled(false);
    JOptionPane.showMessageDialog(this, "telefon numarası güncellendi");
    clickCounter=0;
    
}
     
    }//GEN-LAST:event_TelNoiconMouseClicked

    private void SifreDegistiriconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SifreDegistiriconMouseClicked
ActionAyarlari.setVisible(this, new SifreYenilemeEkrani());
    
    }//GEN-LAST:event_SifreDegistiriconMouseClicked

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ayarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ayarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ayarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ayarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ayarlarEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SifreDegistiricon;
    private javax.swing.JLabel TelNoicon;
    private javax.swing.JPanel ayarlarPanel;
    private javax.swing.JButton geriButton;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel mesajSifreLabel;
    private javax.swing.JLabel mesajTelNoLabel;
    private javax.swing.JTextField sifreText;
    private javax.swing.JTextField telnoText;
    // End of variables declaration//GEN-END:variables

   
}
