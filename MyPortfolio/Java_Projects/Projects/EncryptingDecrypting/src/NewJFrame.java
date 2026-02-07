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
    A subroutine created which encrypts the users input by adding letters, and performing a ceaser cipher
    requires: input from user
    returns: encMessage
    */
    public static String Encrypting (String input){
    //creates a string which stores the value which is eventually returned
    String encMessage = "";
    
    //Creates a variable for the char which is used for the ceaser cipher
    char Char;
    
    //Creates a variable for the Accii which is used for the ceaser cipher
    int Ascii;
    
    //Creates a variable for the ExtrasAscii which is used for adding extra letters
    int ExtrasAscii;
    
    //Creates a variable for the Extrachar which is used for adding extra letters
    char Extrachar;
    
    //creates string for extraString and sets valiable to ""
    String extraString = "";
    //creates string for extraString2 and sets valiable to ""
    String extraString2 = "";
    
    
    //creates a for loop which starts at 0 and increases by 1 until it reaches the input length
    for (int i = 0; i< input.length(); i = i + 1)
    {
        //stores char as Char variable
        Char = input.charAt(i);
        //makes the character into a Ascii value
        Ascii = (int)Char;
        //increases the ascii value by 4
        Ascii = Ascii + 4;
        //converts the value back to a char
        Char = (char)Ascii;
        //adds encyrpted variable to the string
        encMessage = encMessage + Char;
    }
    
    //creates a for loop that sets i = 0 and then increases by 1 until its <= 4
    for (int i = 0; i<=4; i=i+1){
        
    //gives the extra numbers an ascii value
    ExtrasAscii = (int)Math.round(Math.random()*25+1+ 96);
    
    //converts the char to a aschii value
    Extrachar = (char)ExtrasAscii;
    extraString = extraString + Extrachar;
    }
    
    //creates a for loop where i = and then increases by 1 until its <= 4
    for (int i = 0; i<=4; i=i+1){
        
    //gives the extra numbers an ascii value
    ExtrasAscii = (int)Math.round(Math.random()*25+1 + 96);
    
    //converts the char to a aschii value 
    Extrachar = (char)ExtrasAscii;
    extraString2 = extraString2 + Extrachar;
    }
    
    //puts each peice into a final encMessage
    encMessage = extraString + encMessage + extraString2;
    
    //returns to the user
    return encMessage;
    }
    public static String Decrypt (String input){
    //creates a string which stores the value which is eventually returned
    String encMessage = "";
    
    //Creates a variable for the char which is used for the reverse ceaser cipher
    char Char;
    
    //Creates a variable for the char which is used for the reverse ceaser cipher, sets it = 1(giving in an ascii value
    char Char1 = 0;
    
    //creates a variable for the length of the origninally inputted message
    int length = input.length();
    
    //creates a int value for ascii
    int Ascii;
    
    //creates a for loop which starts at 0 and increases by 1 until it reaches the input length
    for (int i = 0; i< input.length(); i = i + 1)
    {
        //sets the variable char equal to the inputted string at the position
        Char = input.charAt(i);
        
        //converts the char to a aschii value 
        Ascii = (int)Char;
        //subtracts 4 from the aschii value
        Ascii = Ascii - 4;
        //converts it back
        Char = (char)Ascii;
        
        //adds char and encmessage
        encMessage = encMessage + Char;    
    }
    //edits the string to remove the extra letters
    encMessage = encMessage.substring(5, length -5);
    
    //returns the decrypted strign to the user
    return encMessage;
    
    
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Encrypt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtInputE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtInputD = new javax.swing.JTextField();
        Encrypt1 = new javax.swing.JButton();
        txtEncrypted = new javax.swing.JTextField();
        txtDecrypted = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        Encrypt.setText("ENCRYPT");
        Encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter a Decrypted String and it will be cryped and returned");

        txtInputE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtInputE.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("--Secret Agent--");

        jLabel3.setText("Decryptive Softwhere");

        jLabel5.setText("Enter an Encrypted String and it will be decrypted");

        Encrypt1.setText("DECRYPT");
        Encrypt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Encrypt1ActionPerformed(evt);
            }
        });

        txtEncrypted.setBackground(new java.awt.Color(204, 204, 204));
        txtEncrypted.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEncrypted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEncryptedActionPerformed(evt);
            }
        });

        txtDecrypted.setBackground(new java.awt.Color(204, 204, 204));
        txtDecrypted.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDecrypted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDecryptedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(294, 294, 294))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(270, 270, 270))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(169, 169, 169)
                                        .addComponent(Encrypt1))
                                    .addComponent(txtInputD, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addComponent(txtInputE, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Encrypt)
                        .addGap(324, 324, 324))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtEncrypted, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(222, 222, 222))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDecrypted, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInputE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Encrypt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEncrypted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInputD, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Encrypt1)
                .addGap(18, 18, 18)
                .addComponent(txtDecrypted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncryptActionPerformed
    //creates varible which stores the user imptted message
    String UserInput;
    
    //gathers the text from the user
    UserInput = txtInputE.getText();
    
    //if the length of the userinput is under 31 the following will run
    if (UserInput.length() <= 31)
        
    //outputs the return value of the subroutine to the user
    txtEncrypted.setText(Encrypting(UserInput));
    
    }//GEN-LAST:event_EncryptActionPerformed

    private void txtEncryptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEncryptedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEncryptedActionPerformed

    private void txtDecryptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDecryptedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDecryptedActionPerformed

    private void Encrypt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Encrypt1ActionPerformed
    //creates varible which stores the user imptted message
    String UserInput;
    
    //gathers the text from the user
    UserInput = txtInputD.getText();
   
    
    //if the length of the userinput is under 31 the following will run
    if (UserInput.length() <= 31)
        
    //outputs the return value of the subroutine to the user
    txtDecrypted.setText(Decrypt(UserInput));
    }//GEN-LAST:event_Encrypt1ActionPerformed

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
    private javax.swing.JButton Encrypt;
    private javax.swing.JButton Encrypt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDecrypted;
    private javax.swing.JTextField txtEncrypted;
    private javax.swing.JTextField txtInputD;
    private javax.swing.JTextField txtInputE;
    // End of variables declaration//GEN-END:variables
}
