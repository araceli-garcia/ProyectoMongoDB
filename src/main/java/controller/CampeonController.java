package controller;

import java.math.BigDecimal;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import model.Campeon;
import org.bson.Document;

public class CampeonController extends javax.swing.JFrame {
  
    String nombre;
    String sexo;
    int edad;
    int tipo;
    BigDecimal precio;
    
    public CampeonController() {
        initComponents();
        vacio();
        PanelAgregar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        PanelAgregar = new javax.swing.JPanel();
        jLblNombre = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jLblEdad = new javax.swing.JLabel();
        jLblSexo = new javax.swing.JLabel();
        jLblTipo = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        TextFieldPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbm_nivel = new javax.swing.JComboBox<>();
        cbm_sexo = new javax.swing.JComboBox<>();
        cbm_edad = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_Regresar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Ver Campeones");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, -1, -1));

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 107, -1));

        Editar.setText("Editar");
        Editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditarMouseClicked(evt);
            }
        });
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 107, -1));

        jLblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLblNombre.setText("Nombre:");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLblEdad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLblEdad.setText("Edad:");

        jLblSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLblSexo.setText("Sexo:");

        jLblTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLblTipo.setText("Tipo:");

        TextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNombreActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Precio:");

        cbm_nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cbm_nivel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbm_nivelMouseClicked(evt);
            }
        });
        cbm_nivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbm_nivelActionPerformed(evt);
            }
        });

        cbm_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        cbm_edad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));
        cbm_edad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbm_edadMouseClicked(evt);
            }
        });
        cbm_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbm_edadActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Agregar  Campeón");

        javax.swing.GroupLayout PanelAgregarLayout = new javax.swing.GroupLayout(PanelAgregar);
        PanelAgregar.setLayout(PanelAgregarLayout);
        PanelAgregarLayout.setHorizontalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel3))
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelAgregarLayout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar))
                            .addGroup(PanelAgregarLayout.createSequentialGroup()
                                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblNombre)
                                    .addComponent(jLblEdad, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLblSexo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLblTipo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(30, 30, 30)
                                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextFieldPrecio)
                                    .addComponent(TextFieldNombre)
                                    .addComponent(cbm_nivel, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbm_sexo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbm_edad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        PanelAgregarLayout.setVerticalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNombre)
                    .addComponent(TextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addComponent(jLblEdad)
                        .addGap(23, 23, 23)
                        .addComponent(jLblSexo)
                        .addGap(23, 23, 23)
                        .addComponent(jLblTipo))
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addComponent(cbm_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(cbm_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(cbm_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnNuevo))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(PanelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 390, 320));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Edad", "Precio", "Sexo", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 377, 275));

        btn_Regresar.setText("Regresar");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Campeón");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       setDefaultCloseOperation(0);
        obtenerCampeones();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        setDefaultCloseOperation(0);      
        obtenerCampeones();

    }//GEN-LAST:event_jButton1MouseClicked

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        eliminarCampeon();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setDefaultCloseOperation(0);
        PanelAgregar.setVisible(true);
        this.setEnabled(true);
        OpcionMostrarNoMostrar(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        OpcionMostrarNoMostrar(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void TextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNombreActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        setDefaultCloseOperation(0);
        nombre = TextFieldNombre.getText();
        sexo = cbm_sexo.getSelectedItem().toString();
        edad = Integer.parseInt(cbm_edad.getSelectedItem().toString());
        tipo = Integer.parseInt(cbm_nivel.getSelectedItem().toString());
       Document document = new Document("mongo","MongoDB") 
               .append("nombre",nombre)
               .append("sexo",sexo)
               .append("edad",edad)
               .append("nivel",tipo);
        Principal.collectionCampeon.insertOne(document);
        //vacio();
        OpcionMostrarNoMostrar(true);
        btnNuevo.setEnabled(true);
        PanelAgregar.setVisible(false);
        obtenerCampeones();
        //cc.obtenerCampeon();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       setDefaultCloseOperation(0);
        vacio();
        PanelAgregar.setVisible(false);
        btnNuevo.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbm_nivelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbm_nivelMouseClicked

    }//GEN-LAST:event_cbm_nivelMouseClicked

    private void cbm_nivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbm_nivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbm_nivelActionPerformed

    private void cbm_edadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbm_edadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbm_edadMouseClicked

    private void cbm_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbm_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbm_edadActionPerformed

    private void EditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarMouseClicked
        actualizarCampeon();
    }//GEN-LAST:event_EditarMouseClicked

  
    public static void main(String args[]) {
       
       
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CampeonController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private javax.swing.JPanel PanelAgregar;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JTextField TextFieldPrecio;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JComboBox<String> cbm_edad;
    private javax.swing.JComboBox<String> cbm_nivel;
    private javax.swing.JComboBox<String> cbm_sexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblEdad;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblSexo;
    private javax.swing.JLabel jLblTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
   
    public void actualizarCampeon(){
     
    }

    
    public void eliminarCampeon(){
        int fila = this.jTable1.getSelectedRow();
        Long id = Long.parseLong(this.jTable1.getModel().getValueAt(fila,0).toString());
        System.out.println(id);
        
    }

    public void obtenerCampeon(){

    }
    
    public void obtenerCampeones(){
         
    }
    
    public void OpcionMostrarNoMostrar(boolean opcion){
        TextFieldNombre.setEnabled(opcion);
        cbm_edad.setEnabled(opcion);
        cbm_nivel.setEnabled(opcion);
        cbm_sexo.setEnabled(opcion);
        TextFieldPrecio.setEnabled(opcion);
        btnGuardar.setEnabled(opcion);
        if(opcion == true){
            btnNuevo.setEnabled(false);
        }
    }
    
    public void vacio(){
        TextFieldNombre.setText("");       
        TextFieldPrecio.setText("");
    }
}
