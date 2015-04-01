
package scanner.view;

import java.awt.Color;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import scanner.controller.DatosArchivoController;

public class LexerGUI extends javax.swing.JFrame {

    //Referencia al controlador
    DatosArchivoController archivoController = new DatosArchivoController();
    
    public LexerGUI() {
        initComponents();
        //Centrar pantalla
        setLocationRelativeTo(null);
        archivoTxtArea.setDisabledTextColor(Color.BLACK);
        FileFilter filtro = new FileNameExtensionFilter(".c", "c");
        archivofileChooser.setFileFilter(filtro);
        
        crearTablaTokens();
        crearTablaErrores();
    }
    
    public void crearTablaTokens(){
        String columnas[] = {"Token","Tipo","Línea"};
        //Object[][] datosFila = {{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"}};
        DefaultTableModel modelo = new DefaultTableModel(null , columnas);

        JTable tablaTokens = new JTable(modelo);
        tablaTokens.setBounds(10, 10, 655, 350);

        JScrollPane tablaTokensSP = new JScrollPane(tablaTokens);
        tablaTokensSP.setBounds(10, 10, 655, 350);
        tablaTokens.setFillsViewportHeight(true);
        
        panelTokens.add(tablaTokensSP);
    }
    
    public void crearTablaErrores(){
        String columnas[] = {"Error","Línea"};
        Object[][] datosFila = {{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"},{"ASD", "1", "1,2,3(5)"}};
        DefaultTableModel modelo = new DefaultTableModel(datosFila , columnas);

        JTable tablaTokens = new JTable(modelo);
        tablaTokens.setBounds(10, 10, 655, 350);

        JScrollPane tablaTokensSP = new JScrollPane(tablaTokens);
        tablaTokensSP.setBounds(10, 10, 655, 350);
        tablaTokens.setFillsViewportHeight(true);
        
        panelErrores.add(tablaTokensSP);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        archivoFileDialog = new javax.swing.JDialog();
        archivofileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnAnalizarArchivo = new javax.swing.JButton();
        lblNbrArchivo = new javax.swing.JLabel();
        lblNombreArchivo = new javax.swing.JLabel();
        panelVisor = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        archivoTxtArea = new javax.swing.JTextArea();
        panelTokens = new javax.swing.JPanel();
        panelErrores = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        archivoFileDialog.setMinimumSize(new java.awt.Dimension(623, 397));

        archivofileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivofileChooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout archivoFileDialogLayout = new javax.swing.GroupLayout(archivoFileDialog.getContentPane());
        archivoFileDialog.getContentPane().setLayout(archivoFileDialogLayout);
        archivoFileDialogLayout.setHorizontalGroup(
            archivoFileDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, archivoFileDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(archivofileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        archivoFileDialogLayout.setVerticalGroup(
            archivoFileDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, archivoFileDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(archivofileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Analizador Léxico");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 151, 36));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 58, 695, 5));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Archivo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 89, -1, -1));

        btnAnalizarArchivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAnalizarArchivo.setText("Analizar archivo");
        btnAnalizarArchivo.setFocusPainted(false);
        btnAnalizarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarArchivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnalizarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 158, 33));

        lblNbrArchivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(lblNbrArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 540, 20));

        lblNombreArchivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombreArchivo.setText("Nombre del archivo:");
        getContentPane().add(lblNombreArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 132, -1, -1));

        panelVisor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        archivoTxtArea.setColumns(20);
        archivoTxtArea.setRows(5);
        archivoTxtArea.setEnabled(false);
        jScrollPane1.setViewportView(archivoTxtArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelVisor.addTab("Visor del archivo", jPanel1);

        javax.swing.GroupLayout panelTokensLayout = new javax.swing.GroupLayout(panelTokens);
        panelTokens.setLayout(panelTokensLayout);
        panelTokensLayout.setHorizontalGroup(
            panelTokensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        panelTokensLayout.setVerticalGroup(
            panelTokensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        panelVisor.addTab("Lista de tokens", panelTokens);

        javax.swing.GroupLayout panelErroresLayout = new javax.swing.GroupLayout(panelErrores);
        panelErrores.setLayout(panelErroresLayout);
        panelErroresLayout.setHorizontalGroup(
            panelErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        panelErroresLayout.setVerticalGroup(
            panelErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        panelVisor.addTab("Lista de errores", panelErrores);

        getContentPane().add(panelVisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 690, 400));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Seleccionar archivo");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 81, 158, 33));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void archivofileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivofileChooserActionPerformed
        archivoController.setArchivo((JFileChooser)evt.getSource(), evt.getActionCommand());
        File archivo = archivoController.getArchivoFromData();
        if(archivo != null){
            lblNbrArchivo.setText(archivo.getName());
            try {
                //Mostramos el texto en un text area
                archivoTxtArea.read( new FileReader( archivo.getAbsolutePath() ), null );
            } catch (IOException ex) {
                System.out.println("Problema al acceder el archivo: " + archivo.getAbsolutePath());
            }
        }
        archivoFileDialog.dispose();
    }//GEN-LAST:event_archivofileChooserActionPerformed

    private void btnAnalizarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarArchivoActionPerformed
        if(lblNbrArchivo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Favor seleccionar un archivo C para que este sea analizado.", 
                                                "Advertencia", JOptionPane.ERROR_MESSAGE);
        }else{
            //Analizar el archivo
            try{
                String resultado = archivoController.analizarArchivo();
                System.out.println("El archivo ha sido analizado.\n" + resultado);
                JOptionPane.showMessageDialog(null, "El archivo ha sido analizado.\n" + resultado, 
                                                "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnAnalizarArchivoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        archivoFileDialog.setVisible(true);
        archivoFileDialog.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LexerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LexerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LexerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LexerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LexerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog archivoFileDialog;
    private javax.swing.JTextArea archivoTxtArea;
    private javax.swing.JFileChooser archivofileChooser;
    private javax.swing.JButton btnAnalizarArchivo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNbrArchivo;
    private javax.swing.JLabel lblNombreArchivo;
    private javax.swing.JPanel panelErrores;
    private javax.swing.JPanel panelTokens;
    private javax.swing.JTabbedPane panelVisor;
    // End of variables declaration//GEN-END:variables
}