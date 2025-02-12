package cookbook;

import javax.swing.ImageIcon;

/*
 * @author Anna Phillips
 */

public class frmHelp extends javax.swing.JFrame {

    /*
     * Creates new form frmHelp
     */
    
    private String previousScreen;
    
    public frmHelp(String source) {
        previousScreen = source;
        
        initComponents();
        
        AppManager.helpManager = new HelpManager("help.txt", pnlQuestions, lblAnswer);
        
        this.validate();
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        pnlBorderTop = new javax.swing.JPanel();
        pnlTopBorder = new javax.swing.JPanel();
        Back = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblHeading = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlBorderLeft = new javax.swing.JPanel();
        pnlBorderRight = new javax.swing.JPanel();
        pnlBorderBottom = new javax.swing.JPanel();
        pnlCentre = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        scpnQuestions = new javax.swing.JScrollPane();
        pnlQuestions = new javax.swing.JPanel();
        pnlAnswer = new javax.swing.JPanel();
        lblAnswer = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBorderTop.setBackground(new java.awt.Color(247, 247, 247));

        pnlTopBorder.setBackground(new java.awt.Color(247, 247, 247));
        pnlTopBorder.setPreferredSize(new java.awt.Dimension(800, 60));

        Back.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_back.png"))); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BackMouseReleased(evt);
            }
        });
        pnlTopBorder.add(Back);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_bar1.png"))); // NOI18N
        pnlTopBorder.add(jLabel3);

        lblHeading.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        lblHeading.setText("Help");
        lblHeading.setToolTipText("");
        pnlTopBorder.add(lblHeading);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_bar2.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(200, 50));
        jLabel4.setMinimumSize(new java.awt.Dimension(200, 50));
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 50));
        pnlTopBorder.add(jLabel4);

        javax.swing.GroupLayout pnlBorderTopLayout = new javax.swing.GroupLayout(pnlBorderTop);
        pnlBorderTop.setLayout(pnlBorderTopLayout);
        pnlBorderTopLayout.setHorizontalGroup(
            pnlBorderTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBorderTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlTopBorder, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBorderTopLayout.setVerticalGroup(
            pnlBorderTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTopBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnlBorderTop, java.awt.BorderLayout.PAGE_START);

        pnlBorderLeft.setBackground(new java.awt.Color(247, 247, 247));

        javax.swing.GroupLayout pnlBorderLeftLayout = new javax.swing.GroupLayout(pnlBorderLeft);
        pnlBorderLeft.setLayout(pnlBorderLeftLayout);
        pnlBorderLeftLayout.setHorizontalGroup(
            pnlBorderLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlBorderLeftLayout.setVerticalGroup(
            pnlBorderLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        getContentPane().add(pnlBorderLeft, java.awt.BorderLayout.LINE_START);

        pnlBorderRight.setBackground(new java.awt.Color(247, 247, 247));

        javax.swing.GroupLayout pnlBorderRightLayout = new javax.swing.GroupLayout(pnlBorderRight);
        pnlBorderRight.setLayout(pnlBorderRightLayout);
        pnlBorderRightLayout.setHorizontalGroup(
            pnlBorderRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlBorderRightLayout.setVerticalGroup(
            pnlBorderRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        getContentPane().add(pnlBorderRight, java.awt.BorderLayout.LINE_END);

        pnlBorderBottom.setBackground(new java.awt.Color(247, 247, 247));
        pnlBorderBottom.setPreferredSize(new java.awt.Dimension(811, 50));

        javax.swing.GroupLayout pnlBorderBottomLayout = new javax.swing.GroupLayout(pnlBorderBottom);
        pnlBorderBottom.setLayout(pnlBorderBottomLayout);
        pnlBorderBottomLayout.setHorizontalGroup(
            pnlBorderBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 811, Short.MAX_VALUE)
        );
        pnlBorderBottomLayout.setVerticalGroup(
            pnlBorderBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(pnlBorderBottom, java.awt.BorderLayout.PAGE_END);

        pnlCentre.setLayout(new java.awt.GridLayout(1, 0));

        jPanel10.setBackground(new java.awt.Color(247, 247, 247));

        pnlQuestions.setMaximumSize(new java.awt.Dimension(714, 32767));

        javax.swing.GroupLayout pnlQuestionsLayout = new javax.swing.GroupLayout(pnlQuestions);
        pnlQuestions.setLayout(pnlQuestionsLayout);
        pnlQuestionsLayout.setHorizontalGroup(
            pnlQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );
        pnlQuestionsLayout.setVerticalGroup(
            pnlQuestionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        scpnQuestions.setViewportView(pnlQuestions);

        javax.swing.GroupLayout pnlAnswerLayout = new javax.swing.GroupLayout(pnlAnswer);
        pnlAnswer.setLayout(pnlAnswerLayout);
        pnlAnswerLayout.setHorizontalGroup(
            pnlAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnswerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnlAnswerLayout.setVerticalGroup(
            pnlAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnswerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(432, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(scpnQuestions, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scpnQuestions)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(pnlAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pnlCentre.add(jPanel10);

        getContentPane().add(pnlCentre, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // When the user cancels the editing, this ensures they return to the previous screen they were on
        if(previousScreen.equals("Welcome"))
            new frmWelcome().setVisible(true);
        else if(previousScreen.equals("Home"))
            new frmHome().setVisible(true);
        else if(previousScreen.equals("NewRecipe"))
            new frmNewRecipe("Help").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackMouseClicked

    private void BackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMousePressed
        Back.setIcon(new ImageIcon(getClass().getResource("/images/btn_back_pressed.png")));
    }//GEN-LAST:event_BackMousePressed

    private void BackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseReleased
        Back.setIcon(new ImageIcon(getClass().getResource("/images/btn_back.png")));
    }//GEN-LAST:event_BackMouseReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHelp("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAnswer;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JPanel pnlAnswer;
    private javax.swing.JPanel pnlBorderBottom;
    private javax.swing.JPanel pnlBorderLeft;
    private javax.swing.JPanel pnlBorderRight;
    private javax.swing.JPanel pnlBorderTop;
    private javax.swing.JPanel pnlCentre;
    private javax.swing.JPanel pnlQuestions;
    private javax.swing.JPanel pnlTopBorder;
    private javax.swing.JScrollPane scpnQuestions;
    // End of variables declaration//GEN-END:variables
}
