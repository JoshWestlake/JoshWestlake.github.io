/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author westy
 */
public class NewJFrame extends javax.swing.JFrame {
boolean Sauce = false;
boolean Cheese = false;
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

        jLabel10 = new javax.swing.JLabel();
        lblBurger = new javax.swing.JLabel();
        lblFries = new javax.swing.JLabel();
        lblPoutine = new javax.swing.JLabel();
        lblSalad = new javax.swing.JLabel();
        lblSundae = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbltaxes = new javax.swing.JLabel();
        lblsubtotal = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnSauce = new javax.swing.JCheckBox();
        txtBurger = new javax.swing.JTextField();
        txtFries = new javax.swing.JTextField();
        txtPoutine = new javax.swing.JTextField();
        txtSalad = new javax.swing.JTextField();
        txtSundae = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnCheese = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnCalculate = new javax.swing.JButton();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBurger.setText(" Burger ($7.99)");

        lblFries.setText("French Fries ($3.99)");

        lblPoutine.setText("Poutine ($5.99)");

        lblSalad.setText("Cesar Salad ($4.99)");

        lblSundae.setText("Ice Cream Sundae($5.99)");

        jLabel7.setText("SubTotal:");

        jLabel9.setText("Grand Total");

        lbltaxes.setText("$0.00");

        lblsubtotal.setText("$0.00");

        lbltotal.setText("$0.00");

        btnSauce.setText("↪ Sauce ($0.50)");
        btnSauce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSauceActionPerformed(evt);
            }
        });

        txtBurger.setText("0");
        txtBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBurgerActionPerformed(evt);
            }
        });

        txtFries.setText("0");

        txtPoutine.setText("0");

        txtSalad.setText("0");

        txtSundae.setText("0");

        jLabel15.setText("Taxes");

        btnCheese.setText("Cheese ($.50)");
        btnCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheeseActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\westy\\Downloads\\New Project (10).png")); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("South Street Sports Bar");

        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnCalculate.setText("Calculate Total");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(btnCalculate, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDesktopPane2)
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(310, 310, 310)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtFries, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtBurger, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                                .addComponent(txtSundae)
                                                .addComponent(txtSalad)
                                                .addComponent(txtPoutine))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblFries)
                                        .addComponent(lblBurger)
                                        .addComponent(lblPoutine)
                                        .addComponent(lblSalad)
                                        .addComponent(lblSundae)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnSauce, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addGap(107, 107, 107)))
                                        .addComponent(btnCheese)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(jLabel8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblsubtotal))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbltotal))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(364, 364, 364)
                                    .addComponent(lbltaxes))))))
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBurger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCheese)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFries)
                            .addComponent(txtFries, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPoutine)
                            .addComponent(txtPoutine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalad)
                    .addComponent(txtSalad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lbltaxes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(63, 63, 63)
                        .addComponent(lblSundae)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSauce)
                            .addComponent(txtSundae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblsubtotal)
                            .addComponent(jLabel7))
                        .addGap(60, 60, 60)
                        .addComponent(lbltotal)))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSauceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSauceActionPerformed
       Sauce = true;
       
    }//GEN-LAST:event_btnSauceActionPerformed

    private void txtBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBurgerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBurgerActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
       //BurgerNum is an integer and represent the number of Burgers bieng ordered
       int burgerNum;
       
        //FrenchfriesNum is an integer and represent the number of fries bieng ordered
       int frenchfriesNum;
       
        //PoutineNum is an integer and represent the number of Poutine bieng ordered
       int poutineNum;
       
        //SaladNum is an integer and represent the number of Salad bieng ordered
       int saladNum;
       
        //SundaeNum is an integer and represent the number of Sundae's bieng ordered
       int sundaeNum;
       
       //Taxes is an constant double which represents the tax % bieng charged on each order
       final double taxes = 0.13;
       
        //Tax is an double and represents the number of total tax bieng charged per order
       double tax;
       
        //subtotal is an double and represents the total before tax on each order
       double subtotal;
              
        //grandtotal is a double and represents the total cost after taxes are added, for each order
       double grandtotal;
       
              
       //Gather the users information
       burgerNum = Integer.parseInt(txtBurger.getText());
       frenchfriesNum = Integer.parseInt(txtFries.getText());
       poutineNum = Integer.parseInt(txtPoutine.getText()); 
       saladNum = Integer.parseInt(txtSalad.getText());
       sundaeNum = Integer.parseInt(txtSundae.getText());
      
      
       //calculating the subtotal related to amount of each purchase & Sauce or Cheese Selection
        if (Sauce == true && Cheese == true){
           subtotal = (burgerNum * 7.99) + (frenchfriesNum * 3.99) + (poutineNum * 5.99) + (saladNum * 4.99) +(sundaeNum * 5.99)+ 1;
       }else{
       if (Sauce == true){
           subtotal = (burgerNum * 7.99) + (frenchfriesNum * 3.99) + (poutineNum * 5.99) + (saladNum * 4.99) +(sundaeNum * 5.99)+ (sundaeNum * 0.5);
               } else{     
               if (Cheese == true){
           subtotal = (burgerNum * 7.99) + (frenchfriesNum * 3.99) + (poutineNum * 5.99) + (saladNum * 4.99) +(sundaeNum * 5.99)+ (burgerNum * 0.5);
       }else{
           subtotal = (burgerNum * 7.99) + (frenchfriesNum * 3.99) + (poutineNum * 5.99) + (saladNum * 4.99) +(sundaeNum * 5.99);
               }}}
     
        subtotal = subtotal*100;
        subtotal = Math.round(subtotal);
        subtotal = subtotal/100;
        lblsubtotal.setText (String.valueOf(subtotal));
       
       //Finding and Rounding the tax totals
       tax = subtotal * taxes;
                
       tax = tax*100;
       tax = Math.round(tax);
       tax = tax/100;
      lbltaxes.setText (String.valueOf(tax));
     
      //Finding the Grand total of the order (Subtotal + Taxes)
       grandtotal= tax + subtotal;
       grandtotal = grandtotal*100;
       grandtotal = Math.round(grandtotal);
       grandtotal = grandtotal/100;
             
        lbltotal.setText (String.valueOf(grandtotal));
       
       
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheeseActionPerformed
        Cheese = true;
    }//GEN-LAST:event_btnCheeseActionPerformed

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
    private javax.swing.JButton btnCalculate;
    private javax.swing.JCheckBox btnCheese;
    private javax.swing.JCheckBox btnSauce;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblBurger;
    private javax.swing.JLabel lblFries;
    private javax.swing.JLabel lblPoutine;
    private javax.swing.JLabel lblSalad;
    private javax.swing.JLabel lblSundae;
    private javax.swing.JLabel lblsubtotal;
    private javax.swing.JLabel lbltaxes;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTextField txtBurger;
    private javax.swing.JTextField txtFries;
    private javax.swing.JTextField txtPoutine;
    private javax.swing.JTextField txtSalad;
    private javax.swing.JTextField txtSundae;
    // End of variables declaration//GEN-END:variables
}
