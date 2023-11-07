/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.InterfaceDuzenleyici;
import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import methods.HesapTablosu;

public class odemeler extends javax.swing.JFrame implements InterfaceDuzenleyici {

    static int elektrik_db = 0;
    static int su_db = 0;
    static int dogalgaz_db = 0;
    static int internet_db = 0;
      
    
    
    
         static LocalDateTime dateTime = LocalDateTime.now();
        static  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        static String  tarih = dateTime.format(formatter); 

    public void yazdır() {
        int dizi[] = database.getFaturaFromDatabase(GirisEkrani.kullanici_id);
        elektrik_db = dizi[0];
        su_db=dizi[1];
        dogalgaz_db=dizi[2];
        internet_db=dizi[3];    
        String elektrik_yaz = Integer.toString(dizi[0]);
        elektrikborcu.setText(elektrik_yaz);
        String su_yaz = Integer.toString(dizi[1]);
        suborcu.setText(su_yaz);
        String dogalgaz_yaz = Integer.toString(dizi[2]);
        dogalgazborcu.setText(dogalgaz_yaz);
        String int_yaz = Integer.toString(dizi[3]);
        internetborcu.setText(int_yaz);
    }

    public odemeler() {
        initComponents();
        getEdit();
        kullaniciAdiSoyadiLabel.setText(GirisEkrani.name);
        yazdır();

    }

    @Override
    public void getEdit() {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
                this.setLocation(680, 125);
        odemelerEkraniPanel.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        odemelerEkraniPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        geriButton = new javax.swing.JButton();
        MESAJELEKTRİKLABEL = new javax.swing.JLabel();
        elektrikborcu = new javax.swing.JLabel();
        elektrikodeButton = new javax.swing.JButton();
        MESAJSULABEL = new javax.swing.JLabel();
        suborcu = new javax.swing.JLabel();
        suodeButton = new javax.swing.JButton();
        MESAJDOGALGAZLABEL = new javax.swing.JLabel();
        dogalgazborcu = new javax.swing.JLabel();
        dogalgazodeButton = new javax.swing.JButton();
        MESAJİNTERNETLABEL = new javax.swing.JLabel();
        internetborcu = new javax.swing.JLabel();
        internetodeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ODEMELER");
        setUndecorated(true);

        odemelerEkraniPanel.setBackground(new java.awt.Color(255, 255, 255));

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(51, 153, 0));
        kullaniciAdiSoyadiLabel.setText("Sayın [KULLANICI ADI SOYADI ]");

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

        MESAJELEKTRİKLABEL.setBackground(new java.awt.Color(204, 204, 204));
        MESAJELEKTRİKLABEL.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        MESAJELEKTRİKLABEL.setForeground(new java.awt.Color(102, 102, 102));
        MESAJELEKTRİKLABEL.setText("TOPLAM ELEKTRİK FATURASI BORCUNUZ : ");

        elektrikborcu.setBackground(new java.awt.Color(204, 204, 204));
        elektrikborcu.setForeground(new java.awt.Color(102, 102, 102));
        elektrikborcu.setText("[ELEK BORC ]");

