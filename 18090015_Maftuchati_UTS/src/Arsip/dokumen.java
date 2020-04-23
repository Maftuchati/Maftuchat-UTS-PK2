/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arsip;

import java.awt.BorderLayout;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MAFTUCHATI
 */
public class dokumen extends javax.swing.JFrame {

    DefaultTableModel model;
    String idData;
    private String File;
        public dokumen() {
        initComponents();
        String[] judul = {"id", "Kode Dokumen", "Nama Dokumen", "Kategori Dokumen", "Lokasi Dokumen(Path)", "Deskripsi", "Tanggal"};
        model = new DefaultTableModel(judul, 0);
        tblData.setModel(model);
        loadData(""); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txttanggal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtpath = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbkategori = new javax.swing.JComboBox<>();
        btntambah = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnUbah = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        txtdeskripsi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        path = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Kode Dokumen");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 114, -1, -1));

        txtkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 115, 230, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nama Dokumen");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 153, -1, -1));

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 154, 230, -1));

        txttanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttanggalActionPerformed(evt);
            }
        });
        getContentPane().add(txttanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 310, 230, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Kategori Dokumen");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 194, -1, -1));

        txtpath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpathActionPerformed(evt);
            }
        });
        getContentPane().add(txtpath, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 233, 230, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Lokasi Dokumen (Path)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 231, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Tanggal");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 309, -1, -1));

        cmbkategori.setBackground(new java.awt.Color(0, 51, 255));
        cmbkategori.setForeground(new java.awt.Color(255, 255, 255));
        cmbkategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pribadi", "Niaga", "Sejarah", "Pemerintah" }));
        getContentPane().add(cmbkategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 192, 230, -1));

        btntambah.setBackground(new java.awt.Color(255, 255, 204));
        btntambah.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btntambah.setText("Simpan");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        getContentPane().add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 380, -1, -1));

        tblData.setForeground(new java.awt.Color(255, 0, 51));
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 540, 246));

        btnUbah.setBackground(new java.awt.Color(255, 255, 204));
        btnUbah.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });
        getContentPane().add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 201, -1));

        txtdeskripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdeskripsiActionPerformed(evt);
            }
        });
        getContentPane().add(txtdeskripsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 271, 230, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Cari");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 40, 20));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Deskripsi Dokumen");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 270, -1, -1));

        btnlogout.setBackground(new java.awt.Color(255, 255, 204));
        btnlogout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(51, 51, 51));
        btnlogout.setText("LOGOUT");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, -1));

        btnHapus.setBackground(new java.awt.Color(255, 255, 204));
        btnHapus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("PENGISIAN ARSIP DOKUMEN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 479, 45));

        path.setText("path");
        path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathActionPerformed(evt);
            }
        });
        getContentPane().add(path, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Silahkan isi form berikut :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 240, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodeActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txttanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttanggalActionPerformed

    private void txtpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpathActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/dokumen?useTimezone=true&serverTimezone=UTC", "root", "");
            cn.createStatement().executeUpdate("INSERT INTO data_dokumen(id, Kode, nama, kategori, path, deskripsi, tanggal) "
                    + "VALUES " + "(NULL,'" + txtkode.getText() + "','" + txtnama.getText() + "','" 
                    + cmbkategori.getSelectedItem() + "','" + txtpath.getText() + "','" + txtdeskripsi.getText() 
                    + "','" + txttanggal.getText() + "')" );
            
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasill.....");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ada yang belum diisi !!");
        }
        loadData("");
    }//GEN-LAST:event_btntambahActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        int i = tblData.getSelectedRow();

        if (i > -1) {
            idData = model.getValueAt(i, 0).toString();
            txtkode.setText(model.getValueAt(i, 1).toString());
            txtnama.setText(model.getValueAt(i, 2).toString());
            cmbkategori.setSelectedItem(model.getValueAt(i, 3));
            txtpath.setText(model.getValueAt(i, 4).toString());
            txtdeskripsi.setText(model.getValueAt(i, 5).toString());
            txttanggal.setText(model.getValueAt(i, 6).toString());
        }
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        try {
            String filename = null;
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/dokumen?useTimezone=true&serverTimezone=UTC", "root", "");
            Statement st = cn.createStatement();
            cn.createStatement().executeUpdate("UPDATE data_dokumen set Kode ='" 
                    + txtkode.getText() + "',nama ='" + txtnama.getText() + "',kategori ='" 
                    + cmbkategori.getSelectedItem() + "',path ='" + txtpath.getText() + "',deskripsi ='" 
                    + txtdeskripsi.getText() + "',tanggal ='" + txttanggal.getText() + "' WHERE id ='" + idData + "'");

            JOptionPane.showMessageDialog(null, "Data telah diedit.....");
            loadData("");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        String key = txtCari.getText();
        if (key.isEmpty()) {
            loadData("");
        } else {
            loadData(key);
        }
    }//GEN-LAST:event_txtCariKeyReleased

    private void txtdeskripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdeskripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdeskripsiActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int baris = tblData.getSelectedRow();
        if (baris !=-1) {
            int id = Integer.parseInt(tblData.getValueAt(baris, 0).toString());
            int pilih = JOptionPane.showConfirmDialog(this, ""+"Apakah Anda Yakin ?","Konfirmasi"
                    ,JOptionPane.YES_NO_OPTION);
            if (pilih==0) {
                
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/dokumen?useTimezone=true&serverTimezone=UTC", "root", "");
            cn.createStatement().executeUpdate("DELETE FROM data_dokumen where id ='" + idData + "'");
            loadData("");
            JOptionPane.showMessageDialog(null, "data terhapus.....");
        } catch (SQLException ex) {
            Logger.getLogger(dokumen.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathActionPerformed
        String filename = null;
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        txtpath.setText(filename);
    }//GEN-LAST:event_pathActionPerformed

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
            java.util.logging.Logger.getLogger(dokumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dokumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dokumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dokumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dokumen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnUbah;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btntambah;
    private javax.swing.JComboBox<String> cmbkategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton path;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtdeskripsi;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtpath;
    private javax.swing.JTextField txttanggal;
    // End of variables declaration//GEN-END:variables


    private void loadData(String key) {
        try {
            model.setRowCount(0);
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/dokumen?useTimezone=true&serverTimezone=UTC", "root", "");
            Statement st = cn.createStatement();

            String where = key.isEmpty() ? "" : " WHERE Kode LIKE '%" + key + "%' OR nama LIKE '%"+ key + "%' OR kategori LIKE '%"+ key + "%' OR path LIKE '%"+ key +"%' OR deskripsi LIKE '%"+ key +"%' OR tanggal LIKE '%"+key+"%'";

            ResultSet rs = st.executeQuery("SELECT * FROM data_dokumen" + where);
            int no = 0;
            while (rs.next()) {
                
                no++;
                int id = rs.getInt("id");
                String Kode = rs.getString("Kode");
                String nama = rs.getString("Nama");
                String kategori = rs.getString("kategori");
                String path = rs.getString("path");
                String deskripsi = rs.getString("deskripsi");
                String tanggal = rs.getString("tanggal");

                Object[] data = {id, Kode, nama, kategori, path, deskripsi, tanggal};
                model.addRow(data);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}
