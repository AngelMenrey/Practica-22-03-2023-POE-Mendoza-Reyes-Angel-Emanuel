public class frmFormulario extends javax.swing.JFrame {

    public frmFormulario(String usr) {
        initComponents();
        setLocationRelativeTo(null);
        USUARIO.setText(usr);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        USUARIO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FEDERAL = new javax.swing.JRadioButton();
        ESTATAL = new javax.swing.JRadioButton();
        INSTITUCIONAL = new javax.swing.JRadioButton();
        BIBLIOGRAFIA = new javax.swing.JCheckBox();
        MATERIAL = new javax.swing.JCheckBox();
        TRANSPORTE = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        TEXTAREA = new javax.swing.JTextArea();
        MENSAJE = new javax.swing.JLabel();
        REGISTRAR = new javax.swing.JButton();
        REGRESAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("FORMULARIO DE INGRESO");

        jLabel2.setText("USUARIO");

        jLabel3.setText("TIPO BECA");

        jLabel4.setText("BECA UTILIZADA PARA");

        buttonGroup1.add(FEDERAL);
        FEDERAL.setText("FEDERAL");
        FEDERAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEDERALActionPerformed(evt);
            }
        });

        buttonGroup1.add(ESTATAL);
        ESTATAL.setText("ESTATAL");

        buttonGroup1.add(INSTITUCIONAL);
        INSTITUCIONAL.setText("INSTITUCIONAL");

        BIBLIOGRAFIA.setText("BIOGRAFIA");
        BIBLIOGRAFIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIBLIOGRAFIAActionPerformed(evt);
            }
        });

        MATERIAL.setText("MATERIAL");
        MATERIAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MATERIALActionPerformed(evt);
            }
        });

        TRANSPORTE.setText("TRANSPORTE");

        TEXTAREA.setColumns(20);
        TEXTAREA.setRows(5);
        jScrollPane1.setViewportView(TEXTAREA);

        MENSAJE.setText("MENSAJE");

        REGISTRAR.setText("REGISTRAR");
        REGISTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRARActionPerformed(evt);
            }
        });

        REGRESAR.setText("REGRESAR");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(78, 78, 78)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(FEDERAL)
                                            .addComponent(ESTATAL)
                                            .addComponent(INSTITUCIONAL))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TRANSPORTE)
                                            .addComponent(MATERIAL)
                                            .addComponent(BIBLIOGRAFIA))
                                        .addGap(52, 52, 52)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(REGISTRAR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(REGRESAR))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(MENSAJE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FEDERAL)
                    .addComponent(BIBLIOGRAFIA))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ESTATAL)
                    .addComponent(MATERIAL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INSTITUCIONAL)
                    .addComponent(TRANSPORTE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MENSAJE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REGISTRAR)
                    .addComponent(REGRESAR))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FEDERALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FEDERALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FEDERALActionPerformed

    private void BIBLIOGRAFIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIBLIOGRAFIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BIBLIOGRAFIAActionPerformed

    private void MATERIALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MATERIALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MATERIALActionPerformed

    private void REGISTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRARActionPerformed
      if(FEDERAL.isSelected()){
                    MENSAJE.setText("beca: Federal. ");
                } else if (ESTATAL.isSelected()) {
                    MENSAJE.setText("beca: Estatal.");
                } else if (INSTITUCIONAL.isSelected()) {
                    MENSAJE.setText("beca: Institucional.");
                }else {
                    MENSAJE.setText("Ninguna beca seleccionada");
                }
                MENSAJE.setText(MENSAJE.getText()+"uso: ");
                if(BIBLIOGRAFIA.isSelected()){
                    MENSAJE.setText(MENSAJE.getText()+"Bibliografia");
                }
                if(MATERIAL.isSelected()){
                    MENSAJE.setText(MENSAJE.getText()+"Material");
                }
                if(TRANSPORTE.isSelected()){
                    MENSAJE.setText(MENSAJE.getText()+"Transporte");
                }
                if(!BIBLIOGRAFIA.isSelected() && MATERIAL.isSelected() && TRANSPORTE.isSelected()){
                    MENSAJE.setText(MENSAJE.getText()+"Ninguna carrera selecciona. \n");
                }
                MENSAJE.setText(MENSAJE.getText()+TEXTAREA.getText());

    }//GEN-LAST:event_REGISTRARActionPerformed

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
                frmInicio inicio = new frmInicio();
                inicio.setVisible(true);
                dispose();
                setVisible(false);
    }//GEN-LAST:event_REGRESARActionPerformed

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
            java.util.logging.Logger.getLogger(frmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new frmFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox BIBLIOGRAFIA;
    private javax.swing.JRadioButton ESTATAL;
    private javax.swing.JRadioButton FEDERAL;
    private javax.swing.JRadioButton INSTITUCIONAL;
    private javax.swing.JCheckBox MATERIAL;
    private javax.swing.JLabel MENSAJE;
    private javax.swing.JButton REGISTRAR;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JTextArea TEXTAREA;
    private javax.swing.JCheckBox TRANSPORTE;
    private javax.swing.JTextField USUARIO;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
