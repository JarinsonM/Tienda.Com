package Controlador;

import Modelo.ModeloCliente;
import Vista.Nuevo_cliente;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorCliente implements ActionListener {

    Nuevo_cliente cli = new Nuevo_cliente();
    Principal prin = new Principal();
    ModeloCliente modcliente = new ModeloCliente();

    public ControladorCliente() {
        cli.getBtnGuardar().addActionListener(this);
        cli.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cli.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal princ = new ControladorPrincipal();
                princ.iniciarPrincipal(0);
            }
        });
    }

    public void controlCliente(){
        prin.setVisible(false);
        cli.setLocationRelativeTo(null);
        cli.setTitle("Nuevo Cliente");
        cli.setVisible(true);

        //lleno combo box sexo
        cli.getCmbSexo().addItem("Seleccione...");
        Map<String, Integer> combosexo = modcliente.llenarCombo("sexo");
        for (String sexo : combosexo.keySet()) {
            cli.getCmbSexo().addItem(sexo);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          
        if (e.getSource().equals(cli.getBtnGuardar())) {
            //validar campos vacios
            if ((cli.getTxtDocumento().getText().isEmpty()) ||(cli.getTxtDocumento().getSelectedText().equals("Seleccione..."))|| (cli.getTxtnombre().getText().isEmpty()) || (cli.getTxtDireccion().getText().isEmpty())
                    || (cli.getTxtcorreo().getText().isEmpty()) || (cli.getTxtTelefono().getText().isEmpty())|| (cli.getJdtFechadeNacimiento().getDate() == null) 
                    || (cli.getCmbSexo().getSelectedItem().equals("Seleccione..."))) {
                JOptionPane.showMessageDialog(null, "Debe ingresar información en todos los campos");
            } else {
                //Convertimos el dato de los combox al que entiende sql
                String valorSexo = cli.getCmbSexo().getSelectedItem().toString();
                int sexo = modcliente.llenarCombo("sexo").get(valorSexo);
                
                // seleccion de fecha, cambia al formato de fecha al que entiende sql
                java.util.Date fec = cli.getJdtFechadeNacimiento().getDate();
                long fe = fec.getTime();
                java.sql.Date fecha = new Date(fe);
      
                modcliente.setDoc(Integer.parseInt(cli.getTxtDocumento().getText()));
                modcliente.setNom(cli.getTxtnombre().getText());
                modcliente.setTele(cli.getTxtTelefono().getText());
                modcliente.setCorreo(cli.getTxtcorreo().getText());
                modcliente.setDire(cli.getTxtDireccion().getText());
                modcliente.setSex(sexo);
                modcliente.setFec(fecha);
                modcliente.insertarCliente();
                modcliente.limpiar(cli.getjPl().getComponents());
                
                if (cli.getBtnGuardar().getText().equals("Guardar")) {
                    modcliente.insertarCliente();
                    modcliente.limpiar(cli.getjPl().getComponents());
                } else {
//                    modcliente.actualizarUsuario();
//                    usu.setVisible(false);
//                    prin.setVisible(true);
                    modcliente.mostrarTablaCliente(prin.getjTableCliente(), "", "Cliente");
//                    prin.getTpPrincipal().setSelectedIndex(0);
                }
            }
        }
    }
}