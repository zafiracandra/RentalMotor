
import static java.lang.Math.toIntExact;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import uts.KoneksiDB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zafira Candra
 */
public class Form extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Form() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        namaPeminjam = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        alamatPeminjam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        noStruk = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        noPol = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRental = new javax.swing.JTable();
        lamaPinjam = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tglKembali = new com.toedter.calendar.JDateChooser();
        tglPinjam = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        btnPrint = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        hitungHari = new javax.swing.JButton();
        harga1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Zsylett", 1, 24)); // NOI18N
        jLabel1.setText("Rental Motor");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 310, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 750, 80);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nama Peminjam");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 11, 96, 15);

        namaPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPeminjamActionPerformed(evt);
            }
        });
        jPanel2.add(namaPeminjam);
        namaPeminjam.setBounds(10, 30, 170, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Alamat Peminjam");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 70, 120, 15);
        jPanel2.add(alamatPeminjam);
        alamatPeminjam.setBounds(10, 90, 170, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nama Peminjam");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 11, 96, 15);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(10, 30, 160, 30);
        jPanel2.add(noStruk);
        noStruk.setBounds(10, 150, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("No Struk");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 130, 120, 15);
        jPanel2.add(noPol);
        noPol.setBounds(10, 210, 170, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("No Pol");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 190, 120, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Tanggal Pinjam");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 250, 120, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Tanggal Kembali");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 310, 120, 15);

        tbRental.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Alamat", "No Sruk", "No Pol", "Tanggal Pinjam", "Tanggal Kembali", "Harga"
            }
        ));
        jScrollPane1.setViewportView(tbRental);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(210, 80, 520, 350);
        jPanel2.add(lamaPinjam);
        lamaPinjam.setBounds(10, 460, 170, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Lama Hari");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 440, 120, 15);
        jPanel2.add(tglKembali);
        tglKembali.setBounds(10, 330, 170, 30);
        jPanel2.add(tglPinjam);
        tglPinjam.setBounds(10, 270, 170, 30);

        jPanel3.setLayout(null);

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel3.add(btnPrint);
        btnPrint.setBounds(410, 10, 100, 40);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave);
        btnSave.setBounds(10, 10, 110, 40);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear);
        btnClear.setBounds(140, 10, 110, 40);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete);
        btnDelete.setBounds(280, 10, 100, 40);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(210, 10, 520, 60);

        hitungHari.setText("Hitung Hari");
        hitungHari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungHariActionPerformed(evt);
            }
        });
        jPanel2.add(hitungHari);
        hitungHari.setBounds(10, 500, 100, 40);
        jPanel2.add(harga1);
        harga1.setBounds(10, 390, 170, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Harga");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 370, 120, 15);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 100, 750, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String pinjam = dateFormat.format(tglPinjam.getDate());
        String kembali = dateFormat.format(tglKembali.getDate());
        
       
        if("".equals(namaPeminjam.getText()) || "".equals(alamatPeminjam.getText()) || "".equals(noStruk.getText()) || pinjam.equals("") || kembali.equals("") || "".equals(noPol.getText()) ||  "".equals(harga1.getText())   ){
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {

            String SQL = "INSERT INTO data VALUES ('"+namaPeminjam.getText()+"','"+alamatPeminjam.getText()+"','"+noStruk.getText()+"','"+"','"+"','"+noPol.getText()+"','"+pinjam+"','"+kembali+"','"+lamaPinjam.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if(status == 1){
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void namaPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPeminjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaPeminjamActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        namaPeminjam.setText("");
        alamatPeminjam.setText("");
        noStruk.setText("");
        noPol.setText("");
        tglPinjam.setDate(null);
        tglKembali.setDate(null);
        lamaPinjam.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void hitungHariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungHariActionPerformed
        // TODO add your handling code here:
        Date Pinjam = tglPinjam.getDate();
        Date Kembali = tglKembali.getDate();
        long startTime = Pinjam.getTime();
        long endTime = Kembali.getTime();
        
        long sewaTime = endTime - startTime;
        long bedaHari = sewaTime/(1000 * 60 * 60 * 24);
        DateFormat dateFormat = DateFormat.getDateInstance();
        
        lamaPinjam.setText(" "+bedaHari+" hari");
        
        int lama = toIntExact(bedaHari);
        int total = lama * 20000;
        String harga = Integer.toString(total);
        
        harga1.setText(harga);
    }//GEN-LAST:event_hitungHariActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int baris = tbRental.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(null,"Anda yakin ingin menghapus data?","Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == 0){
            if(baris != -1){
                String struk = tbRental.getValueAt(baris, 2).toString();
                String SQL = "DELETE FROM db_uts WHERE struk='"+struk+"'";
                int status = KoneksiDB.execute(SQL);
                
                if(status == 1){
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
                }
            } else {
               JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }

    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Biodata Siswa SMK Telkom Malang");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}   ");
        try{
            tbRental.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Biodata Siswa SMK Telkom Malang");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}   ");
        try{
            tbRental.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_btnPrintActionPerformed

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatPeminjam;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField harga1;
    private javax.swing.JButton hitungHari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField lamaPinjam;
    private javax.swing.JTextField namaPeminjam;
    private javax.swing.JTextField noPol;
    private javax.swing.JTextField noStruk;
    private javax.swing.JTable tbRental;
    private com.toedter.calendar.JDateChooser tglKembali;
    private com.toedter.calendar.JDateChooser tglPinjam;
    // End of variables declaration//GEN-END:variables
}
