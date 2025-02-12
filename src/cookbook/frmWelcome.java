package cookbook;

import javax.swing.ImageIcon;

/*
 * @author Anna Phillips
 */

public class frmWelcome extends javax.swing.JFrame {

    /*
     * Creates new form frmWelcome
     */
    
    public frmWelcome() {
        initComponents();
        
        AppManager.connectToTables();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopBorder = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        Help = new javax.swing.JLabel();
        pnlLeftBorder = new javax.swing.JPanel();
        lblImageLeft = new javax.swing.JLabel();
        pnlRightBorder = new javax.swing.JPanel();
        lblImageRight = new javax.swing.JLabel();
        pnlBottomBorder = new javax.swing.JPanel();
        pnlCentre = new javax.swing.JPanel();
        NewRecipe = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlTopBorder.setBackground(new java.awt.Color(247, 247, 247));
        pnlTopBorder.setPreferredSize(new java.awt.Dimension(800, 60));

        lblHeading.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        lblHeading.setText("Welcome to your CookBook");
        lblHeading.setToolTipText("");

        Help.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_help.png"))); // NOI18N
        Help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HelpMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                HelpMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlTopBorderLayout = new javax.swing.GroupLayout(pnlTopBorder);
        pnlTopBorder.setLayout(pnlTopBorderLayout);
        pnlTopBorderLayout.setHorizontalGroup(
            pnlTopBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTopBorderLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(lblHeading, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addGap(116, 116, 116)
                .addComponent(Help)
                .addContainerGap())
        );
        pnlTopBorderLayout.setVerticalGroup(
            pnlTopBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopBorderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTopBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(pnlTopBorder, java.awt.BorderLayout.PAGE_START);

        pnlLeftBorder.setBackground(new java.awt.Color(247, 247, 247));
        pnlLeftBorder.setLayout(new java.awt.GridLayout(1, 0));

        lblImageLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_1.png"))); // NOI18N
        pnlLeftBorder.add(lblImageLeft);

        getContentPane().add(pnlLeftBorder, java.awt.BorderLayout.LINE_START);

        pnlRightBorder.setBackground(new java.awt.Color(247, 247, 247));
        pnlRightBorder.setPreferredSize(new java.awt.Dimension(300, 340));
        pnlRightBorder.setLayout(new java.awt.GridLayout(1, 0));

        lblImageRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_2.png"))); // NOI18N
        pnlRightBorder.add(lblImageRight);

        getContentPane().add(pnlRightBorder, java.awt.BorderLayout.LINE_END);

        pnlBottomBorder.setBackground(new java.awt.Color(247, 247, 247));

        javax.swing.GroupLayout pnlBottomBorderLayout = new javax.swing.GroupLayout(pnlBottomBorder);
        pnlBottomBorder.setLayout(pnlBottomBorderLayout);
        pnlBottomBorderLayout.setHorizontalGroup(
            pnlBottomBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        pnlBottomBorderLayout.setVerticalGroup(
            pnlBottomBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(pnlBottomBorder, java.awt.BorderLayout.PAGE_END);

        pnlCentre.setBackground(new java.awt.Color(247, 247, 247));
        pnlCentre.setPreferredSize(new java.awt.Dimension(200, 340));

        NewRecipe.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        NewRecipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_addrecipe.png"))); // NOI18N
        NewRecipe.setMinimumSize(new java.awt.Dimension(100, 32));
        NewRecipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewRecipeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NewRecipeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                NewRecipeMouseReleased(evt);
            }
        });

        Home.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_home.png"))); // NOI18N
        Home.setMinimumSize(new java.awt.Dimension(80, 32));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                HomeMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlCentreLayout = new javax.swing.GroupLayout(pnlCentre);
        pnlCentre.setLayout(pnlCentreLayout);
        pnlCentreLayout.setHorizontalGroup(
            pnlCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentreLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(pnlCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentreLayout.createSequentialGroup()
                        .addComponent(NewRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentreLayout.createSequentialGroup()
                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        pnlCentreLayout.setVerticalGroup(
            pnlCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentreLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        getContentPane().add(pnlCentre, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseClicked
        // Takes the user to the help screen
        new frmHelp("Welcome").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HelpMouseClicked

    private void NewRecipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewRecipeMouseClicked
        // Takes the user to the new recipe screen
        new frmNewRecipe("Welcome").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NewRecipeMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // Takes the user to the home screen
        new frmHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeMouseClicked

    private void HelpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMousePressed
        // Changes the icon of the button when pressed
        Help.setIcon(new ImageIcon(getClass().getResource("/images/btn_help_pressed.png")));
    }//GEN-LAST:event_HelpMousePressed

    private void HelpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseReleased
        // Resets the icon of the button
        Help.setIcon(new ImageIcon(getClass().getResource("/images/btn_help.png")));
    }//GEN-LAST:event_HelpMouseReleased

    private void HomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMousePressed
        // Changes the icon of the button when pressed
        Home.setIcon(new ImageIcon(getClass().getResource("/images/btn_home_pressed.png")));
    }//GEN-LAST:event_HomeMousePressed

    private void HomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseReleased
        // Resets the icon of the button
        Home.setIcon(new ImageIcon(getClass().getResource("/images/btn_home.png")));
    }//GEN-LAST:event_HomeMouseReleased

    private void NewRecipeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewRecipeMousePressed
        // Changes the icon of the button when pressed
        NewRecipe.setIcon(new ImageIcon(getClass().getResource("/images/btn_addrecipe_pressed.png")));
    }//GEN-LAST:event_NewRecipeMousePressed

    private void NewRecipeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewRecipeMouseReleased
        // Resets the icon of the button
        NewRecipe.setIcon(new ImageIcon(getClass().getResource("/images/btn_addrecipe.png")));
    }//GEN-LAST:event_NewRecipeMouseReleased

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmWelcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmWelcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Help;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel NewRecipe;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblImageLeft;
    private javax.swing.JLabel lblImageRight;
    private javax.swing.JPanel pnlBottomBorder;
    private javax.swing.JPanel pnlCentre;
    private javax.swing.JPanel pnlLeftBorder;
    private javax.swing.JPanel pnlRightBorder;
    private javax.swing.JPanel pnlTopBorder;
    // End of variables declaration//GEN-END:variables
}
