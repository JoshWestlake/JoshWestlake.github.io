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

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }
    /*
    A subroutine which when called apon check to see if the user inputed number is Prime, or not
    Requires: input
    returns: boolean value prime
     */
    public static boolean PrimeNumber (int input){
    
    //creates a value which saves the value and is used to check for prime, or not
    int remainder;
    
    //Creates a boolean value to store and return the results to the main
    boolean prime = true;
    
    //Creates a for loop to set i = 2, then runs until i is <= input/2. The i value increases each time
    for (int i = 2; i <= input / 2; i = i + 1)
    {
        //Checks to see if the value is divisable by i
        remainder = input % i;
        
        //if the remainder is equal to 0 the followng will run
        if(remainder == 0)
        {
            //sets value to false
            prime = false;
            
        }
        
        }
    //returns the prime value
    return prime;
    }
    /*
    A subroutine which when called finds the factorial of the inputed value
    Required: input
    return: factorail
    */
    public static int Factorial (int factorial){
     
    //creates a for loop which sets the i variable equal to 1 below the facotrial(UserInput)
    for (int i = factorial -1; i >=1;){
        //calcualtes the following 
        factorial = factorial * i;
        //subtracts 1 from the i value each time until i >= 1
        i = i -1; 
        
        
        }
   //returns the factorial
   return (factorial);
    }
    
    
    /* creates a subroutine which when called finds the value of the number located at the inputed location in the fibiancci
    Requires: input
    Returns: integer values, and ans
    */
    public int Fibonacci (int Input){
    
    //creates the variable known as ans and sets it to 0
    int ans = 0;
    
    //creates the variable known as num1 and sets it to 1
    int num1 = 1;
    //creates the variable known as num2 and sets it to 1
    int num2 = 1;
    
    //if the userinputed value is equal to 1 the following will run
    if (Input == 1)
        //return the valuue
        return 0;
    
    //if the userinputed value is equal to 1 the following will run
    else if (Input == 2)  
        //return the valuue
        return 1;
    
    //if the userinputed value is equal to 1 the following will run
    else if (Input == 3)
        //return the valuue
        return 1;
    
    //if the userinputed value is equal to or greater than 4 the following will run
    else if (Input >= 4)
        //creates a forloop which sets the i variable to 4 and runs until is is greater than or equal to Input(inc by 1)
        for (int i = 4; i <= Input; i = i+1)
    {
            //sets the valiable ans equal to num1 + num2
            ans = num2 + num1;
            //sets variable num1 equal to num2
            num1 = num2;
            //sets variable num2 equal to ans
            num2 = ans;
    
    }
    //return the valuue
    return ans;
    
     
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtFact = new javax.swing.JTextField();
        txtPrime = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtFibonacci = new javax.swing.JTextField();
        lblFact = new javax.swing.JLabel();
        lblPrime = new javax.swing.JLabel();
        lblFibonacci = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel1.setText("  --Numbers--");

        jLabel2.setText(" Enter an integer and click the button to find a factorial");

        jButton1.setText("Factorial");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Prime");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter an integer and click the button to determine whether or not it is a prime number");

        jLabel4.setText("Enter an integer and click the button to see the corresponding Fibonacci Number");

        jButton3.setText("Fibonacci");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lblFibonacci.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFact, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jButton1)
                                .addGap(53, 53, 53)
                                .addComponent(lblFact))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPrime, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(jButton2)
                                .addGap(61, 61, 61)
                                .addComponent(lblPrime))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtFibonacci, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jButton3)
                                .addGap(47, 47, 47)
                                .addComponent(lblFibonacci)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(txtPrime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(txtFibonacci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFibonacci))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    //creates variable to store the users inputted number and Gets the inputed value from the user
    int factorialInt = Integer.parseInt(txtFact.getText()); 
      
    //sets the lbl text equal to the result
    lblFact.setText(String.valueOf(Factorial(factorialInt)));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    //creates variable to store the users inputted number
    int input;
    
    //Gets the inputed value from the user
    input = Integer.parseInt(txtPrime.getText());
    
    //if the returned value is false
    if (PrimeNumber(input))
        lblPrime.setText("This is a prime number");
    
    //if the returned value is true
    else 
        lblPrime.setText("This is not a prime number");
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    //creates variable to store the users inputted number and Gets the inputed value from the user
    int input = Integer.parseInt(txtFibonacci.getText());
    
    //sets the lbl text equal to the result
    lblFibonacci.setText(String.valueOf(Fibonacci(input)));
    
    
    
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFact;
    private javax.swing.JLabel lblFibonacci;
    private javax.swing.JLabel lblPrime;
    private javax.swing.JTextField txtFact;
    private javax.swing.JTextField txtFibonacci;
    private javax.swing.JTextField txtPrime;
    // End of variables declaration//GEN-END:variables
}
