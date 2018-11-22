
package controller;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.table.DefaultTableModel;
import model.Batalla;
import model.Campeon;
import model.Jugador;


public class BatallaController extends javax.swing.JFrame {    
   
    int cantidad;
    Long j;
    Long c;
    public BatallaController() {
        initComponents();
        vacio();
        PanelAgregar.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        PanelAgregar = new javax.swing.JPanel();
        jLblNombre = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        TextFieldCantidad = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmb_campeon = new javax.swing.JComboBox<>();
        cmb_jugador = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_Regresar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Ver Batallas");
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jButton2.setText("Eliminar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 89, -1));

        jLblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLblNombre.setText("Cantidad:");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        TextFieldCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCantidadActionPerformed(evt);
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
        jLabel1.setText("Campeon:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Jugador:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Agregar Batalla");

        cmb_campeon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_campeonMouseClicked(evt);
            }
        });

        cmb_jugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_jugadorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelAgregarLayout = new javax.swing.GroupLayout(PanelAgregar);
        PanelAgregar.setLayout(PanelAgregarLayout);
        PanelAgregarLayout.setHorizontalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnNuevo)
                        .addGap(6, 6, 6)
                        .addComponent(btnGuardar)
                        .addGap(10, 10, 10)
                        .addComponent(btnCancelar))
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAgregarLayout.createSequentialGroup()
                                .addComponent(jLblNombre)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAgregarLayout.createSequentialGroup()
                                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(30, 30, 30)))
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldCantidad)
                            .addComponent(cmb_campeon, 0, 193, Short.MAX_VALUE)
                            .addComponent(cmb_jugador, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel3)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        PanelAgregarLayout.setVerticalGroup(
            PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAgregarLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(51, 51, 51)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAgregarLayout.createSequentialGroup()
                        .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblNombre)
                            .addComponent(TextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cmb_campeon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addGroup(PanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)))
        );

        getContentPane().add(PanelAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 390, 290));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cantidad", "Jugador", "Campeon"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 383, 275));

        btn_Regresar.setText("Regresar");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 89, -1));

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Batallas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        setDefaultCloseOperation(0);
        obtenerBatallas();

    }//GEN-LAST:event_jButton1MouseClicked

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        this.setVisible(false);
        this.dispose();
       
    }//GEN-LAST:event_btn_RegresarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       setDefaultCloseOperation(0);
        PanelAgregar.setVisible(true);
        this.setEnabled(true);
        OpcionMostrarNoMostrar(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        OpcionMostrarNoMostrar(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        setDefaultCloseOperation(0);
        cantidad = Integer.parseInt(TextFieldCantidad.getText());
        String nombreJ = cmb_jugador.getSelectedItem().toString();
        String nombreC = cmb_campeon.getSelectedItem().toString();
      //  obtenerId(nombre);
       
      
        //Long idJugador=Long.parseLong(cmb_jugador.getSelectedItem().toString());
        //j = Long.parseLong(TextFieldJugador.getText());
        //c = Long.parseLong(TextFieldCampeon.getText());
       

        

        vacio();
        OpcionMostrarNoMostrar(true);
        btnNuevo.setEnabled(true);
        PanelAgregar.setVisible(false);
        obtenerBatallas();
        //jc.obtenerBatalla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        setDefaultCloseOperation(0);
        vacio();
        PanelAgregar.setVisible(false);
        btnNuevo.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void TextFieldCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCantidadActionPerformed

    private void cmb_campeonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_campeonMouseClicked

       
    }//GEN-LAST:event_cmb_campeonMouseClicked

    private void cmb_jugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_jugadorMouseClicked
     
    }//GEN-LAST:event_cmb_jugadorMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        eliminarBatalla();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

    }//GEN-LAST:event_jButton2MouseClicked

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BatallaController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BatallaController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BatallaController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BatallaController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BatallaController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAgregar;
    private javax.swing.JTextField TextFieldCantidad;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JComboBox<String> cmb_campeon;
    private javax.swing.JComboBox<String> cmb_jugador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
//private BatallaService batallaService = new BatallaServiceImpl();
    
    
// public Batalla(int cantidad, Date fechaCreacion, Long idBatalla, Long idCampeon) 
      
    public void actualizarBatalla(){
        
    }
    
    public void eliminarBatalla(){
        int fila = this.jTable1.getSelectedRow();
        Long id = Long.parseLong(this.jTable1.getModel().getValueAt(fila,0).toString());        
       
    }

    public void obtenerBatalla(){
        
    }
    
    public void obtenerBatallas(){
       DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        model.setRowCount(0);
      
        
    }
    
    public void OpcionMostrarNoMostrar(boolean opcion){
      
        TextFieldCantidad.setEnabled(opcion);
        cmb_campeon.setEnabled(opcion);
        cmb_jugador.setEnabled(opcion);
        if(opcion == true){
            btnNuevo.setEnabled(false);
        }
    }
    
    public void vacio(){        
        TextFieldCantidad.setText("");
       
   }
       

    
}
