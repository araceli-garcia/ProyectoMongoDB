package controller;

import java.util.Date;
import javax.swing.table.DefaultTableModel;
import model.Jugador;
import org.bson.Document;


public class JugadorController extends javax.swing.JFrame {
 
    String nombre;
    String sexo;
    int edad;
    int nivel;
    public JugadorController() {
        initComponents();
        vacio();
        PanelAgregar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_ver = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        PanelAgregar = new javax.swing.JPanel();
        jLblNombre = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jLblEdad = new javax.swing.JLabel();
        jLblSexo = new javax.swing.JLabel();
        jLblNivel = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbm_nivel = new javax.swing.JComboBox<>();
        cbm_sexo = new javax.swing.JComboBox<>();
        cbm_edad = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_Regresar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_ver.setText("Ver Jugadores");
        bt_ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_verMouseClicked(evt);
            }
        });
        bt_ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_verActionPerformed(evt);
            }
        });
        getContentPane().add(bt_ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 101, -1));

        btn_editar.setText("Editar");
        btn_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editarMouseClicked(evt);
            }
        });
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 101, -1));

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

        jLblNivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLblNivel.setText("Nivel:");

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
                .addGap(30, 30, 30)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
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
                            .addComponent(jLblNivel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30)
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TextFieldNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbm_nivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbm_sexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbm_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        PanelAgregarLayout.setVerticalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNombre)
                    .addComponent(TextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblEdad)
                    .addComponent(cbm_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblSexo)
                    .addComponent(cbm_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNivel)
                    .addComponent(cbm_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)
                    .addComponent(btnNuevo))
                .addContainerGap())
        );

        getContentPane().add(PanelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 400, 260));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Edad", "Nivel", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 387, 161));

        btn_Regresar.setText("Regresar");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Jugador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_verActionPerformed
        
    }//GEN-LAST:event_bt_verActionPerformed

    private void bt_verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_verMouseClicked
        setDefaultCloseOperation(0);
        obtenerJugadores();

    }//GEN-LAST:event_bt_verMouseClicked

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        setDefaultCloseOperation(0);
        eliminarJugador();
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
       setDefaultCloseOperation(0);
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
       setDefaultCloseOperation(0);
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
         this.setVisible(false);
      
      
    }//GEN-LAST:event_btn_RegresarActionPerformed

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
        nivel = Integer.parseInt(cbm_nivel.getSelectedItem().toString());
        System.out.println("nombre:"+ nombre);
        System.out.println("edad: "+edad);
        System.out.println("nivel: "+nivel);
        System.out.println("sexo:" +sexo);

        Document document = new Document("mongo","MongoDB") 
               .append("nombre",nombre)
               .append("sexo",sexo)
               .append("edad",edad)
               .append("nivel",nivel);
        
     Principal.collectionJugador.insertOne(document);
                

        vacio();
        OpcionMostrarNoMostrar(true);
        btnNuevo.setEnabled(true);
        PanelAgregar.setVisible(false);
        obtenerJugadores();
        //jc.obtenerJugador();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       setDefaultCloseOperation(0);
        vacio();
        PanelAgregar.setVisible(false);
        btnNuevo.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setDefaultCloseOperation(0); 
        PanelAgregar.setVisible(true);
         this.setEnabled(true);
         OpcionMostrarNoMostrar(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void btn_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMouseClicked
       actualizarJugador();
    }//GEN-LAST:event_btn_editarMouseClicked

 
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JugadorController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JugadorController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JugadorController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JugadorController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JugadorController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAgregar;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JButton bt_ver;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JComboBox<String> cbm_edad;
    private javax.swing.JComboBox<String> cbm_nivel;
    private javax.swing.JComboBox<String> cbm_sexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblEdad;
    private javax.swing.JLabel jLblNivel;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
   
   
    
    
    public void actualizarJugador(){

    }
    
    public void eliminarJugador(){
 
    }

    public void obtenerJugador(){
            
    }    
    public void obtenerJugadores(){
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        model.setRowCount(0);
       
    }

    public void OpcionMostrarNoMostrar(boolean opcion){
        TextFieldNombre.setEnabled(opcion);
        cbm_edad.setEnabled(opcion);
        cbm_nivel.setEnabled(opcion);
        cbm_sexo.setEnabled(opcion);      
        btnGuardar.setEnabled(opcion);
        if(opcion == true){
            btnNuevo.setEnabled(false);
        }
    }
    
    public void vacio(){
        TextFieldNombre.setText("");
        
    }
}
