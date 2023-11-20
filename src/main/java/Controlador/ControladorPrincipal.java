package Controlador;

import Modelo.ModeloCliente;
import Modelo.ModeloUsuario;
import Vista.Nueva_Factura;
import Vista.Nueva_Venta;
import Vista.Nuevo_Producto;
import Vista.Nuevo_cliente;
import Vista.Principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class ControladorPrincipal implements ActionListener, ChangeListener, DocumentListener {

    Principal prin = new Principal();
    Nuevo_cliente cli = new Nuevo_cliente();
    Nuevo_Producto produc = new Nuevo_Producto();
    Nueva_Venta vent = new Nueva_Venta();
    ControladorCliente controcli = new ControladorCliente();
    ModeloUsuario modusu = new ModeloUsuario();
    ModeloCliente modcli = new ModeloCliente();
    ControladorUsuario controUsu = new ControladorUsuario();
    Nueva_Factura nuevaFact = new Nueva_Factura();
    ControladorProducto controproduc = new ControladorProducto();
    Controlador_Proveedor controprovee = new Controlador_Proveedor();


    public ControladorPrincipal() {
        prin.getBtnNuevocliente().addActionListener(this);
        prin.getBtnNuevoprove().addActionListener(this);
        prin.getBtnNuevoProducto().addActionListener(this);
        prin.getJtxtBuscarfactura().addActionListener(this);
        prin.getBtNuevoVenta().addActionListener(this);
        prin.getJtxtBuscarUsuario().getDocument().addDocumentListener(this);
        prin.getBtnNuevocliente().addActionListener(this);//Que escuche el txt para buscar
        prin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cli.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        prin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        produc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        prin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void iniciarPrincipal(int valor) {
        prin.setLocationRelativeTo(null);//Centra la ventana
        prin.setTitle("Principal");//Le da titulo a la ventana
        prin.setExtendedState(JFrame.MAXIMIZED_BOTH);//Maximiza la ventana
        prin.getJtPrincipal().setSelectedIndex(valor);
        prin.setVisible(true);//Se visualiza la ventana
        gestionUsuario();//llamo al metodo de Gestion usuario
        gestionCliente();
    }

    public void gestionarPestanas() {

    }
   // modusu.mostrarTablaUsuario(prin.getUsuario, "", "Usuario");

    public void gestionUsuario() {
        modusu.mostrarTablaUsuario(prin.getJTablaUsuario(), "", "Usuario");

        prin.getJtPrincipal().addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

            }
        });
        prin.getJpUsuario().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                prin.getBtnNuevousu().setText("");
                prin.getBtnNuevousu().setForeground(new java.awt.Color(0, 0, 0));
            }
        });
        //Para darle clic al boton de editar
        prin.getTbUsuario().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = prin.getTbUsuario().rowAtPoint(e.getPoint());
                int colum = prin.getTbUsuario().columnAtPoint(e.getPoint());
                modusu.setDoc(Integer.parseInt(prin.getTbUsuario().getValueAt(fila, 0).toString()));

                if (colum   == 9) {
                    prin.setVisible(false);
                    prin.setExtendedState(JFrame.MAXIMIZED_BOTH);
                     controUsu.actualizarUsuario(modusu.getDoc());
                }
                if (colum == 10) {
                     controUsu.eliminarUsuario(modusu.getDoc());
                    JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    modusu.mostrarTablaUsuario(prin.getJTablaUsuario(), "", "Usuario");
                }
            }
        });
    }

    public void gestionCliente() {
        modcli.mostrarTablaCliente(prin.getTbUsuario(), "", "Cliente");
    }

    public void gestionProveedor() {

    }

    public void gestionProducto() {

    }

    public void gestionFacturacompra() {

    }

    public void gestionVenta() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(prin.getBtnNuevousu())) {
            prin.setVisible(false);
            controUsu.controlUsuario();
        }
        if (e.getSource().equals(prin.getBtnNuevocliente())) {
            prin.setVisible(false);
            controcli.controlCliente();
        }
        if (e.getSource().equals(prin.getBtnNuevoprove())) {
            prin.setVisible(false);
            controprovee.controlProveedor();
        }
        if (e.getSource().equals(prin.getBtnNuevoProducto())) {
            prin.setVisible(false);
            controproduc.controlProducto();

        }
        if (e.getSource().equals(prin.getjTableFactura())) {
            prin.setVisible(false);
            nuevaFact.setLocation(null);
            nuevaFact.setTitle("Nueva Factura Compra");
            nuevaFact.setVisible(true);
        }
        if (e.getSource().equals(prin.getTxtventa())) {
            prin.setVisible(false);
            vent.setLocationRelativeTo(null);
            vent.setTitle("Nueva Venta");
            vent.setVisible(true);
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int seleccionar = prin.getjTablaProveedor().getSelectedRow();
        if (seleccionar == 0) {
            gestionUsuario();
        }
        if (seleccionar == 1) {
            gestionCliente();
        }
        if (seleccionar == 2) {
            gestionProveedor();
        }
        if (seleccionar == 3) {
            gestionProducto();
        }
        if (seleccionar == 4) {
            gestionFacturacompra();
        }
        if (seleccionar == 5) {
            gestionVenta();
        }
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
