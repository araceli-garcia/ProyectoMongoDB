package controller;


import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Batalla;
import model.Jugador;
import org.bson.Document;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.*;
import org.bson.Document;




public class Principal extends javax.swing.JFrame {  
    
    public static MongoCollection<Document> collectionJugador;
    public static MongoCollection<Document> collectionCampeon;
    public static MongoCollection<Document> collectionBatalla;
    
    
    public Principal() {
        initComponents();        
        
    }         

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_jugador = new javax.swing.JMenu();
        menu_campeones = new javax.swing.JMenu();
        menu_batallas = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Jugador", "Batallas", "Campeón"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("cargar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Principal");

        jMenu1.setText("Inicio");
        jMenuBar1.add(jMenu1);

        menu_jugador.setText("Jugadores");
        menu_jugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_jugadorMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_jugador);

        menu_campeones.setText("Campeones");
        menu_campeones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_campeonesMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_campeones);

        menu_batallas.setText("Batallas");
        menu_batallas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_batallasMouseClicked(evt);
            }
        });
        jMenuBar1.add(menu_batallas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_jugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_jugadorMouseClicked
        JugadorController jcontroller = new JugadorController();
        jcontroller.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_menu_jugadorMouseClicked

    private void menu_campeonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_campeonesMouseClicked
        //
       // ccontroller.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_menu_campeonesMouseClicked

    private void menu_batallasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_batallasMouseClicked
        //BatallaController bcontroller = new BatallaController();
        //bcontroller.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_menu_batallasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

  
    public static void main(String args[]) {
        
       MongoClient clienteMongo = new MongoClient("localhost",27017);      
       MongoCredential credencial;
       
       credencial = MongoCredential.createCredential("root", "jpa", "root".toCharArray());
       
       MongoDatabase db = clienteMongo.getDatabase("roldejuegos");
       
    
      collectionJugador= db.getCollection("jugador");
      collectionCampeon =  db.getCollection("campeon");
      collectionBatalla = db.getCollection("batalla"); 
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
   
    public void llenarTablaBatalla(){
         DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        model.setRowCount(0);
   

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu menu_batallas;
    private javax.swing.JMenu menu_campeones;
    private javax.swing.JMenu menu_jugador;
    // End of variables declaration//GEN-END:variables
}
