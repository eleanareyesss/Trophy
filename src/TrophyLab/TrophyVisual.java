package TrophyLab;
import TrophyLab.Trophy;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author elean
 */
public class TrophyVisual extends javax.swing.JFrame {

    public static PSNUsers psn=new PSNUsers();
    UIManager UI;
    public TrophyVisual() {
        initComponents();
        Principal.setVisible(true);
        AddUser.setVisible(false);
        DeactivateUser.setVisible(false);
        AddTrophy.setVisible(false);
        PlayerInfo.setVisible(false);
        
        jComboBox1.removeAllItems();
        for (Trophy trophy : Trophy.values()) {
            jComboBox1.addItem(trophy);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PlayerInfo = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Fondo4 = new javax.swing.JLabel();
        AddTrophy = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Fondo3 = new javax.swing.JLabel();
        DeactivateUser = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Fondo2 = new javax.swing.JLabel();
        AddUser = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Principal = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PlayerInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        PlayerInfo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 160, 70));

        jScrollPane1.setBackground(new java.awt.Color(213, 180, 180));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(213, 180, 180));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(134, 112, 112));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        PlayerInfo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 400, 270));

        jTextField6.setBackground(new java.awt.Color(213, 180, 180));
        jTextField6.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(134, 112, 112));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(null);
        jTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PlayerInfo.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 260, 60));

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        PlayerInfo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 100, 100));

        Fondo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PlayerInfo.png"))); // NOI18N
        PlayerInfo.add(Fondo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 520));

        jPanel1.add(PlayerInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 520));

        AddTrophy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        AddTrophy.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 160, 70));

        jComboBox1.setBackground(new java.awt.Color(213, 180, 180));
        jComboBox1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(134, 112, 112));
        jComboBox1.setBorder(null);
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddTrophy.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 240, 60));

        jTextField5.setBackground(new java.awt.Color(213, 180, 180));
        jTextField5.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(134, 112, 112));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(null);
        jTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        AddTrophy.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 260, 60));

        jTextField4.setBackground(new java.awt.Color(213, 180, 180));
        jTextField4.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(134, 112, 112));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(null);
        jTextField4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        AddTrophy.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 260, 60));

        jTextField3.setBackground(new java.awt.Color(213, 180, 180));
        jTextField3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(134, 112, 112));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(null);
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        AddTrophy.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 260, 60));

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        AddTrophy.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 100, 100));

        Fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AddTrophy.png"))); // NOI18N
        AddTrophy.add(Fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 520));

        jPanel1.add(AddTrophy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 520));

        DeactivateUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        DeactivateUser.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 160, 70));

        jTextField2.setBackground(new java.awt.Color(213, 180, 180));
        jTextField2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(134, 112, 112));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        DeactivateUser.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 550, 60));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        DeactivateUser.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 100, 100));

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DesactivarUser.png"))); // NOI18N
        DeactivateUser.add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 520));

        jPanel1.add(DeactivateUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 520));

        AddUser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        AddUser.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 160, 70));

        jTextField1.setBackground(new java.awt.Color(213, 180, 180));
        jTextField1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(134, 112, 112));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(null);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        AddUser.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 550, 60));

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        AddUser.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 100, 100));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AddUser.png"))); // NOI18N
        AddUser.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 520));

        jPanel1.add(AddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 520));

        Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        Principal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 180, 180));

        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        Principal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 180, 180));

        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        Principal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 180, 180));

        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        Principal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 180, 180));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Principal.png"))); // NOI18N
        Principal.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 520));

        jPanel1.add(Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Principal.setVisible(true);
        AddUser.setVisible(false);
        jTextField1.setText("");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Principal.setVisible(true);
        DeactivateUser.setVisible(false);
        jTextField2.setText("");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Principal.setVisible(true);
        AddTrophy.setVisible(false);
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Principal.setVisible(true);
        PlayerInfo.setVisible(false);
        jTextField6.setText("");
        jTextArea1.setText("");
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Principal.setVisible(false);
        AddUser.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Principal.setVisible(false);
        DeactivateUser.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        Principal.setVisible(false);
        AddTrophy.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        Principal.setVisible(false);
        PlayerInfo.setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        String username=jTextField1.getText();
        if (username.isBlank() || username.isEmpty()) {
            UI = null;
            UI.put("OptionPane.background", new Color(119, 67, 173));
            UI.put("Panel.background", new Color(119, 67, 173));
            UI.put("OptionPane.messageForeground", new Color(18, 2, 43));
            UI.put("Button.background", new Color(18, 2, 43));
            UI.put("Button.foreground", new Color(255, 255, 255));
            UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
            UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
            JOptionPane.showMessageDialog(null, "¡COMPLETE EL CAMPO DE USERNAME!", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            boolean siguiente=psn.addUser(username);
        } catch (IOException ex) {
            Logger.getLogger(TrophyVisual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        String username=jTextField2.getText();
        if (username.isBlank() || username.isEmpty()) {
            UI = null;
            UI.put("OptionPane.background", new Color(119, 67, 173));
            UI.put("Panel.background", new Color(119, 67, 173));
            UI.put("OptionPane.messageForeground", new Color(18, 2, 43));
            UI.put("Button.background", new Color(18, 2, 43));
            UI.put("Button.foreground", new Color(255, 255, 255));
            UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
            UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
            JOptionPane.showMessageDialog(null, "¡COMPLETE EL CAMPO DE USERNAME!", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            boolean siguiente=psn.deactivateUser(username);
        } catch (IOException ex) {
            Logger.getLogger(TrophyVisual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        String username =jTextField3.getText();
        Trophy tipoTrofeo=(Trophy) jComboBox1.getSelectedItem();
        String trophyGame=jTextField4.getText();
        String trophyName=jTextField5.getText();
        
        if (username.isBlank() || username.isEmpty()) {
            UI = null;
            UI.put("OptionPane.background", new Color(119, 67, 173));
            UI.put("Panel.background", new Color(119, 67, 173));
            UI.put("OptionPane.messageForeground", new Color(18, 2, 43));
            UI.put("Button.background", new Color(18, 2, 43));
            UI.put("Button.foreground", new Color(255, 255, 255));
            UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
            UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
            JOptionPane.showMessageDialog(null, "¡COMPLETE EL CAMPO DE USERNAME!", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (trophyGame.isBlank() || trophyGame.isEmpty()) {
            UI = null;
            UI.put("OptionPane.background", new Color(119, 67, 173));
            UI.put("Panel.background", new Color(119, 67, 173));
            UI.put("OptionPane.messageForeground", new Color(18, 2, 43));
            UI.put("Button.background", new Color(18, 2, 43));
            UI.put("Button.foreground", new Color(255, 255, 255));
            UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
            UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
            JOptionPane.showMessageDialog(null, "¡COMPLETE EL CAMPO DE TROPHY GAME!", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (trophyName.isBlank() || trophyName.isEmpty()) {
            UI = null;
            UI.put("OptionPane.background", new Color(119, 67, 173));
            UI.put("Panel.background", new Color(119, 67, 173));
            UI.put("OptionPane.messageForeground", new Color(18, 2, 43));
            UI.put("Button.background", new Color(18, 2, 43));
            UI.put("Button.foreground", new Color(255, 255, 255));
            UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
            UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
            JOptionPane.showMessageDialog(null, "¡COMPLETE EL CAMPO DE TROPHY NAME!", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            boolean siguiente=psn.addTrophieTo(username, trophyGame, trophyName, tipoTrofeo);
        } catch (IOException ex) {
            Logger.getLogger(TrophyVisual.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        String username =jTextField6.getText();

        if (username.isBlank() || username.isEmpty()) {
            UI = null;
            UI.put("OptionPane.background", new Color(119, 67, 173));
            UI.put("Panel.background", new Color(119, 67, 173));
            UI.put("OptionPane.messageForeground", new Color(18, 2, 43));
            UI.put("Button.background", new Color(18, 2, 43));
            UI.put("Button.foreground", new Color(255, 255, 255));
            UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
            UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
            JOptionPane.showMessageDialog(null, "¡COMPLETE EL CAMPO DE USERNAME!", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
            return;
        } 

        jTextArea1.setText(psn.playerinfo(username));
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(TrophyVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrophyVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrophyVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrophyVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrophyVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddTrophy;
    private javax.swing.JPanel AddUser;
    private javax.swing.JPanel DeactivateUser;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JLabel Fondo3;
    private javax.swing.JLabel Fondo4;
    private javax.swing.JPanel PlayerInfo;
    private javax.swing.JPanel Principal;
    private javax.swing.JComboBox<Trophy> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
