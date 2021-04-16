package rbe;

import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;

/**
 *
 * @author YDRGZM
 */
public class CreateAccount extends javax.swing.JPanel {

    /**
     * Creates new form CreateAccount
     */
    public CreateAccount(JFrame j,JPanel jp ,String type) {
        initComponents();
        J = j;
        Jp=jp;
        userType = type;
        hideErrIcon();
        if (userType.equals("Teacher")) {
            jLabel7.setVisible(false);
            creatDOBChoose.setVisible(false);
        } else {
            jLabel7.setVisible(true);
            creatDOBChoose.setVisible(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleBar = new keeptoo.KGradientPanel();
        close = new javax.swing.JLabel();
        maxi = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        createNameBox = new javax.swing.JTextField();
        createShowPas = new javax.swing.JCheckBox();
        signUpBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        createFNameBox = new javax.swing.JTextField();
        createEmailBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        createContBox = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        createPassBox = new javax.swing.JPasswordField();
        creatNameErr = new javax.swing.JLabel();
        creatFNameErr = new javax.swing.JLabel();
        creatEmailErr = new javax.swing.JLabel();
        creatContPErr = new javax.swing.JLabel();
        creatPassErr = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        creatDOBChoose = new com.toedter.calendar.JDateChooser();
        creatDobErr = new javax.swing.JLabel();

        titleBar.setkEndColor(new java.awt.Color(108, 117, 125));
        titleBar.setkStartColor(new java.awt.Color(33, 37, 41));
        titleBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleBarMouseDragged(evt);
            }
        });
        titleBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleBarMousePressed(evt);
            }
        });

        close.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_close_window_40px_1.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeMousePressed(evt);
            }
        });

        maxi.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        maxi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_maximize_window_40px.png"))); // NOI18N
        maxi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                maxiMousePressed(evt);
            }
        });

        mini.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_minimize_window_40px.png"))); // NOI18N
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                miniMousePressed(evt);
            }
        });

        kGradientPanel1.setBackground(new java.awt.Color(218, 89, 34));
        kGradientPanel1.setkEndColor(new java.awt.Color(29, 9, 4));
        kGradientPanel1.setkStartColor(new java.awt.Color(133, 1, 0));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(886, 730));

        kGradientPanel2.setkEndColor(new java.awt.Color(176, 42, 55));
        kGradientPanel2.setkStartColor(new java.awt.Color(253, 126, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_add_user_male_100px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        createNameBox.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N

        createShowPas.setBackground(new java.awt.Color(218, 89, 34));
        createShowPas.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        createShowPas.setForeground(new java.awt.Color(255, 255, 255));
        createShowPas.setText("Show Password");
        createShowPas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createShowPasActionPerformed(evt);
            }
        });

        signUpBtn.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        signUpBtn.setText("SignUp");
        signUpBtn.setBorderPainted(false);
        signUpBtn.setFocusPainted(false);
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Father's Name");

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");

        createFNameBox.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N

        createEmailBox.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contact Phone");

        createContBox.setFont(new java.awt.Font("Palatino Linotype", 1, 16)); // NOI18N

        backBtn.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        backBtn.setText("Back");
        backBtn.setBorderPainted(false);
        backBtn.setFocusPainted(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        creatNameErr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_cancel_40px.png"))); // NOI18N

        creatFNameErr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_cancel_40px.png"))); // NOI18N

        creatEmailErr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_cancel_40px.png"))); // NOI18N

        creatContPErr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_cancel_40px.png"))); // NOI18N

        creatPassErr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_cancel_40px.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date of Birth");

        creatDobErr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rbe/img/icons8_cancel_40px.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(77, 77, 77))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(77, 77, 77))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addGap(45, 45, 45)))
                .addGap(0, 0, 0)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(creatDOBChoose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createPassBox)
                    .addComponent(createNameBox)
                    .addComponent(createFNameBox)
                    .addComponent(createEmailBox)
                    .addComponent(createContBox)
                    .addComponent(createShowPas, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(creatNameErr)
                    .addComponent(creatFNameErr)
                    .addComponent(creatEmailErr)
                    .addComponent(creatContPErr)
                    .addComponent(creatPassErr)
                    .addComponent(creatDobErr))
                .addGap(165, 165, 165))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signUpBtn)
                .addGap(86, 86, 86))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(createNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(creatNameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(createFNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(creatFNameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(createEmailBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(creatEmailErr, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(createContBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(creatContPErr, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(createPassBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createShowPas))
                            .addComponent(creatPassErr, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(creatDobErr, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(creatDOBChoose, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                        .addGap(116, 116, 116)))
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpBtn)
                    .addComponent(backBtn))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout titleBarLayout = new javax.swing.GroupLayout(titleBar);
        titleBar.setLayout(titleBarLayout);
        titleBarLayout.setHorizontalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleBarLayout.createSequentialGroup()
                .addGroup(titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titleBarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mini)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close))
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        titleBarLayout.setVerticalGroup(
            titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(titleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mini)
                        .addComponent(maxi, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(close))
                .addGap(0, 0, 0)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void titleBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_titleBarMousePressed

    private void titleBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        J.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_titleBarMouseDragged

    private void miniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMousePressed
        // TODO add your handling code here:
        J.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_miniMousePressed

    private void maxiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxiMousePressed
        // TODO add your handling code here:

        if (J.getExtendedState() != J.MAXIMIZED_BOTH) {
            J.setExtendedState(J.MAXIMIZED_BOTH);
        } else {
            J.setExtendedState(J.NORMAL);
        }
    }//GEN-LAST:event_maxiMousePressed

    private void closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMousePressed
        System.gc();
        System.exit(0);
    }//GEN-LAST:event_closeMousePressed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        gotoP(new SignInPanel(J));

    }//GEN-LAST:event_backBtnActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        // TODO add your handling code here:
        String name = createNameBox.getText();
        String fname = createFNameBox.getText();
        String email = createEmailBox.getText();
        String contPhone = createContBox.getText();
        String pass = new String(createPassBox.getPassword());
        Date date = creatDOBChoose.getDate();
        int count = 0;
        if (Validator.getInstance().isValidStr(name)) {
            creatNameErr.setVisible(false);
            count++;
        } else {
            creatNameErr.setVisible(true);
        }
        if (Validator.getInstance().isValidStr(fname)) {
            creatFNameErr.setVisible(false);
            count++;
        } else {
            creatFNameErr.setVisible(true);
        }
        if (Validator.getInstance().isValidEmail(email)) {
            creatEmailErr.setVisible(false);
            count++;
        } else {
            creatEmailErr.setVisible(true);
        }
        if (Validator.getInstance().isValidContPhone(contPhone)) {
            creatContPErr.setVisible(false);
            count++;
        } else {
            creatContPErr.setVisible(true);
        }
        if (Validator.getInstance().isValidStr(pass)) {
            creatPassErr.setVisible(false);
            count++;
        } else {
            creatPassErr.setVisible(true);
        }
        if (userType.equals("Student")) {
            if (date == null) {
                creatDobErr.setVisible(true);
            } else {
                count++;
                creatDobErr.setVisible(false);
            }
        }
        if (userType.equals("Teacher")) {
            if (count == 5) {
                Teacher t = new Teacher();
                t.setName(name);
                t.setFatherName(fname);
                t.setContPhone(contPhone);
                t.setEmail(email);
                t.setPassword(pass);
                RBE.getInstance().addtoList(t);
                PromptMessage pt = new PromptMessage("Successfull! Account has been created", J, Jp);
                pt.setVisible(true);
            }
        } else if (userType.equals("Student")) {
            if (count == 6) {
                Student st = new Student();
                st.setName(name);
                st.setFatherName(fname);
                st.setDob(date);
                st.setRegNo(contPhone);
                st.setPassword(pass);
                st.setEmail(email);
                RBE.getInstance().addtoList(st);
                PromptMessage pt = new PromptMessage("Successfull! Account has been created", J, Jp);
                pt.setVisible(true);

            }
        }
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void createShowPasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createShowPasActionPerformed
        // TODO add your handling code here:
        if (createShowPas.isSelected()) {
            createPassBox.setEchoChar((char) 0);
        } else {
            createPassBox.setEchoChar('*');
        }
    }//GEN-LAST:event_createShowPasActionPerformed

    private void hideErrIcon() {
        creatContPErr.setVisible(false);
        creatEmailErr.setVisible(false);
        creatFNameErr.setVisible(false);
        creatNameErr.setVisible(false);
        creatPassErr.setVisible(false);
        creatDobErr.setVisible(false);
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
    String userType;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel close;
    private javax.swing.JLabel creatContPErr;
    private com.toedter.calendar.JDateChooser creatDOBChoose;
    private javax.swing.JLabel creatDobErr;
    private javax.swing.JLabel creatEmailErr;
    private javax.swing.JLabel creatFNameErr;
    private javax.swing.JLabel creatNameErr;
    private javax.swing.JLabel creatPassErr;
    private javax.swing.JTextField createContBox;
    private javax.swing.JTextField createEmailBox;
    private javax.swing.JTextField createFNameBox;
    private javax.swing.JTextField createNameBox;
    private javax.swing.JPasswordField createPassBox;
    private javax.swing.JCheckBox createShowPas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel maxi;
    private javax.swing.JLabel mini;
    private javax.swing.JButton signUpBtn;
    private keeptoo.KGradientPanel titleBar;
    // End of variables declaration//GEN-END:variables
}