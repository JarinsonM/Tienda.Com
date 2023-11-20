package Controlador;

import Modelo.Modelo_Producto;
import Vista.Nuevo_Producto;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFrame;

public class ControladorProducto implements ActionListener {

    Nuevo_Producto pro = new Nuevo_Producto();
    Principal prin = new Principal();
    Modelo_Producto modproduc = new Modelo_Producto();

    public ControladorProducto() {
        pro.getTxtborroImagen().addActionListener(this);
        pro.getTxtNuevo_Producto().addActionListener(this);
        pro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pro.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal princ = new ControladorPrincipal();
                princ.iniciarPrincipal(0);
            }
        });
    }

    public void controlProducto() {
        prin.setVisible(false);
        pro.setLocationRelativeTo(null);
        pro.setTitle("Nuevo Producto");
        pro.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(pro.getTxtborroImagen())) {
            modproduc.getImagen();
            File file = new File(modproduc.getRuta());
            String archivo = file.getName();//obtiene solo el nombre de la ruta
            pro.getTxtborroImagen().setText(archivo);
        }
        if (e.getSource().equals(pro.getTxtNuevo_Producto())) {
            modproduc.setDes(pro.getTxtNuevo_Producto().getText());
            modproduc.setDes(pro.getTxtborroDescripcion().getText());
            modproduc.setImagen(modproduc.getImagen());
            modproduc.insertarproducto();
            modproduc.LimpiarProducto(pro.getJPLProducto().getComponents());
        }
    }
}

