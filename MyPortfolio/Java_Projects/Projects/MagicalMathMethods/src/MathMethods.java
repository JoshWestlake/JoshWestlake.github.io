/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author westy
 */
public class MathMethods extends javax.swing.JFrame {

    /**
     * Creates new form MathMethods
     */
    public MathMethods() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLarge1 = new javax.swing.JTextField();
        txtLarge2 = new javax.swing.JTextField();
        btnLargest = new javax.swing.JButton();
        txtSmall1 = new javax.swing.JTextField();
        btnSmallest = new javax.swing.JButton();
        txtSmall2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPow1 = new javax.swing.JTextField();
        btnTothepowerof = new javax.swing.JButton();
        txtPow2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnHype = new javax.swing.JButton();
        txtHypot2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txthypot1 = new javax.swing.JTextField();
        btnrounddown = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtRoundD1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnroundup = new javax.swing.JButton();
        txtRoundU1 = new javax.swing.JTextField();
        txtSqrt1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnsqrt = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnRadians = new javax.swing.JButton();
        txtRadians1 = new javax.swing.JTextField();
        lblLargeAns = new javax.swing.JLabel();
        lblSmallAns = new javax.swing.JLabel();
        lblPowAns = new javax.swing.JLabel();
        lblHypotAns = new javax.swing.JLabel();
        lblRoundD = new javax.swing.JLabel();
        lblRoundU = new javax.swing.JLabel();
        lblSqrtAns = new javax.swing.JLabel();
        lblRadians = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Magical Math Methods");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter two numbers and click the button. The Program will display the biggest of the 2 numbers");

        txtLarge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLarge1ActionPerformed(evt);
            }
        });

        btnLargest.setText("Largest");
        btnLargest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLargestActionPerformed(evt);
            }
        });

        btnSmallest.setText("Smallest");
        btnSmallest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSmallestActionPerformed(evt);
            }
        });

        txtSmall2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSmall2ActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Enter 2 numbers and click the button. The Program will display the smallest of the 2 numbers");

        txtPow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPow1ActionPerformed(evt);
            }
        });

        btnTothepowerof.setText("To the power of");
        btnTothepowerof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTothepowerofActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Enter 2 numbers and click the button. The Program will display the first number to the power of the second");

        btnHype.setText("Hypotenuse");
        btnHype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHypeActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Enter the length of 2 sides of the right angled triangle and click the button. The program will display the hypotenuse of the triangle");

        txthypot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthypot1ActionPerformed(evt);
            }
        });

        btnrounddown.setText("Rounded down");
        btnrounddown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrounddownActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Enter a Decimal Value. The program will display the value rounded down to the nearest integer");

        txtRoundD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoundD1ActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Enter a decimal value. The [rogram will display the value rounded up to the nearest integer");

        btnroundup.setText("Rounded up");
        btnroundup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnroundupActionPerformed(evt);
            }
        });

        txtRoundU1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoundU1ActionPerformed(evt);
            }
        });

        txtSqrt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSqrt1ActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Enter an integer. The Program will display the square root of the integer");

        btnsqrt.setText("Square Root");
        btnsqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsqrtActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Enter a angle in degrees. The program will display the angle in radians");

        btnRadians.setText("In Radians..");
        btnRadians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadiansActionPerformed(evt);
            }
        });

        txtRadians1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRadians1ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\westy\\Downloads\\Math.jpg")); // NOI18N
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txthypot1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtHypot2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRoundD)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnHype)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHypotAns))))
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtRoundU1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnroundup)
                        .addGap(38, 38, 38)
                        .addComponent(lblRoundU))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(txtRadians1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnRadians)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRadians))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRoundD1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(btnrounddown))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSqrt1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(btnsqrt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblSqrtAns))))
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPow1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPow2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(btnTothepowerof)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPowAns, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSmall2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSmall1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192)
                        .addComponent(btnSmallest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSmallAns))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(txtLarge1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtLarge2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLargest)
                                .addGap(68, 68, 68)
                                .addComponent(lblLargeAns))
                            .addComponent(jLabel2))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLarge2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLargest)
                            .addComponent(txtLarge1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLargeAns))
                        .addGap(82, 82, 82)
                        .addComponent(jLabel3))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSmall1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSmallest)
                    .addComponent(lblSmallAns)
                    .addComponent(txtSmall2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTothepowerof)
                    .addComponent(txtPow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPowAns, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHypot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHype)
                    .addComponent(txthypot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHypotAns))
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRoundD)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRoundD1)
                            .addComponent(btnrounddown))))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnroundup)
                    .addComponent(txtRoundU1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRoundU))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsqrt)
                    .addComponent(txtSqrt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSqrtAns))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRadians)
                    .addComponent(txtRadians1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRadians))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLarge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLarge1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLarge1ActionPerformed

    private void btnLargestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLargestActionPerformed
        //This double stores the users first input number 
        double num1;
        
        //This double stores the users second input number
        double num2;
        
        //this is the result when the users input numbers are put through the method
        double result;
        
        //Recives the users input and stores the value as a double in Num1
        num1 = Double.parseDouble (txtLarge1.getText());
        
        //Recives the users input and stores the value as a double in Num2
        num2 = Double.parseDouble (txtLarge2.getText());
        
        //Runs the method which finds which out of the 2 inputed numbers is greater
        result = (Math.max(num1,num2));
        result = result*100;
        result = Math.round(result);
        result = result/100;
        
        //outputs the number to the user
        lblLargeAns.setText(String.valueOf(result));
        
    }//GEN-LAST:event_btnLargestActionPerformed

    private void btnSmallestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSmallestActionPerformed
        //This double stores the users first input number
        double num1;
        
        //This double stores the users second input number
        double num2;
        
        //this is the result when the users input numbers are put through the method
        double result;
        
        //Recives the users input and stores the value as a double in Num1
        num1 = Double.parseDouble (txtSmall1.getText());
        
        //Recives the users input and stores the value as a double in Num2
        num2 = Double.parseDouble (txtSmall2.getText());
        
        //Runs the method which finds which out of the 2 inputed numbers is smaller
        result = (Math.min(num1,num2));
        result = result*100;
        result = Math.round(result);
        result = result/100;
        
        //outputs the number to the user
        lblSmallAns.setText(String.valueOf(result));
    }//GEN-LAST:event_btnSmallestActionPerformed

    private void txtSmall2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSmall2ActionPerformed
       
    }//GEN-LAST:event_txtSmall2ActionPerformed

    private void txtPow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPow1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPow1ActionPerformed

    private void btnTothepowerofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTothepowerofActionPerformed
        //This double stores the users first input number
        double num1;
        
        //This double stores the users second input number
        double num2;
        
        //this is the result when the users input numbers are put through the method
        double result;
        
        //Recives the users input and stores the value as a double in Num1
        num1 = Double.parseDouble (txtPow1.getText());
        
        //Recives the users input and stores the value as a double in Num2
        num2 = Double.parseDouble (txtPow2.getText());
        
        //Runs the method which finds the answer of the first number to the power of the second. Stored as result
        result = (Math.pow(num1,num2));
        result = result*100;
        result = Math.round(result);
        result = result/100;
        
        //outputs the number to the user
        lblPowAns.setText(String.valueOf(result));
    }//GEN-LAST:event_btnTothepowerofActionPerformed

    private void btnHypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHypeActionPerformed
       //This double stores the users first input number
        double Side1;
        
        //This double stores the users second input number
        double Side2;
        
        //this is the result when the users input numbers are put through the method
        double result;
        
        //Recives the users input and stores the value as a double in Side1
        Side1 = Double.parseDouble (txthypot1.getText());
        
        //Recives the users input and stores the value as a double in Side2
        Side2= Double.parseDouble (txtHypot2.getText());
        
        //Runs the method which finds the answer of the first number to the power of the second. Stored as result
        result = (Math.hypot(Side1, Side2));
        result = result*100;
        result = Math.round(result);
        result = result/100;
        
        //outputs the number to the user
        lblHypotAns.setText(String.valueOf(result));
    }//GEN-LAST:event_btnHypeActionPerformed

    private void txthypot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthypot1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthypot1ActionPerformed

    private void btnrounddownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrounddownActionPerformed
        
        //This double stores the users input number
        double Num1;
        
        //this is the result when the users input numbers are put through the method
        double result;
       
        //Recives the users input and stores the value as a double in Num1
        Num1 = Double.parseDouble(txtRoundD1.getText());
        
        //Runs the method which rounds the user inputed number up to the nearest integer
        result = (Math.floor(Num1));
        
        //outputs the number to the user
        lblRoundD.setText(String.valueOf(result));
    }//GEN-LAST:event_btnrounddownActionPerformed

    private void txtRoundD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoundD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoundD1ActionPerformed

    private void btnroundupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnroundupActionPerformed
        //This double stores the users input number
        double Num1;
        
        //this is the result when the users input numbers are put through the method
        double result;
       
        //Recives the users input and stores the value as a double in Num1
        Num1 = Double.parseDouble(txtRoundU1.getText());
        
        //Runs the method which rounds the user inputed number up to the nearest integer
        result = (Math.ceil(Num1));
        
        //outputs the number to the user
        lblRoundU.setText(String.valueOf(result));
    }//GEN-LAST:event_btnroundupActionPerformed

    private void txtRoundU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoundU1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoundU1ActionPerformed

    private void txtSqrt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSqrt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSqrt1ActionPerformed

    private void btnsqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsqrtActionPerformed
        //This double stores the users input number
        double Num1;
        
        //this is the result when the users input numbers are put through the method
        double result;
       
        //Recives the users input and stores the value as a double in Num1
        Num1 = Double.parseDouble(txtSqrt1.getText());
        
        //Runs the method which rounds the user inputed number up to the nearest integer
        result = (Math.sqrt(Num1));
        result = result*100;
        result = Math.round(result);
        result = result/100;
        
        //outputs the number to the user
        lblSqrtAns.setText(String.valueOf(result));
    }//GEN-LAST:event_btnsqrtActionPerformed

    private void btnRadiansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadiansActionPerformed
        //This double stores the users input number
        double Num1;
        
        //this is the result when the users input numbers are put through the method
        double result;
       
        //Recives the users input and stores the value as a double in Num1
        Num1 = Double.parseDouble(txtRadians1.getText());
        
        //Runs the method which rounds the user inputed number up to the nearest integer
        result = (Math.toRadians(Num1));
        result = result*100;
        result = Math.round(result);
        result = result/100;
        
        //outputs the number to the user
        lblRadians.setText(String.valueOf(result));
    }//GEN-LAST:event_btnRadiansActionPerformed

    private void txtRadians1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRadians1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRadians1ActionPerformed

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
            java.util.logging.Logger.getLogger(MathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MathMethods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHype;
    private javax.swing.JButton btnLargest;
    private javax.swing.JButton btnRadians;
    private javax.swing.JButton btnSmallest;
    private javax.swing.JButton btnTothepowerof;
    private javax.swing.JButton btnrounddown;
    private javax.swing.JButton btnroundup;
    private javax.swing.JButton btnsqrt;
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
    private javax.swing.JLabel lblHypotAns;
    private javax.swing.JLabel lblLargeAns;
    private javax.swing.JLabel lblPowAns;
    private javax.swing.JLabel lblRadians;
    private javax.swing.JLabel lblRoundD;
    private javax.swing.JLabel lblRoundU;
    private javax.swing.JLabel lblSmallAns;
    private javax.swing.JLabel lblSqrtAns;
    private javax.swing.JTextField txtHypot2;
    private javax.swing.JTextField txtLarge1;
    private javax.swing.JTextField txtLarge2;
    private javax.swing.JTextField txtPow1;
    private javax.swing.JTextField txtPow2;
    private javax.swing.JTextField txtRadians1;
    private javax.swing.JTextField txtRoundD1;
    private javax.swing.JTextField txtRoundU1;
    private javax.swing.JTextField txtSmall1;
    private javax.swing.JTextField txtSmall2;
    private javax.swing.JTextField txtSqrt1;
    private javax.swing.JTextField txthypot1;
    // End of variables declaration//GEN-END:variables
}