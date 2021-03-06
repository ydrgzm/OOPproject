/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbe;

import java.awt.Dimension;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author YDRGZM
 */
public class RubricPanel extends javax.swing.JPanel {

    /**
     * Creates new form RubricPanel
     */
    public RubricPanel(JFrame j, JPanel jp) {
        initComponents();
        J = j;
        Jp = jp;
        dj = J.getPreferredSize();
        setCrsCombo();
        setCloCombo();
        rubNameErr.setVisible(false);
        rubLevelErr.setVisible(false);
        visibilty(false);
        viewTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleBar2 = new keeptoo.KGradientPanel();
        close2 = new javax.swing.JLabel();
        maxi2 = new javax.swing.JLabel();
        mini2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        kGradientPanel5 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        backBtn2 = new javax.swing.JButton();
        rubCrsCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        rubTable = new javax.swing.JTable();
        rubNameBox = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        rubNameErr = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        rubLevelNameBox = new javax.swing.JTextField();
        rubLevelWeightBox = new javax.swing.JTextField();
        rubLevelOrderBox = new javax.swing.JTextField();
        levelLabel = new javax.swing.JLabel();
        submitBtn1 = new javax.swing.JButton();
        rubCloCombo = new javax.swing.JComboBox<>();
        rubLevelErr = new javax.swing.JLabel();

        titleBar2.setkEndColor(new java.awt.Color(108, 117, 125));
        titleBar2.setkStartColor(new java.awt.Color(33, 37, 41));
        titleBar2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleBar2MouseDragged(evt);
            }
        });
        titleBar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleBar2MousePressed(evt);
            }
        });

        close2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        close2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_close_window_40px_1.png"))); // NOI18N
        close2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                close2MousePressed(evt);
            }
        });

        maxi2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        maxi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_maximize_window_40px.png"))); // NOI18N
        maxi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                maxi2MousePressed(evt);
            }
        });

        mini2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        mini2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_minimize_window_40px.png"))); // NOI18N
        mini2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mini2MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rubrics");

        javax.swing.GroupLayout titleBar2Layout = new javax.swing.GroupLayout(titleBar2);
        titleBar2.setLayout(titleBar2Layout);
        titleBar2Layout.setHorizontalGroup(
            titleBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleBar2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mini2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maxi2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close2)
                .addGap(10, 10, 10))
        );
        titleBar2Layout.setVerticalGroup(
            titleBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleBar2Layout.createSequentialGroup()
                .addGroup(titleBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(titleBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(close2)
                        .addComponent(maxi2)
                        .addComponent(mini2)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        kGradientPanel3.setBackground(new java.awt.Color(218, 89, 34));
        kGradientPanel3.setkEndColor(new java.awt.Color(29, 9, 4));
        kGradientPanel3.setkStartColor(new java.awt.Color(133, 1, 0));
        kGradientPanel3.setPreferredSize(new java.awt.Dimension(868, 721));
        kGradientPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kGradientPanel3MouseDragged(evt);
            }
        });
        kGradientPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel3MousePressed(evt);
            }
        });

        kGradientPanel5.setkEndColor(new java.awt.Color(176, 42, 55));
        kGradientPanel5.setkStartColor(new java.awt.Color(253, 126, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_brick_100px.png"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Rubric Name");

        jLabel29.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Course & CLO");

        backBtn2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        backBtn2.setText("Back");
        backBtn2.setBorderPainted(false);
        backBtn2.setFocusPainted(false);
        backBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn2ActionPerformed(evt);
            }
        });

        rubCrsCombo.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        rubCrsCombo.setToolTipText("course");
        rubCrsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rubCrsComboActionPerformed(evt);
            }
        });

        rubTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr.", "Clo", "Rubric Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        rubTable.setToolTipText("");
        rubTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(rubTable);

        rubNameBox.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        rubNameBox.setToolTipText("Rubric Name");

        submitBtn.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        submitBtn.setText("Add");
        submitBtn.setBorderPainted(false);
        submitBtn.setFocusPainted(false);
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        rubNameErr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_cancel_40px.png"))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Rubric Level");

        rubLevelNameBox.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        rubLevelNameBox.setToolTipText("Level Name");

        rubLevelWeightBox.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        rubLevelWeightBox.setToolTipText("Weightage");

        rubLevelOrderBox.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        rubLevelOrderBox.setToolTipText("Order of Level");
        rubLevelOrderBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rubLevelOrderBoxActionPerformed(evt);
            }
        });

        levelLabel.setBackground(getBackground());
        levelLabel.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        levelLabel.setForeground(new java.awt.Color(255, 255, 255));
        levelLabel.setText("*");

        submitBtn1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        submitBtn1.setText("Add Level");
        submitBtn1.setBorderPainted(false);
        submitBtn1.setFocusPainted(false);
        submitBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtn1ActionPerformed(evt);
            }
        });

        rubCloCombo.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N
        rubCloCombo.setToolTipText("CLO");
        rubCloCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rubCloComboActionPerformed(evt);
            }
        });

        rubLevelErr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_cancel_40px.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel5Layout = new javax.swing.GroupLayout(kGradientPanel5);
        kGradientPanel5.setLayout(kGradientPanel5Layout);
        kGradientPanel5Layout.setHorizontalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(106, 106, 106)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addComponent(levelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(355, 355, 355))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
                .addGap(112, 112, 112))
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(backBtn2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rubNameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rubLevelErr, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel30))
                .addGap(24, 24, 24)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rubLevelNameBox)
                    .addComponent(rubCrsCombo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rubNameBox, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                        .addComponent(rubCloCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submitBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submitBtn1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                        .addComponent(rubLevelWeightBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rubLevelOrderBox, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113))
        );
        kGradientPanel5Layout.setVerticalGroup(
            kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rubCrsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(submitBtn)
                                    .addComponent(rubCloCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel5Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(submitBtn1))))
                            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rubNameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rubNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(kGradientPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rubLevelNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rubLevelWeightBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rubLevelOrderBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(kGradientPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rubLevelErr, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(levelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBtn2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(kGradientPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void close2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MousePressed
        System.gc();
        System.exit(0);
    }//GEN-LAST:event_close2MousePressed

    private void maxi2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxi2MousePressed
        // TODO add your handling code here:
        if (J.getExtendedState() != J.MAXIMIZED_BOTH) {
            J.setExtendedState(J.MAXIMIZED_BOTH);
        } else {
            J.setExtendedState(J.NORMAL);
            J.setPreferredSize(dj);
        }
    }//GEN-LAST:event_maxi2MousePressed

    private void mini2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mini2MousePressed
        // TODO add your handling code here:
        J.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_mini2MousePressed

    private void titleBar2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBar2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        J.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_titleBar2MouseDragged

    private void titleBar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBar2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_titleBar2MousePressed

    private void backBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn2ActionPerformed
        // TODO add your handling code here:
        if (checkL < 100) {
            PromptMessage pm = new PromptMessage("Please Enter the Levels Completely!", J, Jp);
            pm.setVisible(true);
        } else {
            gotoP(Jp);
        }
    }//GEN-LAST:event_backBtn2ActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        if (rubCrsCombo.getSelectedItem() != null) {
            String[] arr = rubCrsCombo.getSelectedItem().toString().split("\\s");
            cloIndex = RBE.getInstance().searchCloByCloNameInt(rubCloCombo.getSelectedItem().toString());
            crsIndex = RBE.getInstance().searchCrsByCrsCode(arr[0]);

            backBtn2.setEnabled(false);
            submitBtn.setEnabled(false);
            Rubric r = new Rubric();
            if (Validator.getInstance().isValidStr(rubNameBox.getText())) {
                rubNameErr.setVisible(false);
            } else {
                rubNameErr.setVisible(true);
            }

            r.setRubName(rubNameBox.getText());

            RBE.getInstance().getCrsList().get(crsIndex).getCloList().get(cloIndex).addRubric(r);
            viewTable();
            visibilty(true);
            editAble(false);
            levelLabel.setText("Please add a Level of 100% weightage or create levels of weightage less than 100");
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void kGradientPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel3MouseDragged
        // TODO add your handling code here:
        if (J.getExtendedState() != J.MAXIMIZED_BOTH) {
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();

            J.setLocation(x - xMouse, y - yMouse);
        }
    }//GEN-LAST:event_kGradientPanel3MouseDragged

    private void kGradientPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel3MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_kGradientPanel3MousePressed

    private void submitBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtn1ActionPerformed
        // TODO add your handling code here:
        rubricIndex = -2;
        for (int i = 0; i < RBE.getInstance().getCrsList().get(crsIndex).getCloList().get(cloIndex).getRubricList().size(); i++) {
            if (RBE.getInstance().getCrsList().get(crsIndex).getCloList().get(cloIndex).getRubricList().get(i).getRubName().equals(rubNameBox.getText())) {
                rubricIndex = i;
            }
        }
        String lname = rubLevelNameBox.getText();
        String lorder = rubLevelOrderBox.getText();
        String lper = rubLevelWeightBox.getText();
        System.out.println(RBE.getInstance().getCrsList().get(crsIndex).getCloList().get(cloIndex).getRubricList().size());
        System.out.println("Rubr "+rubricIndex);
        checkL = RBE.getInstance().getCrsList().get(crsIndex).getCloList().get(cloIndex).getRubricList().get(rubricIndex).isMoreLevelReq();
        if (checkL < 100) {
            levelLabel.setText("Please add a Level of " + (100 - checkL) + "% weightage or create levels of weightage less than " + (100 - checkL));
            if (Validator.getInstance().isValidStr(lname)) {
                rubLevelErr.setVisible(false);
            } else {
                rubLevelErr.setVisible(true);
            }
            if (Validator.getInstance().isValidNumber(lorder)) {
                rubLevelErr.setVisible(false);
            } else {
                rubLevelErr.setVisible(true);
            }
            if (Validator.getInstance().isValidNumber(lper)) {
                rubLevelErr.setVisible(false);
            } else {
                rubLevelErr.setVisible(true);
            }
            RubricLevel rl = new RubricLevel();
            rl.setLevelName(lname);
            rl.setPercentage(Integer.valueOf(lper));
            rl.setOrder(Integer.valueOf(lorder));
            RBE.getInstance().getCrsList().get(crsIndex).getCloList().get(cloIndex).getRubricList().get(rubricIndex).addRubricLevel(rl);
            viewTable();
        }
    }//GEN-LAST:event_submitBtn1ActionPerformed

    private void rubCrsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rubCrsComboActionPerformed
        // TODO add your handling code here:
        setCloCombo();
    }//GEN-LAST:event_rubCrsComboActionPerformed

    private void rubCloComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rubCloComboActionPerformed
        // TODO add your handling code here:
        viewTable();
    }//GEN-LAST:event_rubCloComboActionPerformed

    private void rubLevelOrderBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rubLevelOrderBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rubLevelOrderBoxActionPerformed

    public void setCrsCombo() {
        List<Course> l = RBE.getInstance().getCrsList();
        String[] arr = new String[l.size()];
        for (int i = 0; i < l.size(); i++) {
            arr[i] = l.get(i).getCrsCode() + " " + l.get(i).getCrsName();
        }
        rubCrsCombo.setModel(new DefaultComboBoxModel(arr));
    }

    public void setCloCombo() {
        if (rubCrsCombo.getSelectedItem() != null) {
            String[] c = rubCrsCombo.getSelectedItem().toString().split("\\s");
            List<CLOs> l = RBE.getInstance().searchCloByCrs(c[0]);
            String[] arr = new String[l.size()];
            for (int i = 0; i < l.size(); i++) {
                arr[i] = l.get(i).getCloName();
            }
            rubCloCombo.setModel(new DefaultComboBoxModel(arr));
        }
    }

    public void viewTable() {
        tbMod = (DefaultTableModel) rubTable.getModel();
        tbMod.setRowCount(0);
        if (rubCrsCombo.getSelectedItem() != null) {
            String[] c = rubCrsCombo.getSelectedItem().toString().split("\\s");
            String clo = rubCloCombo.getSelectedItem().toString();
            crsIndex = RBE.getInstance().searchCrsByCrsCode(c[0]);
            CLOs cObj = RBE.getInstance().searchCloByCloNameStr(clo);
            List<Rubric> rl = cObj.getRubricList();
            int ind = 0;
            for (int i = 0; i < rl.size(); i++) {
                List<RubricLevel> rbl = rl.get(i).getRubList();
                String[] cloArr = new String[3 + rbl.size()];
                cloArr[0] = i + 1 + "";
                cloArr[1] = clo;
                cloArr[2] = rl.get(i).getRubName();
                ind = 3;
                for (int j = 0; j < rbl.size(); j++) {

                    cloArr[ind] = rbl.get(j).getLevelName();
                    tbMod.addColumn("Level " + (j + 1));
                    ind++;
                }

                tbMod.addRow(cloArr);
            }
        }
    }

    public void editAble(boolean flag) {
        rubCloCombo.setEditable(flag);
        rubCrsCombo.setEditable(flag);
        rubNameBox.setEditable(flag);
        submitBtn.setEnabled(flag);
    }

    public void visibilty(boolean flag) {
        submitBtn1.setVisible(flag);
        jLabel30.setVisible(flag);
        rubLevelNameBox.setVisible(flag);
        rubLevelOrderBox.setVisible(flag);
        rubLevelWeightBox.setVisible(flag);
    }

    public void gotoP(JPanel mp) {
        J.setContentPane(mp);
        J.revalidate();
        J.repaint();
    }
    int xMouse;
    int yMouse;

    JFrame J;
    JPanel Jp;
    Dimension dj;
    DefaultTableModel tbMod;
    int crsIndex;
    int cloIndex;
    int rubricIndex;
    int checkL = 100;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn2;
    private javax.swing.JLabel close2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel5;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JLabel maxi2;
    private javax.swing.JLabel mini2;
    private javax.swing.JComboBox<String> rubCloCombo;
    private javax.swing.JComboBox<String> rubCrsCombo;
    private javax.swing.JLabel rubLevelErr;
    private javax.swing.JTextField rubLevelNameBox;
    private javax.swing.JTextField rubLevelOrderBox;
    private javax.swing.JTextField rubLevelWeightBox;
    private javax.swing.JTextField rubNameBox;
    private javax.swing.JLabel rubNameErr;
    private javax.swing.JTable rubTable;
    private javax.swing.JButton submitBtn;
    private javax.swing.JButton submitBtn1;
    private keeptoo.KGradientPanel titleBar2;
    // End of variables declaration//GEN-END:variables

}
