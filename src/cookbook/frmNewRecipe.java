package cookbook;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

/*
 * @author Anna Phillips
 */

public class frmNewRecipe extends javax.swing.JFrame {

    private String previousScreen;
    
    /**
     * Creates new form NewRecipe
     */
    
    // The name of the recipe being edited
    // If a new recipe is being created, name = "", otherwise it will have a value
    private String name = "";
    
    public frmNewRecipe(String source){
        initComponents();
        previousScreen = source;
        
        // The Comboboxes of the ingredients and measurement types are setup
        cmbIngredientName.setModel(new DefaultComboBoxModel(AppManager.getAvailableIngredientNames(name)));
        cmbMeasurementType.setModel(new DefaultComboBoxModel(AppManager.ingredientManager.getMeasurementTypes()));
        
        // The list of active ingredients is reset
        // This is so that each time a recipe is opened to be edited or created, 
        // All the unused ingredients are still open to the user
        AppManager.activeIngredients = new ArrayList<>();
    }
    
    public frmNewRecipe(String source, String name) {
        // If a recipe is opened to be edited then this Constructor is used
        this.name = name;
        
        initComponents();
        previousScreen = source;
        
        // The components are initialised with the values of the recipe that is being edited
        AppManager.setComponentValues(name, txfName, cmbType, 
            spnServes, txaSteps, spnHour, spnMin, pnlIngredients);
        
        txfName.setEditable(false);
        cmbIngredientName.setModel(new DefaultComboBoxModel(AppManager.getAvailableIngredientNames(name)));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBorderTop = new javax.swing.JPanel();
        pnlTopBorder = new javax.swing.JPanel();
        lblPictureLeft = new javax.swing.JLabel();
        lblHeading = new javax.swing.JLabel();
        lblPictureRight = new javax.swing.JLabel();
        btnHelp = new javax.swing.JLabel();
        pnlBorderBottom = new javax.swing.JPanel();
        btnCancel = new javax.swing.JLabel();
        btnSave = new javax.swing.JLabel();
        pnlBorderLeft = new javax.swing.JPanel();
        pnlBorderRight = new javax.swing.JPanel();
        pnlBorderCentre = new javax.swing.JPanel();
        lblRecipeName = new javax.swing.JLabel();
        txfName = new javax.swing.JTextField();
        lblRecipeDuration = new javax.swing.JLabel();
        spnHour = new javax.swing.JSpinner();
        lblHours = new javax.swing.JLabel();
        spnMin = new javax.swing.JSpinner();
        lblMinutes = new javax.swing.JLabel();
        lblRecipeType = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        lblMethod = new javax.swing.JLabel();
        scrIngredients = new javax.swing.JScrollPane();
        pnlIngredients = new javax.swing.JPanel();
        lblIngredients = new javax.swing.JLabel();
        lblIngredientName = new javax.swing.JLabel();
        cmbIngredientName = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JLabel();
        lblMeasurementType = new javax.swing.JLabel();
        cmbMeasurementType = new javax.swing.JComboBox<>();
        btnNewIngredient = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        spnQuantity = new javax.swing.JSpinner();
        lblServings = new javax.swing.JLabel();
        spnServes = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaSteps = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBorderTop.setBackground(new java.awt.Color(247, 247, 247));
        pnlBorderTop.setMinimumSize(new java.awt.Dimension(800, 50));
        pnlBorderTop.setPreferredSize(new java.awt.Dimension(800, 60));

        pnlTopBorder.setBackground(new java.awt.Color(247, 247, 247));
        pnlTopBorder.setPreferredSize(new java.awt.Dimension(800, 60));

        lblPictureLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_bar1.png"))); // NOI18N
        pnlTopBorder.add(lblPictureLeft);

        lblHeading.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        lblHeading.setText("Create a New Recipe");
        lblHeading.setToolTipText("");
        pnlTopBorder.add(lblHeading);

        lblPictureRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_bar2.png"))); // NOI18N
        pnlTopBorder.add(lblPictureRight);

        btnHelp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_help.png"))); // NOI18N
        btnHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHelpMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnHelpMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnHelpMouseReleased(evt);
            }
        });
        pnlTopBorder.add(btnHelp);

        javax.swing.GroupLayout pnlBorderTopLayout = new javax.swing.GroupLayout(pnlBorderTop);
        pnlBorderTop.setLayout(pnlBorderTopLayout);
        pnlBorderTopLayout.setHorizontalGroup(
            pnlBorderTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBorderTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlTopBorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBorderTopLayout.setVerticalGroup(
            pnlBorderTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBorderTopLayout.createSequentialGroup()
                .addComponent(pnlTopBorder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(pnlBorderTop, java.awt.BorderLayout.PAGE_START);

        pnlBorderBottom.setBackground(new java.awt.Color(247, 247, 247));
        pnlBorderBottom.setMinimumSize(new java.awt.Dimension(800, 50));
        pnlBorderBottom.setPreferredSize(new java.awt.Dimension(800, 60));

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_cancel.png"))); // NOI18N
        btnCancel.setMinimumSize(new java.awt.Dimension(80, 32));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelMouseReleased(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_save.png"))); // NOI18N
        btnSave.setMinimumSize(new java.awt.Dimension(80, 32));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSaveMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSaveMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlBorderBottomLayout = new javax.swing.GroupLayout(pnlBorderBottom);
        pnlBorderBottom.setLayout(pnlBorderBottomLayout);
        pnlBorderBottomLayout.setHorizontalGroup(
            pnlBorderBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBorderBottomLayout.createSequentialGroup()
                .addContainerGap(621, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBorderBottomLayout.setVerticalGroup(
            pnlBorderBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBorderBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBorderBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlBorderBottom, java.awt.BorderLayout.PAGE_END);

        pnlBorderLeft.setBackground(new java.awt.Color(247, 247, 247));

        javax.swing.GroupLayout pnlBorderLeftLayout = new javax.swing.GroupLayout(pnlBorderLeft);
        pnlBorderLeft.setLayout(pnlBorderLeftLayout);
        pnlBorderLeftLayout.setHorizontalGroup(
            pnlBorderLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlBorderLeftLayout.setVerticalGroup(
            pnlBorderLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        getContentPane().add(pnlBorderLeft, java.awt.BorderLayout.LINE_START);

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
            .addGap(0, 441, Short.MAX_VALUE)
        );

        getContentPane().add(pnlBorderRight, java.awt.BorderLayout.LINE_END);

        pnlBorderCentre.setBackground(new java.awt.Color(247, 247, 247));

        lblRecipeName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRecipeName.setText("Name of Recipe");

        txfName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblRecipeDuration.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRecipeDuration.setText("Duration of Recipe");

        spnHour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spnHour.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        lblHours.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHours.setText("hr");

        spnMin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spnMin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 10));

        lblMinutes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMinutes.setText("min");

        lblRecipeType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRecipeType.setText("Type of Recipe");

        cmbType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Snack", "Light meal", "Main meal", "Dessert" }));

        lblMethod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMethod.setText("Steps (Write each step on a new line)");

        javax.swing.GroupLayout pnlIngredientsLayout = new javax.swing.GroupLayout(pnlIngredients);
        pnlIngredients.setLayout(pnlIngredientsLayout);
        pnlIngredientsLayout.setHorizontalGroup(
            pnlIngredientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
        );
        pnlIngredientsLayout.setVerticalGroup(
            pnlIngredientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 165, Short.MAX_VALUE)
        );

        scrIngredients.setViewportView(pnlIngredients);

        lblIngredients.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIngredients.setText("Ingredients");

        lblIngredientName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIngredientName.setText("Name:");

        cmbIngredientName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbIngredientName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Egg", "Carrot" }));

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_add.png"))); // NOI18N
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        lblMeasurementType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMeasurementType.setText("Measurement Type");

        cmbMeasurementType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbMeasurementType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grams", "Millilitres", "Quantity" }));

        btnNewIngredient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNewIngredient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_addingredient.png"))); // NOI18N
        btnNewIngredient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewIngredientMouseClicked(evt);
            }
        });

        lblQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQuantity.setText("Quantity");

        spnQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        lblServings.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblServings.setText("Number of Servings");

        spnServes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spnServes.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        txaSteps.setColumns(20);
        txaSteps.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txaSteps.setRows(5);
        jScrollPane3.setViewportView(txaSteps);

        javax.swing.GroupLayout pnlBorderCentreLayout = new javax.swing.GroupLayout(pnlBorderCentre);
        pnlBorderCentre.setLayout(pnlBorderCentreLayout);
        pnlBorderCentreLayout.setHorizontalGroup(
            pnlBorderCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBorderCentreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBorderCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlBorderCentreLayout.createSequentialGroup()
                        .addComponent(lblRecipeName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBorderCentreLayout.createSequentialGroup()
                        .addComponent(lblRecipeType)
                        .addGap(18, 18, 18)
                        .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBorderCentreLayout.createSequentialGroup()
                        .addComponent(lblRecipeDuration)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnHour, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblHours, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMinutes))
                    .addGroup(pnlBorderCentreLayout.createSequentialGroup()
                        .addComponent(lblServings)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnServes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMethod)
                    .addComponent(jScrollPane3))
                .addGap(62, 62, 62)
                .addGroup(pnlBorderCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBorderCentreLayout.createSequentialGroup()
                        .addComponent(lblMeasurementType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbMeasurementType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBorderCentreLayout.createSequentialGroup()
                        .addGroup(pnlBorderCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIngredients)
                            .addGroup(pnlBorderCentreLayout.createSequentialGroup()
                                .addComponent(lblIngredientName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbIngredientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNewIngredient))
                    .addGroup(pnlBorderCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pnlBorderCentreLayout.createSequentialGroup()
                            .addComponent(lblQuantity)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd))
                        .addComponent(scrIngredients, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlBorderCentreLayout.setVerticalGroup(
            pnlBorderCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBorderCentreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBorderCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRecipeName)
                    .addComponent(txfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBorderCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHours)
                    .addComponent(spnMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinutes)
                    .addComponent(spnHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRecipeDuration))
                .addGap(10, 10, 10)
                .addGroup(pnlBorderCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBorderCentreLayout.createSequentialGroup()
                        .addGroup(pnlBorderCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbType)
                            .addComponent(lblRecipeType, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBorderCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnServes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblServings))
                        .addGap(9, 9, 9)
                        .addComponent(lblMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBorderCentreLayout.createSequentialGroup()
                        .addGroup(pnlBorderCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlBorderCentreLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(pnlBorderCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlBorderCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblIngredientName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbIngredientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnNewIngredient))
                                .addGap(18, 18, 18)
                                .addGroup(pnlBorderCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMeasurementType, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbMeasurementType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlBorderCentreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAdd))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrIngredients)))
                .addGap(38, 38, 38))
        );

        getContentPane().add(pnlBorderCentre, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // When the user cancels the editing, this ensures they return to the previous screen they were on
        switch (previousScreen) {
            case "Welcome" -> new frmWelcome().setVisible(true);
            case "Home" -> new frmHome().setVisible(true);
            // If the user was on the NewRecipe screen, then went to the Help screen, then returned
            // and wanted to Cancel the editing of the recipe
            // they will be taken back to the Home screen, rather than the Help screen
            case "Help" -> new frmHome().setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        // The component values are fetched and a new recipe is created and saved 
        // or changes to an existing recipe are saved, this depends the value of name
        // This also checks if all the fields of the recipe are present and if so it is saved
        if(AppManager.getComponentValues(name, txfName, cmbType, spnServes, txaSteps, spnHour, spnMin, pnlIngredients)){
            AppManager.connectToTables();
            new frmHome().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnCancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMousePressed
        btnCancel.setIcon(new ImageIcon(getClass().getResource("/images/btn_cancel_pressed.png")));
    }//GEN-LAST:event_btnCancelMousePressed

    private void btnCancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseReleased
        btnCancel.setIcon(new ImageIcon(getClass().getResource("/images/btn_cancel.png")));
    }//GEN-LAST:event_btnCancelMouseReleased

    private void btnSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMousePressed
        btnSave.setIcon(new ImageIcon(getClass().getResource("/images/btn_save_pressed.png")));
    }//GEN-LAST:event_btnSaveMousePressed

    private void btnSaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseReleased
        btnSave.setIcon(new ImageIcon(getClass().getResource("/images/btn_save.png")));
    }//GEN-LAST:event_btnSaveMouseReleased

    private void btnHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHelpMouseClicked
        new frmHelp("Welcome").setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHelpMouseClicked

    private void btnHelpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHelpMousePressed
        btnHelp.setIcon(new ImageIcon(getClass().getResource("/images/btn_help_pressed.png")));
    }//GEN-LAST:event_btnHelpMousePressed

    private void btnHelpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHelpMouseReleased
        btnHelp.setIcon(new ImageIcon(getClass().getResource("/images/btn_help.png")));
    }//GEN-LAST:event_btnHelpMouseReleased

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // An ingredient is added to the panel of ingrediens
        AppManager.addNewIngredientToPanel(pnlIngredients, cmbIngredientName, cmbMeasurementType, spnQuantity);
        cmbIngredientName.setModel(new DefaultComboBoxModel(AppManager.getAvailableIngredientNames(name, cmbIngredientName.getSelectedItem().toString())));
        this.validate();
        this.repaint();
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnNewIngredientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewIngredientMouseClicked
        AppManager.addIngredientDialog(cmbIngredientName);
    }//GEN-LAST:event_btnNewIngredientMouseClicked

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" >
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmNewRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNewRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNewRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNewRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNewRecipe("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdd;
    private javax.swing.JLabel btnCancel;
    private javax.swing.JLabel btnHelp;
    private javax.swing.JLabel btnNewIngredient;
    private javax.swing.JLabel btnSave;
    private javax.swing.JComboBox<String> cmbIngredientName;
    private javax.swing.JComboBox<String> cmbMeasurementType;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblHours;
    private javax.swing.JLabel lblIngredientName;
    private javax.swing.JLabel lblIngredients;
    private javax.swing.JLabel lblMeasurementType;
    private javax.swing.JLabel lblMethod;
    private javax.swing.JLabel lblMinutes;
    private javax.swing.JLabel lblPictureLeft;
    private javax.swing.JLabel lblPictureRight;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblRecipeDuration;
    private javax.swing.JLabel lblRecipeName;
    private javax.swing.JLabel lblRecipeType;
    private javax.swing.JLabel lblServings;
    private javax.swing.JPanel pnlBorderBottom;
    private javax.swing.JPanel pnlBorderCentre;
    private javax.swing.JPanel pnlBorderLeft;
    private javax.swing.JPanel pnlBorderRight;
    private javax.swing.JPanel pnlBorderTop;
    private javax.swing.JPanel pnlIngredients;
    private javax.swing.JPanel pnlTopBorder;
    private javax.swing.JScrollPane scrIngredients;
    private javax.swing.JSpinner spnHour;
    private javax.swing.JSpinner spnMin;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JSpinner spnServes;
    private javax.swing.JTextArea txaSteps;
    private javax.swing.JTextField txfName;
    // End of variables declaration//GEN-END:variables
}
