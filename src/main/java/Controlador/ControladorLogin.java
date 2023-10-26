package Controlador;

import Modelo.ModeloLogin;
import Vista.Login;
import Vista.Login;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ControladorLogin implements ActionListener{
    
    ModeloLogin modLog = new ModeloLogin();
    Login Log = new Login();
    Principal princ =new Principal();
    ControladorPrincipal prin = new ControladorPrincipal();

    public ControladorLogin() {
        Log.getBtnIniciar().
        Log.getBtnIniciar.add(this);
        Log.getBtnMostrarClave().addActionListener(this);
    }
    public void iniciarVista(){
        Log.setLocationRelativeTo(null);//Centrando la vista
        Log.setTitle("Iniciar Sesión");// Titulo a la vista
        Log.setVisible(true);//Visible la vista
    }
            

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(Log.getBtnMostrarClave())){
            if(Log.getJpContra().getEchoChar()=='\u2022'){
                Log.getJpContra().setEchoChar((char)0);
                Log.getBtnMostrarClave().setIcon(new javax.swing.ImageIcon(
                        getClass().getResource("/img/ojo-cruzado.png")));
            }else{
                Log.getJpContra().setEchoChar('\u2022');
                Log.getBtnMostrarClave().setIcon(new javax.swing.ImageIcon(
                        getClass().getResource("/img/ojo.png")));
            }
        }
        if(e.getSource()==(Log.getBtnIniciar())){
            modLog.setUsu(Log.getTxtUsuario().getText());
            String pass = new String(Log.getJpContra().getPassword());
            modLog.setContra(pass);
            if(modLog.validar(modlog.getUsu(), modlog.getContra())){
                Log.setVisible(false);
                prin.iniciar();
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
                
            }
        }
  
    }
    
}
