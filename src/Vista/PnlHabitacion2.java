/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Cliente;
import Modelo.Habitacion;
import static Vista.PnlHabitacion.listaDeHabitaciones;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class PnlHabitacion2 extends javax.swing.JPanel {
     DefaultTableModel dtmModelo;
     Habitacion c;
     int indiceHabitacionSeleccionada=-1;
    /**
     * Creates new form PnlTarifas
     */
    public PnlHabitacion2() {
        initComponents();
        dtmModelo=new DefaultTableModel();
        dtmModelo.addColumn("Tipo de habitacion");
        dtmModelo.addColumn("Piso");
        dtmModelo.addColumn("Numero de habitacion");
        dtmModelo.addColumn("Capacidad");
        dtmModelo.addColumn("Precio");
    
        tblHabitacion.setModel(dtmModelo);
        for(Cliente r :PaginaPrincipal.listaDeClientes){
            cmbClientes.addItem(r.getNombre() +" "+r.getApellido());  
        }
        for (Habitacion c:PaginaPrincipal.listaDeHabitaciones){
            dtmModelo.addRow(new Object[] {c.getTipoDeHabitacion(),c.getPiso(),c.getNumeroDeHabitacion(),
           c.getCapacidad(),c.getPrecio()});      
        }
        for (Habitacion r:PaginaPrincipal.listaDeHabitacionesMatrimoniales){
            dtmModelo.addRow(new Object[] {c.getTipoDeHabitacion(),c.getPiso(),c.getNumeroDeHabitacion(),
           c.getCapacidad(),c.getPrecio()});      
        }
indiceHabitacionSeleccionada=-1;
/*
listaDeHabitaciones.add(new Habitacion("Triple",2,25,2,80));
listaDeHabitaciones.add(new Habitacion("Triple",2,25,2,80));
listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));
listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));

listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));
listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));
listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));
listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));

listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));
listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));
listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));
listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));

listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));
listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));
listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));
listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));

listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));
listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));
listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));
listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));

listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));
listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));
listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));
listaDeHabitaciones.add(new Habitacion("Matrimonial",2,25,2,80));
*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgFormaDePago = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox<>();
        lblFechaEntrada = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jdcFechaSalida = new com.toedter.calendar.JDateChooser();
        jdcFechaEntrada = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        rbtTarjetaDeCredito = new javax.swing.JRadioButton();
        rbtTransferencia = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripccion = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnNuevaReserva = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHabitacion = new javax.swing.JTable();

        jLabel1.setText("Cliente");

        lblFechaEntrada.setText("Fecha de ingreso");

        jLabel3.setText("Fecha de salida");

        jdcFechaSalida.setDateFormatString("dd/MM/yyyy");

        jdcFechaEntrada.setDateFormatString("dd/MM/yyyy");

        jLabel2.setText("Forma de pago");

        btgFormaDePago.add(rbtTarjetaDeCredito);
        rbtTarjetaDeCredito.setText("Tarjeta de credito");

        btgFormaDePago.add(rbtTransferencia);
        rbtTransferencia.setText("Transferencia");

        txtDescripccion.setColumns(20);
        txtDescripccion.setRows(5);
        txtDescripccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcción de habitación"));
        jScrollPane2.setViewportView(txtDescripccion);

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Facturar");

        btnNuevaReserva.setText("Nueva Reserva");
        btnNuevaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNuevaReserva)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(49, 49, 49))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnNuevaReserva)
                .addGap(19, 19, 19))
        );

        jLabel4.setText("Elija el tipo de habitación de su preferencia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFechaEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtTarjetaDeCredito))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtTarjetaDeCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(rbtTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tblHabitacion.setModel(new javax.swing.table.DefaultTableModel(
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
        tblHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHabitacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHabitacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNuevaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaReservaActionPerformed
        // TODO add your handling code here:
        //limpiar ();
         seleccionarHabitacion();
    }//GEN-LAST:event_btnNuevaReservaActionPerformed

    private void tblHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHabitacionMouseClicked
        // TODO add your handling code here:
         indiceHabitacionSeleccionada=tblHabitacion.getSelectedRow();
        //recypperar el cliente de la lista en el indice selccionado
        Habitacion HabitacionSeleccionada=PaginaPrincipal.listaDeHabitaciones.get(indiceHabitacionSeleccionada);
       
    }//GEN-LAST:event_tblHabitacionMouseClicked
    private void limpiar () {
        cmbClientes.setSelectedIndex(0);
        jdcFechaEntrada.setCalendar(null);
        jdcFechaSalida.setCalendar(null);
        btgFormaDePago.clearSelection();
        }
    private void seleccionarHabitacion(){
        if (indiceHabitacionSeleccionada!=-1){
                PaginaPrincipal.listaDeHabitaciones.remove(indiceHabitacionSeleccionada);
                limpiarTablaDeClientes();
                agregarListaCompletaALaTabla();
                indiceHabitacionSeleccionada=-1;
            }

    }

        private void limpiarTablaDeClientes(){
        for(int i=0;i<tblHabitacion.getRowCount();i++){
            dtmModelo.removeRow(i);
            i--;//decremento asi o asi; i-=1
        }   
    }
        private void agregarListaCompletaALaTabla(){
        for(Habitacion c:PaginaPrincipal.listaDeHabitaciones)
            agregarClienteALaTabla (c);
    }
        private void agregarClienteALaTabla(Habitacion h){
        dtmModelo.addRow(new Object[]{h.getTipoDeHabitacion(),h.getPiso(),h.getNumeroDeHabitacion(),
        h.getCapacidad(),h.getPrecio()}); 
    }
    private void informacionHabitacion(){
    if (indiceHabitacionSeleccionada!=-1){
        PaginaPrincipal.listaDeHabitacionesMatrimoniales.remove(indiceHabitacionSeleccionada);
        c.habitacionesDisponibles();
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgFormaDePago;
    private javax.swing.JButton btnNuevaReserva;
    private javax.swing.JComboBox<String> cmbClientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdcFechaEntrada;
    private com.toedter.calendar.JDateChooser jdcFechaSalida;
    private javax.swing.JLabel lblFechaEntrada;
    private javax.swing.JRadioButton rbtTarjetaDeCredito;
    private javax.swing.JRadioButton rbtTransferencia;
    private javax.swing.JTable tblHabitacion;
    private javax.swing.JTextArea txtDescripccion;
    // End of variables declaration//GEN-END:variables
}
