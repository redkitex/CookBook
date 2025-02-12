package cookbook;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @author Anna Phillips
 */


public class frmHome extends javax.swing.JFrame {

    private int selectedRow = -1; // by default no rows are selected in the table
    public static DatabaseManager databaseManager;
    public static IngredientManager ingredientManager;
    public static RecipeManager recipeManager;
    
    /**
     * Creates new form frmHome
     */
    
    public frmHome() {
        initComponents();
        
        // The various managers are fetched from the AppManager class
        databaseManager = AppManager.databaseManager;
        ingredientManager = AppManager.ingredientManager;
        recipeManager = AppManager.recipeManager;
        
        databaseManager.resetFilters(cmbSortBy, spnFromHr, spnFromMin, spnToHr, spnToMin, pnlIngredients);
        
        // The ingredients are displayed in the pnlIngredients as checkboxes
        AppManager.displayIngredients(ingredientManager, tblDatabaseDisplay, pnlIngredients);
        // The table is linked to the database and the records from the database are displayed in it
        databaseManager.setTable(tblDatabaseDisplay);
        databaseManager.displayDataInTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTop = new javax.swing.JPanel();
        pnlTopBorder = new javax.swing.JPanel();
        lblImageLeft = new javax.swing.JLabel();
        lblHeading = new javax.swing.JLabel();
        lblImageRight = new javax.swing.JLabel();
        lblSpace = new javax.swing.JLabel();
        Help = new javax.swing.JLabel();
        pnlBottom = new javax.swing.JPanel();
        View = new javax.swing.JLabel();
        Edit = new javax.swing.JLabel();
        NewRecipe = new javax.swing.JLabel();
        Clear = new javax.swing.JLabel();
        Filter = new javax.swing.JLabel();
        pnlLeft = new javax.swing.JPanel();
        lblSortBy = new javax.swing.JLabel();
        cmbSortBy = new javax.swing.JComboBox<>();
        lblDuration = new javax.swing.JLabel();
        lblFrom = new javax.swing.JLabel();
        spnFromHr = new javax.swing.JSpinner();
        lblFromHr = new javax.swing.JLabel();
        lblTo = new javax.swing.JLabel();
        spnToHr = new javax.swing.JSpinner();
        lblToHr = new javax.swing.JLabel();
        spnToMin = new javax.swing.JSpinner();
        spnFromMin = new javax.swing.JSpinner();
        lblFromMin = new javax.swing.JLabel();
        lblToMin = new javax.swing.JLabel();
        lblIngredients = new javax.swing.JLabel();
        scrpnIngredientsPane = new javax.swing.JScrollPane();
        pnlIngredients = new javax.swing.JPanel();
        pnlRight = new javax.swing.JPanel();
        pnlCentre = new javax.swing.JPanel();
        scpnTable = new javax.swing.JScrollPane();
        tblDatabaseDisplay = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlTop.setBackground(new java.awt.Color(247, 247, 247));
        pnlTop.setMinimumSize(new java.awt.Dimension(800, 50));
        pnlTop.setPreferredSize(new java.awt.Dimension(800, 60));

        pnlTopBorder.setBackground(new java.awt.Color(247, 247, 247));
        pnlTopBorder.setPreferredSize(new java.awt.Dimension(800, 60));

        lblImageLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_bar1.png"))); // NOI18N
        pnlTopBorder.add(lblImageLeft);

        lblHeading.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        lblHeading.setText("Home");
        lblHeading.setToolTipText("");
        pnlTopBorder.add(lblHeading);

        lblImageRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_bar2.png"))); // NOI18N
        pnlTopBorder.add(lblImageRight);

        lblSpace.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        lblSpace.setText("                       ");
        lblSpace.setToolTipText("");
        pnlTopBorder.add(lblSpace);

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

        pnlTop.add(pnlTopBorder);

        getContentPane().add(pnlTop, java.awt.BorderLayout.PAGE_START);

        pnlBottom.setBackground(new java.awt.Color(247, 247, 247));
        pnlBottom.setMinimumSize(new java.awt.Dimension(800, 50));
        pnlBottom.setPreferredSize(new java.awt.Dimension(800, 60));

        View.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        View.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_view.png"))); // NOI18N
        View.setText("View");
        View.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_view_disabled.png"))); // NOI18N
        View.setMinimumSize(new java.awt.Dimension(80, 32));
        View.setPreferredSize(new java.awt.Dimension(80, 40));
        View.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ViewMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ViewMouseReleased(evt);
            }
        });

        Edit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_edit.png"))); // NOI18N
        Edit.setText("Edit");
        Edit.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_view_disabled.png"))); // NOI18N
        Edit.setMinimumSize(new java.awt.Dimension(80, 32));
        Edit.setPreferredSize(new java.awt.Dimension(80, 40));
        Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EditMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                EditMouseReleased(evt);
            }
        });

        NewRecipe.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        NewRecipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_addrecipe.png"))); // NOI18N
        NewRecipe.setText("New Recipe");
        NewRecipe.setMinimumSize(new java.awt.Dimension(100, 32));
        NewRecipe.setPreferredSize(new java.awt.Dimension(100, 40));
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

        Clear.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_clear.png"))); // NOI18N
        Clear.setText("Cancel");
        Clear.setMinimumSize(new java.awt.Dimension(80, 40));
        Clear.setPreferredSize(new java.awt.Dimension(80, 32));
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClearMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ClearMouseReleased(evt);
            }
        });

        Filter.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_filter.png"))); // NOI18N
        Filter.setText("Filter");
        Filter.setMinimumSize(new java.awt.Dimension(80, 40));
        Filter.setPreferredSize(new java.awt.Dimension(80, 40));
        Filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilterMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FilterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                FilterMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewRecipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlBottom, java.awt.BorderLayout.PAGE_END);

        pnlLeft.setBackground(new java.awt.Color(247, 247, 247));
        pnlLeft.setMinimumSize(new java.awt.Dimension(200, 100));
        pnlLeft.setPreferredSize(new java.awt.Dimension(200, 380));

        lblSortBy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSortBy.setText("Sort By");

        cmbSortBy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbSortBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Type", "Duration" }));

        lblDuration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDuration.setText("Filter by Duration");

        lblFrom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFrom.setText("From");

        spnFromHr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spnFromHr.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        lblFromHr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFromHr.setText("hr");

        lblTo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTo.setText("To");

        spnToHr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spnToHr.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));

        lblToHr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblToHr.setText("hr");

        spnToMin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spnToMin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 10));

        spnFromMin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spnFromMin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 10));

        lblFromMin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFromMin.setText("min");

        lblToMin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblToMin.setText("min");

        lblIngredients.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIngredients.setText("Filter by Ingredients");

        scrpnIngredientsPane.setViewportView(pnlIngredients);

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrpnIngredientsPane)
                    .addGroup(pnlLeftLayout.createSequentialGroup()
                        .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSortBy)
                            .addComponent(cmbSortBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDuration)
                            .addGroup(pnlLeftLayout.createSequentialGroup()
                                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftLayout.createSequentialGroup()
                                        .addComponent(lblFrom)
                                        .addGap(5, 5, 5)
                                        .addComponent(spnFromHr, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(lblFromHr, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLeftLayout.createSequentialGroup()
                                        .addComponent(lblTo)
                                        .addGap(5, 5, 5)
                                        .addComponent(spnToHr, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblToHr)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlLeftLayout.createSequentialGroup()
                                        .addComponent(spnToMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblToMin))
                                    .addGroup(pnlLeftLayout.createSequentialGroup()
                                        .addComponent(spnFromMin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblFromMin))))
                            .addComponent(lblIngredients))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSortBy)
                .addGap(7, 7, 7)
                .addComponent(cmbSortBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDuration)
                .addGap(7, 7, 7)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnFromHr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlLeftLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFrom)
                            .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFromHr)
                                .addComponent(spnFromMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFromMin)))))
                .addGap(7, 7, 7)
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spnToHr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblToHr)
                        .addComponent(spnToMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblToMin))
                    .addGroup(pnlLeftLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblTo)))
                .addGap(18, 18, 18)
                .addComponent(lblIngredients)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrpnIngredientsPane, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnlLeft, java.awt.BorderLayout.LINE_START);

        pnlRight.setBackground(new java.awt.Color(247, 247, 247));
        pnlRight.setMinimumSize(new java.awt.Dimension(50, 100));
        pnlRight.setPreferredSize(new java.awt.Dimension(50, 380));

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        getContentPane().add(pnlRight, java.awt.BorderLayout.LINE_END);

        pnlCentre.setBackground(new java.awt.Color(255, 255, 255));

        tblDatabaseDisplay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblDatabaseDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Recipe Name", "Duration", "Serves", "Type", "Ingredients"
            }
        ));
        tblDatabaseDisplay.getTableHeader().setReorderingAllowed(false);
        scpnTable.setViewportView(tblDatabaseDisplay);

        javax.swing.GroupLayout pnlCentreLayout = new javax.swing.GroupLayout(pnlCentre);
        pnlCentre.setLayout(pnlCentreLayout);
        pnlCentreLayout.setHorizontalGroup(
            pnlCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCentreLayout.setVerticalGroup(
            pnlCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        getContentPane().add(pnlCentre, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewMouseClicked
        selectedRow = tblDatabaseDisplay.getSelectedRow();
        try{
            // The name of the recipe that has been selected is sent to the ViewRecipe screen
            String selectedRecipeName = tblDatabaseDisplay.getValueAt(selectedRow, 0).toString();
            new frmViewRecipe("Home", selectedRecipeName).setVisible(true);
            this.setVisible(false);
        } 
        catch(ArrayIndexOutOfBoundsException e){
            // If no recipe has been selected a dialog is shown to the user
            JOptionPane.showMessageDialog(null, "Please select a recipe to view");
        }
    }//GEN-LAST:event_ViewMouseClicked

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
        selectedRow = tblDatabaseDisplay.getSelectedRow();
        try{
            // The name of the recipe that has been selected is sent to the NewRecipe screen
            String selectedRecipeName = tblDatabaseDisplay.getValueAt(selectedRow, 0).toString();
            new frmNewRecipe("Home", selectedRecipeName).setVisible(true);
            this.setVisible(false);
        } 
        catch(ArrayIndexOutOfBoundsException e){
            // If no recipe has been selected a dialog is shown to the user
            JOptionPane.showMessageDialog(null, "Please select a recipe to edit");
        }
    }//GEN-LAST:event_EditMouseClicked

    
    private void NewRecipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewRecipeMouseClicked
        new frmNewRecipe("Home").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NewRecipeMouseClicked

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
        // Reset all the filters
        databaseManager.resetFilters(cmbSortBy, spnFromHr, spnFromMin, spnToHr, spnToMin, pnlIngredients);
        
        // Reset the data displayed in tblDatabaseDisplay so no filters are applied
        databaseManager.connectNoFilters();
        databaseManager.displayDataInTable();
    }//GEN-LAST:event_ClearMouseClicked

    private void FilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterMouseClicked
        // The filters that have been selected are applied
        AppManager.filter(cmbSortBy, spnFromHr, spnFromMin, spnToHr, spnToMin, pnlIngredients);
    }//GEN-LAST:event_FilterMouseClicked

    private void ClearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMousePressed
        Clear.setIcon(new ImageIcon(getClass().getResource("/images/btn_clear_pressed.png")));
    }//GEN-LAST:event_ClearMousePressed

    private void ClearMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseReleased
        Clear.setIcon(new ImageIcon(getClass().getResource("/images/btn_clear.png")));
    }//GEN-LAST:event_ClearMouseReleased

    private void FilterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterMousePressed
        Filter.setIcon(new ImageIcon(getClass().getResource("/images/btn_filter_pressed.png")));
    }//GEN-LAST:event_FilterMousePressed

    private void FilterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterMouseReleased
        Filter.setIcon(new ImageIcon(getClass().getResource("/images/btn_filter.png")));
    }//GEN-LAST:event_FilterMouseReleased

    private void NewRecipeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewRecipeMousePressed
        NewRecipe.setIcon(new ImageIcon(getClass().getResource("/images/btn_addrecipe_pressed.png")));
    }//GEN-LAST:event_NewRecipeMousePressed

    private void NewRecipeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewRecipeMouseReleased
        NewRecipe.setIcon(new ImageIcon(getClass().getResource("/images/btn_addrecipe.png")));
    }//GEN-LAST:event_NewRecipeMouseReleased

    private void ViewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewMousePressed
        View.setIcon(new ImageIcon(getClass().getResource("/images/btn_view_pressed.png")));
    }//GEN-LAST:event_ViewMousePressed

    private void ViewMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewMouseReleased
        View.setIcon(new ImageIcon(getClass().getResource("/images/btn_view.png")));
    }//GEN-LAST:event_ViewMouseReleased

    private void EditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMousePressed
        Edit.setIcon(new ImageIcon(getClass().getResource("/images/btn_edit_pressed.png")));
    }//GEN-LAST:event_EditMousePressed

    private void EditMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseReleased
        Edit.setIcon(new ImageIcon(getClass().getResource("/images/btn_edit.png")));
    }//GEN-LAST:event_EditMouseReleased

    private void HelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseClicked
        new frmHelp("Home").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HelpMouseClicked

    private void HelpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMousePressed
        Help.setIcon(new ImageIcon(getClass().getResource("/images/btn_help_pressed.png")));
    }//GEN-LAST:event_HelpMousePressed

    private void HelpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseReleased
        Help.setIcon(new ImageIcon(getClass().getResource("/images/btn_help.png")));
    }//GEN-LAST:event_HelpMouseReleased

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
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmHome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clear;
    private javax.swing.JLabel Edit;
    private javax.swing.JLabel Filter;
    private javax.swing.JLabel Help;
    private javax.swing.JLabel NewRecipe;
    private javax.swing.JLabel View;
    private javax.swing.JComboBox<String> cmbSortBy;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblFromHr;
    private javax.swing.JLabel lblFromMin;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblImageLeft;
    private javax.swing.JLabel lblImageRight;
    private javax.swing.JLabel lblIngredients;
    private javax.swing.JLabel lblSortBy;
    private javax.swing.JLabel lblSpace;
    private javax.swing.JLabel lblTo;
    private javax.swing.JLabel lblToHr;
    private javax.swing.JLabel lblToMin;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlCentre;
    private javax.swing.JPanel pnlIngredients;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JPanel pnlTopBorder;
    private javax.swing.JScrollPane scpnTable;
    private javax.swing.JScrollPane scrpnIngredientsPane;
    private javax.swing.JSpinner spnFromHr;
    private javax.swing.JSpinner spnFromMin;
    private javax.swing.JSpinner spnToHr;
    private javax.swing.JSpinner spnToMin;
    private javax.swing.JTable tblDatabaseDisplay;
    // End of variables declaration//GEN-END:variables
}
