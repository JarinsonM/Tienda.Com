package Controlador;

import Modelo.ModeloUsuario;
import Vista.Nuevo_Usuario;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Map;
import javax.swing.JFrame;

public class ControladorPrincipal implements ActionListener {

    Principal prin = new Principal();//Instancia(Llama) la ventana principal
    Nuevo_Usuario nuevo = new Nuevo_Usuario();//Instanca (Llama) la ventana(vista) Nuevo usuario
    ModeloUsuario usu = new ModeloUsuario();//Instancia el modelo de usuario

    
    public ControladorPrincipal() {
        prin.getBtnNuevo().addActionListener(this);//Agrega el boton nuevo para que se escuche cuando se de clic
        nuevo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Desactiva la x que cierrar el programa para que permita abrir o volver a la ventana principal
    }

    public void iniciar() {
        prin.setLocationRelativeTo(null);//Centra la ventana
        prin.setTitle("Principal");//Le da titulo a la ventana
        prin.setVisible(true);//Hace visible la ventana
    }
   
    @Override
    public void actionPerformed(ActionEvent e) { //Valida los eventos
        if (e.getSource().equals(prin.getBtnNuevo())) {//Se crea al acción cuando le damos clic en el boton nuevo de la vista princial
            
            /*Al cerrar la ventana nuevo no cierra el programa sino que abre la ventana principal*/
            nuevo.addWindowListener(new WindowAdapter() {
                public void windowClosed(WindowEvent e) {
                    prin.setVisible(true);
                }
            });
            prin.setVisible(false);//Cierra la ventana principal para a que solo se visualice la ventana de nuevo usuario
            nuevo.setLocationRelativeTo(null);
            nuevo.setVisible(true);
            
            //Lleno el combobox de sexo
            nuevo.getJcvsexo().addItem("Seleccione...");
            Map<String,Integer>dato = usu.llenarCombo("sexo");
            for(String sexo:dato.keySet()){
                nuevo.getJcvsexo().addItem(sexo);
            }
            //Lleno el combobox de rol
            nuevo.getCbxCargo().addItem("Seleccione...");
            Map<String,Integer>datos = usu.llenarCombo("rol");
            for(String rol:datos.keySet()){
                nuevo.getCbxCargo().addItem(rol);
            }
        }

    }

}
