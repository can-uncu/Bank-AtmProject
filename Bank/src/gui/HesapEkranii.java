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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class HesapEkranii extends javax.swing.JFrame implements InterfaceDuzenleyici {

   
    //static  DefaultTableModel model;
    
    
    
    public HesapEkranii()  {
 
        initComponents();
        
        
        getEdit();
        methods.Methods.TabloyaSatirYaz(tablo);
               BakiyeLabel.setText( ""+database.getBakiyeFromDatabase(GirisEkrani.kullanici_id));
        KullanıcıAdSoyadLabel.setText(GirisEkrani.name);
    
        try {
            altınLabel.setText(StockMarket.AltınKuru());
        } catch (Exception ex) {
            Logger.getLogger(HesapEkranii.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dolarLabel.setText(StockMarket.DolarKuru());
        } catch (Exception ex) {
            Logger.getLogger(HesapEkranii.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            euroLabel.setText(StockMarket.EuroKuru());
            
            //  DbConnection.showTable(tablo);
        } catch (Exception ex) {
            Logger.getLogger(HesapEkranii.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        hesapekraniPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        KullanıcıAdSoyadLabel = new javax.swing.JTextField();
        HosgeldinLabel = new javax.swing.JTextField();
        ayarlarlabel = new javax.swing.JLabel();
        BakiyeLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cikislabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ODEMELERPANEL = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PARAYATIRPANEL = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PARACEKPANEL2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        HAVALEPANEL = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        FinansalVerilerPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        euroLabel = new javax.swing.JLabel();
        altınLabel = new javax.swing.JLabel();
        dolarLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablo = new javax.swing.JTable();
        HesapHareketleri_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hesapekraniPanel.setBackground(new java.awt.Color(153, 153, 153));
        hesapekraniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(240, 243, 244));
        jPanel1.setForeground(new java.awt.Color(68, 68, 68));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KullanıcıAdSoyadLabel.setBackground(new java.awt.Color(240, 243, 244));
        KullanıcıAdSoyadLabel.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        KullanıcıAdSoyadLabel.setForeground(new java.awt.Color(102, 102, 102));
        KullanıcıAdSoyadLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KullanıcıAdSoyadLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KullanıcıAdSoyadLabelActionPerformed(evt);
            }
        });
        jPanel1.add(KullanıcıAdSoyadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 540, 50));

        HosgeldinLabel.setEditable(false);
        HosgeldinLabel.setBackground(new java.awt.Color(240, 243, 244));
        HosgeldinLabel.setFont(new java.awt.Font("Candara Light", 3, 24)); // NOI18N
        HosgeldinLabel.setForeground(new java.awt.Color(102, 102, 102));
        HosgeldinLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        HosgeldinLabel.setText("HOŞGELDİNİZ");
        HosgeldinLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(HosgeldinLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 300, 50));

        ayarlarlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/33333_32.png"))); // NOI18N
        ayarlarlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ayarlarlabelMouseClicked(evt);
            }
        });
        jPanel1.add(ayarlarlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, -1, 59));

        BakiyeLabel.setFont(new java.awt.Font("Candara Light", 3, 18)); // NOI18N
        BakiyeLabel.setForeground(new java.awt.Color(102, 102, 102));
        BakiyeLabel.setText("BAKİYE:");
        jPanel1.add(BakiyeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 300, 177, 36));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 409, -1, -1));

        cikislabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8_shutdown_32.png"))); // NOI18N
        cikislabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cikislabelMouseClicked(evt);
            }
        });
        jPanel1.add(cikislabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, 59));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/notification_32.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, 59));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/message_link_32.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, -1, 59));

        jLabel4.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jLabel4.setText("BAKİYE ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 80, 40));

        jPanel3.setBackground(new java.awt.Color(42, 39, 41));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ODEMELERPANEL.setBackground(new java.awt.Color(42, 39, 41));
        ODEMELERPANEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ODEMELERPANELMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ODEMELERPANELMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ODEMELERPANELMouseExited(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(204, 0, 0));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("FATURALAR");

        javax.swing.GroupLayout ODEMELERPANELLayout = new javax.swing.GroupLayout(ODEMELERPANEL);
        ODEMELERPANEL.setLayout(ODEMELERPANELLayout);
        ODEMELERPANELLayout.setHorizontalGroup(
            ODEMELERPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ODEMELERPANELLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 131, Short.MAX_VALUE))
        );
        ODEMELERPANELLayout.setVerticalGroup(
            ODEMELERPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addGroup(ODEMELERPANELLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(ODEMELERPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 260, 80));

        PARAYATIRPANEL.setBackground(new java.awt.Color(42, 39, 41));
        PARAYATIRPANEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PARAYATIRPANELMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PARAYATIRPANELMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PARAYATIRPANELMouseExited(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(204, 0, 0));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("PARA YATIRMA");

        javax.swing.GroupLayout PARAYATIRPANELLayout = new javax.swing.GroupLayout(PARAYATIRPANEL);
        PARAYATIRPANEL.setLayout(PARAYATIRPANELLayout);
        PARAYATIRPANELLayout.setHorizontalGroup(
            PARAYATIRPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PARAYATIRPANELLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        PARAYATIRPANELLayout.setVerticalGroup(
            PARAYATIRPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PARAYATIRPANELLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel3.add(PARAYATIRPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 260, 80));

        PARACEKPANEL2.setBackground(new java.awt.Color(42, 39, 41));
        PARACEKPANEL2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PARACEKPANEL2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PARACEKPANEL2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PARACEKPANEL2MouseExited(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(204, 0, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("PARA ÇEKME");

        javax.swing.GroupLayout PARACEKPANEL2Layout = new javax.swing.GroupLayout(PARACEKPANEL2);
        PARACEKPANEL2.setLayout(PARACEKPANEL2Layout);
        PARACEKPANEL2Layout.setHorizontalGroup(
            PARACEKPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PARACEKPANEL2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        PARACEKPANEL2Layout.setVerticalGroup(
            PARACEKPANEL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PARACEKPANEL2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel3.add(PARACEKPANEL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 260, 80));

        HAVALEPANEL.setBackground(new java.awt.Color(42, 39, 41));
        HAVALEPANEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HAVALEPANELMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HAVALEPANELMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HAVALEPANELMouseExited(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 0, 0));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("HAVALE/ EFT ");

        javax.swing.GroupLayout HAVALEPANELLayout = new javax.swing.GroupLayout(HAVALEPANEL);
        HAVALEPANEL.setLayout(HAVALEPANELLayout);
        HAVALEPANELLayout.setHorizontalGroup(
            HAVALEPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HAVALEPANELLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(0, 127, Short.MAX_VALUE))
        );
        HAVALEPANELLayout.setVerticalGroup(
            HAVALEPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HAVALEPANELLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(30, 30, 30))
        );

        jPanel3.add(HAVALEPANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 260, 80));

        FinansalVerilerPanel.setBackground(new java.awt.Color(42, 39, 41));
        FinansalVerilerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FinansalVerilerPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FinansalVerilerPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FinansalVerilerPanelMouseExited(evt);
            }
        });
        FinansalVerilerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        FinansalVerilerPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 40));

        jLabel15.setBackground(new java.awt.Color(204, 0, 0));
        FinansalVerilerPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 80));

        jPanel3.add(FinansalVerilerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 260, 80));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 800));

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 820, 20));

        jPanel5.setBackground(new java.awt.Color(240, 243, 244));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/WhatsApp Görsel 2023-07-20 saat 12.19.55.jpg"))); // NOI18N
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 220, 180));

        jPanel6.setBackground(new java.awt.Color(240, 243, 244));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/US Dollar.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Euro.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Gold Bars.png"))); // NOI18N

        euroLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        altınLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        dolarLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dolarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(euroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(180, 180, 180)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(altınLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel17, jLabel18});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(euroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(altınLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(dolarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel16, jLabel17, jLabel18});

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, 820, 140));

        tablo.setBackground(new java.awt.Color(240, 243, 244));
        tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TARİH", "AÇIKLAMA", "MİKTAR", "BAKİYE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablo);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 704, 145));

        HesapHareketleri_btn.setText("HESAP HAREKETLERİ");
        HesapHareketleri_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HesapHareketleri_btnActionPerformed(evt);
            }
        });
        jPanel1.add(HesapHareketleri_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 600, -1, -1));

        hesapekraniPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 800));
        hesapekraniPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 785, 880));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hesapekraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1072, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(hesapekraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cikislabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cikislabelMouseClicked
        ActionAyarlari.setVisible(this, new GirisEkrani());
    }//GEN-LAST:event_cikislabelMouseClicked

    private void ayarlarlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayarlarlabelMouseClicked
        ActionAyarlari.setVisible(this, new ayarlarEkrani());
    }//GEN-LAST:event_ayarlarlabelMouseClicked

    private void KullanıcıAdSoyadLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KullanıcıAdSoyadLabelActionPerformed

    }//GEN-LAST:event_KullanıcıAdSoyadLabelActionPerformed

    private void HesapHareketleri_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HesapHareketleri_btnActionPerformed

          ActionAyarlari.secondSetVisible(new HesapTabloFrame());
    }//GEN-LAST:event_HesapHareketleri_btnActionPerformed

    private void PARACEKPANEL2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PARACEKPANEL2MouseClicked
        bar(jLabel5);
        ActionAyarlari.secondSetVisible(new paracekme());
 
      //   ActionAyarlari.setVisible(this, new paracekme());
    }//GEN-LAST:event_PARACEKPANEL2MouseClicked

    private void PARACEKPANEL2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PARACEKPANEL2MouseEntered
     PARACEKPANEL2.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_PARACEKPANEL2MouseEntered

    private void PARACEKPANEL2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PARACEKPANEL2MouseExited
         PARACEKPANEL2.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_PARACEKPANEL2MouseExited

    private void PARAYATIRPANELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PARAYATIRPANELMouseClicked
   bar(jLabel6);
 //  ActionAyarlari.setVisible(this, new parayatırma());
 ActionAyarlari.secondSetVisible(new parayatırma());
    }//GEN-LAST:event_PARAYATIRPANELMouseClicked

    private void PARAYATIRPANELMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PARAYATIRPANELMouseEntered
      PARAYATIRPANEL.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_PARAYATIRPANELMouseEntered

    private void PARAYATIRPANELMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PARAYATIRPANELMouseExited
   PARAYATIRPANEL.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_PARAYATIRPANELMouseExited

    private void ODEMELERPANELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ODEMELERPANELMouseClicked
          bar(jLabel7); ActionAyarlari.secondSetVisible(new odemeler());
    }//GEN-LAST:event_ODEMELERPANELMouseClicked

    private void ODEMELERPANELMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ODEMELERPANELMouseEntered
     ODEMELERPANEL.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_ODEMELERPANELMouseEntered

    private void ODEMELERPANELMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ODEMELERPANELMouseExited
         ODEMELERPANEL.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_ODEMELERPANELMouseExited

    private void HAVALEPANELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HAVALEPANELMouseClicked
  bar(jLabel8); ActionAyarlari.secondSetVisible(new havale());
    }//GEN-LAST:event_HAVALEPANELMouseClicked

    private void HAVALEPANELMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HAVALEPANELMouseEntered
   HAVALEPANEL.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_HAVALEPANELMouseEntered

    
    private void HAVALEPANELMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HAVALEPANELMouseExited
       HAVALEPANEL.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_HAVALEPANELMouseExited

    private void FinansalVerilerPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinansalVerilerPanelMouseClicked
        
    }//GEN-LAST:event_FinansalVerilerPanelMouseClicked

    private void FinansalVerilerPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinansalVerilerPanelMouseEntered
         // FinansalVerilerPanel.setBackground(Color.decode("#565255"));
    }//GEN-LAST:event_FinansalVerilerPanelMouseEntered

    private void FinansalVerilerPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinansalVerilerPanelMouseExited
         // FinansalVerilerPanel.setBackground(Color.decode("#2a2729"));
    }//GEN-LAST:event_FinansalVerilerPanelMouseExited
   public void bar(JLabel lab){
      
        jLabel6.setOpaque(false);
        jLabel7.setOpaque(false);
        jLabel8.setOpaque(false);
        jLabel15.setOpaque(false);
        lab.setOpaque(true);
        hesapekraniPanel.repaint();
    }
    
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
            java.util.logging.Logger.getLogger(HesapEkranii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesapEkranii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesapEkranii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapEkranii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HesapEkranii().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BakiyeLabel;
    private javax.swing.JPanel FinansalVerilerPanel;
    private javax.swing.JPanel HAVALEPANEL;
    private javax.swing.JButton HesapHareketleri_btn;
    private javax.swing.JTextField HosgeldinLabel;
    private javax.swing.JTextField KullanıcıAdSoyadLabel;
    private javax.swing.JPanel ODEMELERPANEL;
    private javax.swing.JPanel PARACEKPANEL2;
    private javax.swing.JPanel PARAYATIRPANEL;
    private javax.swing.JLabel altınLabel;
    private javax.swing.JLabel ayarlarlabel;
    private javax.swing.JLabel cikislabel;
    private javax.swing.JLabel dolarLabel;
    private javax.swing.JLabel euroLabel;
    private javax.swing.JPanel hesapekraniPanel;
    private javax.swing.JColorChooser jColorChooser1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void getEdit() {
        // throw new UnsupportedOperationException("Not supported yet."); 
        this.setLocationRelativeTo(null);
        hesapekraniPanel.setFocusable(true);

    }
}
