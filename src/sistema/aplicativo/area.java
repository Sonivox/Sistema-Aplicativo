package sistema.aplicativo;

import java.awt.Image;
import static java.lang.Double.parseDouble;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class area extends javax.swing.JFrame {
    
    public area() {
        initComponents();
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage();
        setIconImage(icon);
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
        jLabel1 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        factoresBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 128, 128));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unidadTXT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unidadTXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unidadTXTKeyTyped(evt);
            }
        });
        jPanel1.add(unidadTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 105, 208, 40));

        resultadoTXT.setEditable(false);
        resultadoTXT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(resultadoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 105, 222, 40));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 110, -1, -1));

        iniciarBTN.setBackground(new java.awt.Color(255, 255, 255));
        iniciarBTN.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        iniciarBTN.setText("CONVERTIR");
        iniciarBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iniciarBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarBTNActionPerformed(evt);
            }
        });
        jPanel1.add(iniciarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 140, 40));

        segundaCB.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        segundaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CENTIMETROS CUADRADOS", "METROS CUADRADOS", "KILOMETROS CUADRADOS", "MILLAS CUADRADAS", "HECTAREAS", "PIES CUADRADOS", "PULGADAS CUADRADAS", "YARDAS CUADRADAS" }));
        segundaCB.setToolTipText("");
        jPanel1.add(segundaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 160, -1, 50));

        primeraCB.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        primeraCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CENTIMETROS CUADRADOS", "METROS CUADRADOS", "KILOMETROS CUADRADOS", "MILLAS CUADRADAS", "HECTAREAS", "PIES CUADRADOS", "PULGADAS CUADRADAS", "YARDAS CUADRADAS" }));
        jPanel1.add(primeraCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 160, 210, 48));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECIONE LAS UNIDADES QUE DESEA CONVERTIR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 65, -1, -1));

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
        jPanel1.add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 0, 101, 47));

        factoresBTN.setFont(new java.awt.Font("Cambria Math", 2, 14)); // NOI18N
        factoresBTN.setText("factores de conversion");
        factoresBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        factoresBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factoresBTNActionPerformed(evt);
            }
        });
        jPanel1.add(factoresBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarBTNActionPerformed
        try{
        //PARA LAS OPCIONES
        String opcion = primeraCB.getSelectedItem().toString();
        String opcion2 = segundaCB.getSelectedItem().toString();
        
        //PARA LOS CALCULOS
        double unidad = parseDouble(unidadTXT.getText());
        double resultado = 0;
        if(opcion == null ? opcion2 == null : opcion.equals(opcion2)){
            resultadoTXT.setText(unidadTXT.getText());
        }
        
        //PARA CENTIMETROS
        if("CENTIMETROS CUADRADOS".equals(opcion) && "METROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.centiMetro(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("CENTIMETROS CUADRADOS".equals(opcion) && "KILOMETROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.centiKilo(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("CENTIMETROS CUADRADOS".equals(opcion) && "HECTAREAS".equals(opcion2)){
            resultado = parseDouble(principal.f.centiHecta(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("CENTIMETROS CUADRADOS".equals(opcion) && "MILLAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.centiMilla(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("CENTIMETROS CUADRADOS".equals(opcion) && "PIES CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.centiPie(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("CENTIMETROS CUADRADOS".equals(opcion) && "PULGADAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.centiPul(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("CENTIMETROS CUADRADOS".equals(opcion) && "YARDAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.centiYar(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        
        //PARA METROS
        if("METROS CUADRADOS".equals(opcion) && "CENTIMETROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.metroCen(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("METROS CUADRADOS".equals(opcion) && "KILOMETROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.metroKilo(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("METROS CUADRADOS".equals(opcion) && "MILLAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.metroMilla(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("METROS CUADRADOS".equals(opcion) && "HECTAREAS".equals(opcion2)){
            resultado = parseDouble(principal.f.metroHecta(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("METROS CUADRADOS".equals(opcion) && "PIES CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.metroPie(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("METROS CUADRADOS".equals(opcion) && "PULGADAprincipal.S CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.metroPul(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("METROS CUADRADOS".equals(opcion) && "YARDAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.metroYar(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        
        //PARA LOS KILOMETROS
        if("KILOMETROS CUADRADOS".equals(opcion) && "CENTIMETROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.kiloCenti(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("KILOMETROS CUADRADOS".equals(opcion) && "METROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.kiloMetro(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("KILOMETROS CUADRADOS".equals(opcion) && "MILLAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.kiloMilla(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("KILOMETROS CUADRADOS".equals(opcion) && "HECTAREAS".equals(opcion2)){
            resultado = parseDouble(principal.f.kiloHecta(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("KILOMETROS CUADRADOS".equals(opcion) && "PIES CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.kiloPie(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("KILOMETROS CUADRADOS".equals(opcion) && "PULGADAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.kiloPul(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("KILOMETROS CUADRADOS".equals(opcion) && "YARDAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.kiloYar(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        
        //PARA LAS MILLAS
        if("MILLAS CUADRADAS".equals(opcion) && "CENTIMETROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.millaCen(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("MILLAS CUADRADAS".equals(opcion) && "METROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.millaMet(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("MILLAS CUADRADAS".equals(opcion) && "KILOMETROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.millaKilo(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("MILLAS CUADRADAS".equals(opcion) && "HECTAREAS".equals(opcion2)){
            resultado = parseDouble(principal.f.millaHecta(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("MILLAS CUADRADAS".equals(opcion) && "PIES CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.millaPie(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("MILLAS CUADRADAS".equals(opcion) && "PULGADAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.millaPul(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("MILLAS CUADRADAS".equals(opcion) && "YARDAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.millaYar(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        
        //PARA LAS HECTAREAS
        if("HECTAREAS".equals(opcion) && "CENTIMETROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.hectaCen(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("HECTAREAS".equals(opcion) && "METROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.hectaMet(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("HECTAREAS".equals(opcion) && "KILOMETROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.hectaKilo(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("HECTAREAS".equals(opcion) && "MILLAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.hectaMilla(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("HECTAREAS".equals(opcion) && "PIES CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.hectaPie(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("HECTAREAS".equals(opcion) && "PULGADAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.hectaPul(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("HECTAREAS".equals(opcion) && "YARDAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.hectaYar(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        
        //PARA LOS PIES 
        if("PIES CUADRADOS".equals(opcion) && "CENTIMETROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.pieCen(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("PIES CUADRADOS".equals(opcion) && "METROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.pieMet(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("PIES CUADRADOS".equals(opcion) && "KILOMETROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.pieKilo(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("PIES CUADRADOS".equals(opcion) && "MILLAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.pieMilla(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("PIES CUADRADOS".equals(opcion) && "HECTAREAS".equals(opcion2)){
            resultado = parseDouble(principal.f.pieHecta(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("PIES CUADRADOS".equals(opcion) && "PULGADAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.piePul(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("PIES CUADRADOS".equals(opcion) && "YARDAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.piePul(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        
        //PARA LAS PULGADAS
        if("PULGADAS CUADRADAS".equals(opcion) && "CENTIMETROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.pulCen(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("PULGADAS CUADRADAS".equals(opcion) && "METROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.pulMet(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("PULGADAS CUADRADAS".equals(opcion) && "KILOMETROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.pulKilo(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("PULGADAS CUADRADAS".equals(opcion) && "MILLAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.pulMilla(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("PULGADAS CUADRADAS".equals(opcion) && "HECTAREAS".equals(opcion2)){
            resultado = parseDouble(principal.f.pulHecta(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("PULGADAS CUADRADAS".equals(opcion) && "PIES CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.pulPie(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("PULGADAS CUADRADAS".equals(opcion) && "YARDAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.pulYar(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        
        //PARA LAS YARDAS
        if("YARDAS CUADRADAS".equals(opcion) && "CENTIMETROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.yarCen(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("YARDAS CUADRADAS".equals(opcion) && "METROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.yarMet(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("YARDAS CUADRADAS".equals(opcion) && "KILOMETROS CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.yarKilo(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("YARDAS CUADRADAS".equals(opcion) && "MILLAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.yarMilla(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("YARDAS CUADRADAS".equals(opcion) && "HECTAREAS".equals(opcion2)){
            resultado = parseDouble(principal.f.yarHecta(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("YARDAS CUADRADAS".equals(opcion) && "PIES CUADRADOS".equals(opcion2)){
            resultado = parseDouble(principal.f.yarPie(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("YARDAS CUADRADAS".equals(opcion) && "PULGADAS CUADRADAS".equals(opcion2)){
            resultado = parseDouble(principal.f.yarPul(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null," NO INGRESE LETRAS \n NO DEJE CAMPOS VACIOS","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_iniciarBTNActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void unidadTXTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unidadTXTKeyTyped
        
    }//GEN-LAST:event_unidadTXTKeyTyped

    private void factoresBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factoresBTNActionPerformed
        JOptionPane.showMessageDialog(null, " 1 cm^2 = 0.0001m^2 \n 1 m^2 = 0.000006 km^2 \n 1 km^2 = 0.386102 milla^2"
                + "\n 1 pie^2 = 0.092903 m^2 \n 1 pulgada^2 = 0.00064516m^2 \n 1 yarda^2 = 0.836127 m^2", "FACTORES", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new area().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton factoresBTN;
    private javax.swing.JButton iniciarBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> primeraCB;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField resultadoTXT;
    private javax.swing.JComboBox<String> segundaCB;
    private javax.swing.JTextField unidadTXT;
    // End of variables declaration//GEN-END:variables
}
