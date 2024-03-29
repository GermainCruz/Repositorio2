/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author katia
 */
public class Azar extends javax.swing.JFrame {

    /**
     * Creates new form Azar
     */
    public Azar() {
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

        jDesktopPane2 = new javax.swing.JDesktopPane();
        lblNum1 = new javax.swing.JLabel();
        lblNum2 = new javax.swing.JLabel();
        spnn1 = new javax.swing.JSpinner();
        spnn2 = new javax.swing.JSpinner();
        lblNumGene = new javax.swing.JLabel();
        txtNumGene = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador de números");

        lblNum1.setBackground(new java.awt.Color(204, 255, 255));
        lblNum1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        lblNum1.setText("Número 1");

        lblNum2.setBackground(new java.awt.Color(153, 255, 255));
        lblNum2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        lblNum2.setText("Número 2");

        lblNumGene.setBackground(new java.awt.Color(153, 255, 255));
        lblNumGene.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        lblNumGene.setText("Número generado");

        btnGenerar.setBackground(new java.awt.Color(204, 255, 255));
        btnGenerar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayer(lblNum1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lblNum2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(spnn1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(spnn2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lblNumGene, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtNumGene, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnGenerar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spnn1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(spnn2))
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblNumGene, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumGene, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumGene, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumGene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        try{
        int num1 = (int)spnn1.getValue();
        int num2 = (int)spnn2.getValue();
        
        int num_generado = MetodosSueltos.generaNumeroAleatorio(num1, num2);
        
        txtNumGene.setText(num_generado+"");
        
        } catch (InputMismatchException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

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
            java.util.logging.Logger.getLogger(Azar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Azar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Azar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Azar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Azar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerar;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel lblNum1;
    private javax.swing.JLabel lblNum2;
    private javax.swing.JLabel lblNumGene;
    private javax.swing.JSpinner spnn1;
    private javax.swing.JSpinner spnn2;
    private javax.swing.JTextField txtNumGene;
    // End of variables declaration//GEN-END:variables
}
