/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import interfaces.interfazAdministrarMercancia;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Articulo;
import modelo.Categoria;
import modelo.Jugador;
import modelo.Proveedor;

/**
 *
 * @author rosario
 */
public class PanelAdminDeMercancia extends javax.swing.JFrame {
    
    
    private interfazAdministrarMercancia unaInterfazAdministrarMercancia;
    private DefaultTableModel modelo;


    
    public PanelAdminDeMercancia(interfazAdministrarMercancia unaInterfazAdministrarMercancia) {
        
        this.unaInterfazAdministrarMercancia = unaInterfazAdministrarMercancia;
        
        initComponents();
        modelo = (DefaultTableModel)tableroMercancia.getModel();
    }

    private PanelAdminDeMercancia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPrecio1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableroMercancia = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        comboCategoria = new javax.swing.JComboBox<>();
        comboProveedor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblNombreTienda = new javax.swing.JLabel();
        lblTienda = new javax.swing.JLabel();
        lblNombreTiend = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtExistencias = new javax.swing.JTextField();

        txtPrecio1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPrecio1.setForeground(new java.awt.Color(153, 51, 0));
        txtPrecio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 51, 0));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtPrecio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(153, 51, 0));
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 0));
        jLabel3.setText("Categoria:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 51, 0));
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 0));
        jLabel5.setText("Precio:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 51, 0));
        jLabel6.setText("Proveedor");

        tableroMercancia.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tableroMercancia.setForeground(new java.awt.Color(153, 51, 0));
        tableroMercancia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NombreProducto", "Categoria", "Proveedor", "Precio", "Existencias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableroMercancia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableroMercanciaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableroMercancia);

        btnAgregar.setBackground(new java.awt.Color(153, 51, 0));
        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(153, 51, 0));
        btnBorrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(153, 51, 0));
        btnActualizar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblTienda.setText("Tienda");

        lblNombreTiend.setText("Kohler and Sons");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 51, 0));
        jLabel7.setText("Existencias");

        txtExistencias.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtExistencias.setForeground(new java.awt.Color(153, 51, 0));
        txtExistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExistenciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(lblTienda))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblNombreTiend, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                        .addComponent(lblNombreTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnAgregar)
                                        .addGap(38, 38, 38)
                                        .addComponent(btnBorrar)
                                        .addGap(38, 38, 38)
                                        .addComponent(btnActualizar))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel4)))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                                .addComponent(comboProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtExistencias))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreTienda)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTienda)
                                .addComponent(lblNombreTiend)))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnBorrar)
                            .addComponent(btnActualizar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        unaInterfazAdministrarMercancia.agregar((String)comboCategoria.getSelectedItem(),(String)comboProveedor.getSelectedItem(),
                txtNombre.getText(), Double.parseDouble(txtPrecio.getText()),lblNombreTiend.getText(),Integer.parseInt(txtExistencias.getText()));
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtPrecio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
            
        
        
        unaInterfazAdministrarMercancia.actualizar((String)comboCategoria.getSelectedItem(),(String)comboProveedor.getSelectedItem(),        
        txtNombre.getText(), Double.parseDouble(txtPrecio.getText()),lblNombreTiend.getText(),Integer.parseInt(txtExistencias.getText()));
            
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        
        
        
        unaInterfazAdministrarMercancia.borrar((String)comboProveedor.getSelectedItem(),txtNombre.getText(),lblNombreTiend.getText());
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void tableroMercanciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableroMercanciaMouseClicked
            
        int i = tableroMercancia.getSelectedRow();
        
        txtNombre.setText((String)tableroMercancia.getValueAt(i,0));
        comboCategoria.setSelectedItem((String)tableroMercancia.getValueAt(i,1));
        comboProveedor.setSelectedItem((String)tableroMercancia.getValueAt(i,2));
        txtPrecio.setText(String.valueOf( tableroMercancia.getValueAt(i,3)));
        txtExistencias.setText(String.valueOf( tableroMercancia.getValueAt(i,4)));
        
            
    }//GEN-LAST:event_tableroMercanciaMouseClicked

    private void txtExistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExistenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExistenciasActionPerformed

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
            java.util.logging.Logger.getLogger(PanelAdminDeMercancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelAdminDeMercancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelAdminDeMercancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelAdminDeMercancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAdminDeMercancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboProveedor;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombreTiend;
    private javax.swing.JLabel lblNombreTienda;
    private javax.swing.JLabel lblTienda;
    private javax.swing.JTable tableroMercancia;
    private javax.swing.JTextField txtExistencias;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecio1;
    // End of variables declaration//GEN-END:variables

    
        
    public void actualizarTabla(List<Object[]> articulos){
        
        modelo.setRowCount(0);
			
	Object[] registro = new Object[5];
            if (articulos==null) {
                System.out.println("COCK SUCKER!!");
            }
		
	for(int i=0;i<articulos.size();i++){
			
                        registro = articulos.get(i);
			modelo.addRow(registro);
			
		}
		tableroMercancia.setModel(modelo);

    }
        
    public void cargarComboCategoria(List<Categoria> categorias){
        
        comboCategoria.removeAllItems();
        for (int i = 0; i < categorias.size(); i++) {
            
            comboCategoria.addItem(categorias.get(i).getCategoria());
            
        }
        
    }
    
    public void cargarComboProveedores(List<Proveedor> proveedores){
        
        comboProveedor.removeAllItems();
        
        for (int i = 0; i < proveedores.size(); i++) {
            
            
            comboProveedor.addItem(proveedores.get(i).getNombre());
            
        }
        
    }
    
    public String getNombreTienda(){
        
        return lblNombreTiend.getText();
    }

    public void cargarComboDeTiendas(List<Object[]> registros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
