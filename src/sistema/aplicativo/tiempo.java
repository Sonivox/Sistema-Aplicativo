package sistema.aplicativo;

import java.awt.Image;
import static java.lang.Double.parseDouble;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;public class tiempo extends javax.swing.JFrame {

    /**
     * Creates new form tiempo
     */
    public tiempo() {
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

        jPanel3 = new javax.swing.JPanel();
        unidadTXT = new javax.swing.JTextField();
        resultadoTXT = new javax.swing.JTextField();
        iniciarBTN2 = new javax.swing.JButton();
        segundaCB = new javax.swing.JComboBox<>();
        primeraCB = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        regresar1 = new javax.swing.JButton();
        factoresBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 128, 128));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(unidadTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 40));

        resultadoTXT.setEditable(false);
        jPanel3.add(resultadoTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 190, 40));

        iniciarBTN2.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        iniciarBTN2.setText("CONVERTIR");
        iniciarBTN2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        iniciarBTN2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarBTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarBTN2ActionPerformed(evt);
            }
        });
        jPanel3.add(iniciarBTN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 140, 40));

        segundaCB.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        segundaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEGUNDOS", "MINUTOS", "HORAS", "DIAS", "SEMANAS" }));
        jPanel3.add(segundaCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 190, 40));

        primeraCB.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        primeraCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEGUNDOS", "MINUTOS", "HORAS", "DIAS", "SEMANAS" }));
        jPanel3.add(primeraCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 190, 40));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("=");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECIONE LAS UNIDADES QUE DESEA CONVERTIR");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        regresar1.setBackground(new java.awt.Color(255, 255, 255));
        regresar1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        regresar1.setText("MENU");
        regresar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        regresar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresar1ActionPerformed(evt);
            }
        });
        jPanel3.add(regresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 100, 45));

        factoresBTN.setFont(new java.awt.Font("Cambria Math", 2, 14)); // NOI18N
        factoresBTN.setText("factores de conversion");
        factoresBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        factoresBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factoresBTNActionPerformed(evt);
            }
        });
        jPanel3.add(factoresBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarBTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarBTN2ActionPerformed
        //PARA LAS OPCIONES
        try{
        String opcion = primeraCB.getSelectedItem().toString();
        String opcion2 = segundaCB.getSelectedItem().toString();
        //PARA LOS CALCULOS
        double unidad = parseDouble(unidadTXT.getText());
        double resultado = 0;
        
        if(unidad < 0){
            unidad = unidad * -1;
        }else{
            unidad = unidad;
        }
        
        if(opcion == null ? opcion2 == null : opcion.equals(opcion2)){
            resultadoTXT.setText(String.valueOf(unidad));
        }
        
        
        //Segundos
        if("SEGUNDOS".equals(opcion) && "MINUTOS".equals(opcion2)){
            resultado = parseDouble(principal.f.SegundosMinuto(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("SEGUNDOS".equals(opcion) && "HORAS".equals(opcion2)){
            resultado = parseDouble(principal.f.SegundosHora(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("SEGUNDOS".equals(opcion) && "DIAS".equals(opcion2)){
            resultado = parseDouble(principal.f.SegundosDia(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("SEGUNDOS".equals(opcion) && "SEMANAS".equals(opcion2)){
            resultado = parseDouble(principal.f.SegundosSemana(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        
        //Minutos
        if("MINUTOS".equals(opcion) && "SEGUNDOS".equals(opcion2)){
            resultado = parseDouble(principal.f.SegundosMinuto(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("MINUTOS".equals(opcion) && "HORAS".equals(opcion2)){
            resultado = parseDouble(principal.f.MinutosHora(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("MINUTOS".equals(opcion) && "DIAS".equals(opcion2)){
            resultado = parseDouble(principal.f.MinutosDia(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("MINUTOS".equals(opcion) && "SEMANAS".equals(opcion2)){
            resultado = parseDouble(principal.f.MinutosSemana(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        
        //Horas
        if("HORAS".equals(opcion) && "SEGUNDOS".equals(opcion2)){
            resultado = parseDouble(principal.f.HoraSegundo(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("HORAS".equals(opcion) && "MINUTOS".equals(opcion2)){
            resultado = parseDouble(principal.f.HoraMinuto(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("HORAS".equals(opcion) && "DIAS".equals(opcion2)){
            resultado = parseDouble(principal.f.HoraDia(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("HORAS".equals(opcion) && "SEMANAS".equals(opcion2)){
            resultado = parseDouble(principal.f.HoraSemana(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        
        //Dia
        if("DIAS".equals(opcion) && "SEGUNDOS".equals(opcion2)){
            resultado = parseDouble(principal.f.DiaSegundo(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("DIAS".equals(opcion) && "MINUTOS".equals(opcion2)){
            resultado = parseDouble(principal.f.DiaMinuto(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("DIAS".equals(opcion) && "HORAS".equals(opcion2)){
            resultado = parseDouble(principal.f.DiaHora(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("DIA".equals(opcion) && "SEMANAS".equals(opcion2)){
            resultado = parseDouble(principal.f.DiaSemana(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        
        //Semana
        if("SEMANA".equals(opcion) && "SEGUNDOS".equals(opcion2)){
            resultado = parseDouble(principal.f.SemanaSegundo(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("SEMANA".equals(opcion) && "MINUTOS".equals(opcion2)){
            resultado = parseDouble(principal.f.SemanaMinuto(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("SEMANA".equals(opcion) && "HORAS".equals(opcion2)){
            resultado = parseDouble(principal.f.SemanaHora(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        if("SEMANA".equals(opcion) && "DIAS".equals(opcion2)){
            resultado = parseDouble(principal.f.SemanaDia(unidad));
            resultadoTXT.setText(String.valueOf(resultado).replaceAll("E", "*10^"));
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null," NO INGRESE LETRAS \n NO DEJE CAMPOS VACIOS ","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_iniciarBTN2ActionPerformed

    private void regresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_regresar1ActionPerformed

    private void factoresBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factoresBTNActionPerformed
        JOptionPane.showMessageDialog(null, " 1 min = 60 seg \n 1 hora = 60 min"
                + "\n 1 dia = 24 horas \n 1 semana = 7 dias \n no hay tiempo negativo", "FACTORES", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(tiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tiempo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton factoresBTN;
    private javax.swing.JButton iniciarBTN2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> primeraCB;
    private javax.swing.JButton regresar1;
    private javax.swing.JTextField resultadoTXT;
    private javax.swing.JComboBox<String> segundaCB;
    private javax.swing.JTextField unidadTXT;
    // End of variables declaration//GEN-END:variables
}
