
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Interfaz extends javax.swing.JFrame {
    
   DefaultTableModel model=new DefaultTableModel();
    

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        model.addColumn("Id Zona");
        model.addColumn("Longitud");
        model.addColumn("Nombre Zona");
        model.addColumn("Latitud");
        this.tabla.setModel(model);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jCPanel1 = new com.bolivia.panel.JCPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        IDZONA = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        zonanombre = new javax.swing.JLabel();
        Latitud = new javax.swing.JLabel();
        txtidZona = new javax.swing.JTextField();
        txtlongitud = new javax.swing.JTextField();
        txtnombrezona = new javax.swing.JTextField();
        txtlatitud = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btmlimpiar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btmAgregar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/97286192-jóvenes-plantas-de-maíz-verde-en-tierras-de-cultivo-tiro-de-ángulo-bajo-extremo-vista-de-gusano.jpg"))); // NOI18N
        jCPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CULTIVOS  xD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        jCPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1037, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Zona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 3, 18), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IDZONA.setText("Id Zona:");
        jPanel2.add(IDZONA, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 41, -1, -1));

        jLabel3.setText("Longitud:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 79, -1, -1));

        zonanombre.setText("Nombre de La Zona:");
        jPanel2.add(zonanombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 117, -1, -1));

        Latitud.setText("Latitud:");
        jPanel2.add(Latitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 155, -1, -1));
        jPanel2.add(txtidZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 38, 111, -1));
        jPanel2.add(txtlongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 76, 111, -1));
        jPanel2.add(txtnombrezona, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 114, 111, -1));
        jPanel2.add(txtlatitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 152, 111, -1));

        btnguardar.setText("Eliminar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        btmlimpiar.setText("LIMPIAR");
        btmlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmlimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btmlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jPanel4.setBackground(new java.awt.Color(153, 185, 27));

        txtbuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Search_32px_2.png"))); // NOI18N
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbuscar)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 60));

        jButton1.setText("salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tabla);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, 90));

        btmAgregar.setText("AGREGAR");
        btmAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btmAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jCPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 152, 460, 420));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos De Cultivos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Curlz MT", 2, 18), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Id Registro:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 41, -1, -1));

        jLabel8.setText("Id Planta:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 82, -1, -1));

        jLabel9.setText("PH:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 120, -1, -1));

        jLabel10.setText("Temperatura Agua:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 158, -1, -1));

        jLabel11.setText("Humedad:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 196, -1, -1));
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 38, 120, -1));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 79, 120, -1));
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 117, 120, -1));
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 155, 120, -1));
        jPanel3.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 193, 120, -1));

        jButton3.setText("GUARDAR");
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jButton4.setText("LIMPIAR");
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 250, -1, -1));

        jButton5.setText("Grafica");
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, 20));

        jCPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 152, -1, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//boton guardar
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
       int eli=tabla.getSelectedRowCount();
       if(eli >=0)
       {
           model.removeRow(eli);
       }else{
           
           JOptionPane.showInternalMessageDialog(null, "No HAY DATOS POR ELIMINAR ");
           
       }
        
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        String buscar=txtbuscar.getText();
        botones.buscar(buscar);
        
        //limpia
        txtbuscar.setText("");
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btmAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmAgregarActionPerformed
        // TODO add your handling code here:
        
           
        
        ///////
        String [] agregar=new String[4];
        agregar[0]=txtidZona.getText();
        agregar[1]=txtlongitud.getText();
        agregar[2]=txtnombrezona.getText();
        agregar[3]=txtlatitud.getText();
        model.addRow(agregar);
        
        
         String id=txtidZona.getText();
        String lon=txtlongitud.getText();
        String znom=txtnombrezona.getText();
        String lat=txtlatitud.getText();
        
      
        //int  var=Integer.parseInt(d);}
        
        botones.guardar(id, lat, znom, lat);
        //botones es el nombre de la clase principal 
        //metodo creado 
        //limpiar datos dentro del boton guardar 
        txtidZona.setText("");
        txtlongitud.setText("");
        txtnombrezona.setText("");
        txtlatitud.setText("");
    }//GEN-LAST:event_btmAgregarActionPerformed

    private void btmlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmlimpiarActionPerformed
        // TODO add your handling code here:
        txtidZona.setText("");
        txtlongitud.setText("");
        txtnombrezona.setText("");
        txtlatitud.setText("");
    }//GEN-LAST:event_btmlimpiarActionPerformed

     
    public void cargardatos(Interfazz inter){
        //LLENA LOS CAMPOS AL MOMENTO DE BUSCAR 
        
        this.txtidZona.setText(inter.getIDZONA());
        this.txtlongitud.setText(inter.getLongitud());
        this.txtnombrezona.setText(inter.getZonanombre());
        this.txtlatitud.setText(inter.getLatitud());
        
        
        
    }
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDZONA;
    private javax.swing.JLabel Latitud;
    private javax.swing.JButton btmAgregar;
    private javax.swing.JButton btmlimpiar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.bolivia.panel.JCPanel jCPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtidZona;
    private javax.swing.JTextField txtlatitud;
    private javax.swing.JTextField txtlongitud;
    private javax.swing.JTextField txtnombrezona;
    private javax.swing.JLabel zonanombre;
    // End of variables declaration//GEN-END:variables
}
