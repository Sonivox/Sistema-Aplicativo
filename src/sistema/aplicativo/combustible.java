package sistema.aplicativo;

import static java.lang.Double.parseDouble;
import javax.swing.JOptionPane;
public class combustible extends javax.swing.JFrame {

    /**
     * Creates new form combustible
     */
    public combustible() {
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
        jLabel1 = new javax.swing.JLabel();
        distanciaTXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gasolinaTXT = new javax.swing.JTextField();
        factoresBTN = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        dineroTXT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        iniciarBTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoTXT = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 128, 128));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 128, 128));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DISTANCIA RECORRIDA: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        distanciaTXT.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jPanel1.add(distanciaTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 150, 40));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CALCULO DEL CONSUMO DE COMBUSTIBLE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RESULTADO =");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 180, 50));

        gasolinaTXT.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jPanel1.add(gasolinaTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 150, 40));

        factoresBTN.setFont(new java.awt.Font("Cambria Math", 2, 14)); // NOI18N
        factoresBTN.setText("informacion");
        factoresBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        factoresBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factoresBTNActionPerformed(evt);
            }
        });
        jPanel1.add(factoresBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 320, 110, 30));

        regresar.setBackground(new java.awt.Color(255, 255, 255));
        regresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        regresar.setText("MENU");
        regresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 0, 101, 47));

        dineroTXT.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jPanel1.add(dineroTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 150, 40));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GASOLINA UTILIZADA: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        iniciarBTN.setBackground(new java.awt.Color(255, 255, 255));
        iniciarBTN.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        iniciarBTN.setText("CALCULAR");
        iniciarBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iniciarBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarBTNActionPerformed(evt);
            }
        });
        jPanel1.add(iniciarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 150, 110, 40));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRECIO DE LA GASOLINA: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        resultadoTXT.setEditable(false);
        resultadoTXT.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(resultadoTXT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 150, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void factoresBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factoresBTNActionPerformed
        JOptionPane.showMessageDialog(null, " EN DISTANCIA RECORRIDA INGRESAR LOS KILOMETROS O MILLAS QUE RRECORRIO"
                + "\n EN GASOLINA ULTILZADA INGRESAR LOS GALONES O LITROS QUE USO EN RECOORER DICHA DISTANCIA"
                + "\n Y EN PRECIO DE GASOLINA INGRESAR EL PRECIO DE LA GASOLINA EN SU PAIS", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_factoresBTNActionPerformed

    private void iniciarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarBTNActionPerformed
        try{
            double distancia =  parseDouble(distanciaTXT.getText());
            double gas = parseDouble(gasolinaTXT.getText());
            double dinero;
            
            if(dineroTXT.getText().isEmpty()){
                dinero = 0;
            }else{
                dinero = parseDouble(dineroTXT.getText());
            }
            
            String conversion = "";
            String costo = "";
            
            conversion = String.valueOf(principal.f.consumo(distancia, gas));
            costo = String.valueOf(principal.f.costo(gas, dinero));
            
            resultadoTXT.setText("CONSUMO DE COMBUUSTIBLE (km/L o mi/gal) = " + conversion +
                    " \n COSTO DEL COMBUSTIBLE = " + costo);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null," NO INGRESE LETRAS \n NO DEJE CAMPOS VACIOS","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_iniciarBTNActionPerformed

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
            java.util.logging.Logger.getLogger(combustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(combustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(combustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(combustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new combustible().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dineroTXT;
    private javax.swing.JTextField distanciaTXT;
    private javax.swing.JButton factoresBTN;
    private javax.swing.JTextField gasolinaTXT;
    private javax.swing.JButton iniciarBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton regresar;
    private javax.swing.JTextPane resultadoTXT;
    // End of variables declaration//GEN-END:variables
}
