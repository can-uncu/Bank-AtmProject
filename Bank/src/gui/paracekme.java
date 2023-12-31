package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.InterfaceDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import methods.HesapTablosu;

public class paracekme extends javax.swing.JFrame implements InterfaceDuzenleyici {

    static int cekilen_para;

    public paracekme() {
        initComponents();
        getEdit();
        kullaniciAdiSoyadiLabel.setText(GirisEkrani.name);
        bakiyeLabel.setText("BAKİYENİZ :  " + database.getBakiyeFromDatabase(GirisEkrani.kullanici_id));
    }

    @Override
    public void getEdit() {

        this.setLocationRelativeTo(null);
        paracekmeEkraniPanel.setFocusable(true);
        this.setLocation(680, 125);

        TextAyarlari.ayarlasadecesayi(cekilecekMiktarText);
        //   TextAyarlari.ayarlaMaxLimit(cekilecekMiktarText, 4);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paracekmeEkraniPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        LimituyariLabel = new javax.swing.JLabel();
        toplambakiyeLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        cekeceginizMiktarLabel = new javax.swing.JLabel();
        cekilecekMiktarText = new javax.swing.JTextField();
        paracekButton = new javax.swing.JButton();
        geriButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        paracekmeEkraniPanel.setBackground(new java.awt.Color(255, 255, 255));

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(204, 204, 0));
        kullaniciAdiSoyadiLabel.setText("Sayın [KULLANICI ADI SOYADI ]");

        LimituyariLabel.setBackground(new java.awt.Color(0, 204, 0));
        LimituyariLabel.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        LimituyariLabel.setForeground(new java.awt.Color(102, 102, 102));
        LimituyariLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LimituyariLabel.setText("TEK SEFERDE ÇEKİLEBİLECEK TUTAR: 5000TL");

        toplambakiyeLabel.setForeground(java.awt.Color.cyan);
        toplambakiyeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        bakiyeLabel.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        bakiyeLabel.setForeground(new java.awt.Color(102, 102, 102));
        bakiyeLabel.setText("[BAKİYE]");

        cekeceginizMiktarLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        cekeceginizMiktarLabel.setForeground(new java.awt.Color(102, 102, 102));
        cekeceginizMiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cekeceginizMiktarLabel.setText("Çekeceğiniz Miktar :");

        cekilecekMiktarText.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        cekilecekMiktarText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekilecekMiktarTextActionPerformed(evt);
            }
        });
        cekilecekMiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cekilecekMiktarTextKeyReleased(evt);
            }
        });

        paracekButton.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        paracekButton.setForeground(new java.awt.Color(0, 102, 0));
        paracekButton.setText("PARA ÇEK ");
        paracekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paracekButtonActionPerformed(evt);
            }
        });

        geriButton.setForeground(new java.awt.Color(0, 102, 0));
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

        javax.swing.GroupLayout paracekmeEkraniPanelLayout = new javax.swing.GroupLayout(paracekmeEkraniPanel);
        paracekmeEkraniPanel.setLayout(paracekmeEkraniPanelLayout);
        paracekmeEkraniPanelLayout.setHorizontalGroup(
            paracekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paracekmeEkraniPanelLayout.createSequentialGroup()
                .addGroup(paracekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paracekmeEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(toplambakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paracekmeEkraniPanelLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(LimituyariLabel))
                    .addGroup(paracekmeEkraniPanelLayout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paracekmeEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriButton)
                        .addGap(120, 120, 120)
                        .addGroup(paracekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(paracekmeEkraniPanelLayout.createSequentialGroup()
                                .addComponent(cekeceginizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cekilecekMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paracekmeEkraniPanelLayout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(paracekButton)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        paracekmeEkraniPanelLayout.setVerticalGroup(
            paracekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paracekmeEkraniPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(paracekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(geriButton)
                    .addComponent(kullaniciAdiSoyadiLabel))
                .addGap(18, 18, 18)
                .addComponent(LimituyariLabel)
                .addGap(26, 26, 26)
                .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(paracekmeEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cekeceginizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cekilecekMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(toplambakiyeLabel)
                .addGap(18, 18, 18)
                .addComponent(paracekButton)
                .addContainerGap(502, Short.MAX_VALUE))
        );

        paracekmeEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bakiyeLabel, cekilecekMiktarText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paracekmeEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paracekmeEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cekilecekMiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cekilecekMiktarTextKeyReleased
        // kullanıcıdan klavyeden bir tuşa basılıp BIRAKTIĞINDA 

        TextAyarlari.checkTheTextKeyReleased(cekilecekMiktarText, 5000);


    }//GEN-LAST:event_cekilecekMiktarTextKeyReleased

    private void cekilecekMiktarTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekilecekMiktarTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cekilecekMiktarTextActionPerformed

    private void geriButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriButtonMouseClicked

        ActionAyarlari.SETVİSİBLE(this);


    }//GEN-LAST:event_geriButtonMouseClicked

    private void paracekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paracekButtonActionPerformed

        cekilen_para = Integer.parseInt(cekilecekMiktarText.getText());
        int bakiye = database.getBakiyeFromDatabase(GirisEkrani.kullanici_id);
        int son_bakiye = bakiye - cekilen_para;
        methods.Methods.bakiyeGuncelle(GirisEkrani.kullanici_id, son_bakiye);

        
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String tarih = dateTime.format(formatter);

        HesapTablosu.ekleHesapHareketi(GirisEkrani.kullanici_id, tarih, "ATM den çekilen para  ", cekilen_para, son_bakiye);

        JOptionPane.showMessageDialog(this, "Para Çekme İşlemi Başarılı Olmuştur"
                + "\n" + "ÇEKİLEN TUTAR : " + this.cekilecekMiktarText.getText() + "TL");
        ActionAyarlari.setVisible(this, new HesapEkranii());

    }//GEN-LAST:event_paracekButtonActionPerformed

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
            java.util.logging.Logger.getLogger(paracekme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paracekme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paracekme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paracekme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paracekme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LimituyariLabel;
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JLabel cekeceginizMiktarLabel;
    private javax.swing.JTextField cekilecekMiktarText;
    private javax.swing.JButton geriButton;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JButton paracekButton;
    private javax.swing.JPanel paracekmeEkraniPanel;
    private javax.swing.JLabel toplambakiyeLabel;
    // End of variables declaration//GEN-END:variables

}
