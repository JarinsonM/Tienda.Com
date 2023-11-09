/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Controlador.Conexion;
import Controlador.Conexion;
import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.swing.JFileChooser;
import java.swing.JOptionPane;
import java.swing.JTextField;
import java.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.JTableHeader;
       
        
public class Modelo_Producto {
    
    private String nom,des,ruta;
    private byte imagen;
    
    public String getNom(){
     
        return nom;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public byte getImagen() {
        return imagen;
    }

    public void setImagen(byte imagen) {
        this.imagen = imagen;
    }
    
    public void BuscarImagen (){
      
        JFileChooser archivos = new JFileChooser();
        String rutacarpeta = getClass().getClassLoader().getResource("Producto").getPath();
        File carpeta = new File(rutacarpeta);
        archivos.setCurrentDirectory(carpeta);
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG, PNG, & GIF", "png", "gif");
        archivos.setFileFilter(filtro);
        if (archivos.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){
            setRuta(archivos.getSelectedFile().getAbsolutePath());
        }
    
    }
    
    public byte[] obtenerImagen(String ruta) {
      try {
           File archivo = new File(ruta);
           byte[] foto = new byte[(int) archivo.length()];
           InputStream img = new FileInputStream(archivo);
           img.read(foto);
           return foto;
       }catch(Exception e){
           return null;
       }
    
    }
    public void insertarproducto() throws SQLException{
       Conexion con =new Conexion();
       Connection cn =(Connection) con.iniciarConexion();
           
    
       String insProducto="call producto_ins(?,?,?,?)";
        try{
          PreparedStatement ps = cn.prepareStatement(insProducto);
          ps.setString(1, getNom());
          ps.setString(2, getDes());
          ps.setByte(3, getImagen());
          ps.setString(4, getRuta());
          ps.executeUpdate();
          
          JOptionPane.showMessageDialog(null, "registro guardado");
          
        }catch(SQLException e){
            e.printStackTrace();
        }
           
    }
    public void LimpiarProducto(Component[] panel){
        for (Object limpiar :panel){
            if(limpiar instanceof JTextField){
                ((JTextField) limpiar).setToolTipText("");
            }
             if (limpiar instanceof JScrollPane){
                Component[] limpio=((JScrollPane)limpiar).getViewport().getComponents();
                for (Object controltext: limpio){
                    if (controltext instanceof JTextArea){
                        ((JTextArea) controltext).setText("");
                    }
                
                }
             }
        }
    
    }
    public void mostrarTablaProducto(JTable tabla,String valor,String nomPesta){
        Conexion conect= new Conexion();
        Connection cn= conect.iniciarConexion();
        JTableHeader encabezado = tabla.getTableHeader();
        encabezado.setDefaultRenderer(new GestionEncabezado());
        tabla.setTableHeader(encabezado);
    }    
}