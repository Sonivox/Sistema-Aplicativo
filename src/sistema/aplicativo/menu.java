package sistema.aplicativo;
/**
 *
 * @author Roberto
 */
public class menu extends javax.swing.JFrame {
    public menu() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        areaBTN = new javax.swing.JButton();
        energiaBTN = new javax.swing.JButton();
        longitudBTN = new javax.swing.JButton();
        masaBTN = new javax.swing.JButton();
        presionBTN = new javax.swing.JButton();
        tempeBTN = new javax.swing.JButton();
        tiempoBTN = new javax.swing.JButton();
        velocidadBTN = new javax.swing.JButton();
        volumenBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cerrarLB = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaBTN.setBackground(new java.awt.Color(27, 90, 119));
        areaBTN.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        areaBTN.setForeground(new java.awt.Color(255, 255, 255));
        areaBTN.setText("AREA");
        areaBTN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        areaBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        areaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaBTNActionPerformed(evt);
            }
        });
        jPanel1.add(areaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 160, 40));

<<<<<<< HEAD
=======
        fuerzaBTN.setBackground(new java.awt.Color(27, 90, 119));
        fuerzaBTN.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        fuerzaBTN.setForeground(new java.awt.Color(255, 255, 255));
        fuerzaBTN.setText("FUERZA");
        fuerzaBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        fuerzaBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fuerzaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuerzaBTNActionPerformed(evt);
            }
        });
        jPanel1.add(fuerzaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 160, 45));

>>>>>>> 881fa75e94d901cc7d635d57d3f093e31bba0d4e
        energiaBTN.setBackground(new java.awt.Color(27, 90, 119));
        energiaBTN.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        energiaBTN.setForeground(new java.awt.Color(255, 255, 255));
        energiaBTN.setText("ENERGIA");
        energiaBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        energiaBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        energiaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                energiaBTNActionPerformed(evt);
            }
        });
        jPanel1.add(energiaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 160, 45));

        longitudBTN.setBackground(new java.awt.Color(27, 90, 119));
        longitudBTN.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        longitudBTN.setForeground(new java.awt.Color(255, 255, 255));
        longitudBTN.setText("LONGITUD");
        longitudBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        longitudBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        longitudBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                longitudBTNActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        jPanel1.add(longitudBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 160, 45));
=======
        jPanel1.add(longitudBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 160, 45));
>>>>>>> 881fa75e94d901cc7d635d57d3f093e31bba0d4e

        masaBTN.setBackground(new java.awt.Color(27, 90, 119));
        masaBTN.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        masaBTN.setForeground(new java.awt.Color(255, 255, 255));
        masaBTN.setText("MASA");
        masaBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        masaBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        masaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masaBTNActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        jPanel1.add(masaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 160, 45));
=======
        jPanel1.add(masaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 160, 45));
>>>>>>> 881fa75e94d901cc7d635d57d3f093e31bba0d4e

        presionBTN.setBackground(new java.awt.Color(27, 90, 119));
        presionBTN.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        presionBTN.setForeground(new java.awt.Color(255, 255, 255));
        presionBTN.setText("PRESION");
        presionBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        presionBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        presionBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presionBTNActionPerformed(evt);
            }
        });
        jPanel1.add(presionBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 160, 45));

        tempeBTN.setBackground(new java.awt.Color(27, 90, 119));
        tempeBTN.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        tempeBTN.setForeground(new java.awt.Color(255, 255, 255));
        tempeBTN.setText("TEMPERATURA");
        tempeBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        tempeBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tempeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempeBTNActionPerformed(evt);
            }
        });
        jPanel1.add(tempeBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 160, 45));

        tiempoBTN.setBackground(new java.awt.Color(27, 90, 119));
        tiempoBTN.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        tiempoBTN.setForeground(new java.awt.Color(255, 255, 255));
        tiempoBTN.setText("TIEMPO");
        tiempoBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        tiempoBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tiempoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoBTNActionPerformed(evt);
            }
        });
        jPanel1.add(tiempoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 160, 45));

        velocidadBTN.setBackground(new java.awt.Color(27, 90, 119));
        velocidadBTN.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        velocidadBTN.setForeground(new java.awt.Color(255, 255, 255));
        velocidadBTN.setText("VELOCIDAD");
        velocidadBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        velocidadBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        velocidadBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                velocidadBTNActionPerformed(evt);
            }
        });
        jPanel1.add(velocidadBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 160, 45));

        volumenBTN.setBackground(new java.awt.Color(27, 90, 119));
        volumenBTN.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        volumenBTN.setForeground(new java.awt.Color(255, 255, 255));
        volumenBTN.setText("VOLUMEN");
        volumenBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        volumenBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        volumenBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volumenBTNActionPerformed(evt);
            }
        });
        jPanel1.add(volumenBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 160, 45));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECIONE LAS UNIDADES ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("QUE DESEA CONVERTIR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        cerrarLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar X.png"))); // NOI18N
        cerrarLB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarLBMouseClicked(evt);
            }
        });
        jPanel1.add(cerrarLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 30, -1));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaBTNActionPerformed
        area a = new area();
        a.setVisible(true);
    }//GEN-LAST:event_areaBTNActionPerformed

    private void presionBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presionBTNActionPerformed
        presion p = new presion();
        p.setVisible(true);
    }//GEN-LAST:event_presionBTNActionPerformed

    private void energiaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_energiaBTNActionPerformed
        energia e = new energia();
        e.setVisible(true);
    }//GEN-LAST:event_energiaBTNActionPerformed

    private void tempeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempeBTNActionPerformed
        temperatura t =new temperatura();
        t.setVisible(true);
    }//GEN-LAST:event_tempeBTNActionPerformed

    private void tiempoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoBTNActionPerformed
        tiempo ti = new tiempo();
        ti.setVisible(true);
    }//GEN-LAST:event_tiempoBTNActionPerformed

    private void longitudBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_longitudBTNActionPerformed
        longitud l = new longitud();
        l.setVisible(true);
    }//GEN-LAST:event_longitudBTNActionPerformed

    private void velocidadBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_velocidadBTNActionPerformed
        velocidad v = new velocidad();
        v.setVisible(true);
    }//GEN-LAST:event_velocidadBTNActionPerformed

    private void masaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masaBTNActionPerformed
        masa m = new masa();
        m.setVisible(true);
    }//GEN-LAST:event_masaBTNActionPerformed

    private void volumenBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumenBTNActionPerformed
        volumen vo = new volumen();
        vo.setVisible(true);
    }//GEN-LAST:event_volumenBTNActionPerformed

    private void cerrarLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarLBMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarLBMouseClicked

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton areaBTN;
    private javax.swing.JLabel cerrarLB;
    private javax.swing.JButton energiaBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton longitudBTN;
    private javax.swing.JButton masaBTN;
    private javax.swing.JButton presionBTN;
    private javax.swing.JButton tempeBTN;
    private javax.swing.JButton tiempoBTN;
    private javax.swing.JButton velocidadBTN;
    private javax.swing.JButton volumenBTN;
    // End of variables declaration//GEN-END:variables


}
