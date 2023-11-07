package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.InterfaceDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import methods.HesapTablosu;

public class havale extends javax.swing.JFrame implements InterfaceDuzenleyici {

    private final String MUSTERİ_NO_TEXT_ORİGİNAL = " MÜŞTERİ NO ";

    private int gonderilecekMiktar = 0;

    public havale() {
        initComponents();
        getEdit();
        kullaniciAdiSoyadiLabel.setText(GirisEkrani.name);
        bakiyeLabel.setText("BAKİYENİZ :  " + database.getBakiyeFromDatabase(GirisEkrani.kullanici_id));
    }

    @Override
    public void getEdit() {
        this.setLocationRelativeTo(null);
        this.setLocation(680, 125);
        havalePanel.setFocusable(true);
        TextAyarlari.ayarlasadecesayi(gonderilecekMiktarText);
        TextAyarlari.ayarlaMaxLimit(gonderilecekMiktarText, 6);
        TextAyarlari.ayarlasadecesayi(MusteriNoText);
        MusteriNoText.setText(MUSTERİ_NO_TEXT_ORİGİNAL);

        TextAyarlari.ayarlaMaxLimit(MusteriNoText, 11);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        havalePanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        LimituyariLabel = new javax.swing.JLabel();
        toplambakiyeLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        gondereceginizMiktarLabel = new javax.swing.JLabel();
        gonderilecekMiktarText = new javax.swing.JTextField();
        havaleButton = new javax.swing.JButton();
        geriButton = new javax.swing.JButton();
        MusteriNoText = new javax.swing.JTextField();
        havalealanLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        havalePanel.setBackground(new java.awt.Color(255, 255, 255));
        havalePanel.setForeground(new java.awt.Color(102, 102, 102));
        havalePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(204, 204, 0));
        kullaniciAdiSoyadiLabel.setText("Sayın [KULLANICI ADI SOYADI ]");
        havalePanel.add(kullaniciAdiSoyadiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 25, 423, -1));

        LimituyariLabel.setBackground(new java.awt.Color(0, 204, 0));
        LimituyariLabel.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        LimituyariLabel.setForeground(new java.awt.Color(102, 102, 102));
        LimituyariLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LimituyariLabel.setText("TEK SEFERDE GÖNDEREBİLECEĞİNİZ TUTAR: 100000TL");
        havalePanel.add(LimituyariLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 380, 63));

        toplambakiyeLabel.setForeground(java.awt.Color.cyan);
        toplambakiyeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        havalePanel.add(toplambakiyeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 255, 37, 22));

        bakiyeLabel.setBackground(new java.awt.Color(0, 51, 51));
        bakiyeLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        bakiyeLabel.setForeground(new java.awt.Color(102, 102, 102));
        bakiyeLabel.setText("[BAKİYE]");
        havalePanel.add(bakiyeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 293, 40));

        gondereceginizMiktarLabel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        gondereceginizMiktarLabel.setForeground(new java.awt.Color(102, 102, 102));
        gondereceginizMiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gondereceginizMiktarLabel.setText("GÖNDERECEĞİNİZ MİKTAR : ");
        havalePanel.add(gondereceginizMiktarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 184, 40));

        gonderilecekMiktarText.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        gonderilecekMiktarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gonderilecekMiktarTextActionPerformed(evt);
            }
        });
        gonderilecekMiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gonderilecekMiktarTextKeyReleased(evt);
            }
        });
        havalePanel.add(gonderilecekMiktarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 175, 40));

        havaleButton.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        havaleButton.setForeground(new java.awt.Color(0, 102, 51));
        havaleButton.setText("HAVALE");
        havaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                havaleButtonActionPerformed(evt);
            }
        });
        havalePanel.add(havaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

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
        havalePanel.add(geriButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 25, -1, -1));

        MusteriNoText.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        MusteriNoText.setForeground(new java.awt.Color(153, 153, 153));
        MusteriNoText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MusteriNoTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MusteriNoTextFocusLost(evt);
            }
        });
        MusteriNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusteriNoTextActionPerformed(evt);
            }
        });
        havalePanel.add(MusteriNoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 175, 40));

        havalealanLabel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        havalealanLabel.setForeground(new java.awt.Color(102, 102, 102));
        havalealanLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        havalealanLabel.setText("HAVALE ALAN KİŞİ TC : ");
        havalePanel.add(havalealanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 156, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(havalePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(havalePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gonderilecekMiktarTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gonderilecekMiktarTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gonderilecekMiktarTextActionPerformed

    private void gonderilecekMiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gonderilecekMiktarTextKeyReleased
        // kullanıcıdan klavyeden bir tuşa basılıp BIRAKTIĞINDA

        this.gonderilecekMiktar = TextAyarlari.checkTheTextKeyReleased(gonderilecekMiktarText, 100000);

    }//GEN-LAST:event_gonderilecekMiktarTextKeyReleased

    private void havaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_havaleButtonActionPerformed

        int para = Integer.parseInt(gonderilecekMiktarText.getText());
        int bakiye = database.getBakiyeFromDatabase(GirisEkrani.kullanici_id);
        int gonderen_bakiye = bakiye - para;
        int alan_id = methods.Methods.getKullaniciID(MusteriNoText.getText());
        int al_bak = database.getBakiyeFromDatabase(alan_id);
        int alan_bakiye = al_bak + para;
        methods.Methods.bakiyeGuncelle(GirisEkrani.kullanici_id, gonderen_bakiye);
        System.out.println("KALAN BAKİYENİZ :     " + gonderen_bakiye);
        System.out.println("gödernen tc :  " + GirisEkrani.tc);
        System.out.println("alan tc :   " + MusteriNoText.getText());
        System.out.println("parayı alan kişinin id si :   " + alan_id);
        methods.Methods.bakiyeGuncelle(alan_id, alan_bakiye);
        String name = database.getNameFromDatabase(alan_id);

        
        
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String tarih = dateTime.format(formatter);

        HesapTablosu.ekleHesapHareketi(GirisEkrani.kullanici_id, tarih, name, para, gonderen_bakiye);

        JOptionPane.showMessageDialog(this, "Para Gönderme İşlemi Başarılı Olmuştur"
                + "\n" + "Gönderilen TUTAR : " + this.gonderilecekMiktar + "TL");
        ActionAyarlari.setVisible(this, new HesapEkranii());
    }//GEN-LAST:event_havaleButtonActionPerformed

    private void geriButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriButtonMouseClicked

        ActionAyarlari.SETVİSİBLE(this);
    }//GEN-LAST:event_geriButtonMouseClicked

    private void MusteriNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusteriNoTextActionPerformed

    }//GEN-LAST:event_MusteriNoTextActionPerformed

    private void MusteriNoTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MusteriNoTextFocusGained
        TextAyarlari.degistirTextFocusGained(MusteriNoText, MUSTERİ_NO_TEXT_ORİGİNAL);

    }//GEN-LAST:event_MusteriNoTextFocusGained

    private void MusteriNoTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MusteriNoTextFocusLost

        TextAyarlari.degistirTextFocusLost(MusteriNoText);
    }//GEN-LAST:event_MusteriNoTextFocusLost

    private void geriButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_geriButtonActionPerformed

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
            java.util.logging.Logger.getLogger(havale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(havale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(havale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(havale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new havale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LimituyariLabel;
    private javax.swing.JTextField MusteriNoText;
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JButton geriButton;
    private javax.swing.JLabel gondereceginizMiktarLabel;
    private javax.swing.JTextField gonderilecekMiktarText;
    private javax.swing.JButton havaleButton;
    private javax.swing.JPanel havalePanel;
    private javax.swing.JLabel havalealanLabel;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel toplambakiyeLabel;
    // End of variables declaration//GEN-END:variables

}
