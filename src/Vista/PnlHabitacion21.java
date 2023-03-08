/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Cliente;
import Modelo.Habitacion;
import Modelo.Reserva;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class PnlHabitacion21 extends javax.swing.JPanel {
 DefaultTableModel dtmModelo;
 Habitacion c;
 int indiceHabitacionSeleccionada=-1;
 PnlFactura pnlFactura;
 Reserva r;
 
    /**
     * Creates new form PnlTarifas
     */
    public PnlHabitacion21() {
        initComponents();
        dtmModelo=new DefaultTableModel();
        dtmModelo.addColumn("Tipo de habitacion");
        dtmModelo.addColumn("Piso");
        dtmModelo.addColumn("Numero de habitacion");
        dtmModelo.addColumn("Capacidad");
        dtmModelo.addColumn("Precio");
        
        tblHabitacion21.setModel(dtmModelo);
        for(Cliente r :PaginaPrincipal.listaDeClientes){
            cmbClientes.addItem(r.getNombre() +" "+r.getApellido());  
        }
        for (Habitacion c:PaginaPrincipal.listaDeHabitaciones){
     dtmModelo.addRow(new Object[] {c.getTipoDeHabitacion(),c.getPiso(),c.getNumeroDeHabitacion(),
           c.getCapacidad(),c.getPrecio()});      
        }
indiceHabitacionSeleccionada=-1;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHabitacion = new javax.swing.JTable();
        fondo = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblHabitacion21 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblFechaEntrada = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbtTarjetaDeCredito = new javax.swing.JRadioButton();
        rbtTransferencia = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox<>();
        jdcFechaEntrada = new com.toedter.calendar.JDateChooser();
        jdcFechaSalida = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripccion = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        brnFactura = new javax.swing.JButton();
        btnNuevaReserva = new javax.swing.JButton();

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

        fondo.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        fondo.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tblHabitacion21.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHabitacion21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHabitacion21MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblHabitacion21);
        if (tblHabitacion21.getColumnModel().getColumnCount() > 0) {
            tblHabitacion21.getColumnModel().getColumn(0).setResizable(false);
            tblHabitacion21.getColumnModel().getColumn(1).setResizable(false);
            tblHabitacion21.getColumnModel().getColumn(2).setResizable(false);
            tblHabitacion21.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setText("Cliente");

        lblFechaEntrada.setText("Fecha de ingreso");

        jLabel3.setText("Fecha de salida");

        jLabel2.setText("Forma de pago");

        btgFormaDePago.add(rbtTarjetaDeCredito);
        rbtTarjetaDeCredito.setText("Tarjeta de credito");

        btgFormaDePago.add(rbtTransferencia);
        rbtTransferencia.setText("Transferencia");

        jLabel4.setText("Elija el tipo de habitación de su preferencia");

        jdcFechaEntrada.setDateFormatString("dd/MM/yyyy");

        jdcFechaSalida.setDateFormatString("dd/MM/yyyy");

        txtDescripccion.setColumns(20);
        txtDescripccion.setRows(5);
        txtDescripccion.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcción de habitación"));
        jScrollPane2.setViewportView(txtDescripccion);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        brnFactura.setText("Facturar");
        brnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnFacturaActionPerformed(evt);
            }
        });

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
                            .addComponent(btnGuardar)
                            .addComponent(brnFactura))
                        .addGap(49, 49, 49))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnGuardar)
                .addGap(27, 27, 27)
                .addComponent(brnFactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnNuevaReserva)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblFechaEntrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rbtTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(rbtTarjetaDeCredito)))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jdcFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jdcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(45, 45, 45)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lblFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jdcFechaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtTarjetaDeCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        fondo.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHabitacionMouseClicked
        // TODO add your handling code here:
                
    }//GEN-LAST:event_tblHabitacionMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", new Locale("es"));       
        String fechaIngreso = sdf.format(jdcFechaEntrada.getDate());
        String fechaSalida = sdf.format(jdcFechaSalida.getDate());
        
        r=new Reserva(fechaIngreso,fechaSalida);
        if(rbtTransferencia.isSelected())
                r.setFormaDePago("Transferencia");
        if(rbtTarjetaDeCredito.isSelected())
                r.setFormaDePago("Tarjeta de credito");
        txtDescripccion.append("Fecha ingreso: " + r.getFechaIngreso() + "\nFecha salida: " +
         r.getFechaSalida() + "\nForma de pago: " + r.getFormaDePago() + "\n");
       
       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaReservaActionPerformed
        // TODO add your handling code here:
        //limpiar ();
        seleccionarHabitacion();
    }//GEN-LAST:event_btnNuevaReservaActionPerformed

    private void brnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnFacturaActionPerformed
        // TODO add your handling code here:
        pnlFactura=new PnlFactura();
        agregarPanel(pnlFactura);
    }//GEN-LAST:event_brnFacturaActionPerformed

    private void tblHabitacion21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHabitacion21MouseClicked
        // TODO add your handling code here:
         indiceHabitacionSeleccionada=tblHabitacion21.getSelectedRow();
         Habitacion HabitacionSeleccionada=PaginaPrincipal.listaDeHabitaciones.get(indiceHabitacionSeleccionada);
         borrarAreaDeTexto();
         if(HabitacionSeleccionada.getTipoDeHabitacion().equals("Matrimonial")){
             txtDescripccion.append(HabitacionSeleccionada.habitacionDoble()+ "\n"); 
         }
         if(HabitacionSeleccionada.getTipoDeHabitacion().equals("Triple")){
          txtDescripccion.append(HabitacionSeleccionada.habitacionTriple()+ "\n"); 
         }          
         if(HabitacionSeleccionada.getTipoDeHabitacion().equals("Simple")){
             txtDescripccion.append(HabitacionSeleccionada.habitacionSimple()+ "\n"); 
         }
         
             if(HabitacionSeleccionada.getTipoDeHabitacion().equals("Cuadruple")){
             txtDescripccion.append(HabitacionSeleccionada.habitacionCuadruple()+ "\n"); 
         }
             if(HabitacionSeleccionada.getTipoDeHabitacion().equals("ConnectingRooms")){
            txtDescripccion.append(HabitacionSeleccionada.habitacionConnectingRooms()+ "\n");   
         }
             if(HabitacionSeleccionada.getTipoDeHabitacion().equals("Suite")){
             txtDescripccion.append(HabitacionSeleccionada.Suite()+"\n");
         }
                   
    }//GEN-LAST:event_tblHabitacion21MouseClicked
