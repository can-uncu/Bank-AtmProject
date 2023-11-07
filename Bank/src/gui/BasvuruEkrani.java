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

public class BasvuruEkrani extends javax.swing.JFrame implements InterfaceDuzenleyici {

    /**
     * Creates new form BasvuruEkrani
     */
    public BasvuruEkrani() {
        initComponents();
        getEdit();
    }

    @Override
    public void getEdit() {
        this.setLocationRelativeTo(null);
        BasvuruEkraniPanel.setFocusable(true);
        TextAyarlari.ayarlasadeceAlfabe(AdSoyadText);
        TextAyarlari.ayarlasadecesayi(TcText);
        TextAyarlari.ayarlasadecesayi(TelefonText);
        TextAyarlari.ayarlaMaxLimit(TcText, 11);
        TextAyarlari.ayarlaMaxLimit(TelefonText, 11);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BasvuruEkraniPanel = new javax.swing.JPanel();
        AdSoyadLabel = new javax.swing.JLabel();
        KisiselBilgilerLabel = new javax.swing.JLabel();
        AdSoyadText = new javax.swing.JTextField();
        TcLabel = new javax.swing.JLabel();
        TcText = new javax.swing.JTextField();
        TelefonLabel = new javax.swing.JLabel();
        TelefonText = new javax.swing.JTextField();
        KisiselBilgilerLabel1 = new javax.swing.JLabel();
        GuvenlikSorusuLabel = new javax.swing.JLabel();
        GuvenlikSorusu = new javax.swing.JComboBox<>();
        GuvenlikCevapText = new javax.swing.JTextField();
        GuvenlikCevapLabel = new javax.swing.JLabel();
        KaydetButton = new javax.swing.JButton();
        sifreText = new javax.swing.JTextField();
        TelefonLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Basvuru Ekrani");

        BasvuruEkraniPanel.setBackground(new java.awt.Color(0, 51, 51));

        AdSoyadLabel.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        AdSoyadLabel.setForeground(java.awt.Color.cyan);
        AdSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AdSoyadLabel.setText("Ad Soyad :");

        KisiselBilgilerLabel.setFont(new java.awt.Font("Trebuchet MS", 3, 24)); // NOI18N
        KisiselBilgilerLabel.setForeground(java.awt.Color.blue);
        KisiselBilgilerLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KisiselBilgilerLabel.setText("KİŞİSEL BİLGİLER");

        AdSoyadText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AdSoyadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdSoyadTextActionPerformed(evt);
            }
        });

        TcLabel.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        TcLabel.setForeground(java.awt.Color.cyan);
        TcLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TcLabel.setText("T.C No :");

        TelefonLabel.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        TelefonLabel.setForeground(java.awt.Color.cyan);
        TelefonLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TelefonLabel.setText("Telefon No :");

        TelefonText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonTextActionPerformed(evt);
            }
        });

        KisiselBilgilerLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        KisiselBilgilerLabel1.setForeground(java.awt.Color.blue);
        KisiselBilgilerLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KisiselBilgilerLabel1.setText("GÜVENLİK BİLGİLERİ");

        GuvenlikSorusuLabel.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        GuvenlikSorusuLabel.setForeground(java.awt.Color.cyan);
        GuvenlikSorusuLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        GuvenlikSorusuLabel.setText("Güvenlik Sorusu :");

        GuvenlikSorusu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EVCİL HAYVANINIZIN ADI NEDİR?", "ANNENİZİN KIZLIK SOYADI NEDİR?", "DEDENİZİN MESLEĞİ NEDİR?", "YA DA RASTGELE ÖZEL KARAKTERLİ CÜMLE GİRİNİZ (ÖNERİLEN)" }));
        GuvenlikSorusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuvenlikSorusuActionPerformed(evt);
            }
        });

        GuvenlikCevapLabel.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        GuvenlikCevapLabel.setForeground(java.awt.Color.cyan);
        GuvenlikCevapLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        GuvenlikCevapLabel.setText("Cevap :");

        KaydetButton.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        KaydetButton.setForeground(new java.awt.Color(0, 102, 0));
        KaydetButton.setText("KAYDET");
        KaydetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        KaydetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KaydetButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KaydetButtonMouseExited(evt);
            }
        });
        KaydetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaydetButtonActionPerformed(evt);
            }
        });

        sifreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreTextActionPerformed(evt);
            }
        });

        TelefonLabel1.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        TelefonLabel1.setForeground(java.awt.Color.cyan);
        TelefonLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TelefonLabel1.setText("Şifre:");

        javax.swing.GroupLayout BasvuruEkraniPanelLayout = new javax.swing.GroupLayout(BasvuruEkraniPanel);
        BasvuruEkraniPanel.setLayout(BasvuruEkraniPanelLayout);
        BasvuruEkraniPanelLayout.setHorizontalGroup(
            BasvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasvuruEkraniPanelLayout.createSequentialGroup()
                .addGroup(BasvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BasvuruEkraniPanelLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(KaydetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BasvuruEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(KisiselBilgilerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BasvuruEkraniPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(BasvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(BasvuruEkraniPanelLayout.createSequentialGroup()
                                .addComponent(GuvenlikSorusuLabel)
                                .addGap(18, 18, 18)
                                .addComponent(GuvenlikSorusu, 0, 1, Short.MAX_VALUE))
                            .addGroup(BasvuruEkraniPanelLayout.createSequentialGroup()
                                .addComponent(GuvenlikCevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(GuvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(BasvuruEkraniPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(BasvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BasvuruEkraniPanelLayout.createSequentialGroup()
                                .addComponent(TelefonLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BasvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(BasvuruEkraniPanelLayout.createSequentialGroup()
                                    .addComponent(TcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(TcText, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(BasvuruEkraniPanelLayout.createSequentialGroup()
                                    .addComponent(AdSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(AdSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(BasvuruEkraniPanelLayout.createSequentialGroup()
                                .addComponent(TelefonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TelefonText, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(BasvuruEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(KisiselBilgilerLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        BasvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {GuvenlikSorusuLabel, TelefonLabel});

        BasvuruEkraniPanelLayout.setVerticalGroup(
            BasvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasvuruEkraniPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(KisiselBilgilerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BasvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdSoyadText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BasvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TcText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BasvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BasvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(KisiselBilgilerLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BasvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuvenlikSorusuLabel)
                    .addComponent(GuvenlikSorusu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BasvuruEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuvenlikCevapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuvenlikCevapText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(KaydetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BasvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AdSoyadLabel, AdSoyadText});

        BasvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {GuvenlikSorusuLabel, TelefonLabel});

        BasvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {TcLabel, TcText});

        BasvuruEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {GuvenlikSorusu, TelefonText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasvuruEkraniPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BasvuruEkraniPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuvenlikSorusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuvenlikSorusuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuvenlikSorusuActionPerformed

    private void KaydetButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KaydetButtonMouseEntered
        ButtonAyarlari.setBgFg(KaydetButton, Color.yellow, Color.cyan);
    }//GEN-LAST:event_KaydetButtonMouseEntered

    private void KaydetButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KaydetButtonMouseExited
        ButtonAyarlari.setOrijinalBgFg(KaydetButton);
    }//GEN-LAST:event_KaydetButtonMouseExited

    private void KaydetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaydetButtonActionPerformed

        String ad_Soyad = AdSoyadText.getText();
        String tc_no = TcText.getText();
        String tel_no = TelefonText.getText();
        String guvenlik_sorusu = GuvenlikCevapText.getText();

        String sifre = methods.MD5Example.encrypt(sifreText.getText());

        String queryyy = "insert into kullanicilar(ad_soyad,tc_no,tel_no,sifre,güvenlik_sorusu) values ('" + ad_Soyad + "','" + tc_no + "','" + tel_no + "','" + sifre + "','" + guvenlik_sorusu + "')";

        DbConnection object = new DbConnection();

        object.baglann(queryyy);

        //  stt.executeUpdate(queryyy); // veri tabanına kayıt eklemek içinnn */
        JOptionPane.showMessageDialog(this, "Başvurunuz kabul edilmiştir.");
        ActionAyarlari.setVisible(this, new GirisEkrani());

    }//GEN-LAST:event_KaydetButtonActionPerformed

    private void AdSoyadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdSoyadTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdSoyadTextActionPerformed

    private void TelefonTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonTextActionPerformed

    private void sifreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreTextActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_sifreTextActionPerformed

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
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasvuruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasvuruEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdSoyadLabel;
    private javax.swing.JTextField AdSoyadText;
    private javax.swing.JPanel BasvuruEkraniPanel;
    private javax.swing.JLabel GuvenlikCevapLabel;
    private javax.swing.JTextField GuvenlikCevapText;
    private javax.swing.JComboBox<String> GuvenlikSorusu;
    private javax.swing.JLabel GuvenlikSorusuLabel;
    private javax.swing.JButton KaydetButton;
    private javax.swing.JLabel KisiselBilgilerLabel;
    private javax.swing.JLabel KisiselBilgilerLabel1;
    private javax.swing.JLabel TcLabel;
    private javax.swing.JTextField TcText;
    private javax.swing.JLabel TelefonLabel;
    private javax.swing.JLabel TelefonLabel1;
    private javax.swing.JTextField TelefonText;
    private javax.swing.JTextField sifreText;
    // End of variables declaration//GEN-END:variables
}
