
package examorais175;

import javax.swing.JOptionPane; //ventanas emergentes
import java.sql.Connection;     //conexion a BD
import java.sql.DriverManager;  //Controlador de java a MySQL
import java.sql.Statement;      //Instrucciones SQL querys de BD
import java.sql.ResultSet;      //Resultado final de datos y manejo de excepciones
import java.sql.SQLException;   //Trabajar errors de base de datos
import java.sql.*;              //Libreria general de base de datos
import java.io.*;   //Entrada y salidad de datos
import javax.swing.table.DefaultTableModel;//Modelo de datos (dibuja una tablita )
 
public class VendedorCRUD extends javax.swing.JFrame {

        //variables de conexion
        public  Connection cn;//conexion a BD
        public  Statement stmt;//Instrucciones SQL querys de BD
        public  ResultSet rs;//Resultado final de datos
        
    public VendedorCRUD() { //CONSTRUCTOR
        initComponents();
    }

    //MÉTODO PARA CONECTAR A LA BD
    public void conectarBase() {
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/bdexamorais175", "root", "");
            stmt = cn.createStatement();
            JOptionPane.showMessageDialog(null, "CONEXION BD ESTABLECIDA \n Mora");
        } catch (SQLException ex) {//
            JOptionPane.showMessageDialog(null, ex);
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, e);
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        PANELIN = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panAlta = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdProd = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtUbicacion = new javax.swing.JTextField();
        btnAlta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        panBaja = new javax.swing.JPanel();
        txtIdProductoBaja = new javax.swing.JTextField();
        btnBajaProducto = new javax.swing.JButton();
        lblIdProductoBaja = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panBusquedaEditar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIdProductoMod = new javax.swing.JTextField();
        txtNombreProductoMod = new javax.swing.JTextField();
        txtDescripcionProductoMod = new javax.swing.JTextField();
        txtUbicacionProductoMod = new javax.swing.JTextField();
        btnEditarProducto = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnBuscarProducto = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtPrecioProductoMod = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PANELINLayout = new javax.swing.GroupLayout(PANELIN);
        PANELIN.setLayout(PANELINLayout);
        PANELINLayout.setHorizontalGroup(
            PANELINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );
        PANELINLayout.setVerticalGroup(
            PANELINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        jLabel1.setText("Captura Id producto a eliminar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        panAlta.setBackground(new java.awt.Color(102, 0, 0));
        panAlta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alta Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 0, 51))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("MARCA");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("MODELO");

        txtIdProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProdActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        txtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionActionPerformed(evt);
            }
        });

        btnAlta.setBackground(new java.awt.Color(102, 102, 102));
        btnAlta.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        btnAlta.setForeground(new java.awt.Color(255, 51, 51));
        btnAlta.setText("Alta de Producto");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("TIPO");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("ID PRODUCTO");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("PRECIO");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAltaLayout = new javax.swing.GroupLayout(panAlta);
        panAlta.setLayout(panAltaLayout);
        panAltaLayout.setHorizontalGroup(
            panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panAltaLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panAltaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panAltaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panAltaLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(txtIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panAltaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(panAltaLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(btnAlta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panAltaLayout.setVerticalGroup(
            panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(32, 32, 32)
                .addComponent(btnAlta)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panBaja.setBackground(new java.awt.Color(153, 102, 0));
        panBaja.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Baja Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 153, 0))); // NOI18N

        btnBajaProducto.setBackground(new java.awt.Color(102, 102, 102));
        btnBajaProducto.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        btnBajaProducto.setForeground(new java.awt.Color(255, 51, 51));
        btnBajaProducto.setText("Borrar Producto");
        btnBajaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaProductoActionPerformed(evt);
            }
        });

        lblIdProductoBaja.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblIdProductoBaja.setForeground(new java.awt.Color(204, 204, 204));
        lblIdProductoBaja.setText("Captura Id producto a eliminar");

        javax.swing.GroupLayout panBajaLayout = new javax.swing.GroupLayout(panBaja);
        panBaja.setLayout(panBajaLayout);
        panBajaLayout.setHorizontalGroup(
            panBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBajaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIdProductoBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBajaProducto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBajaLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(lblIdProductoBaja)
                .addGap(21, 21, 21))
        );
        panBajaLayout.setVerticalGroup(
            panBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBajaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblIdProductoBaja)
                .addGap(32, 32, 32)
                .addComponent(txtIdProductoBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBajaProducto)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jLabel5.setBackground(new java.awt.Color(0, 255, 204));
        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 0));
        jLabel5.setText("INSTRUMENTOS MORA");

        panBusquedaEditar.setBackground(new java.awt.Color(102, 0, 0));
        panBusquedaEditar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda-EditarProducto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 0, 51))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("MARCA");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("MODELO");

        txtIdProductoMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoModActionPerformed(evt);
            }
        });

        txtNombreProductoMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoModActionPerformed(evt);
            }
        });

        txtDescripcionProductoMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionProductoModActionPerformed(evt);
            }
        });

        txtUbicacionProductoMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionProductoModActionPerformed(evt);
            }
        });

        btnEditarProducto.setBackground(new java.awt.Color(102, 102, 102));
        btnEditarProducto.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        btnEditarProducto.setForeground(new java.awt.Color(255, 51, 51));
        btnEditarProducto.setText("Editar Producto");
        btnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("TIPO");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("ID PRODUCTO");

        btnBuscarProducto.setBackground(new java.awt.Color(102, 102, 102));
        btnBuscarProducto.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        btnBuscarProducto.setForeground(new java.awt.Color(255, 51, 51));
        btnBuscarProducto.setText("Buscar Producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("PRECIO");

        txtPrecioProductoMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioProductoModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBusquedaEditarLayout = new javax.swing.GroupLayout(panBusquedaEditar);
        panBusquedaEditar.setLayout(panBusquedaEditarLayout);
        panBusquedaEditarLayout.setHorizontalGroup(
            panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBusquedaEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBusquedaEditarLayout.createSequentialGroup()
                        .addGroup(panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panBusquedaEditarLayout.createSequentialGroup()
                                .addComponent(btnBuscarProducto)
                                .addGap(33, 33, 33)
                                .addComponent(btnEditarProducto))
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panBusquedaEditarLayout.createSequentialGroup()
                        .addGroup(panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panBusquedaEditarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtPrecioProductoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panBusquedaEditarLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombreProductoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panBusquedaEditarLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDescripcionProductoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panBusquedaEditarLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdProductoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panBusquedaEditarLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUbicacionProductoMod, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panBusquedaEditarLayout.setVerticalGroup(
            panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBusquedaEditarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdProductoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNombreProductoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescripcionProductoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUbicacionProductoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtPrecioProductoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panBusquedaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarProducto)
                    .addComponent(btnBuscarProducto))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel8.setBackground(new java.awt.Color(0, 255, 204));
        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 51, 0));
        jLabel8.setText("CRUD DE ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(panAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panBusquedaEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(228, 228, 228))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(465, 465, 465)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(361, 361, 361)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(panBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(panBusquedaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1038, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProdActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacionActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        
        conectarBase();
        
        int id = Integer.parseInt(txtIdProd.getText());
        String tipo = txtNombre.getText();
        String nomMarca = txtDescripcion.getText();
        String nomModelo = txtUbicacion.getText();
        String precio = txtPrecio.getText();

        
        String altaProducto = "INSERT INTO TINSTRUMENTOS VALUES ('" + id + "','"
                + "" + tipo + " ',' " + nomMarca + "','" + nomModelo + "','" + precio + "' )";
        try {
            
            stmt.executeUpdate(altaProducto);
            JOptionPane.showMessageDialog(null, "Se agrego producto de forma correcta\n" + nomModelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de BD de Alta :\n" + e);
        }
        
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnBajaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaProductoActionPerformed
        int confirmaBaja;
        try {
            conectarBase();
            int productoBaja=Integer.parseInt(txtIdProductoBaja.getText());
           
            confirmaBaja=stmt.executeUpdate("DELETE FROM tinstrumentos WHERE ID = '"+productoBaja+"'");
           
            if (confirmaBaja==1) {//si elimino
                JOptionPane.showMessageDialog(null,"Se dio de baja el Instrumento : \n"+productoBaja);
            } else {
                JOptionPane.showMessageDialog(null,"Error no existe ese ID de producto  : \nVerifica  codigo");
            }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Error de BD\n"+ e);
        }
    }//GEN-LAST:event_btnBajaProductoActionPerformed

    private void txtIdProductoModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductoModActionPerformed

    private void txtNombreProductoModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoModActionPerformed

    private void txtDescripcionProductoModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionProductoModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionProductoModActionPerformed

    private void txtUbicacionProductoModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionProductoModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacionProductoModActionPerformed

    private void btnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductoActionPerformed
        String editarSQL="";    //Var inicializada llamada editar, vacía
             
        try {
            conectarBase();
            int idProductoMod=Integer.parseInt(this.txtIdProductoMod.getText());
            String tipo = this.txtNombreProductoMod.getText();
            String nomMarca = this.txtDescripcionProductoMod.getText();
            String nomModelo = this.txtUbicacionProductoMod.getText();
            String precio = this.txtPrecioProductoMod.getText();
           
editarSQL="UPDATE TINSTRUMENTOS SET  nomModelo = '"+nomModelo+"' , nomMarca = '"+nomMarca+"' , precio = '"+precio+"' , tipo= '"+tipo+"' where idproducto = '"+idProductoMod+"'";
                 stmt.executeUpdate(editarSQL);
           
                 JOptionPane.showMessageDialog(null, "Producto actualizado\nVerifica tu consulta");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error de BD"+ e);
        }
        
    }//GEN-LAST:event_btnEditarProductoActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        try {
            conectarBase();
            int idProductoMod=Integer.parseInt(this.txtIdProductoMod.getText());
            //instruccion para buscar usuario
            rs=stmt.executeQuery("SELECT * FROM tinstrumentos where id='"+idProductoMod+"'");
            JOptionPane.showMessageDialog(null, "Buscando Producto...");
            if (rs.next()==true) {
                this.txtNombreProductoMod.setText(rs.getString("tipo"));
                this.txtDescripcionProductoMod.setText(rs.getString("nomMarca"));
                this.txtUbicacionProductoMod.setText(rs.getString("nomModelo"));
                this.txtPrecioProductoMod.setText(rs.getString("precio"));
            } else {
                 JOptionPane.showMessageDialog(null, "Error no existe ese ID de Producto\nVerifica");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD"+ e);
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtPrecioProductoModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioProductoModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioProductoModActionPerformed

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
            java.util.logging.Logger.getLogger(VendedorCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendedorCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendedorCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendedorCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendedorCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PANELIN;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBajaProducto;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEditarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblIdProductoBaja;
    private javax.swing.JPanel panAlta;
    private javax.swing.JPanel panBaja;
    private javax.swing.JPanel panBusquedaEditar;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDescripcionProductoMod;
    private javax.swing.JTextField txtIdProd;
    private javax.swing.JTextField txtIdProductoBaja;
    private javax.swing.JTextField txtIdProductoMod;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreProductoMod;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioProductoMod;
    private javax.swing.JTextField txtUbicacion;
    private javax.swing.JTextField txtUbicacionProductoMod;
    // End of variables declaration//GEN-END:variables
}
