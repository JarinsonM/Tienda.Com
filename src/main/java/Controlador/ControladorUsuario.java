package Controlador;

import Modelo.ModeloUsuario;
import Vista.Nuevo_Usuario;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class ControladorUsuario implements ActionListener {

    Nuevo_Usuario usu = new Nuevo_Usuario();
    Principal prin = new Principal();
    ModeloUsuario modusuario = new ModeloUsuario();

    //constructor
    public ControladorUsuario() {
        usu.getBtnGuardar().addActionListener(this);
        usu.getBtnOjo().addActionListener(this);
        usu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        usu.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                ControladorPrincipal princ = new ControladorPrincipal();
                princ.iniciarPrincipal(0);
            }
        });
    }

    public void controlUsuario() {
        prin.setVisible(false);
        usu.setLocationRelativeTo(null);
        usu.setTitle("Nuevo Usuario");
        usu.setVisible(true);

        //lleno combo box sexo
        usu.getCmbSeleccionesuSexo().addItem("Seleccione...");
        Map<String, Integer> combosexo = modusuario.llenarCombo("sexo");
        for (String sexo : combosexo.keySet()) {
            usu.getCmbSeleccionesuSexo().addItem(sexo);
        }
        //lleno combo box rol
        usu.getCmbCargo().addItem("Seleccione...");
        Map<String, Integer> comborol = modusuario.llenarCombo("rol");
        for (String rol : comborol.keySet()) {
            usu.getCmbCargo().addItem(rol);
        }
    }

    //Metodo adstracto
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(usu.getBtnOjo())) {

            if (usu.getJtxtClave().getEchoChar() == '\u2022') {
                usu.getJtxtClave().setEchoChar((char) 0);
                usu.getBtnOjo().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ojo-cruzado.png")));
            } else {
                usu.getJtxtClave().setEchoChar('\u2022');
                usu.getBtnOjo().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ojo.png")));
            }
        }
        if (e.getSource().equals(usu.getBtnGuardar())) {
            //validar campos vacios
            if ( (usu.getCmbTipodedocumento().getSelectedItem().equals("Seleccione...")) || (usu.getTxtNombre().getText().isEmpty()) || (usu.getTxtDireccion().getText().isEmpty())
                    || (usu.getTxtCorreo().getText().isEmpty()) || (usu.getTxtLogin().getText().isEmpty()) || (usu.getTxtTelefono().getText().isEmpty())
                    || (usu.getJtxtClave().getPassword() == null) || (usu.getJdcFechadenacimiento().getDate() == null) || (usu.getCmbCargo().getSelectedItem().equals("Seleccione..."))
                    || (usu.getCmbSeleccionesuSexo().getSelectedItem().equals("Seleccione..."))) {
                JOptionPane.showMessageDialog(null, "Debe ingresar información en todos los campos");
            } else {
                //Convertimos el dato de los combox al que entiende sql
                String valorSexo = usu.getCmbSeleccionesuSexo().getSelectedItem().toString();
                int sexo = modusuario.llenarCombo("sexo").get(valorSexo);
                String valorRol = usu.getCmbCargo().getSelectedItem().toString();
                int rol = modusuario.llenarCombo("rol").get(valorRol);

                // seleccion de fecha, cambia al formato de fecha al que entiende sql
                java.util.Date fec = usu.getJdcFechadenacimiento().getDate();
                long fe = fec.getTime();
                java.sql.Date fecha = new Date(fe);

                //Contraseña
                char[] contra = usu.getJtxtClave().getPassword();
                String contrasena = String.valueOf(contra);

                modusuario.setCmbTipodedocumento(usu.getCmbTipodedocumento().getSelectedItem().toString());
                modusuario.setNom(usu.getTxtNombre().getText());
                modusuario.setDir(usu.getTxtDireccion().getText());
                modusuario.setCor(usu.getTxtCorreo().getText());
                modusuario.setTel(usu.getTxtTelefono().getText());
                modusuario.setLo(usu.getTxtLogin().getText());
                modusuario.setFec(fecha);
                modusuario.setCor(contrasena);
                modusuario.setSex(sexo);
                modusuario.setRol(rol);

                if (usu.getBtnGuardar().getText().equals("Guardar")) {
                    modusuario.insertarUsuario();
                    modusuario.Limpiar(usu.getJPL().getComponents());
                } else {
                    modusuario.actualizarUsuario();
                    usu.setVisible(false);
                    prin.dispose();
                }

            }
        }

    }
//Actualizar Usuario

    void actualizarUsuario(int doc) {
        modusuario.buscarUsuario(doc);
        usu.getCmbTipodedocumento().setEnabled(false);
        usu.getTxtLogin().setEnabled(false);
        usu.getCmbTipodedocumento().setEnabled(false);
        usu.getCmbTipodedocumento().setSelectedItem(String.valueOf(doc));
        usu.getTxtNombre().setText(modusuario.getNom());
        usu.getTxtTelefono().setText(modusuario.getTec());
        usu.getTxtCorreo().setText(modusuario.getCor());
        usu.getTxtDireccion().setText(modusuario.getDir());
        usu.getTxtLogin().setText(modusuario.getLo());
        usu.getJtxtClave().setText(modusuario.getCl());
        usu.getJdcFechadenacimiento().setDate(modusuario.getFec());

        //llenar Sexo
        Map<String, Integer> info = modusuario.llenarCombo("sexo");
        for (String sexo : info.keySet()) {
            usu.getCmbSeleccionesuSexo().addItem(sexo);
        }
        //obtener el valor de la base de datos
        String valoSexo = modusuario.obtenerSeleccion(info, modusuario.getSex());
        usu.getCmbSeleccionesuSexo().setSelectedItem(valoSexo);

        //llenar Rol
        Map<String, Integer> info2 = modusuario.llenarCombo("rol");
        for (String rol : info2.keySet()) {
            usu.getCmbCargo().addItem(rol);
        }

        //obtener el valor de la base de datos
        String valoRol = modusuario.obtenerSeleccion(info, modusuario.getRol());
        usu.getCmbCargo().setSelectedItem(valoRol);

        //Llenar tipo de documento
        usu.getCmbTipodedocumento().setSelectedItem(modusuario.getTip());

        //Cambiar Titulo
        Border borde = BorderFactory.createTitledBorder(null, "Actualizar Usuario",
                javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Yu Gothic UI", 1, 36),
                new java.awt.Color(204, 0, 204));
        usu.getJPL().setBorder(borde);
        prin.setVisible(false);
        usu.setLocationRelativeTo(null);
        usu.getBtnGuardar().setText("Actualizar");
        usu.setVisible(true);

    }
//Eliminar Usuario

    void eliminarUsuario(int doc) {
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar al usuario? \n" + doc,
                 "Eliminar Usuario", JOptionPane.YES_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            modusuario.setDoc(doc);
            modusuario.eliminarUsuario();
        }
     }

}