private void limpiar () {
    cmbClientes.setSelectedIndex(0);
    jdcFechaEntrada.setCalendar(null);
    jdcFechaSalida.setCalendar(null);
    btgFormaDePago.clearSelection();
    }
private void borrarAreaDeTexto(){
        txtDescripccion.setText("");
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
    for(int i=0;i<tblHabitacion21.getRowCount();i++){
        dtmModelo.removeRow(i);
        i--;//decremento asi o asi; i-=1
    }   
}
    private void agregarListaCompletaALaTabla(){
    for(Habitacion c:PaginaPrincipal.listaDeHabitaciones)
        agregarHabitacionesALaTabla (c);
}
    private void agregarHabitacionesALaTabla(Habitacion h){
    dtmModelo.addRow(new Object[]{h.getTipoDeHabitacion(),h.getPiso(),h.getNumeroDeHabitacion(),
    h.getCapacidad(),h.getPrecio()}); 
}
    
    private void agregarPanel(JPanel pnl){
     pnl.setSize(1000,620);
        pnl.setLocation(0,0);
        fondo.removeAll();
        fondo.add(pnl);
       fondo.revalidate();
        fondo.repaint();    
 
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnFactura;
    private javax.swing.ButtonGroup btgFormaDePago;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevaReserva;
    private javax.swing.JComboBox<String> cmbClientes;
    private javax.swing.JScrollPane fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private com.toedter.calendar.JDateChooser jdcFechaEntrada;
    private com.toedter.calendar.JDateChooser jdcFechaSalida;
    private javax.swing.JLabel lblFechaEntrada;
    private javax.swing.JRadioButton rbtTarjetaDeCredito;
    private javax.swing.JRadioButton rbtTransferencia;
    private javax.swing.JTable tblHabitacion;
    private javax.swing.JTable tblHabitacion21;
    private javax.swing.JTextArea txtDescripccion;
    // End of variables declaration//GEN-END:variables
}
