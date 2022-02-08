public class TelaPerdeu extends javax.swing.JFrame {

    public TelaPerdeu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        continuarPerdedor = new javax.swing.JButton();
        perdeu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        continuarPerdedor.setText("Continuar");
        continuarPerdedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarPerdedorActionPerformed(evt);
            }
        });
        getContentPane().add(continuarPerdedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 213, 120, 30));

        perdeu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/52453359e2a3cb9.png"))); // NOI18N
        getContentPane().add(perdeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -50, 650, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continuarPerdedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarPerdedorActionPerformed
 
        PreJogo p = new PreJogo();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_continuarPerdedorActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPerdeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPerdeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPerdeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPerdeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerdeu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continuarPerdedor;
    private javax.swing.JLabel perdeu;
    // End of variables declaration//GEN-END:variables
}