        elektrikodeButton.setBackground(new java.awt.Color(0, 204, 0));
        elektrikodeButton.setForeground(new java.awt.Color(255, 153, 153));
        elektrikodeButton.setText("ÖDE");
        elektrikodeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                elektrikodeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                elektrikodeButtonMouseExited(evt);
            }
        });
        elektrikodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elektrikodeButtonActionPerformed(evt);
            }
        });

        MESAJSULABEL.setBackground(new java.awt.Color(204, 204, 204));
        MESAJSULABEL.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        MESAJSULABEL.setForeground(new java.awt.Color(102, 102, 102));
        MESAJSULABEL.setText("TOPLAM SU FATURASI BORCUNUZ : ");

        suborcu.setBackground(new java.awt.Color(204, 204, 204));
        suborcu.setForeground(new java.awt.Color(102, 102, 102));
        suborcu.setText("[SU BORC ]");

        suodeButton.setBackground(new java.awt.Color(0, 204, 0));
        suodeButton.setForeground(new java.awt.Color(255, 153, 153));
        suodeButton.setText("ÖDE");
        suodeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                suodeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                suodeButtonMouseExited(evt);
            }
        });
        suodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suodeButtonActionPerformed(evt);
            }
        });

        MESAJDOGALGAZLABEL.setBackground(new java.awt.Color(204, 204, 204));
        MESAJDOGALGAZLABEL.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        MESAJDOGALGAZLABEL.setForeground(new java.awt.Color(102, 102, 102));
        MESAJDOGALGAZLABEL.setText("TOPLAM DOĞALGAZ FATURASI BORCUNUZ : ");

        dogalgazborcu.setBackground(new java.awt.Color(204, 204, 204));
        dogalgazborcu.setForeground(new java.awt.Color(102, 102, 102));
        dogalgazborcu.setText("[DOĞALGAZ BORC ]");

        dogalgazodeButton.setBackground(new java.awt.Color(0, 204, 0));
        dogalgazodeButton.setForeground(new java.awt.Color(255, 153, 153));
        dogalgazodeButton.setText("ÖDE");
        dogalgazodeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dogalgazodeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dogalgazodeButtonMouseExited(evt);
            }
        });
        dogalgazodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogalgazodeButtonActionPerformed(evt);
            }
        });

        MESAJİNTERNETLABEL.setBackground(new java.awt.Color(204, 204, 204));
        MESAJİNTERNETLABEL.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        MESAJİNTERNETLABEL.setForeground(new java.awt.Color(102, 102, 102));
        MESAJİNTERNETLABEL.setText("TOPLAM İNTERNET FATURASI BORCUNUZ : ");

        internetborcu.setBackground(new java.awt.Color(204, 204, 204));
        internetborcu.setForeground(new java.awt.Color(102, 102, 102));
        internetborcu.setText("[İNTERNET BORC ]");

        internetodeButton.setBackground(new java.awt.Color(0, 204, 0));
        internetodeButton.setForeground(new java.awt.Color(255, 153, 153));
        internetodeButton.setText("ÖDE");
        internetodeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                internetodeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                internetodeButtonMouseExited(evt);
            }
        });
        internetodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internetodeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout odemelerEkraniPanelLayout = new javax.swing.GroupLayout(odemelerEkraniPanel);
        odemelerEkraniPanel.setLayout(odemelerEkraniPanelLayout);
        odemelerEkraniPanelLayout.setHorizontalGroup(
            odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(geriButton)
                        .addGap(76, 76, 76)
                        .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                .addComponent(MESAJİNTERNETLABEL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addComponent(internetborcu)
                                .addGap(33, 33, 33)
                                .addComponent(internetodeButton))
                            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, odemelerEkraniPanelLayout.createSequentialGroup()
                                        .addComponent(MESAJDOGALGAZLABEL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                                        .addComponent(dogalgazborcu))
                                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                        .addComponent(MESAJELEKTRİKLABEL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(elektrikborcu))
                                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(MESAJSULABEL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(suborcu)))
                                .addGap(33, 33, 33)
                                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dogalgazodeButton)
                                    .addComponent(elektrikodeButton)
                                    .addComponent(suodeButton))))
                        .addGap(198, 198, 198))))
        );
        odemelerEkraniPanelLayout.setVerticalGroup(
            odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(geriButton)
                            .addComponent(kullaniciAdiSoyadiLabel))
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(elektrikodeButton)
                            .addComponent(elektrikborcu)
                            .addComponent(MESAJELEKTRİKLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(suborcu)
                            .addComponent(MESAJSULABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suodeButton))
                        .addGap(35, 35, 35)))
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dogalgazodeButton)
                    .addComponent(dogalgazborcu)
                    .addComponent(MESAJDOGALGAZLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(internetodeButton)
                    .addComponent(MESAJİNTERNETLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(internetborcu))
                .addContainerGap(490, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerEkraniPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriButtonMouseClicked

                ActionAyarlari.SETVİSİBLE(this);
    }//GEN-LAST:event_geriButtonMouseClicked

    private void elektrikodeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elektrikodeButtonMouseEntered
        ButtonAyarlari.setBgFg(elektrikodeButton, Color.black, Color.white);
    }//GEN-LAST:event_elektrikodeButtonMouseEntered

    private void elektrikodeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elektrikodeButtonMouseExited
        ButtonAyarlari.setOrijinalBgFg(elektrikodeButton);
    }//GEN-LAST:event_elektrikodeButtonMouseExited

    private void suodeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suodeButtonMouseEntered
        ButtonAyarlari.setBgFg(suodeButton, Color.black, Color.white);
    }//GEN-LAST:event_suodeButtonMouseEntered

    private void suodeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suodeButtonMouseExited
        ButtonAyarlari.setOrijinalBgFg(suodeButton);
    }//GEN-LAST:event_suodeButtonMouseExited

    private void dogalgazodeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogalgazodeButtonMouseEntered
        ButtonAyarlari.setBgFg(dogalgazodeButton, Color.black, Color.white);
    }//GEN-LAST:event_dogalgazodeButtonMouseEntered

    private void dogalgazodeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogalgazodeButtonMouseExited
        ButtonAyarlari.setOrijinalBgFg(dogalgazodeButton);
    }//GEN-LAST:event_dogalgazodeButtonMouseExited

    private void internetodeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_internetodeButtonMouseEntered
        ButtonAyarlari.setBgFg(internetodeButton, Color.black, Color.white);
    }//GEN-LAST:event_internetodeButtonMouseEntered

    private void internetodeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_internetodeButtonMouseExited
        ButtonAyarlari.setOrijinalBgFg(internetodeButton);

    }//GEN-LAST:event_internetodeButtonMouseExited

    // actionperformed

    private void elektrikodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elektrikodeButtonActionPerformed

      methods.Methods.ode(GirisEkrani.kullanici_id, elektrik_db);
      methods.Methods.elektrikFaturaGuncelle(GirisEkrani.kullanici_id, 0);

      
        
      
        int  bakiye=database.getBakiyeFromDatabase(GirisEkrani.kullanici_id);
        
