package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.InterfaceDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import methods.HesapTablosu;

public class parayatırma extends javax.swing.JFrame implements InterfaceDuzenleyici {

    private int yatirilacakmiktar = 0;

    public parayatırma() {
        initComponents();
        getEdit();
        kullaniciAdiSoyadiLabel.setText(GirisEkrani.name);
        bakiyeLabel.setText("BAKİYENİZ :  " + database.getBakiyeFromDatabase(GirisEkrani.kullanici_id));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yatiracaginizMiktarPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        LimituyariLabel = new javax.swing.JLabel();
        toplambakiyeLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        yatiralicakMiktarLabel = new javax.swing.JLabel();
        yatiralacakMiktarText = new javax.swing.JTextField();
        parayatirButton = new javax.swing.JButton();
        geriButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        yatiracaginizMiktarPanel.setBackground(new java.awt.Color(255, 255, 255));
        yatiracaginizMiktarPanel.setForeground(new java.awt.Color(0, 51, 51));

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(204, 204, 0));
        kullaniciAdiSoyadiLabel.setText("Sayın [KULLANICI ADI SOYADI ]");

        LimituyariLabel.setBackground(new java.awt.Color(0, 204, 0));
        LimituyariLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LimituyariLabel.setForeground(new java.awt.Color(102, 102, 102));
        LimituyariLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LimituyariLabel.setText("TEK SEFERDE 5000 TL YE KADAR  YATIRABİLİRSİNİZ.");

        toplambakiyeLabel.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        toplambakiyeLabel.setForeground(java.awt.Color.cyan);
        toplambakiyeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        bakiyeLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        bakiyeLabel.setForeground(new java.awt.Color(102, 102, 102));
        bakiyeLabel.setText("[BAKİYE]");

        yatiralicakMiktarLabel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        yatiralicakMiktarLabel.setForeground(new java.awt.Color(102, 102, 102));
        yatiralicakMiktarLabel.setText("YATIRACAĞINIZ MİKTAR :");

        yatiralacakMiktarText.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        yatiralacakMiktarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yatiralacakMiktarTextActionPerformed(evt);
            }
        });
        yatiralacakMiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                yatiralacakMiktarTextKeyReleased(evt);
            }
        });

        parayatirButton.setText("PARA YATIR");
        parayatirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parayatirButtonActionPerformed(evt);
            }
        });

        geriButton.setText("GERİ");
        geriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriButtonMouseClicked(evt);
            }
        });
        geriButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout yatiracaginizMiktarPanelLayout = new javax.swing.GroupLayout(yatiracaginizMiktarPanel);
        yatiracaginizMiktarPanel.setLayout(yatiracaginizMiktarPanelLayout);
        yatiracaginizMiktarPanelLayout.setHorizontalGroup(
            yatiracaginizMiktarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yatiracaginizMiktarPanelLayout.createSequentialGroup()
                .addGap(22, 768, Short.MAX_VALUE)
                .addComponent(toplambakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(yatiracaginizMiktarPanelLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(yatiralicakMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(yatiralacakMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(yatiracaginizMiktarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(geriButton)
                .addGap(126, 126, 126)
                .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(yatiracaginizMiktarPanelLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(LimituyariLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, yatiracaginizMiktarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
            .addGroup(yatiracaginizMiktarPanelLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(parayatirButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        yatiracaginizMiktarPanelLayout.setVerticalGroup(
            yatiracaginizMiktarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yatiracaginizMiktarPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(yatiracaginizMiktarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geriButton)
                    .addComponent(kullaniciAdiSoyadiLabel))
                .addGap(29, 29, 29)
                .addComponent(LimituyariLabel)
                .addGroup(yatiracaginizMiktarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(yatiracaginizMiktarPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(yatiracaginizMiktarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yatiralacakMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yatiralicakMiktarLabel)))
                    .addGroup(yatiracaginizMiktarPanelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(toplambakiyeLabel)))
                .addGap(40, 40, 40)
                .addComponent(parayatirButton)
                .addContainerGap(514, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(yatiracaginizMiktarPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(yatiracaginizMiktarPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yatiralacakMiktarTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yatiralacakMiktarTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yatiralacakMiktarTextActionPerformed

    private void yatiralacakMiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yatiralacakMiktarTextKeyReleased
        // kullanıcıdan klavyeden bir tuşa basılıp BIRAKTIĞINDA

        this.yatirilacakmiktar = TextAyarlari.checkTheTextKeyReleasedd(yatiralacakMiktarText, 5000);

    }//GEN-LAST:event_yatiralacakMiktarTextKeyReleased

    private void parayatirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parayatirButtonActionPerformed

        int yatirilan_para = Integer.parseInt(yatiralacakMiktarText.getText());
        int bakiye = database.getBakiyeFromDatabase(GirisEkrani.kullanici_id);
        int son_bakiye = bakiye + yatirilan_para;
        methods.Methods.bakiyeGuncelle(GirisEkrani.kullanici_id, son_bakiye);

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String tarih = dateTime.format(formatter);

        HesapTablosu.ekleHesapHareketi(GirisEkrani.kullanici_id, tarih, "ATM den yatırılan para ", yatirilan_para, son_bakiye);

        JOptionPane.showMessageDialog(this, "Para Yatırma İşlemi Başarılı Olmuştur"
                + "\n" + "YATIRILAN TUTAR : " + this.yatirilacakmiktar + "TL");
        ActionAyarlari.setVisible(this, new HesapEkranii());
    }//GEN-LAST:event_parayatirButtonActionPerformed

    private void geriButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriButtonMouseClicked

        ActionAyarlari.SETVİSİBLE(this);
    }//GEN-LAST:event_geriButtonMouseClicked

    private void geriButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriButtonActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_geriButtonActionPerformed

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
            java.util.logging.Logger.getLogger(parayatırma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(parayatırma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(parayatırma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(parayatırma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new parayatırma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LimituyariLabel;
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JButton geriButton;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JButton parayatirButton;
    private javax.swing.JLabel toplambakiyeLabel;
    private javax.swing.JPanel yatiracaginizMiktarPanel;
    private javax.swing.JTextField yatiralacakMiktarText;
    private javax.swing.JLabel yatiralicakMiktarLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void getEdit() {

        this.setLocationRelativeTo(null);
        this.setLocation(680, 125);
        yatiracaginizMiktarPanel.setFocusable(true);
        TextAyarlari.ayarlasadecesayi(yatiralacakMiktarText);
        TextAyarlari.ayarlaMaxLimit(yatiralacakMiktarText, 5);
    }
}
