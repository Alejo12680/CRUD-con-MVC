
package vista;

import controlador.Controlador;
import javax.swing.table.DefaultTableModel;


public class modificarTiket extends javax.swing.JFrame {
    
    DefaultTableModel del;
    String [] datos = new String[8];

  
    public modificarTiket() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel01 = new javax.swing.JLabel();
        jLabel02 = new javax.swing.JLabel();
        jLabel03 = new javax.swing.JLabel();
        jLabel04 = new javax.swing.JLabel();
        jLabel05 = new javax.swing.JLabel();
        jLabel06 = new javax.swing.JLabel();
        jLabel07 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComen2 = new javax.swing.JTextArea();
        cboTipoServi2 = new javax.swing.JComboBox<>();
        txtFecha2 = new javax.swing.JTextField();
        txtTelefono2 = new javax.swing.JTextField();
        txtDireccion2 = new javax.swing.JTextField();
        txtCliente2 = new javax.swing.JTextField();
        txtNit2 = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNomClien = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), " Buscar por Nit o Nombre", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Modificacion del Tiket", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel01.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel01.setForeground(new java.awt.Color(0, 0, 0));
        jLabel01.setText("Nit:");

        jLabel02.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel02.setForeground(new java.awt.Color(0, 0, 0));
        jLabel02.setText("Nombre Cliente:");

        jLabel03.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel03.setForeground(new java.awt.Color(0, 0, 0));
        jLabel03.setText("Dirección:");

        jLabel04.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel04.setForeground(new java.awt.Color(0, 0, 0));
        jLabel04.setText("Telefono:");

        jLabel05.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel05.setForeground(new java.awt.Color(0, 0, 0));
        jLabel05.setText("Fecha de Servicio:");

        jLabel06.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel06.setForeground(new java.awt.Color(0, 0, 0));
        jLabel06.setText("Tipo de Servicio:");

        jLabel07.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel07.setForeground(new java.awt.Color(0, 0, 0));
        jLabel07.setText("Comentario:");

        txtComen2.setColumns(20);
        txtComen2.setRows(5);
        jScrollPane2.setViewportView(txtComen2);

        cboTipoServi2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selección", "Instalacion de Camaras", "Mantenimiento de PC", "Mantenimiento de Impresora", "Limpieza de Virus" }));

        txtDireccion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccion2ActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setText("Modificar");

        btnCancelar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancelar1.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar1.setText("Cancelar");
        btnCancelar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelar1MouseClicked(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");

        btnSalir1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir1.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir1.setText("Salir");
        btnSalir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalir1MouseClicked(evt);
            }
        });

        jLabel2.setText("ID:");

        txtId.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel07, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(73, 73, 73)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtFecha2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cboTipoServi2, javax.swing.GroupLayout.Alignment.LEADING, 0, 250, Short.MAX_VALUE)
                                .addComponent(txtCliente2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNit2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDireccion2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addComponent(jLabel05, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel06, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel04, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel03, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel02, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel01, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(186, 186, 186)
                            .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel01)
                    .addComponent(txtNit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel02)
                    .addComponent(txtCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel03)
                    .addComponent(txtDireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel04)
                    .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel05)
                    .addComponent(txtFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel06)
                    .addComponent(cboTipoServi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel07)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnCancelar1)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir1))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar Cliente:");

        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Buscar");

        tbTabla.setBackground(new java.awt.Color(0, 102, 153));
        tbTabla.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tbTabla.setForeground(new java.awt.Color(255, 255, 255));
        tbTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nit", "Nombre del Cliente", "Direccion", "Telefono", "Fecha", "Servicio", "Comentario"
            }
        ));
        jScrollPane1.setViewportView(tbTabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomClien, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomClien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccion2ActionPerformed

    private void btnSalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalir1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_btnSalir1MouseClicked

    private void btnCancelar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelar1MouseClicked

    
    public static void main(String args[]) {
        modificarTiket bus =new modificarTiket();
        Controlador con = new Controlador(bus);
        bus.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnCancelar1;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnSalir1;
    public javax.swing.JComboBox<String> cboTipoServi2;
    private javax.swing.JLabel jLabel01;
    private javax.swing.JLabel jLabel02;
    private javax.swing.JLabel jLabel03;
    private javax.swing.JLabel jLabel04;
    private javax.swing.JLabel jLabel05;
    private javax.swing.JLabel jLabel06;
    private javax.swing.JLabel jLabel07;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tbTabla;
    public javax.swing.JTextField txtCliente2;
    public javax.swing.JTextArea txtComen2;
    public javax.swing.JTextField txtDireccion2;
    public javax.swing.JTextField txtFecha2;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtNit2;
    public javax.swing.JTextField txtNomClien;
    public javax.swing.JTextField txtTelefono2;
    // End of variables declaration//GEN-END:variables
}
