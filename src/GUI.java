//This program will assist an overwatch to improve teir understanding of their business
//It will display statistics from their business and also display their sessions
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jack
 */
public class GUI extends javax.swing.JFrame {
    public void fetchmonth (String month)
    {
        // Initalize month statistics
        double [] revenue = new double [12];
        revenue[0] = 100.12;
        revenue[1] = 160.59;
        revenue[2] = 107.10;
        revenue[3] = 200.18;
        revenue[4] = 156.12;
        revenue[5] = 101.22;
        revenue[6] = 0;
        revenue[7] = 0;
        revenue[8] = 0;
        revenue[9] = 0;
        revenue[10] = 0;
        revenue[11] = 0;
        double [] hours = new double [12];
        hours[0] = 2.5;
        hours[1] = 6.5;
        hours[2] = 20.8;
        hours[3] = 15.0;
        hours[4] = 12.2;
        hours[5] = 17.2;
        hours[6] = 0;
        hours[7] = 0;
        hours[8] = 0;
        hours[9] = 0;
        hours[10] = 0;
        hours[11] = 0;
        int [] customers = new int [12];
        customers[0] = 2;
        customers[1] = 6;
        customers[2] = 3;
        customers[3] = 10;
        customers[4] = 8;
        customers[5] = 5;
        customers[6] = 0;
        customers[7] = 0;
        customers[8] = 0;
        customers[9] = 0;
        customers[10] = 0;
        customers[11] = 0;
        double [] adexpend = new double [12];
        adexpend[0] = 20.99;
        adexpend[1] = 10.99;
        adexpend[2] = 0.99;
        adexpend[3] = 50.99;
        adexpend[4] = 2.99;
        adexpend[5] = 4.99;
        adexpend[6] = 0;
        adexpend[7] = 0;
        adexpend[8] = 0;
        adexpend[9] = 0;
        adexpend[10] = 0;
        adexpend[11] = 0;
        // Convert plaintext month input to a usable number
        month = month.toLowerCase();
        int monthnum = 0;
        switch (month) {
            case "january":
                monthnum=0;
                break;
            case "february":
                monthnum=1;
                break;    
            case "march":
                monthnum=2;
                break;
            case "april":
                monthnum=3;
                break;
            case "may":
                monthnum=4;
                break;
            case "june":
                monthnum=5;
                break;
            case "july":
                monthnum=6;
                break;
            case "august":
                monthnum=7;
                break;
            case "september":
                monthnum=8;
                break;
            case "october":
                monthnum=9;
                break;  
            case "november":
                monthnum=10;
                break;
            case "december":
                monthnum=11;
                break;   
            default:
                monthnum = 0;
                break;        
        }
        // Display Summary of inputted month
        txt1.setText("Revenue: $"+revenue[monthnum]);
        txt2.setText("Hours: "+hours[monthnum]);
        txt3.setText("Customers: "+customers[monthnum]);
        txt4.setText("Ad Expenditure: $"+adexpend[monthnum]);
        txt5.setText("Profit: $"+(revenue[monthnum]-adexpend[monthnum]));
        txt6.setText("Hourly Rate: $"+(revenue[monthnum]/hours[monthnum]));
        
        
        
    }
    public void fetchsession (int session)
    {
        // Initalize session statistics
        double [] price = new double [10];
        price[0] = 100.12;
        price[1] = 160.59;
        price[2] = 107.10;
        price[3] = 200.18;
        price[4] = 156.12;
        price[5] = 101.22;
        price[6] = 0;
        price[7] = 0;
        price[8] = 0;
        price[9] = 0;
        double [] length = new double [10];
        length[0] = 2.5;
        length[1] = 6.5;
        length[2] = 20.8;
        length[3] = 15.0;
        length[4] = 12.2;
        length[5] = 17.2;
        length[6] = 0;
        length[7] = 0;
        length[8] = 0;
        length[9] = 0;
        String [] date = new String [10];
        date[0] = "03/02/20";
        date[1] = "05/01/20";
        date[2] = "12/02/20";
        date[3] = "17/05/20";
        date[4] = "14/02/20";
        date[5] = "20/05/20";
        date[6] = "27/02/20";
        date[7] = "04/06/20";
        date[8] = "01/01/20";
        date[9] = "08/04/20";
        String [] customername = new String [10];
        customername[0] = "bobby";
        customername[1] = "billy";
        customername[2] = "jane";
        customername[3] = "john";
        customername[4] = "yes";
        customername[5] = "no";
        customername[6] = "maybe";
        customername[7] = "running";
        customername[8] = "out";
        customername[9] = "of";
        String [] discordtag = new String [10];
        discordtag[0] = "bobby#1234";
        discordtag[1] = "billy#1234";
        discordtag[2] = "jane#1234";
        discordtag[3] = "john#1234";
        discordtag[4] = "yes#1234";
        discordtag[5] = "no#1234";
        discordtag[6] = "maybe#1234";
        discordtag[7] = "running#1234";
        discordtag[8] = "out#1234";
        discordtag[9] = "of#1234";
        // Display Summary of inputted session
        txt1.setText("Price: $"+price[session]);
        txt2.setText("Hours: "+length[session]);
        txt3.setText("Date: "+date[session]);
        txt4.setText("Customer: "+customername[session]);
        txt5.setText("Discord Tag: "+discordtag[session]);
        txt6.setText("Hourly Rate: $"+(price[session]/length[session]));
    }
    /**
     * Creates new form GUI
     */
    public GUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        in1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        in2 = new javax.swing.JTextField();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Coaching Management");

        jLabel2.setText("Search Month:");

        in1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Search Session");

        in2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in2ActionPerformed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Coaching Logo.jpg"))); // NOI18N

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt1)
                            .addComponent(txt4))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt2)
                            .addComponent(txt5))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt6)
                            .addComponent(txt3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(in1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(in2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Reset)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE)
                        .addComponent(jLabel4))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(in1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(in2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reset)))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1)
                    .addComponent(txt2)
                    .addComponent(txt3))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4)
                    .addComponent(txt5)
                    .addComponent(txt6))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void in1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in1ActionPerformed
        fetchmonth(in1.getText());
    }//GEN-LAST:event_in1ActionPerformed

    private void in2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in2ActionPerformed
        fetchsession(Integer.parseInt(in2.getText()));
    }//GEN-LAST:event_in2ActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // Reset text labels
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
        txt6.setText("");
    }//GEN-LAST:event_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JTextField in1;
    private javax.swing.JTextField in2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    // End of variables declaration//GEN-END:variables
}
