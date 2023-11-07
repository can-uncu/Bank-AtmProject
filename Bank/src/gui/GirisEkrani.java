package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.InterfaceDuzenleyici;
import gui.ayarlar.TextAyarlari;

import java.awt.Color;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public final class GirisEkrani extends javax.swing.JFrame implements InterfaceDuzenleyici {

    public static String name;

    public static int kullanici_id;

    private final String KIMLIK_TEXT_ORIGINAL = "T.C No/Müşteri  No";

    private final String SIFRE_TEXT_ORIGINAL = "***************";

    static String tc;

    static String sifree = "";

    PreparedStatement durum;

    public GirisEkrani() {
        initComponents();
        getEdit();
        //  setExtendedState(JFrame.MAXIMIZED_BOTH);
        // TextAyarlari.ayarlaMaxLimit(kimlikText, 11);

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        girisEkraniPanel = new javax.swing.JPanel();
        soruLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        hosgeldinizMesaji = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sifreText = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        girisButon = new javax.swing.JButton();
        sifreUnuttumLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        basvurButon = new javax.swing.JButton();
        kimlikText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kimlikTextt = new javax.swing.JLabel();

        label1.setText("label1");

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("T.C No/Müsteri No:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BANKA GİRİS EKRANI");

        girisEkraniPanel.setBackground(new java.awt.Color(204, 204, 204));
        girisEkraniPanel.setForeground(new java.awt.Color(255, 255, 255));
        girisEkraniPanel.setToolTipText("");
        girisEkraniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        soruLabel.setFont(new java.awt.Font("Sitka Heading", 3, 18)); // NOI18N
        soruLabel.setForeground(new java.awt.Color(255, 255, 255));
        girisEkraniPanel.add(soruLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 597, 287, -1));

        jPanel1.setBackground(new java.awt.Color(240, 243, 244));

        hosgeldinizMesaji.setBackground(new java.awt.Color(102, 51, 255));
        hosgeldinizMesaji.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        hosgeldinizMesaji.setForeground(new java.awt.Color(102, 102, 102));
        hosgeldinizMesaji.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinizMesaji.setText("bank of turkey welcome ");

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText(" TR No/Customer No :");

        sifreText.setBackground(new java.awt.Color(240, 243, 244));
        sifreText.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        sifreText.setBorder(null);
        sifreText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sifreTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sifreTextFocusLost(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Password  :");

        girisButon.setBackground(new java.awt.Color(255, 255, 255));
        girisButon.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        girisButon.setText("Sign In");
        girisButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        girisButon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                girisButonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                girisButonFocusLost(evt);
            }
        });
        girisButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                girisButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                girisButonMouseExited(evt);
            }
        });
        girisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisButonActionPerformed(evt);
            }
        });

        sifreUnuttumLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 18)); // NOI18N
        sifreUnuttumLabel.setForeground(new java.awt.Color(153, 153, 153));
        sifreUnuttumLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sifreUnuttumLabel.setText("forgot password?");
        sifreUnuttumLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreUnuttumLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifreUnuttumLabelMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8_customer_64.png"))); // NOI18N

        basvurButon.setBackground(new java.awt.Color(255, 255, 255));
        basvurButon.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        basvurButon.setText("Create Account");
        basvurButon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        basvurButon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                basvurButonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                basvurButonMouseExited(evt);
            }
        });
        basvurButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvurButonActionPerformed(evt);
            }
        });

        kimlikText.setBackground(new java.awt.Color(240, 243, 244));
        kimlikText.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        kimlikText.setBorder(null);
        kimlikText.setSelectionColor(new java.awt.Color(204, 204, 204));
        kimlikText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kimlikTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kimlikTextFocusLost(evt);
            }
        });
        kimlikText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kimlikTextActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/notification_32.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/message_link_32.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                        .addGap(99, 99, 99))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(186, 186, 186))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jSeparator2))
                                    .addComponent(sifreText)
                                    .addComponent(kimlikText))
                                .addGap(4, 4, 4))
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(basvurButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(17, 17, 17))
                            .addComponent(sifreUnuttumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(hosgeldinizMesaji, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(girisButon, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(hosgeldinizMesaji, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kimlikText, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sifreText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(girisButon, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(sifreUnuttumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(basvurButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        girisEkraniPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 500, 740));

        kimlikTextt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/is (1).jpg"))); // NOI18N
        girisEkraniPanel.add(kimlikTextt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 500, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkraniPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1131, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(girisEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // BUTON RENKLENDİRMELERİ

    private void girisButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButonMouseEntered

        ButtonAyarlari.setBgFg(girisButon, Color.black, Color.white);


    }//GEN-LAST:event_girisButonMouseEntered

    private void girisButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButonMouseExited

        ButtonAyarlari.setOrijinalBgFg(girisButon);


    }//GEN-LAST:event_girisButonMouseExited

    private void basvurButonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButonMouseEntered

        ButtonAyarlari.setBgFg(basvurButon, Color.black, Color.white);


    }//GEN-LAST:event_basvurButonMouseEntered

    private void basvurButonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButonMouseExited

        ButtonAyarlari.setOrijinalBgFg(basvurButon);

    }//GEN-LAST:event_basvurButonMouseExited

    private void girisButonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_girisButonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_girisButonFocusGained

    private void girisButonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_girisButonFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_girisButonFocusLost

    private void kimlikTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusGained

        TextAyarlari.degistirTextFocusGained(kimlikText, KIMLIK_TEXT_ORIGINAL);


    }//GEN-LAST:event_kimlikTextFocusGained

    // TEXT ODAKLANMA AYARLARI
    private void kimlikTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusLost

        TextAyarlari.degistirTextFocusLost(kimlikText);

    }//GEN-LAST:event_kimlikTextFocusLost

    private void sifreTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreTextFocusGained

        TextAyarlari.degistirTextFocusGained(sifreText, SIFRE_TEXT_ORIGINAL);
    }//GEN-LAST:event_sifreTextFocusGained

    private void sifreTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreTextFocusLost
        TextAyarlari.degistirTextFocusLost(sifreText);
    }//GEN-LAST:event_sifreTextFocusLost

    // BUTTON ACTİON (buttona basıldığında)
    private void girisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisButonActionPerformed

        tc = kimlikTextt.getText();
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/dburun";
            Connection c = DriverManager.getConnection(url, "postgres", "123456");
            String onesql = "Select * from kullanicilar where tc_no =? and sifre =?";
            String Hashing_password = methods.MD5Example.encrypt(sifreText.getText());

            PreparedStatement pst = c.prepareStatement(onesql);
            pst.setString(1, kimlikText.getText());
            pst.setString(2, Hashing_password);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                name = rs.getString("ad_soyad");
                kullanici_id = rs.getInt(1);

                System.out.println(name + "  verilen tc ye karşılık gelen isim");
                JOptionPane.showMessageDialog(null, "Hesap Giriş Bilgileri Doğru");
                ActionAyarlari.setVisible(this, new HesapEkranii());

            } else {
                JOptionPane.showMessageDialog(null, "Hesap Giriş Bilgileri Yanlış");
                kimlikText.setText("");
                sifreText.setText("");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GirisEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_girisButonActionPerformed

    private void basvurButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvurButonActionPerformed

        ActionAyarlari.setVisible(this, new BasvuruEkrani());

    }//GEN-LAST:event_basvurButonActionPerformed

    private void kimlikTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kimlikTextActionPerformed


    }//GEN-LAST:event_kimlikTextActionPerformed

    private void sifreUnuttumLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreUnuttumLabelMouseClicked

        SifreYenilemeEkrani sifreYenilemeEkrani = new SifreYenilemeEkrani();
        ActionAyarlari.setVisible(this, sifreYenilemeEkrani);
        sifreYenilemeEkrani.getEskiSifreText().setEnabled(false);// giriş ekranından şifre unuttuma basınca eski şifre textfieldını pasif hale getiriyorrr


    }//GEN-LAST:event_sifreUnuttumLabelMouseClicked

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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    @Override
    public void getEdit() {
        this.setLocationRelativeTo(null);

        girisEkraniPanel.setFocusable(true);

        kimlikText.setText(KIMLIK_TEXT_ORIGINAL);

        sifreText.setText(SIFRE_TEXT_ORIGINAL);

        TextAyarlari.ayarlasadecesayi(kimlikText);

        TextAyarlari.ayarlaMaxLimit(kimlikText, 11);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton basvurButon;
    private javax.swing.JButton girisButon;
    private javax.swing.JPanel girisEkraniPanel;
    private javax.swing.JLabel hosgeldinizMesaji;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField kimlikText;
    private javax.swing.JLabel kimlikTextt;
    private java.awt.Label label1;
    private javax.swing.JPasswordField sifreText;
    private javax.swing.JLabel sifreUnuttumLabel;
    private javax.swing.JLabel soruLabel;
    // End of variables declaration//GEN-END:variables
}
