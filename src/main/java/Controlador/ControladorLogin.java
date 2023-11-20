package Controlador;

import Modelo.ModeloLogin;
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
        Log.getBtnIniciar().addActionListener(this);
        Log.getPsfContraseña().addActionListener(this);
        Log.getBtnOjo().addActionListener(this);
    }
    public void iniciarVista(){
        Log.setLocationRelativeTo(null);//Centrando la vista
        Log.setTitle("Iniciar Sesión");// Titulo a la vista
        Log.setVisible(true);//Visible la vista
    }         

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(Log.getBtnOjo())){
            if(Log.getPsfContraseña().getEchoChar()=='\u2022'){
                Log.getPsfContraseña().setEchoChar((char)0);
                Log.getBtnOjo().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ojo-cruzado.png")));
            }else{
                Log.getPsfContraseña().setEchoChar('\u2022');
                Log.getBtnOjo().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ojo.png")));
            }
        }
        if(e.getSource()==(Log.getBtnIniciar())){
            modLog.setUsu(Log.getTxtborroUsuario().getText());
            String pass = new String(Log.getPsfContraseña().getPassword());
            modLog.setContra(pass);
            if(modLog.validar(modLog.getUsu(), modLog.getContra())){
                Log.setVisible(false);
                prin.iniciarPrincipal(0);
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
               
            }
        }
  
    }
    
}
