/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author DELL
 */
public class frmLingkaran extends javax.swing.JFrame {

    /**
     * Creates new form frmLingkaran
     */
    public frmLingkaran() {
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

        judul = new javax.swing.JLabel();
        lblJari = new javax.swing.JLabel();
        lblHasil = new javax.swing.JLabel();
        txtJari = new javax.swing.JTextField();
        txtHasil = new javax.swing.JTextField();
        btnLuas = new javax.swing.JButton();
        btnKeliling = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        judul.setText("Hitung Luas dan Keliling lingkaran");

        lblJari.setText("Jari-jari");

        lblHasil.setText("Hasil");

        txtJari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJariActionPerformed(evt);
            }
        });

        txtHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHasilActionPerformed(evt);
            }
        });

        btnLuas.setText("Luas");
        btnLuas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuasActionPerformed(evt);
            }
        });

        btnKeliling.setText("Keliling");
        btnKeliling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKelilingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(judul)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblHasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblJari, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtJari, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                    .addComponent(txtHasil)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnLuas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnKeliling, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judul)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJari)
                    .addComponent(txtJari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHasil)
                    .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuas)
                    .addComponent(btnKeliling))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuasActionPerformed
        // TODO add your handling code here:
        String lblJari = txtJari.getText();
        int r = Integer.parseInt(lblJari);
        double p = 3.14;
        double luas = p * r * r;
        txtHasil.setText(""+luas);
    }//GEN-LAST:event_btnLuasActionPerformed

    private void btnKelilingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKelilingActionPerformed
        // TODO add your handling code here:
        String lblJari = txtJari.getText();
        int r = Integer.parseInt(lblJari);
        double p = 3.14;
        double keliling = p * 2 * r;
        txtHasil.setText(""+keliling);
    }//GEN-LAST:event_btnKelilingActionPerformed

    private void txtHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHasilActionPerformed

    private void txtJariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJariActionPerformed

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
            java.util.logging.Logger.getLogger(frmLingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLingkaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLingkaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKeliling;
    private javax.swing.JButton btnLuas;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel lblHasil;
    private javax.swing.JLabel lblJari;
    private javax.swing.JTextField txtHasil;
    private javax.swing.JTextField txtJari;
    // End of variables declaration//GEN-END:variables
}
