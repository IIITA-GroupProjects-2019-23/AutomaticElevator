/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiita.gproject.automaticelevatorsys;
import java.util.Random;

/**
 *
 * @author anshverma
 */
public class NumberTracker extends javax.swing.JFrame {

    int idx,f;
    /**
     * Creates new form NumberTracker
     */
    public NumberTracker(int a,int b) {
        idx=a;
        f=b;
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        curFloor = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        Header = new javax.swing.JLabel();
        enterLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        floorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        int enterVar = new Random().nextInt(5);
        int exitVar = new Random().nextInt(5);
        exitVar++;

        Header.setFont(new java.awt.Font("FreeSans", 1, 24)); // NOI18N
        Header.setForeground(new java.awt.Color(153, 102, 0));
        Header.setText("Tracking People");

        curFloor.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        curFloor.setText("Current Floor :");
        floorLabel.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        floorLabel.setText(Integer.toString(f));

        jLabel2.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel2.setText("People Entering :");
        
        enterLabel.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        if(idx<=3)
        enterLabel.setText("--");
        else if(idx==4)
        enterLabel.setText("0");
        else
        enterLabel.setText(Integer.toString(enterVar));
        
        jLabel5.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        jLabel5.setText("People Exiting :");
        
        exitLabel.setFont(new java.awt.Font("FreeSans", 0, 14)); // NOI18N
        if(idx<=3)
        exitLabel.setText("--");
        else
        exitLabel.setText(Integer.toString(exitVar));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(curFloor)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitLabel)
                    .addComponent(enterLabel)
                    .addComponent(floorLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Header))
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Header)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(curFloor)
                    .addComponent(floorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterLabel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(exitLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>                        
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
            java.util.logging.Logger.getLogger(NumberTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumberTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumberTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumberTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Initiate p = new Initiate();
                p.setVisible(true);
                new NumberTracker(p.idx,p.f).setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Header;
    private javax.swing.JLabel curFloor;
    private javax.swing.JLabel enterLabel;
    private javax.swing.JLabel floorLabel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration                   
}