HesapTablosu.ekleHesapHareketi(GirisEkrani.kullanici_id, tarih, "Elektrik Fatura Borcu",elektrik_db ,bakiye );
      
      
      
      
      
      
 //       JOptionPane.showMessageDialog(this, "elektrik ödemesi başarılı");
        ActionAyarlari.setVisible(this, new HesapEkranii());

    }//GEN-LAST:event_elektrikodeButtonActionPerformed

    private void suodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suodeButtonActionPerformed

        methods.Methods.ode(GirisEkrani.kullanici_id, su_db);
        
        methods.Methods.suFaturaGuncelle(GirisEkrani.kullanici_id, 0);
        
        int  bakiye=database.getBakiyeFromDatabase(GirisEkrani.kullanici_id);
        
               HesapTablosu.ekleHesapHareketi(GirisEkrani.kullanici_id, tarih, "Su Fatura Borcu",su_db ,bakiye );
        

    //    JOptionPane.showMessageDialog(this, "su  ödemesi başarılı");
        ActionAyarlari.setVisible(this, new HesapEkranii());
    }//GEN-LAST:event_suodeButtonActionPerformed

    private void dogalgazodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogalgazodeButtonActionPerformed
        methods.Methods.ode(GirisEkrani.kullanici_id, dogalgaz_db);
        
        methods.Methods.dogalgazFaturaGuncelle(GirisEkrani.kullanici_id, 0);
        
        int  bakiye=database.getBakiyeFromDatabase(GirisEkrani.kullanici_id);
        
         HesapTablosu.ekleHesapHareketi(GirisEkrani.kullanici_id, tarih, "Doğalgaz Fatura Borcu",dogalgaz_db ,bakiye );
        
        
     //   JOptionPane.showMessageDialog(this, "doğalgaz ödemesi başarılı");
        ActionAyarlari.setVisible(this, new HesapEkranii());
    }//GEN-LAST:event_dogalgazodeButtonActionPerformed

    private void internetodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internetodeButtonActionPerformed

        methods.Methods.ode(GirisEkrani.kullanici_id, internet_db);
        
        methods.Methods.internetFaturaGuncelle(GirisEkrani.kullanici_id, 0);
        int  bakiye=database.getBakiyeFromDatabase(GirisEkrani.kullanici_id);
        
           HesapTablosu.ekleHesapHareketi(GirisEkrani.kullanici_id, tarih, "İnternet Fatura Borcu ",internet_db ,bakiye );
        
      //  JOptionPane.showMessageDialog(this, "internet ödemesi başarılı");
        ActionAyarlari.setVisible(this, new HesapEkranii());
    }//GEN-LAST:event_internetodeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(odemeler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(odemeler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(odemeler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(odemeler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new odemeler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MESAJDOGALGAZLABEL;
    private javax.swing.JLabel MESAJELEKTRİKLABEL;
    private javax.swing.JLabel MESAJSULABEL;
    private javax.swing.JLabel MESAJİNTERNETLABEL;
    private javax.swing.JLabel dogalgazborcu;
    private javax.swing.JButton dogalgazodeButton;
    private javax.swing.JLabel elektrikborcu;
    private javax.swing.JButton elektrikodeButton;
    private javax.swing.JButton geriButton;
    private javax.swing.JLabel internetborcu;
    private javax.swing.JButton internetodeButton;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JPanel odemelerEkraniPanel;
    private javax.swing.JLabel suborcu;
    private javax.swing.JButton suodeButton;
    // End of variables declaration//GEN-END:variables

}
