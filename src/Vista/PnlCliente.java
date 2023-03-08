/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Cliente;
import Validar.Validador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class PnlCliente extends javax.swing.JPanel {
    DefaultTableModel dtmCliente;
    int indiceClienteSeleccionado;

    /**
     * Creates new form PnlCliente
     */
    public PnlCliente() {
        initComponents();
        Cliente c;
        dtmCliente = new DefaultTableModel();
        dtmCliente.addColumn("NOMBRE");
        dtmCliente.addColumn("APELLIDO");
        dtmCliente.addColumn("CEDULA");
        dtmCliente.addColumn("CONTACTO");
        
        tblCliente.setModel(dtmCliente);
        indiceClienteSeleccionado = -1;
        lblError1.setVisible(false);
        lblError2.setVisible(false);
        lblError3.setVisible(false);
        lblError4.setVisible(false);
        agregarListaCompletaALaTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNumeroCedila = new javax.swing.JLabel();
        lblNumeroTelefono = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNumeroCedula = new javax.swing.JTextField();
        txtNumeroTelefono = new javax.swing.JTextField();
        lblError2 = new javax.swing.JLabel();
        lblError3 = new javax.swing.JLabel();
        lblError4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblError1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 430));

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblNombre.setText("Nombre");

        lblApellido.setText("Apellido");

        lblNumeroCedila.setText("Número de cédula");

        lblNumeroTelefono.setText("Número de teléfono");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
        });

        txtNumeroCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCedulaActionPerformed(evt);
            }
        });
        txtNumeroCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumeroCedulaKeyReleased(evt);
            }
        });

        txtNumeroTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroTelefonoActionPerformed(evt);
            }
        });
        txtNumeroTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumeroTelefonoKeyReleased(evt);
            }
        });

        lblError2.setForeground(new java.awt.Color(0, 102, 102));
        lblError2.setText("jLabel6");

        lblError3.setForeground(new java.awt.Color(0, 102, 102));
        lblError3.setText("jLabel7");

        lblError4.setForeground(new java.awt.Color(0, 102, 102));
        lblError4.setText("jLabel8");

        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblError1.setForeground(new java.awt.Color(0, 102, 102));
        lblError1.setText("jLabel1");

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardar)
                    .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNumeroCedila)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblApellido)
                            .addComponent(lblNombre))
                        .addComponent(lblNumeroTelefono)))
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtNumeroCedula)
                            .addComponent(txtNumeroTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblError2, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(lblError3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblError4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblError1)))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnActualizar)
                        .addGap(43, 43, 43)
                        .addComponent(btnEliminar)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblError1))
                .addGap(25, 25, 25)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblError2))
                .addGap(29, 29, 29)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroCedila)
                    .addComponent(txtNumeroCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblError3))
                .addGap(27, 27, 27)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroTelefono)
                    .addComponent(txtNumeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblError4))
                .addGap(18, 18, 18)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 255));
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tblCliente.setBackground(new java.awt.Color(204, 255, 204));
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCliente.setGridColor(new java.awt.Color(204, 255, 255));
        tblCliente.setInheritsPopupMenu(true);
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
        /*if(Validador.esNombreValido(txtNombre.getText())){
            lblError1.setVisible(false);
        }
        else{
            lblError1.setText("Nombre Incorrecto");
            lblError1.setVisible(true);
        }*/
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
       /* if(Validador.esApellidoValido(txtApellido.getText())){
            lblError2.setVisible(false);
        }
        else{
            lblError2.setText("Apellido Incorrecto");
            lblError2.setVisible(true);
        }*/
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtNumeroCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCedulaActionPerformed
        // TODO add your handling code here:
        /*if(Validador.esCedulaValida(txtNumeroCedula.getText())){
            lblError3.setVisible(false);
        }
        else{
            lblError3.setText("Número de Cedula Incorrecto");
            lblError3.setVisible(true);
        }*/
    }//GEN-LAST:event_txtNumeroCedulaActionPerformed

    private void txtNumeroTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroTelefonoActionPerformed
        // TODO add your handling code here:
        /*if(Validador.esNumeroValido(txtNumeroTelefono.getText())){
            lblError4.setVisible(false);
        }
        else{
            lblError4.setText("Número de teléfono Incorrecto");
            lblError4.setVisible(true);
        }*/
    }//GEN-LAST:event_txtNumeroTelefonoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
         if (Validador.esNombreValido(txtNombre.getText()) 
               && Validador.esApellidoValido(txtApellido.getText()) 
               && Validador.esCedulaValida(txtNumeroCedula.getText())
               && Validador.esNumeroValido(txtNumeroTelefono.getText())) {
            Cliente c = new Cliente(txtNombre.getText(), 
                    txtApellido.getText(), txtNumeroCedula.getText(),
                    txtNumeroTelefono.getText());
           PaginaPrincipal.listaDeClientes.add(c);
            int indiceUltimoElemento = PaginaPrincipal.listaDeClientes.size() - 1;
            agregarClienteALaTabla(PaginaPrincipal.listaDeClientes.get(
                    indiceUltimoElemento));
            JOptionPane.showMessageDialog(pnlFondo, "Usuario guardado"
                + " con éxito");
       vaciar();
        } else if (!Validador.esNombreValido(txtNombre.getText())) {
            JOptionPane.showMessageDialog(pnlFondo, 
                    "Nombre incorrecto", "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
        } else if (!Validador.esApellidoValido(txtApellido.getText())) {
            JOptionPane.showMessageDialog(pnlFondo, 
                    "Apellido incorrecto", "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
        }else if (!Validador.esCedulaValida(txtNumeroCedula.getText())){
            JOptionPane.showMessageDialog(pnlFondo, 
                    "Número de Cédula incorrecto", "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
        } else if (!Validador.esNumeroValido(
                txtNumeroTelefono.getText())) {
            JOptionPane.showMessageDialog(pnlFondo, 
                    "Número de teléfono incorrecto", "ERROR", 
                    JOptionPane.ERROR_MESSAGE);
        }else{
          JOptionPane.showMessageDialog(null, "Usuario no guardado",
                  "ERROR",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        indiceClienteSeleccionado = tblCliente.getSelectedRow();
        if (indiceClienteSeleccionado != -1) {
            Cliente clienteActualizado = new Cliente(txtNombre.getText(),
                    txtApellido.getText(),txtNumeroCedula.getText(),
                    txtNumeroTelefono.getText());
            PaginaPrincipal.listaDeClientes.set(indiceClienteSeleccionado, clienteActualizado);
            limpiarTablaDeClientes();
            agregarListaCompletaALaTabla();
            indiceClienteSeleccionado = -1;
            JOptionPane.showMessageDialog(pnlFondo, "Usuario actualizado"
                + " con éxito");
        } else{
          JOptionPane.showMessageDialog(null, "Usurio no actualizado",
                  "ERROR",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
         indiceClienteSeleccionado = tblCliente.getSelectedRow();
        if(indiceClienteSeleccionado != -1){
            PaginaPrincipal.listaDeClientes.remove(indiceClienteSeleccionado);
            limpiarTablaDeClientes();
            agregarListaCompletaALaTabla();
            indiceClienteSeleccionado = -1;
            JOptionPane.showMessageDialog(pnlFondo, "Usuario eliminado"
                + " con éxito");
        } else{
          JOptionPane.showMessageDialog(null, "Usurio no eliminado",
                  "ERROR",
            JOptionPane.ERROR_MESSAGE);
        }
        
    }
        private void agregarListaCompletaALaTabla() {
        for (Cliente c :PaginaPrincipal.listaDeClientes) {
            agregarClienteALaTabla(c);
        }
    }                                                  

    private void limpiarTablaDeClientes(){
        for(int i=0; i<tblCliente.getRowCount(); i++){
            dtmCliente.removeRow(i);
            i -= 1;  
        }
    }
     private void agregarClienteALaTabla(Cliente c) {
        dtmCliente.addRow(new Object[]{c.getNombre(), c.getApellido(),
            c.getNumeroCedula(), c.getTelefono()});
     
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        // TODO add your handling code here:
        indiceClienteSeleccionado = tblCliente.getSelectedRow();
        //recuperar el cliente de la lista en el indice seleccionado
        Cliente clienteSeleccionado =PaginaPrincipal.listaDeClientes.get(
            indiceClienteSeleccionado);
        //colocar los datos del clienteSeleccionado en las cajas de texto
        txtNombre.setText(clienteSeleccionado.getNombre());
        txtApellido.setText(clienteSeleccionado.getApellido());
        txtNumeroCedula.setText(clienteSeleccionado.getNumeroCedula());
        txtNumeroTelefono.setText(clienteSeleccionado.getTelefono());
    }//GEN-LAST:event_tblClienteMouseClicked

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
        if(Validador.esNombreValido(txtNombre.getText())){
            lblError1.setVisible(false);
        }
        else{
            lblError1.setText("Nombre Incorrecto");
            lblError1.setVisible(true);
        }
        
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        // TODO add your handling code here:
        if(Validador.esApellidoValido(txtApellido.getText())){
            lblError2.setVisible(false);
        }
        else{
            lblError2.setText("Apellido Incorrecto");
            lblError2.setVisible(true);
        }
        
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtNumeroCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCedulaKeyReleased
        // TODO add your handling code here:
        if(Validador.esCedulaValida(txtNumeroCedula.getText())){
            lblError3.setVisible(false);
        }
        else{
            lblError3.setText("Número de Cedula Incorrecto");
            lblError3.setVisible(true);
        }
        
    }//GEN-LAST:event_txtNumeroCedulaKeyReleased

    private void txtNumeroTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroTelefonoKeyReleased
        // TODO add your handling code here:
        if(Validador.esNumeroValido(txtNumeroTelefono.getText())){
            lblError4.setVisible(false);
        }
        else{
            lblError4.setText("Número de teléfono Incorrecto");
            lblError4.setVisible(true);
        }
        
    }//GEN-LAST:event_txtNumeroTelefonoKeyReleased
private void vaciar(){
        txtNumeroTelefono.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtNumeroCedula.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblError1;
    private javax.swing.JLabel lblError2;
    private javax.swing.JLabel lblError3;
    private javax.swing.JLabel lblError4;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroCedila;
    private javax.swing.JLabel lblNumeroTelefono;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroCedula;
    private javax.swing.JTextField txtNumeroTelefono;
    // End of variables declaration//GEN-END:variables
}
