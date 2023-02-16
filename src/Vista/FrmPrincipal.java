/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Cliente;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author usuario
 */
public class FrmPrincipal extends javax.swing.JFrame {
    JScrollPane barra;
    Habitacion habitacion;
    PnlCliente pnlCliente;
    PnlReservHotel pnlReservHotel;
    PnlReserva pnlReserva;
    public static ArrayList<Cliente> listaDeClientes;
    JScrollPane barra;
 
    
    /**
     * Creates new form FrmPrincipal
     */
    
    public FrmPrincipal() {
        initComponents();
        listaDeClientes = new ArrayList<>();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlInicio = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnPrincipal = new javax.swing.JMenu();
        mnCliente = new javax.swing.JMenu();
        mnHabitacion = new javax.swing.JMenu();
        mnReserva = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnlInicioLayout = new javax.swing.GroupLayout(pnlInicio);
        pnlInicio.setLayout(pnlInicioLayout);
        pnlInicioLayout.setHorizontalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 687, Short.MAX_VALUE)
        );
        pnlInicioLayout.setVerticalGroup(
            pnlInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        mnPrincipal.setText("Pagina Principal");
        mnPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnPrincipalMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnPrincipal);

        mnCliente.setText("Registro de Cliente");
        mnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnClienteMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnCliente);

        mnHabitacion.setText("Gestion Habitacion");
        mnHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnHabitacionMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnHabitacion);

        mnReserva.setText("Reservacion");
        mnReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnReservaMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnReserva);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnHabitacionMouseClicked
        // TODO add your handling code here:
        habitacion=new Habitacion();
        agregarPanel(habitacion);
    }//GEN-LAST:event_mnHabitacionMouseClicked

    private void mnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnClienteMouseClicked
        // TODO add your handling code here:
        pnlCliente=new PnlCliente();
        agregarPanel(pnlCliente);
    }//GEN-LAST:event_mnClienteMouseClicked

    private void mnReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnReservaMouseClicked
        // TODO add your handling code here:
        pnlReserva=new PnlReserva();
        agregarPanel(pnlReserva);
    }//GEN-LAST:event_mnReservaMouseClicked

    private void mnPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnPrincipalMouseClicked
        // TODO add your handling code here:
         barra=new JScrollPane();
        this.add(barra,BorderLayout.CENTER);
      pnlReservHotel=new PnlReservHotel();
        agregarPanel(pnlReservHotel);
        
    }//GEN-LAST:event_mnPrincipalMouseClicked
private void agregarPanel(JPanel pnl){
     pnl.setSize(1000,800);
        pnl.setLocation(0,0);
        pnlInicio.removeAll();
        pnlInicio.add(pnl, BorderLayout.CENTER);
        pnlInicio.revalidate();
        pnlInicio.repaint();
        
        
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnCliente;
    private javax.swing.JMenu mnHabitacion;
    private javax.swing.JMenu mnPrincipal;
    private javax.swing.JMenu mnReserva;
    private javax.swing.JPanel pnlInicio;
    // End of variables declaration//GEN-END:variables
}
