
package Modelo;

import Controlador.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;


public class ModeloUsuario {
    
    //Llamamos a la clase conexión
    Conexion conect= new Conexion();
    Connection cn = conect.iniciarConexion();//Instanciamos la conexion
    
    /* Creamos los atributos o variables  que necesita para realizar los procesos de base de datos*/
    private int doc,sex,rol;
    private String nom, dir,tec,cor,lo,cl;
    private Date fec;

    /*Creamos los getter y setter*/
    public int getDoc() {
        return doc;
    }

    public void setDoc(int doc) {
        this.doc = doc;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getTec() {
        return tec;
    }

    public void setTec(String tec) {
        this.tec = tec;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getLo() {
        return lo;
    }

    public void setLo(String lo) {
        this.lo = lo;
    }

    public String getCl() {
        return cl;
    }

    public void setCl(String cl) {
        this.cl = cl;
    }

    public Date getFec() {
        return fec;
    }

    public void setFec(Date fec) {
        this.fec = fec;
    }
    /*Creamos el metodo para llenar los combos a través de Map o diccionario*/
    public Map<String,Integer> llenarCombo(String valor){
        String sql="Select * from mostrar_"+valor;
        
        Map<String,Integer> llenar_combo = new HashMap<>();
        try {
            Statement st= cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                llenar_combo.put(rs.getString(2), rs.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return llenar_combo;
    }
    
}
