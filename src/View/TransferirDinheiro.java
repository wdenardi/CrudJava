/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author William Denardi
 */
public class TransferirDinheiro extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public TransferirDinheiro() {
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

        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Transferencia");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(179, 27, 79, 16);

        jLabel2.setText("Saldo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 120, 37, 20);

        jLabel3.setText("ID:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 150, 20, 30);

        jLabel4.setText("E-mail:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 200, 41, 16);

        jLabel5.setText("Valor:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 250, 35, 16);

        jButton1.setText("Transferir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 240, 89, 25);

        jButton2.setText("Fechar");
        getContentPane().add(jButton2);
        jButton2.setBounds(350, 280, 90, 25);

        jLabel6.setText("BANK");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 60, 30, 16);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(100, 160, 103, 22);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(100, 200, 213, 22);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(100, 250, 160, 22);

        jLabel7.setText("588");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 120, 21, 16);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(70, 50, 320, 10);

        jButton3.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\William Denardi\\Downloads\\help_browser.png")); // NOI18N
        jButton3.setBorder(null);
        getContentPane().add(jButton3);
        jButton3.setBounds(410, 20, 25, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TransferirDinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferirDinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferirDinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferirDinheiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferirDinheiro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
