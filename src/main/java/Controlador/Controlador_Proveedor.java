package Controlador;

import Modelo.ModeloProveedor;
import Vista.Nuevo_Proveedor;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Controlador_Proveedor implements ActionListener {

    Nuevo_Proveedor provee = new Nuevo_Proveedor();
    Principal prin = new Principal();
    ModeloProveedor modproveedor = new ModeloProveedor();

    public Controlador_Proveedor() {
        provee.getBtGuardar().addActionListener(this);
        provee.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        provee.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal princ = new ControladorPrincipal();
                princ.iniciarPrincipal(0);
            }
        });
    }

    public void controlProveedor() {
        prin.setVisible(false);
        provee.setLocationRelativeTo(null);
        provee.setTitle("Nuevo Proveedor");
        provee.setVisible(true);

        //lleno combo box sexo
        provee.getCmbSexo().addItem("Seleccione...");
        Map<String, Integer> combosexo = modproveedor.llenarCombo("sexo");
        for (String sexo : combosexo.keySet()) {
            provee.getCmbSexo().addItem(sexo);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(provee.getBtGuardar())) {
            //validar campos vacios
            if ((provee.getCmbSeleccioneDocumento().getSelectedItem().equals("Seleccione..."))|| (provee.getTxtNombre().getText().isEmpty()) || (provee.getTxtDireccion().getText().isEmpty())
                    || (provee.getTxtCorreo().getText().isEmpty()) || (provee.getTxtTelefono().getText().isEmpty())|| (provee.getDcFechaNacimiento().getDate() == null) 
                    || (provee.getCmbTipoPersona().getSelectedItem().equals("Seleccione...")) ||(provee.getCmbSexo().getSelectedItem().equals("Seleccione..."))) {
                JOptionPane.showMessageDialog(null, "Debe ingresar información en todos los campos");
            } else {
              //Convertimos el dato de los combox al que entiende sql
                String valorSexo = provee.getCmbSexo().getSelectedItem().toString();
                int sexo = modproveedor.llenarCombo("sexo").get(valorSexo);
                
                // seleccion de fecha, cambia al formato de fecha al que entiende sql
                java.util.Date fec = provee.getDcFechaNacimiento().getDate();
                long fe = fec.getTime();
                java.sql.Date fecha = new Date(fe);
                        
                modproveedor.setDoc(Integer.parseInt(provee.getTxtDocumento().getText()));
                modproveedor.setTipo_docu(provee.getCmbSeleccioneDocumento().getSelectedItem().toString());
                modproveedor.setNom(provee.getTxtNombre().getText());
                modproveedor.setDire(provee.getTxtDireccion().getText());
                modproveedor.setTipo_per(provee.getCmbTipoPersona().getSelectedItem().toString());
                modproveedor.setCorreo(provee.getTxtCorreo().getText());
                modproveedor.setTele(provee.getTxtTelefono().getText());
                modproveedor.setFec(fecha);
                modproveedor.setSex(sexo);
                modproveedor.insertarProveedor();
                modproveedor.limpiar(provee.getPJPanelProveedor().getComponents());

            }
        }

    }

}
