/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project1;

/**
 *
 * @author HP
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.*;
import javax.swing.table.*;

public class bruhhhhh extends javax.swing.JFrame {
    public static Connection con;
    public static Statement stm;

    /**
     * Creates new form bruhhhhh
     */
    public bruhhhhh() {
        initComponents();
        refresh();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refresh)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_refreshActionPerformed

    /**
     * @param args the command line arguments
     */
    public void refresh(){
        loadData();
    }
    public void loadData() {
        try {
            String url = "jdbc:mysql://localhost/belajar_sql";
            String user = "root";
            String pass = "23050477";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            stm = con.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal" + e.getMessage());
        }
        
        try {
            // Query untuk mengambil semua data dari tabel barang1
            String query = "SELECT * FROM barang1";

            // Eksekusi query
            ResultSet resultSet = stm.executeQuery(query);

            // Memproses hasil query menjadi model tabel
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("BARCODE");
            model.addColumn("NAMA");
            model.addColumn("STOCK");
            model.addColumn("HARGA");

            while (resultSet.next()) {
                Object[] row = {
                        resultSet.getInt("barcode"),
                        resultSet.getString("nama_produk"),
                        resultSet.getInt("stock"),
                        resultSet.getInt("harga_per_pcs")
                };
                model.addRow(row);
            }

            // Menetapkan model tabel ke JTable
            jTable1.setModel(model);

        } catch (SQLException e) {
            System.err.println("Gagal menjalankan query: " + e.getMessage());
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bruhhhhh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // Membuat instance dari kelas project1
//        bruhhhhh myFrame = new bruhhhhh();
//        // Memanggil metode setVisible() untuk menampilkan frame
//        myFrame.setVisible(true);
        
//        try {
//            // Query untuk mengambil semua data dari tabel products
//            String query = "SELECT * FROM barang1";
//
//            // Eksekusi query
//            ResultSet resultSet = stm.executeQuery(query);
//
//            // Memproses hasil query menjadi model tabel
//            DefaultTableModel model = new DefaultTableModel();
//            model.addColumn("BARCODE");
//            model.addColumn("NAMA");
//            model.addColumn("STOCK");
//            model.addColumn("HARGA");
//
//            while (resultSet.next()) {
//                Object[] row = {
//                        resultSet.getInt("barcode"),
//                        resultSet.getString("nama_produk"),
//                        resultSet.getInt("stock"),
//                        resultSet.getInt("harga_per_pcs")
//                };
//                model.addRow(row);
//            }
//
//            // Menetapkan model tabel ke JTable
//            myFrame.jTable1.setModel(model);
//
//        } catch (SQLException e) {
//            System.err.println("Gagal menjalankan query: " + e.getMessage());
//        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public  void run() {
                
                  
                new bruhhhhh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}
