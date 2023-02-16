/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Reserva;
import Validar.Validador;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class PnlReserva extends javax.swing.JPanel {
    Reserva reserva = new Reserva();

    /**
     * Creates new form PnlReserva
     */
    public PnlReserva() {
        initComponents();
        lblError1.setVisible(false);
        lblError2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgFormaPago = new javax.swing.ButtonGroup();
        pnlReserva = new javax.swing.JPanel();
        lblReserva = new javax.swing.JLabel();
        lblFechaIngreso = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        lblFechaSalida = new javax.swing.JLabel();
        txtFechaSalida = new javax.swing.JTextField();
        lblFormaPago = new javax.swing.JLabel();
        rbtTarjetaCredito = new javax.swing.JRadioButton();
        rbtTransferencia = new javax.swing.JRadioButton();
        lblTotalPagar = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblError1 = new javax.swing.JLabel();
        lblError2 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        pnlReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("Reserva"));

        lblReserva.setText("Reservación");

        lblFechaIngreso.setText("Fecha de Ingreso");

        txtFechaIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFechaIngresoKeyReleased(evt);
            }
        });

        lblFechaSalida.setText("Fecha de Salida");

        txtFechaSalida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFechaSalidaKeyReleased(evt);
            }
        });

        lblFormaPago.setText("Forma de Pago");

        btgFormaPago.add(rbtTarjetaCredito);
        rbtTarjetaCredito.setText("Tarjeta de Crédito");

        btgFormaPago.add(rbtTransferencia);
        rbtTransferencia.setText("Transferencia");

        lblTotalPagar.setText("Total a Pagar");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblError1.setForeground(new java.awt.Color(255, 0, 0));
        lblError1.setText("jLabel2");

        lblError2.setForeground(new java.awt.Color(255, 0, 0));
        lblError2.setText("jLabel1");

        btnActualizar.setText("Actualizar");

        javax.swing.GroupLayout pnlReservaLayout = new javax.swing.GroupLayout(pnlReserva);
        pnlReserva.setLayout(pnlReservaLayout);
        pnlReservaLayout.setHorizontalGroup(
            pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReservaLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaIngreso)
                    .addComponent(lblFechaSalida)
                    .addComponent(lblFormaPago)
                    .addComponent(lblTotalPagar))
                .addGap(47, 47, 47)
                .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReservaLayout.createSequentialGroup()
                        .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlReservaLayout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(39, 39, 39)
                                .addComponent(btnActualizar))
                            .addGroup(pnlReservaLayout.createSequentialGroup()
                                .addComponent(rbtTarjetaCredito)
                                .addGap(18, 18, 18)
                                .addComponent(rbtTransferencia))
                            .addGroup(pnlReservaLayout.createSequentialGroup()
                                .addComponent(txtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblError2))
                            .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(pnlReservaLayout.createSequentialGroup()
                        .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlReservaLayout.createSequentialGroup()
                                .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblError1))
                            .addGroup(pnlReservaLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(lblReserva)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlReservaLayout.setVerticalGroup(
            pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReservaLayout.createSequentialGroup()
                .addComponent(lblReserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaIngreso)
                    .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblError1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaSalida)
                    .addComponent(txtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblError2))
                .addGap(18, 18, 18)
                .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFormaPago)
                    .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtTarjetaCredito)
                        .addComponent(rbtTransferencia)))
                .addGap(18, 18, 18)
                .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalPagar)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnlReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar))
                .addGap(0, 67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pnlReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pnlReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaIngresoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaIngresoKeyReleased
        // TODO add your handling code here:
        if(Validador.esFechaCorrecta(txtFechaIngreso.getText())){
            lblError1.setVisible(false);
        }
        else{
            lblError1.setText("Fecha Incorrecta");
            lblError1.setVisible(true);
        }
    }//GEN-LAST:event_txtFechaIngresoKeyReleased

    private void txtFechaSalidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaSalidaKeyReleased
        // TODO add your handling code here:ç
        if(Validador.esFechaCorrecta(txtFechaSalida.getText())){
            lblError2.setVisible(false);
        }
        else{
            lblError2.setText("Fecha Incorrecta");
            lblError2.setVisible(true);
        }
    }//GEN-LAST:event_txtFechaSalidaKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String fechaIngreso = txtFechaIngreso.getText();
        String fechaSalida = txtFechaSalida.getText();
        String tarjetaCredito;
        if(rbtTarjetaCredito.isSelected()){
            reserva.setFormaDePago(rbtTarjetaCredito.getText());
            tarjetaCredito= JOptionPane.showInputDialog("Ingrese el número de tarjeta");
            JOptionPane.showMessageDialog(pnlReserva,
            tarjetaCredito);
        } else if(rbtTransferencia.isSelected()){
            reserva.setFormaDePago((rbtTransferencia.getText()));
        }
        if(fechaIngreso.equals("")|| fechaSalida.equals("")){
            JOptionPane.showMessageDialog(pnlReserva, 
                "Ingresar todos los datos para poder guardar la reservación",
                "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            reserva = new Reserva(fechaIngreso, fechaSalida, 
                    reserva.getFormaDePago(), ALLBITS);
            JOptionPane.showMessageDialog(pnlReserva, "Reserva agendada"
                    + "con éxito");
            limpiarPantalla();
        }
 
    }//GEN-LAST:event_btnGuardarActionPerformed

    public void limpiarPantalla(){
        txtFechaIngreso.setText("");
        txtFechaSalida.setText("");
        btgFormaPago.clearSelection();
        txtTotalPagar.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgFormaPago;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel lblError1;
    private javax.swing.JLabel lblError2;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblFechaSalida;
    private javax.swing.JLabel lblFormaPago;
    private javax.swing.JLabel lblReserva;
    private javax.swing.JLabel lblTotalPagar;
    private javax.swing.JPanel pnlReserva;
    private javax.swing.JRadioButton rbtTarjetaCredito;
    private javax.swing.JRadioButton rbtTransferencia;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtFechaSalida;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
