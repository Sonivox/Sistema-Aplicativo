package sistema.aplicativo;

import static java.lang.Double.parseDouble;
import javax.swing.JOptionPane;
public class otro extends javax.swing.JFrame {

    /**
     * Creates new form otro
     */
    public otro() {
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
        regresar = new javax.swing.JButton();
        iniciarBTN = new javax.swing.JButton();
        factoresBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombreTXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        datoTXT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        conversionTXT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoTXT = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        unidadTXT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        unidad2TXT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 128, 128));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 0, 101, 47));

        iniciarBTN.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        iniciarBTN.setText("CONVERTIR");
        iniciarBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iniciarBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarBTNActionPerformed(evt);
            }
        });
        jPanel1.add(iniciarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 140, 40));

        factoresBTN.setFont(new java.awt.Font("Cambria Math", 2, 14)); // NOI18N
        factoresBTN.setText("informacion");
        factoresBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        factoresBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factoresBTNActionPerformed(evt);
            }
        });
        jPanel1.add(factoresBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 365, 110, 30));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NOMBRE DE LA CONVERSION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        nombreTXT.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jPanel1.add(nombreTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, 40));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DATO A CONVERTIR");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        datoTXT.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jPanel1.add(datoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 150, 40));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EQUIVALENTE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        conversionTXT.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jPanel1.add(conversionTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 150, 40));

        resultadoTXT.setEditable(false);
        resultadoTXT.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(resultadoTXT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 260, 120));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("UNIDADES");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        unidadTXT.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jPanel1.add(unidadTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 100, 40));

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("UNIDADES");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("UNIDADES");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        unidad2TXT.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jPanel1.add(unidad2TXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 100, 40));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RESULTADO ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 150, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void iniciarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarBTNActionPerformed
        try{
            String nombre = nombreTXT.getText();
            String unidad = unidadTXT.getText();
            String unidad2 = unidad2TXT.getText();
            double dato = parseDouble(datoTXT.getText());
            double dato2 = parseDouble(conversionTXT.getText());;
            String resultado = principal.f.otro(dato, dato2);
            
            resultadoTXT.setText(nombre + "\n RESULTADO: " + resultado + " " +  unidad2 + "\n " + dato + " " + unidad +
                    " CONVERTIDOS =  "  + unidad2);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null," NO INGRESE LETRAS \n NO DEJE CAMPOS VACIOS","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_iniciarBTNActionPerformed

    private void factoresBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factoresBTNActionPerformed
        JOptionPane.showMessageDialog(null, " EN EL CASO DE QUE NO ESTE LA CONVERSION QUE NECESITA"
                + "\n ESTA OPCION ESTA DISPONIBLE, SOLO TIENE QUE INGRESAR"
                + "\n EL NOMBRE DE LA UNIDAD, EL DATO A CONVERTIR"
                + "\n EL NOMBRE DE LA CONVERSION Y EL EQUIVALENTE A LA OTRA UNIDAD", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_factoresBTNActionPerformed

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
            java.util.logging.Logger.getLogger(otro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(otro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(otro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(otro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new otro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField conversionTXT;
    private javax.swing.JTextField datoTXT;
    private javax.swing.JButton factoresBTN;
    private javax.swing.JButton iniciarBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreTXT;
    private javax.swing.JButton regresar;
    private javax.swing.JTextPane resultadoTXT;
    private javax.swing.JTextField unidad2TXT;
    private javax.swing.JTextField unidadTXT;
    // End of variables declaration//GEN-END:variables
}