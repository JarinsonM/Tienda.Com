
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Map;
import Vista.Principal;
import Vista.Login;
import Vista.Nuevo_Usuario;

public class Controlador_Usuario implements ActionListener {

    Nuevo_Usuario Usu = new Nuevo_Usuario();
    Principal pri = new Principal();
    modelo_Usuario mode_Usu = new modelo_Usuario();

    public void controUsuario() {

        Usu.addWindowListener(new WindowAdapter() {
            public void WindowClosed(WindowEvent y) {
                pri.setVisible(true);

            }

        });

        pri.setVisible(false);
        Usu.setLocationRelativeTo(null);
        Usu.setVisible(true);

        Usu.getjcbBoxselec_sexo().addItem("seleccione...");
        Map<String, Integer> dato = mode_Usu.llenarCombo("Sexo");
        for (String sexo : dato.keySet()) {
            Usu.getjcbBoxselec_sexo().addItem(sexo);

        }

        Usu.getjComboBoxcargo().addItem("Seleccione...");
        Map<String, Integer> datos = mode_Usu.llenarCombo("Cargo");
        for (String rol : datos.keySet()) {
            Usu.getjComboBoxcargo().addItem(rol);

        }

    }

    public Controlador_Usuario() {
        Usu.getjButtoguardar().addActionListener(this);

    }

    
    public void actionperformed(ActionEvent e) {
        if (y.getSource().equals(Usu.getjButtoguardar())) {
            if (((Usu.getjTextinsert_Usuario.getText().isEmpty()) || (Usu.getjTextier_nombre().getText().isEmpty)
                    || (Usu.getjTextinsert_telefono().getText().isEmpty())
                    || (Usu.getjcbBoxselec_sexo().getSelectedItem().equals("selecione..."))
                    || (Usu.getjTextinser_direcion().getTex().isEmpaty())
                    || (Usu.getjDateChooserFecha_nacimiento().getDate() == null)
                    || (Usu.getjComboBoxcargo().getSelectedItem().equals("selecione")
                    || (Usu.getjTextinsert_login().getText().isEmoty())
                    || (Usu.getjTextinsert_correo().getTex().isempty())
                    || (Usu.getjpasinsert_clave().getpassword() == null)))) {
                System.out.println("falta informacion");

            }
        } else {
            String valorSexo = Usu.getjCbBoxselec_sexo().getSelectedItem().toString();
            String valorCargo = Usu.getjComboBoxcargo().getSelectedItem().toString();

            int Sexo = mode_Usu.llenarCombo("Sexo").get(varlorSexo);
            int Cargo = mode_Usu.llenarCombo("Cargo").get(valorCargo);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



   
    
}