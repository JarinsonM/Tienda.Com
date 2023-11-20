/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author SENA
 */
public class Nueva_Venta extends javax.swing.JFrame {

    /**
     * Creates new form Nueva_Venta
     */
    public Nueva_Venta() {
        initComponents();
    }

    public JComboBox<String> getCmbTipopago() {
        return CmbTipopago;
    }

    public void setCmbTipopago(JComboBox<String> CmbTipopago) {
        this.CmbTipopago = CmbTipopago;
    }

    public JButton getBtGuardar() {
        return BtGuardar;
    }

    public void setBtGuardar(JButton btGuardar) {
        this.BtGuardar = btGuardar;
    }

    public JTextField getTxtCedulaCliente() {
        return txtCedulaCliente;
    }

    public void setTxtCedulaCliente(JTextField txtCedulaCliente) {
        this.txtCedulaCliente = txtCedulaCliente;
    }

    public JTextField getTxtIdentificacionUsuario() {
        return txtCedulaCliente;
    }

    public void setTxtIdentificacionUsuario(JTextField txtIdentificacionUsuario) {
        this.txtCedulaCliente = txtIdentificacionUsuario;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PNLNuevaventa = new javax.swing.JPanel();
        lblNuevaVenta = new javax.swing.JLabel();
        lblTipoPago = new javax.swing.JLabel();
        lblCedulaCliente = new javax.swing.JLabel();
        lblidentificacionUsuario = new javax.swing.JLabel();
        CmbTipopago = new javax.swing.JComboBox<>();
        txtCedulaCliente = new javax.swing.JTextField();
        txtidentificacionUsuario = new javax.swing.JTextField();
        BtGuardar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PNLNuevaventa.setBackground(new java.awt.Color(0, 153, 153));

        lblNuevaVenta.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblNuevaVenta.setText("Nueva Venta");

        lblTipoPago.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblTipoPago.setText("Tipo De Pago");

        lblCedulaCliente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCedulaCliente.setText("Cedula Del Cliente");

        lblidentificacionUsuario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblidentificacionUsuario.setText("Identificacion Del Usuario");

        CmbTipopago.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        CmbTipopago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Efectivo", "Tarjeta De Credicto", "Otro" }));

        txtCedulaCliente.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        txtidentificacionUsuario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        BtGuardar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        BtGuardar.setText("Guardar");

        javax.swing.GroupLayout PNLNuevaventaLayout = new javax.swing.GroupLayout(PNLNuevaventa);
        PNLNuevaventa.setLayout(PNLNuevaventaLayout);
        PNLNuevaventaLayout.setHorizontalGroup(
            PNLNuevaventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNLNuevaventaLayout.createSequentialGroup()
                .addGroup(PNLNuevaventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PNLNuevaventaLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lblNuevaVenta))
                    .addGroup(PNLNuevaventaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(PNLNuevaventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTipoPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCedulaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblidentificacionUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(PNLNuevaventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CmbTipopago, 0, 196, Short.MAX_VALUE)
                            .addComponent(txtCedulaCliente)
                            .addComponent(txtidentificacionUsuario))))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNLNuevaventaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtGuardar)
                .addGap(140, 140, 140))
        );
        PNLNuevaventaLayout.setVerticalGroup(
            PNLNuevaventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNLNuevaventaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNuevaVenta)
                .addGap(18, 18, 18)
                .addGroup(PNLNuevaventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoPago)
                    .addComponent(CmbTipopago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(PNLNuevaventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedulaCliente)
                    .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(PNLNuevaventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblidentificacionUsuario)
                    .addComponent(txtidentificacionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(BtGuardar)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PNLNuevaventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PNLNuevaventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Nueva_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nueva_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nueva_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nueva_Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nueva_Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtGuardar;
    private javax.swing.JComboBox<String> CmbTipopago;
    private javax.swing.JPanel PNLNuevaventa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCedulaCliente;
    private javax.swing.JLabel lblNuevaVenta;
    private javax.swing.JLabel lblTipoPago;
    private javax.swing.JLabel lblidentificacionUsuario;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtidentificacionUsuario;
    // End of variables declaration//GEN-END:variables
}
