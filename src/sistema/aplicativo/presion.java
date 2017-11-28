/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.aplicativo;

import static java.lang.Double.parseDouble;

/**
 *
 * @author Ronald
 */
public class presion extends javax.swing.JFrame {
    
    factory f = new factory();
    /**
     * Creates new form presion
     */
    public presion() {
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
        unidadTXT = new javax.swing.JTextField();
        resultadoTXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        iniciarBTN = new javax.swing.JButton();
        segundaCB = new javax.swing.JComboBox<>();
        primeraCB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        regresar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(unidadTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 158, 99, 32));

        resultadoTXT.setEditable(false);
        jPanel1.add(resultadoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 158, 92, 32));

        jLabel2.setText("RESULTADO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 167, -1, -1));

        iniciarBTN.setText("Convertir");
        iniciarBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarBTNActionPerformed(evt);
            }
        });
        jPanel1.add(iniciarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 118, -1, -1));

        segundaCB.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        segundaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATMOSFERAS", "BAROS", "mmHG", "PASCALES" }));
        jPanel1.add(segundaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 63, 197, 37));

        primeraCB.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        primeraCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATMOSFERAS", "BAROS", "mmHG", "PASCALES" }));
        jPanel1.add(primeraCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 63, 189, 37));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel3.setText("A:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 64, -1, -1));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel1.setText("SELECIONE LAS UNIDADES QUE DESEA CONVERTIR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 21, -1, -1));

        regresar1.setBackground(new java.awt.Color(255, 255, 255));
        regresar1.setText("Regresar");
        regresar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresar1ActionPerformed(evt);
            }
        });
        jPanel1.add(regresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 201, 101, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarBTNActionPerformed
        //PARA LAS OPCIONES
        String opcion = primeraCB.getSelectedItem().toString();
        String opcion2 = segundaCB.getSelectedItem().toString();
        
        //PARA LOS CALCULOS
        double unidad = parseDouble(unidadTXT.getText());
        double resultado = 0;
        
        if(opcion == null ? opcion2 == null : opcion.equals(opcion2)){
            resultadoTXT.setText(unidadTXT.getText());
        }
        
        //PARA LAS ATMOSFERA 
        if("ATMOSFERAS".equals(opcion) && "mmHG".equals(opcion2)){
            resultado = parseDouble(f.AtmosferammHG(unidad));
            resultadoTXT.setText(String.valueOf(resultado));
        }
        if("ATMOSFERAS".equals(opcion) && "PASCALES".equals(opcion2)){
            resultado = parseDouble(f.AtmosferaPascales(unidad));
            resultadoTXT.setText(String.valueOf(resultado));
        }
        if("ATMOSFERAS".equals(opcion) && "BAROS".equals(opcion2)){
            resultado = parseDouble(f.AtmosferaBaros(unidad));
            resultadoTXT.setText(String.valueOf(resultado));
        }
        
        //PARA LOS BAROS
        if("BAROS".equals(opcion) && "ATMOSFERAS".equals(opcion2)){
            resultado = parseDouble(f.BarosAtmosfera(unidad));
            resultadoTXT.setText(String.valueOf(resultado));
        }
        if("BAROS".equals(opcion) && "mmHG".equals(opcion2)){
            resultado = parseDouble(f.BarosmmHG(unidad));
            resultadoTXT.setText(String.valueOf(resultado));
        }
        if("BAROS".equals(opcion) && "PASCALES".equals(opcion2)){
            resultado = parseDouble(f.BarosPascales(unidad));
            resultadoTXT.setText(String.valueOf(resultado));
        }
        
        //PARA LOS PASCALES
        if("PASCALES".equals(opcion) && "BAROS".equals(opcion2)){
            resultado = parseDouble(f.PascalesBaros(unidad));
            resultadoTXT.setText(String.valueOf(resultado));
        }
        if("PASCALES".equals(opcion) && "ATMOSFERAS".equals(opcion2)){
            resultado = parseDouble(f.PascalesAtmosfera(unidad));
            resultadoTXT.setText(String.valueOf(resultado));
        }
        if("PASCALES".equals(opcion) && "mmHG".equals(opcion2)){
            resultado = parseDouble(f.PascalesmmHG(unidad));
            resultadoTXT.setText(String.valueOf(resultado));
        }
    }//GEN-LAST:event_iniciarBTNActionPerformed

    private void regresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresar1ActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_regresar1ActionPerformed

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
            java.util.logging.Logger.getLogger(presion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(presion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(presion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(presion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new presion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iniciarBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> primeraCB;
    private javax.swing.JButton regresar1;
    private javax.swing.JTextField resultadoTXT;
    private javax.swing.JComboBox<String> segundaCB;
    private javax.swing.JTextField unidadTXT;
    // End of variables declaration//GEN-END:variables
}
