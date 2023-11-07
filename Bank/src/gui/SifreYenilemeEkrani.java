/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.InterfaceDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author emrec
 */
public class SifreYenilemeEkrani extends javax.swing.JFrame implements InterfaceDuzenleyici{

 
    public SifreYenilemeEkrani() {
        initComponents();
        getEdit();
        
    }

    @Override
    public void getEdit() {
      this.setLocationRelativeTo(null);
      SifreYenilemePanel.setVisible(true);// panele odaklanma 
        TextAyarlari.ayarlasadecesayi(tcNoText);
        TextAyarlari.ayarlaMaxLimit(tcNoText, 11);
        TextAyarlari.ayarlasadecesayi(telNoText);
        TextAyarlari.ayarlaMaxLimit(telNoText, 11);
        
        
        
    }

    public JPasswordField getEskiSifreText() {
        return EskiSifreText;
    }
    private boolean isEnabledEskiSifreText(){ // geri tuşuna basıldığında hesap ekranına gelmesini önlemek için 
       //  aktifliğini tutan 
         return this.getEskiSifreText().isEnabled();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        SifreYenilemePanel = new javax.swing.JPanel();
        GeriButton = new javax.swing.JButton();
        SİfreYENİLEMEtitleLabel = new javax.swing.JLabel();
        TcNoLabel = new javax.swing.JLabel();
        tcNoText = new javax.swing.JTextField();
        TelNoLabel = new javax.swing.JLabel();
        telNoText = new javax.swing.JTextField();
        GuvenlikSorusuLabel = new javax.swing.JLabel();
        guvenlikSorusuText = new javax.swing.JTextField();
        EskiSifreLabel = new javax.swing.JLabel();
        YeniSifreLabel = new javax.swing.JLabel();
        YeniTEKRARSifreLabel = new javax.swing.JLabel();
        EskiSifreText = new javax.swing.JPasswordField();
        YeniSifreText = new javax.swing.JPasswordField();
        yeniTEKRARsifreText = new javax.swing.JPasswordField();
        SifreYenileButton = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("T.C : ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SifreYenilemePanel.setBackground(new java.awt.Color(0, 51, 51));

        GeriButton.setText("GERİ");
        GeriButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeriButtonActionPerformed(evt);
            }
        });

        SİfreYENİLEMEtitleLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        SİfreYENİLEMEtitleLabel.setForeground(new java.awt.Color(0, 0, 255));
        SİfreYENİLEMEtitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SİfreYENİLEMEtitleLabel.setText("ŞİFRE YENİLEME ");

        TcNoLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        TcNoLabel.setForeground(new java.awt.Color(0, 255, 255));
        TcNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TcNoLabel.setText("T.C . NO  : ");

        TelNoLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        TelNoLabel.setForeground(new java.awt.Color(0, 255, 255));
        TelNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TelNoLabel.setText("TELEFON NO : ");

        GuvenlikSorusuLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        GuvenlikSorusuLabel.setForeground(new java.awt.Color(0, 255, 255));
        GuvenlikSorusuLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GuvenlikSorusuLabel.setText("GÜVENLİK SORUSU CEVABI :");

        EskiSifreLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        EskiSifreLabel.setForeground(new java.awt.Color(0, 255, 255));
        EskiSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EskiSifreLabel.setText("ESKİ ŞİFRE : ");

        YeniSifreLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        YeniSifreLabel.setForeground(new java.awt.Color(0, 255, 255));
        YeniSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        YeniSifreLabel.setText("YENİ ŞİFRE : ");

        YeniTEKRARSifreLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        YeniTEKRARSifreLabel.setForeground(new java.awt.Color(0, 255, 255));
        YeniTEKRARSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        YeniTEKRARSifreLabel.setText("YENİ ŞİFRE TEKRAR :");

        SifreYenileButton.setBackground(new java.awt.Color(0, 0, 153));
        SifreYenileButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SifreYenileButton.setForeground(new java.awt.Color(0, 153, 0));
        SifreYenileButton.setText("ŞİFRE YENİLE");
        SifreYenileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SifreYenileButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SifreYenileButtonMouseExited(evt);
            }
        });
        SifreYenileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SifreYenileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SifreYenilemePanelLayout = new javax.swing.GroupLayout(SifreYenilemePanel);
        SifreYenilemePanel.setLayout(SifreYenilemePanelLayout);
        SifreYenilemePanelLayout.setHorizontalGroup(
            SifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SifreYenilemePanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(SifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TcNoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelNoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GuvenlikSorusuLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EskiSifreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YeniSifreLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(YeniTEKRARSifreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(SifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tcNoText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telNoText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guvenlikSorusuText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EskiSifreText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YeniSifreText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeniTEKRARsifreText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(SifreYenilemePanelLayout.createSequentialGroup()
                .addGroup(SifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SifreYenilemePanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(GeriButton))
                    .addGroup(SifreYenilemePanelLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(SİfreYENİLEMEtitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SifreYenilemePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SifreYenileButton)
                .addGap(253, 253, 253))
        );

        SifreYenilemePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {EskiSifreText, YeniSifreText, guvenlikSorusuText, tcNoText, telNoText, yeniTEKRARsifreText});

        SifreYenilemePanelLayout.setVerticalGroup(
            SifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SifreYenilemePanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(GeriButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SİfreYENİLEMEtitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(SifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SifreYenilemePanelLayout.createSequentialGroup()
                        .addGroup(SifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TcNoLabel)
                            .addComponent(tcNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(SifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telNoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelNoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(SifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guvenlikSorusuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GuvenlikSorusuLabel))
                        .addGap(40, 40, 40)
                        .addGroup(SifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EskiSifreLabel)
                            .addComponent(EskiSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(YeniSifreLabel))
                    .addComponent(YeniSifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(SifreYenilemePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YeniTEKRARSifreLabel)
                    .addComponent(yeniTEKRARsifreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(SifreYenileButton)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SifreYenilemePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SifreYenilemePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GeriButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeriButtonActionPerformed

        if(isEnabledEskiSifreText()){
            ActionAyarlari.setVisible(this, new ayarlarEkrani());
        }
        else{
            ActionAyarlari.setVisible(this, new GirisEkrani());
        }
      
    }//GEN-LAST:event_GeriButtonActionPerformed

    private void SifreYenileButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SifreYenileButtonMouseEntered
     ButtonAyarlari.setBgFg(SifreYenileButton, Color.yellow, Color.cyan);
    }//GEN-LAST:event_SifreYenileButtonMouseEntered

    private void SifreYenileButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SifreYenileButtonMouseExited
     ButtonAyarlari.setOrijinalBgFg(SifreYenileButton);
    }//GEN-LAST:event_SifreYenileButtonMouseExited

    private void SifreYenileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SifreYenileButtonActionPerformed
     JOptionPane.showMessageDialog(this, "ŞİFRE BAŞARIYLA GÜNCELLENDİ");
        if(isEnabledEskiSifreText()){
            ActionAyarlari.setVisible(this, new HesapEkranii());
        }
        else{
            ActionAyarlari.setVisible(this, new GirisEkrani());
        }
        
        
    }//GEN-LAST:event_SifreYenileButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreYenilemeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EskiSifreLabel;
    private javax.swing.JPasswordField EskiSifreText;
    private javax.swing.JButton GeriButton;
    private javax.swing.JLabel GuvenlikSorusuLabel;
    private javax.swing.JButton SifreYenileButton;
    private javax.swing.JPanel SifreYenilemePanel;
    private javax.swing.JLabel SİfreYENİLEMEtitleLabel;
    private javax.swing.JLabel TcNoLabel;
    private javax.swing.JLabel TelNoLabel;
    private javax.swing.JLabel YeniSifreLabel;
    private javax.swing.JPasswordField YeniSifreText;
    private javax.swing.JLabel YeniTEKRARSifreLabel;
    private javax.swing.JTextField guvenlikSorusuText;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField tcNoText;
    private javax.swing.JTextField telNoText;
    private javax.swing.JPasswordField yeniTEKRARsifreText;
    // End of variables declaration//GEN-END:variables


}
