/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Cliente;
import Modelo.Habitacion;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class PnlFactura extends javax.swing.JPanel {
    public static ArrayList<Habitacion> listaDeHabitaciones;

    /**
     * Creates new form PnlFactura
     */
    public PnlFactura() {
        initComponents();
        for(Cliente r :PaginaPrincipal.listaDeClientes){
            cmbClientes.addItem(r.getNombre() +" "+r.getApellido());  
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNombreFactura = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblNumeroHabitacion = new javax.swing.JLabel();
        lblHabitacionFactura = new javax.swing.JLabel();
        lblFactura = new javax.swing.JLabel();
        lblNumeroFactura = new javax.swing.JLabel();
        lblFechaIngreso = new javax.swing.JLabel();
        lblFechaIngresoFactura = new javax.swing.JLabel();
        lblFechaSalida = new javax.swing.JLabel();
        lblFechaSalidaFactura = new javax.swing.JLabel();
        lblFechaEmision = new javax.swing.JLabel();
        lblFechaEmisionFactura = new javax.swing.JLabel();
        lblNumeroTelefono = new javax.swing.JLabel();
        lblNumeroTelefonoFactura = new javax.swing.JLabel();
        lblTipoHabitacion = new javax.swing.JLabel();
        lblTipoHabitacionFactura = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblIVA = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblSubtotalFactura = new javax.swing.JLabel();
        lblIVAFactura = new javax.swing.JLabel();
        lblTotalFactura = new javax.swing.JLabel();
        lblFormaPago = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFormaPagoFactura = new javax.swing.JLabel();

        lblNombreFactura.setText("Nombre");

        lblNombre.setText("jLabel3");

        lblNumeroHabitacion.setText("Habitación Nº");

        lblHabitacionFactura.setText("jLabel4");

        lblFactura.setText("Nº Factura");

        lblNumeroFactura.setText("jLabel2");

        lblFechaIngreso.setText("Fecha de Ingreso");

        lblFechaIngresoFactura.setText("jLabel2");

        lblFechaSalida.setText("Fecha de Salida");

        lblFechaSalidaFactura.setText("jLabel4");

        lblFechaEmision.setText("Fecha de Emisión");

        lblFechaEmisionFactura.setText("jLabel1");

        lblNumeroTelefono.setText("Número de Teléfono");

        lblNumeroTelefonoFactura.setText("jLabel1");

        lblTipoHabitacion.setText("Tipo de Habitación");

        lblTipoHabitacionFactura.setText("jLabel1");

        lblSubtotal.setText("Subtotal");

        lblIVA.setText("%IVA");

        lblTotal.setText("Total");

        lblSubtotalFactura.setText("jLabel4");

        lblIVAFactura.setText("jLabel5");

        lblTotalFactura.setText("jLabel6");

        lblFormaPago.setText("Forma de Pago");

        lblFormaPagoFactura.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreFactura)
                    .addComponent(lblFechaIngreso)
                    .addComponent(lblFechaSalida)
                    .addComponent(lblTipoHabitacion)
                    .addComponent(lblFormaPago))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lblFechaEmision)
                                .addGap(61, 61, 61))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFechaIngresoFactura)
                                    .addComponent(lblFechaSalidaFactura))
                                .addGap(103, 103, 103)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumeroHabitacion)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblTotal)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblTotalFactura))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblIVA)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblIVAFactura))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblSubtotal)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblSubtotalFactura))
                                        .addComponent(lblNumeroTelefono)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaEmisionFactura)
                            .addComponent(lblHabitacionFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumeroTelefonoFactura))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblFactura)
                        .addGap(35, 35, 35)
                        .addComponent(lblNumeroFactura)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTipoHabitacionFactura)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFormaPagoFactura)
                        .addGap(388, 388, 388))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroFactura)
                    .addComponent(lblFactura))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreFactura)
                    .addComponent(lblNombre)
                    .addComponent(lblFechaEmision)
                    .addComponent(lblFechaEmisionFactura))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaIngreso)
                    .addComponent(lblFechaIngresoFactura)
                    .addComponent(lblNumeroHabitacion)
                    .addComponent(lblHabitacionFactura))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaSalida)
                    .addComponent(lblFechaSalidaFactura)
                    .addComponent(lblNumeroTelefono)
                    .addComponent(lblNumeroTelefonoFactura))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoHabitacion)
                    .addComponent(lblTipoHabitacionFactura))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubtotal)
                    .addComponent(lblSubtotalFactura))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIVA)
                    .addComponent(lblIVAFactura))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(lblTotalFactura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFormaPago)
                    .addComponent(jLabel2)
                    .addComponent(lblFormaPagoFactura))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFactura;
    private javax.swing.JLabel lblFechaEmision;
    private javax.swing.JLabel lblFechaEmisionFactura;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblFechaIngresoFactura;
    private javax.swing.JLabel lblFechaSalida;
    private javax.swing.JLabel lblFechaSalidaFactura;
    private javax.swing.JLabel lblFormaPago;
    private javax.swing.JLabel lblFormaPagoFactura;
    private javax.swing.JLabel lblHabitacionFactura;
    private javax.swing.JLabel lblIVA;
    private javax.swing.JLabel lblIVAFactura;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreFactura;
    private javax.swing.JLabel lblNumeroFactura;
    private javax.swing.JLabel lblNumeroHabitacion;
    private javax.swing.JLabel lblNumeroTelefono;
    private javax.swing.JLabel lblNumeroTelefonoFactura;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblSubtotalFactura;
    private javax.swing.JLabel lblTipoHabitacion;
    private javax.swing.JLabel lblTipoHabitacionFactura;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalFactura;
    // End of variables declaration//GEN-END:variables
}
