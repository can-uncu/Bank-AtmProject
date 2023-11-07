
package gui;

import AppPackage.AnimationClass;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;


public class NewFrame extends javax.swing.JFrame {

       AnimationClass ac  = new AnimationClass();
       
    public NewFrame() {
        initComponents();
            //  slide();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ParaCekPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ParaYatirPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        HavalePanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        FaturalarPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(180, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(42, 39, 41));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePanel.setBackground(new java.awt.Color(42, 39, 41));
        HomePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomePanelMouseExited(evt);
            }
        });
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        HomePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 60));

        jLabel2.setText("jLabel2");
        HomePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Home");
        HomePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jPanel2.add(HomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 180, 60));

        ParaCekPanel.setBackground(new java.awt.Color(42, 39, 41));
        ParaCekPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ParaCekPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ParaCekPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ParaCekPanelMouseExited(evt);
            }
        });
        ParaCekPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(153, 0, 0));
        ParaCekPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 60));

        jLabel5.setText("jLabel5");
        ParaCekPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Para Çekme");
        ParaCekPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jPanel2.add(ParaCekPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 180, 60));

        ParaYatirPanel.setBackground(new java.awt.Color(42, 39, 41));
        ParaYatirPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ParaYatirPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ParaYatirPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ParaYatirPanelMouseExited(evt);
            }
        });
        ParaYatirPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(153, 0, 0));
        ParaYatirPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 60));

        jLabel8.setText("jLabel8");
        ParaYatirPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Para Yatırma");
        ParaYatirPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jPanel2.add(ParaYatirPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 180, 60));

        HavalePanel.setBackground(new java.awt.Color(42, 39, 41));
        HavalePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HavalePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HavalePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HavalePanelMouseExited(evt);
            }
        });
        HavalePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(153, 0, 0));
        HavalePanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 60));

        jLabel11.setText("jLabel11");
        HavalePanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Havale");
        HavalePanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jPanel2.add(HavalePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 180, 60));

        FaturalarPanel.setBackground(new java.awt.Color(42, 39, 41));
        FaturalarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FaturalarPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FaturalarPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FaturalarPanelMouseExited(evt);
            }
        });
        FaturalarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(153, 0, 0));
        FaturalarPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 60));

        jLabel14.setText("jLabel14");
        FaturalarPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Faturalar");
        FaturalarPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jPanel2.add(FaturalarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 180, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 560));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(255, 51, 51));
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("icon gelecek");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 80));

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 20));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/008.png"))); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 40, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/notif.png"))); // NOI18N
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/closing.png"))); // NOI18N
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 40, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 740, 120));

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        jInternalFrame1.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jDesktopPane1.add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 420));

        jInternalFrame2.setVisible(true);
        jInternalFrame2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jInternalFrame2.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jDesktopPane1.add(jInternalFrame2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 400));

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 740, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMouseExited
        HomePanel.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_HomePanelMouseExited

    private void HomePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMouseClicked
        bar(jLabel1);
        kapat(jInternalFrame2);
         
       //   gui.ayarlar.ActionAyarlari.SETVİSİBLE(jInternalFrame1, jInternalFrame3);
    }//GEN-LAST:event_HomePanelMouseClicked

    private void HomePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMouseEntered
        HomePanel.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_HomePanelMouseEntered

    private void ParaCekPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaCekPanelMouseExited
       ParaCekPanel.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_ParaCekPanelMouseExited

    private void ParaCekPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaCekPanelMouseEntered
               ParaCekPanel.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_ParaCekPanelMouseEntered

    private void ParaCekPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaCekPanelMouseClicked
        bar(jLabel4);
        
           kapat(jInternalFrame1);
      //    gui.ayarlar.ActionAyarlari.SETVİSİBLE(jInternalFrame3, jInternalFrame1);
          
    }//GEN-LAST:event_ParaCekPanelMouseClicked

    private void ParaYatirPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaYatirPanelMouseClicked
        bar(jLabel7);
          // gui.ayarlar.ActionAyarlari.SETVİSİBLE(jInternalFrame3, jInternalFrame5);
    }//GEN-LAST:event_ParaYatirPanelMouseClicked

    private void ParaYatirPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaYatirPanelMouseExited
  ParaYatirPanel.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_ParaYatirPanelMouseExited

    private void ParaYatirPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaYatirPanelMouseEntered
             ParaYatirPanel.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_ParaYatirPanelMouseEntered

    private void HavalePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HavalePanelMouseClicked
        bar(jLabel10);
    }//GEN-LAST:event_HavalePanelMouseClicked

    private void HavalePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HavalePanelMouseExited
       HavalePanel.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_HavalePanelMouseExited

    private void HavalePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HavalePanelMouseEntered
            HavalePanel.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_HavalePanelMouseEntered

    private void FaturalarPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FaturalarPanelMouseClicked
        bar(jLabel13);
    }//GEN-LAST:event_FaturalarPanelMouseClicked

    private void FaturalarPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FaturalarPanelMouseExited
FaturalarPanel.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_FaturalarPanelMouseExited

    private void FaturalarPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FaturalarPanelMouseEntered
       FaturalarPanel.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_FaturalarPanelMouseEntered

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
            java.util.logging.Logger.getLogger(NewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewFrame().setVisible(true);
            }
        });
    }
    
        public void bar(JLabel lab){
        jLabel1.setOpaque(false);
        jLabel4.setOpaque(false);
        jLabel7.setOpaque(false);
        jLabel10.setOpaque(false);
        jLabel13.setOpaque(false);
       
        lab.setOpaque(true);
        jPanel1.repaint();
    }
        
        public void kapat(JInternalFrame internalFrame){
            
            internalFrame.setVisible(true);
        
                JInternalFrame[] frames = jDesktopPane1.getAllFrames();
                for (JInternalFrame frame : frames) {
                    if (frame != internalFrame) {
                        frame.dispose();
                    }
        }
        }
     /*   public void slide(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                int nb = 0;
                try{
                    while(true){
                        switch(nb){
                            case 0:
                                Thread.sleep(300);
                                ac.jLabelXLeft(800, 400, 12, 10, jLabel25);
                                
                                ac.jLabelXRight(-600, 60, 12, 10, jLabel31);
                                ac.jLabelXRight(-500, 80, 12, 10, jLabel26);
                                ac.jLabelXRight(-200, 80, 12, 10, jLabel28);
                                ac.jLabelXRight(-300, 80, 12, 10, jLabel29);
                                ac.jLabelXRight(-320, 80, 12, 10, jLabel27);
                                ac.jLabelXRight(-550, 80, 12, 10, jLabel30);
                        }
                    }
                }catch(Exception ex){
                    
                }
            }
        }){
            
        }.start();
        
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FaturalarPanel;
    private javax.swing.JPanel HavalePanel;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel ParaCekPanel;
    private javax.swing.JPanel ParaYatirPanel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
