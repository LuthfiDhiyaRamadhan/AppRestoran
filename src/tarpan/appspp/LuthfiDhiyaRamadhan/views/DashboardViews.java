/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarpan.appspp.LuthfiDhiyaRamadhan.views;

import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import tarpan.appspp.LuthfiDhiyaRamadhan.config.Koneksi;

/**
 *
 * @author TARPAN
 */
public class DashboardViews extends javax.swing.JFrame {

    /**
     * Creates new form DashboardViews
     */
    public DashboardViews() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuDataMaster = new javax.swing.JMenu();
        menuCRUDdatasiswa = new javax.swing.JMenuItem();
        menuCRUDdatapetugas = new javax.swing.JMenuItem();
        menuCRUDdatakelas = new javax.swing.JMenuItem();
        menuCRUDdataspp = new javax.swing.JMenuItem();
        menuDataTransaksi = new javax.swing.JMenu();
        menuTransaksi = new javax.swing.JMenuItem();
        menuHistory = new javax.swing.JMenuItem();
        menuLaporan = new javax.swing.JMenu();
        menuCetakLaporan = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenu();
        menuAboutUs = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("ANDA LOGIN SEBAGAI");

        lblLevel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblLevel.setText("LEVEL");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tarpan/appspp/LuthfiDhiyaRamadhan/assets/icons8_facebook_32px_2.png"))); // NOI18N
        jLabel9.setText("Luthfi Dhiya Ramadhan");

        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tarpan/appspp/LuthfiDhiyaRamadhan/assets/icons8_instagram_32px.png"))); // NOI18N
        jLabel11.setText("Luthfi_Dhiyar16");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 255));
        jLabel3.setText("INFO");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("CONTACT US");

        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tarpan/appspp/LuthfiDhiyaRamadhan/assets/icons8_whatsapp_32px.png"))); // NOI18N
        jLabel12.setText("0858-6473-8403");

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tarpan/appspp/LuthfiDhiyaRamadhan/assets/icons8_secured_letter_32px.png"))); // NOI18N
        jLabel10.setText("luthfidhiyar16@gmail.com");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 255, 255));
        jLabel13.setText("POWERED BY");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("SMKS TARUNA HARAPAN 1 CIPATAT");

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tarpan/appspp/LuthfiDhiyaRamadhan/assets/icons8_copyright_16px.png"))); // NOI18N
        jLabel7.setText("2021 Developed by Luthfi Dhiya Ramadhan");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Copyright");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(217, 217, 217))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(64, 64, 64)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10))
                .addGap(40, 40, 40))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnLogout.setBackground(new java.awt.Color(255, 0, 51));
        btnLogout.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(184, 184, 184)
                        .addComponent(btnLogout)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLevel)
                        .addGap(371, 371, 371))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogout)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLevel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuDataMaster.setText("Data Master");

        menuCRUDdatasiswa.setText("CRUD data siswa");
        menuCRUDdatasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCRUDdatasiswaActionPerformed(evt);
            }
        });
        menuDataMaster.add(menuCRUDdatasiswa);

        menuCRUDdatapetugas.setText("CRUD data petugas");
        menuCRUDdatapetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCRUDdatapetugasActionPerformed(evt);
            }
        });
        menuDataMaster.add(menuCRUDdatapetugas);

        menuCRUDdatakelas.setText("CRUD data kelas");
        menuCRUDdatakelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCRUDdatakelasActionPerformed(evt);
            }
        });
        menuDataMaster.add(menuCRUDdatakelas);

        menuCRUDdataspp.setText("CRUD data spp");
        menuCRUDdataspp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCRUDdatasppActionPerformed(evt);
            }
        });
        menuDataMaster.add(menuCRUDdataspp);

        jMenuBar1.add(menuDataMaster);

        menuDataTransaksi.setText("Data Transaksi");

        menuTransaksi.setText("Transaksi Pembayaran");
        menuTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTransaksiActionPerformed(evt);
            }
        });
        menuDataTransaksi.add(menuTransaksi);

        menuHistory.setText("History Pembayaran");
        menuHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHistoryActionPerformed(evt);
            }
        });
        menuDataTransaksi.add(menuHistory);

        jMenuBar1.add(menuDataTransaksi);

        menuLaporan.setText("Laporan");

        menuCetakLaporan.setText("Cetak Laporan");
        menuCetakLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCetakLaporanActionPerformed(evt);
            }
        });
        menuLaporan.add(menuCetakLaporan);

        jMenuBar1.add(menuLaporan);

        menuAbout.setText("About");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });

        menuAboutUs.setText("About Us");
        menuAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutUsActionPerformed(evt);
            }
        });
        menuAbout.add(menuAboutUs);

        jMenuBar1.add(menuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        LoginViews login = new LoginViews();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void menuTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTransaksiActionPerformed
        // TODO add your handling code here:
        TransaksiPembayaranViews datatransaksi = new TransaksiPembayaranViews();
        datatransaksi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuTransaksiActionPerformed

    private void menuCRUDdatasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCRUDdatasiswaActionPerformed
        // TODO add your handling code here:
        CrudDataSiswaViews datasiswa = new CrudDataSiswaViews();
        datasiswa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuCRUDdatasiswaActionPerformed

    private void menuCRUDdatapetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCRUDdatapetugasActionPerformed
        // TODO add your handling code here:
        CrudDataPetugasViews datapetugas = new CrudDataPetugasViews();
        datapetugas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuCRUDdatapetugasActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuAboutActionPerformed

    private void menuAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutUsActionPerformed
        // TODO add your handling code here:
        AboutViews about = new AboutViews();
        about.setVisible(true);
    }//GEN-LAST:event_menuAboutUsActionPerformed

    private void menuCRUDdatakelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCRUDdatakelasActionPerformed
        // TODO add your handling code here:
        CrudDataKelasViews datakelas = new CrudDataKelasViews();
        datakelas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuCRUDdatakelasActionPerformed

    private void menuCRUDdatasppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCRUDdatasppActionPerformed
        // TODO add your handling code here:
        CrudDataSppViews dataspp = new CrudDataSppViews();
        dataspp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuCRUDdatasppActionPerformed

    private void menuHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHistoryActionPerformed
        // TODO add your handling code here:
        HistoryPembayaranViews datahistory = new HistoryPembayaranViews();
        datahistory.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuHistoryActionPerformed

    private void menuCetakLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCetakLaporanActionPerformed
        // TODO add your handling code here:
        LaporanViews datalaporan = new LaporanViews();
        datalaporan.setVisible(true);
        this.dispose();
        
        try {
            Connection con = new Koneksi().konek();
            try {
                Map<String, Object> parameter = new HashMap<String, Object>();
                
                File rpt = new File("src/tarpan/appspp/LuthfiDhiyaRamadhan/laporan/LaporanTransaksi.jrxml");
                JasperDesign jasDesign = JRXmlLoader.load(rpt);
                parameter.clear();
                JasperReport jasReport = JasperCompileManager.compileReport(jasDesign);
                JasperPrint jasPrint = net.sf.jasperreports.engine.JasperFillManager.fillReport(jasReport, 
                        parameter, con);
                JasperViewer.viewReport(jasPrint, false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Laporan tidak ditemukan" + e.getMessage());
            }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    
    }//GEN-LAST:event_menuCetakLaporanActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardViews().setVisible(true);
            }
        });
    }
    
    public void dashAdmin(){
        lblLevel.setText("Admin");
    }
    public void dashPetugas(){
        lblLevel.setText("Petugas");
        menuDataMaster.setVisible(false);
        menuLaporan.setVisible(false);
    }
    public void dashSiswa(){
        lblLevel.setText("Siswa");
        menuTransaksi.setVisible(false);
        menuDataMaster.setVisible(false);
        menuLaporan.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenuItem menuAboutUs;
    private javax.swing.JMenuItem menuCRUDdatakelas;
    private javax.swing.JMenuItem menuCRUDdatapetugas;
    private javax.swing.JMenuItem menuCRUDdatasiswa;
    private javax.swing.JMenuItem menuCRUDdataspp;
    private javax.swing.JMenuItem menuCetakLaporan;
    private javax.swing.JMenu menuDataMaster;
    private javax.swing.JMenu menuDataTransaksi;
    private javax.swing.JMenuItem menuHistory;
    private javax.swing.JMenu menuLaporan;
    private javax.swing.JMenuItem menuTransaksi;
    // End of variables declaration//GEN-END:variables
}
