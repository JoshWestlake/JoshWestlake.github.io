/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s300064451
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jLabel4 = new javax.swing.JLabel();
        jColorChooser1 = new javax.swing.JColorChooser();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtMark1 = new javax.swing.JTextField();
        txtMark2 = new javax.swing.JTextField();
        txtMark3 = new javax.swing.JTextField();
        txtMark4 = new javax.swing.JTextField();
        lblMark1 = new javax.swing.JLabel();
        lblMark2 = new javax.swing.JLabel();
        lblMark3 = new javax.swing.JLabel();
        lblMark4 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnGrade = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Corse MArk Average Calculator");
        setBackground(new java.awt.Color(255, 0, 0));
        setFont(new java.awt.Font("AmdtSymbols", 1, 10)); // NOI18N
        setForeground(new java.awt.Color(0, 0, 0));

        txtMark1.setBackground(new java.awt.Color(204, 204, 204));
        txtMark1.setForeground(new java.awt.Color(0, 0, 204));
        txtMark1.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtMark1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMark1ActionPerformed(evt);
            }
        });

        txtMark2.setBackground(new java.awt.Color(204, 204, 204));
        txtMark2.setForeground(new java.awt.Color(0, 0, 204));
        txtMark2.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtMark2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMark2ActionPerformed(evt);
            }
        });

        txtMark3.setBackground(new java.awt.Color(204, 204, 204));
        txtMark3.setForeground(new java.awt.Color(0, 0, 204));
        txtMark3.setDisabledTextColor(new java.awt.Color(0, 0, 255));

        txtMark4.setBackground(new java.awt.Color(204, 204, 204));
        txtMark4.setForeground(new java.awt.Color(0, 0, 204));
        txtMark4.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtMark4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMark4ActionPerformed(evt);
            }
        });

        lblMark1.setBackground(new java.awt.Color(0, 0, 0));
        lblMark1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMark1.setForeground(new java.awt.Color(0, 0, 204));
        lblMark1.setText("First Course Mark: ");

        lblMark2.setBackground(new java.awt.Color(0, 0, 0));
        lblMark2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMark2.setForeground(new java.awt.Color(0, 0, 204));
        lblMark2.setText("Second Course Mark: ");

        lblMark3.setBackground(new java.awt.Color(0, 0, 0));
        lblMark3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMark3.setForeground(new java.awt.Color(0, 0, 204));
        lblMark3.setText("Third Course Mark:");

        lblMark4.setBackground(new java.awt.Color(0, 0, 0));
        lblMark4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMark4.setForeground(new java.awt.Color(0, 0, 204));
        lblMark4.setText("Fourth Course Mark:");

        lblTotal.setBackground(new java.awt.Color(0, 0, 0));
        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 0, 255));

        btnGrade.setBackground(new java.awt.Color(153, 153, 153));
        btnGrade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGrade.setForeground(new java.awt.Color(0, 0, 255));
        btnGrade.setText("Calculate Grade");
        btnGrade.setBorderPainted(false);
        btnGrade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGrade.setFocusable(false);
        btnGrade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrade.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradeActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Course Average Calculator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblMark2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblMark1)
                                            .addComponent(lblMark3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblMark4))
                                        .addGap(112, 112, 112)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMark4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtMark1, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                                .addComponent(txtMark2)
                                                .addComponent(txtMark3)))))
                                .addGap(20, 20, 20)))
                        .addGap(89, 89, 89))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(btnGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMark1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMark1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMark2)
                    .addComponent(txtMark2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMark3)
                    .addComponent(txtMark3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMark4)
                    .addComponent(txtMark4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Corse Mark Average Calculator");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMark4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMark4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMark4ActionPerformed

    private void btnGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradeActionPerformed
      double Mark1;
      double Mark2;
      double Mark3;
      double Mark4;
      double total;
    
      Mark1 = Double.parseDouble(txtMark1.getText());
      Mark2 = Double.parseDouble(txtMark2.getText());
      Mark3 = Double.parseDouble(txtMark3.getText());
      Mark4 = Double.parseDouble(txtMark4.getText());
      
      total = (Mark1 + Mark2 + Mark3 + Mark4)/4;
      total = total*10;
      total = Math.round(total);
      total = total/10;
             
      lblTotal.setText(String.valueOf(total));
     
      
      
    }//GEN-LAST:event_btnGradeActionPerformed

    private void txtMark1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMark1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMark1ActionPerformed

    private void txtMark2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMark2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMark2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrade;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblMark1;
    private javax.swing.JLabel lblMark2;
    private javax.swing.JLabel lblMark3;
    private javax.swing.JLabel lblMark4;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtMark1;
    private javax.swing.JTextField txtMark2;
    private javax.swing.JTextField txtMark3;
    private javax.swing.JTextField txtMark4;
    // End of variables declaration//GEN-END:variables
}