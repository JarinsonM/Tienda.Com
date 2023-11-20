
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author SENA
 */
public class Nueva_Factura extends javax.swing.JFrame {

    /**
     * Creates new form Nueva_Facutra
     */
    public Nueva_Factura() {
        initComponents();
    }

    public JButton getBtGuardar() {
        return BtGuardar;
    }

    public void setBtGuardar(JButton BtGuardar) {
        this.BtGuardar = BtGuardar;
    }

    public JComboBox<String> getCmbtipopago() {
        return Cmbtipopago;
    }

    public void setCmbtipopago(JComboBox<String> Cmbtipopago) {
        this.Cmbtipopago = Cmbtipopago;
    }

    public JPanel getPNLnuevaFactura() {
        return PNLnuevaFactura;
    }

    public void setPNLnuevaFactura(JPanel PNLnuevaFactura) {
        this.PNLnuevaFactura = PNLnuevaFactura;
    }

    public JButton getBtCancelar() {
        return btCancelar;
    }

    public void setBtCancelar(JButton btCancelar) {
        this.btCancelar = btCancelar;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getLblDocumento() {
        return lblDocumento;
    }

    public void setLblDocumento(JLabel lblDocumento) {
        this.lblDocumento = lblDocumento;
    }

    public JLabel getLblNuevaFactura() {
        return lblNuevaFactura;
    }

    public void setLblNuevaFactura(JLabel lblNuevaFactura) {
        this.lblNuevaFactura = lblNuevaFactura;
    }

    public JLabel getLblTipopago() {
        return lblTipopago;
    }

    public void setLblTipopago(JLabel lblTipopago) {
        this.lblTipopago = lblTipopago;
    }

    public JLabel getLblidentificacionProveedor() {
        return lblidentificacionProveedor;
    }

    public void setLblidentificacionProveedor(JLabel lblidentificacionProveedor) {
        this.lblidentificacionProveedor = lblidentificacionProveedor;
    }

    public JLabel getLblidentificacionUsuario() {
        return lblidentificacionUsuario;
    }

    public void setLblidentificacionUsuario(JLabel lblidentificacionUsuario) {
        this.lblidentificacionUsuario = lblidentificacionUsuario;
    }

    public JTextField getTxtDocumento() {
        return txtDocumento;
    }

    public void setTxtDocumento(JTextField txtDocumento) {
        this.txtDocumento = txtDocumento;
    }

    public JTextField getTxtidentificacionProveedor() {
        return txtidentificacionProveedor;
    }

    public void setTxtidentificacionProveedor(JTextField txtidentificacionProveedor) {
        this.txtidentificacionProveedor = txtidentificacionProveedor;
    }

    public JTextField getTxtidentificacionUsuario() {
        return txtidentificacionUsuario;
    }

    public void setTxtidentificacionUsuario(JTextField txtidentificacionUsuario) {
        this.txtidentificacionUsuario = txtidentificacionUsuario;
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
        PNLnuevaFactura = new javax.swing.JPanel();
        lblNuevaFactura = new javax.swing.JLabel();
        lblTipopago = new javax.swing.JLabel();
        lblidentificacionProveedor = new javax.swing.JLabel();
        lblidentificacionUsuario = new javax.swing.JLabel();
        lblDocumento = new javax.swing.JLabel();
        Cmbtipopago = new javax.swing.JComboBox<>();
        txtidentificacionProveedor = new javax.swing.JTextField();
        txtidentificacionUsuario = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        BtGuardar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        PNLnuevaFactura.setBackground(new java.awt.Color(0, 204, 204));

        lblNuevaFactura.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblNuevaFactura.setText("Nueva Factura");

        lblTipopago.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblTipopago.setText("Tipo De Pago");

        lblidentificacionProveedor.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblidentificacionProveedor.setText("Identificacion Del Proveedor");

        lblidentificacionUsuario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblidentificacionUsuario.setText("Identificacion Del Usuario");

        lblDocumento.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblDocumento.setText("Documento");

        Cmbtipopago.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Cmbtipopago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione....", "Efectivo", "Tarjeta de Credito", "Otro" }));

        txtidentificacionProveedor.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        txtidentificacionUsuario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        txtDocumento.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        BtGuardar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        BtGuardar.setText("Guardar");

        btCancelar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btCancelar.setText("Cancelar");

        javax.swing.GroupLayout PNLnuevaFacturaLayout = new javax.swing.GroupLayout(PNLnuevaFactura);
        PNLnuevaFactura.setLayout(PNLnuevaFacturaLayout);
        PNLnuevaFacturaLayout.setHorizontalGroup(
            PNLnuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNLnuevaFacturaLayout.createSequentialGroup()
                .addGroup(PNLnuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PNLnuevaFacturaLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(lblNuevaFactura))
                    .addGroup(PNLnuevaFacturaLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(PNLnuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipopago)
                            .addComponent(lblidentificacionProveedor)
                            .addComponent(lblidentificacionUsuario)
                            .addComponent(lblDocumento))
                        .addGap(35, 35, 35)
                        .addGroup(PNLnuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Cmbtipopago, 0, 234, Short.MAX_VALUE)
                            .addComponent(txtidentificacionProveedor)
                            .addComponent(txtidentificacionUsuario)
                            .addComponent(txtDocumento))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PNLnuevaFacturaLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(BtGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(btCancelar)
                .addGap(66, 66, 66))
        );
        PNLnuevaFacturaLayout.setVerticalGroup(
            PNLnuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNLnuevaFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PNLnuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PNLnuevaFacturaLayout.createSequentialGroup()
                        .addComponent(lblNuevaFactura)
                        .addGap(46, 46, 46)
                        .addComponent(lblTipopago))
                    .addComponent(Cmbtipopago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(PNLnuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblidentificacionProveedor)
                    .addComponent(txtidentificacionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(PNLnuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblidentificacionUsuario)
                    .addComponent(txtidentificacionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(PNLnuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumento)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(PNLnuevaFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtGuardar)
                    .addComponent(btCancelar))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(PNLnuevaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(PNLnuevaFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
            java.util.logging.Logger.getLogger(Nueva_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nueva_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nueva_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nueva_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nueva_Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtGuardar;
    private javax.swing.JComboBox<String> Cmbtipopago;
    private javax.swing.JPanel PNLnuevaFactura;
    private javax.swing.JButton btCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblNuevaFactura;
    private javax.swing.JLabel lblTipopago;
    private javax.swing.JLabel lblidentificacionProveedor;
    private javax.swing.JLabel lblidentificacionUsuario;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtidentificacionProveedor;
    private javax.swing.JTextField txtidentificacionUsuario;
    // End of variables declaration//GEN-END:variables
}