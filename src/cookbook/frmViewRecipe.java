package cookbook;

import javax.swing.ImageIcon;

/**
 * @author Anna Phillips
 */

public class frmViewRecipe extends javax.swing.JFrame {

    /**
     * Creates new form frmViewRecipe
     */
    
    private String previousScreen, name;
    
    public frmViewRecipe(String source, String name) {
        previousScreen = source;
        this.name = name;
        initComponents();
        
        AppManager.viewRecipe(name, lblRecipeName, lblHours, lblMinutes, lblRecipeType, lblServes, pnlIngredients, pnlSteps);
        this.validate();
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlTopBorder = new javax.swing.JPanel();
        Back = new javax.swing.JLabel();
        lblArtLeft = new javax.swing.JLabel();
        lblHeading = new javax.swing.JLabel();
        lblArtRight = new javax.swing.JLabel();
        Help = new javax.swing.JLabel();
        lblHeading1 = new javax.swing.JLabel();
        pnlFooter = new javax.swing.JPanel();
        btnEdit = new javax.swing.JLabel();
        pnlBorderLeft = new javax.swing.JPanel();
        pnlCentre = new javax.swing.JPanel();
        lblRecipeName = new javax.swing.JLabel();
        lblRecipeDuration = new javax.swing.JLabel();
        lblHours = new javax.swing.JLabel();
        lblMinutes = new javax.swing.JLabel();
        lblRecipeType = new javax.swing.JLabel();
        lblSteps = new javax.swing.JLabel();
        scpnIngredients = new javax.swing.JScrollPane();
        pnlIngredients = new javax.swing.JPanel();
        lblIngredients = new javax.swing.JLabel();
        scpnSteps = new javax.swing.JScrollPane();
        pnlSteps = new javax.swing.JPanel();
        lblServes = new javax.swing.JLabel();
        pnlBorderRight = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 60));

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

        lblArtLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_bar1.png"))); // NOI18N
        pnlTopBorder.add(lblArtLeft);

        lblHeading.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        lblHeading.setText("View Your Recipe");
        lblHeading.setToolTipText("");
        pnlTopBorder.add(lblHeading);

        lblArtRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_bar2.png"))); // NOI18N
        lblArtRight.setMaximumSize(new java.awt.Dimension(150, 50));
        lblArtRight.setMinimumSize(new java.awt.Dimension(150, 50));
        lblArtRight.setPreferredSize(new java.awt.Dimension(150, 50));
        pnlTopBorder.add(lblArtRight);

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
        pnlTopBorder.add(Help);

        lblHeading1.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        lblHeading1.setText("                       ");
        lblHeading1.setToolTipText("");
        pnlTopBorder.add(lblHeading1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlTopBorder, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTopBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pnlFooter.setBackground(new java.awt.Color(247, 247, 247));
        pnlFooter.setMinimumSize(new java.awt.Dimension(800, 50));
        pnlFooter.setPreferredSize(new java.awt.Dimension(800, 60));

        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_edit.png"))); // NOI18N
        btnEdit.setMinimumSize(new java.awt.Dimension(80, 32));
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEditMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlFooterLayout = new javax.swing.GroupLayout(pnlFooter);
        pnlFooter.setLayout(pnlFooterLayout);
        pnlFooterLayout.setHorizontalGroup(
            pnlFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFooterLayout.createSequentialGroup()
                .addContainerGap(708, Short.MAX_VALUE)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlFooterLayout.setVerticalGroup(
            pnlFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFooterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlFooter, java.awt.BorderLayout.PAGE_END);

        pnlBorderLeft.setBackground(new java.awt.Color(247, 247, 247));

        javax.swing.GroupLayout pnlBorderLeftLayout = new javax.swing.GroupLayout(pnlBorderLeft);
        pnlBorderLeft.setLayout(pnlBorderLeftLayout);
        pnlBorderLeftLayout.setHorizontalGroup(
            pnlBorderLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlBorderLeftLayout.setVerticalGroup(
            pnlBorderLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        getContentPane().add(pnlBorderLeft, java.awt.BorderLayout.LINE_START);

        pnlCentre.setBackground(new java.awt.Color(247, 247, 247));

        lblRecipeName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRecipeName.setText("Name of Recipe");

        lblRecipeDuration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRecipeDuration.setText("Duration of Recipe");

        lblHours.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHours.setText("hr");

        lblMinutes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMinutes.setText("min");

        lblRecipeType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRecipeType.setText("Type of Recipe");

        lblSteps.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSteps.setText("Steps");

        javax.swing.GroupLayout pnlIngredientsLayout = new javax.swing.GroupLayout(pnlIngredients);
        pnlIngredients.setLayout(pnlIngredientsLayout);
        pnlIngredientsLayout.setHorizontalGroup(
            pnlIngredientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );
        pnlIngredientsLayout.setVerticalGroup(
            pnlIngredientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );

        scpnIngredients.setViewportView(pnlIngredients);

        lblIngredients.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIngredients.setText("Ingredients");

        javax.swing.GroupLayout pnlStepsLayout = new javax.swing.GroupLayout(pnlSteps);
        pnlSteps.setLayout(pnlStepsLayout);
        pnlStepsLayout.setHorizontalGroup(
            pnlStepsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );
        pnlStepsLayout.setVerticalGroup(
            pnlStepsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );

        scpnSteps.setViewportView(pnlSteps);

        lblServes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblServes.setText("Serves");

        javax.swing.GroupLayout pnlCentreLayout = new javax.swing.GroupLayout(pnlCentre);
        pnlCentre.setLayout(pnlCentreLayout);
        pnlCentreLayout.setHorizontalGroup(
            pnlCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRecipeName)
                    .addGroup(pnlCentreLayout.createSequentialGroup()
                        .addComponent(lblRecipeDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHours, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMinutes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblSteps, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scpnSteps, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRecipeType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(pnlCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIngredients)
                    .addComponent(scpnIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServes))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        pnlCentreLayout.setVerticalGroup(
            pnlCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRecipeName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHours)
                    .addComponent(lblMinutes)
                    .addComponent(lblRecipeDuration))
                .addGap(14, 14, 14)
                .addGroup(pnlCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRecipeType, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSteps, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scpnIngredients)
                    .addComponent(scpnSteps))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlCentre, java.awt.BorderLayout.CENTER);

        pnlBorderRight.setBackground(new java.awt.Color(247, 247, 247));
        pnlBorderRight.setMinimumSize(new java.awt.Dimension(50, 100));
        pnlBorderRight.setPreferredSize(new java.awt.Dimension(50, 380));

        javax.swing.GroupLayout pnlBorderRightLayout = new javax.swing.GroupLayout(pnlBorderRight);
        pnlBorderRight.setLayout(pnlBorderRightLayout);
        pnlBorderRightLayout.setHorizontalGroup(
            pnlBorderRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pnlBorderRightLayout.setVerticalGroup(
            pnlBorderRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        getContentPane().add(pnlBorderRight, java.awt.BorderLayout.LINE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        new frmNewRecipe("Home", name).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMousePressed
        btnEdit.setIcon(new ImageIcon(getClass().getResource("/images/btn_save_pressed.png")));
    }//GEN-LAST:event_btnEditMousePressed

    private void btnEditMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseReleased
        btnEdit.setIcon(new ImageIcon(getClass().getResource("/images/btn_save.png")));
    }//GEN-LAST:event_btnEditMouseReleased

    private void HelpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseReleased
        Help.setIcon(new ImageIcon(getClass().getResource("/images/btn_help.png")));
    }//GEN-LAST:event_HelpMouseReleased

    private void HelpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMousePressed
        Help.setIcon(new ImageIcon(getClass().getResource("/images/btn_help_pressed.png")));
    }//GEN-LAST:event_HelpMousePressed

    private void HelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseClicked
        new frmHelp("Welcome").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HelpMouseClicked

    private void BackMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseReleased
        Back.setIcon(new ImageIcon(getClass().getResource("/images/btn_back.png")));
    }//GEN-LAST:event_BackMouseReleased

    private void BackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMousePressed
        Back.setIcon(new ImageIcon(getClass().getResource("/images/btn_back_pressed.png")));
    }//GEN-LAST:event_BackMousePressed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // When the user cancels the editing, this ensures they return to the 
        // previous screen they were on
        switch (previousScreen) {
            case "Welcome" -> new frmWelcome().setVisible(true);
            case "Home" -> new frmHome().setVisible(true);
            case "NewRecipe" -> new frmNewRecipe("Help").setVisible(true);
        }
        
        this.setVisible(false);
    }//GEN-LAST:event_BackMouseClicked

    private void btnEditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseEntered
        //btnEdit.setIcon(new ImageIcon(getClass().getResource("/images/btn_edit_hover.png")));
    }//GEN-LAST:event_btnEditMouseEntered

    private void btnEditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseExited
        //btnEdit.setIcon(new ImageIcon(getClass().getResource("/images/btn_save_normal.png")));
    }//GEN-LAST:event_btnEditMouseExited

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
            java.util.logging.Logger.getLogger(frmViewRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmViewRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmViewRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmViewRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmViewRecipe("", "").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Help;
    private javax.swing.JLabel btnEdit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblArtLeft;
    private javax.swing.JLabel lblArtRight;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblHeading1;
    private javax.swing.JLabel lblHours;
    private javax.swing.JLabel lblIngredients;
    private javax.swing.JLabel lblMinutes;
    private javax.swing.JLabel lblRecipeDuration;
    private javax.swing.JLabel lblRecipeName;
    private javax.swing.JLabel lblRecipeType;
    private javax.swing.JLabel lblServes;
    private javax.swing.JLabel lblSteps;
    private javax.swing.JPanel pnlBorderLeft;
    private javax.swing.JPanel pnlBorderRight;
    private javax.swing.JPanel pnlCentre;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlIngredients;
    private javax.swing.JPanel pnlSteps;
    private javax.swing.JPanel pnlTopBorder;
    private javax.swing.JScrollPane scpnIngredients;
    private javax.swing.JScrollPane scpnSteps;
    // End of variables declaration//GEN-END:variables
}
