
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Proyectos implements Serializable{
    
    int codigo;
    String nombre;
    int investigador;
    String fecha_ini;
    String fecha_fin;
    String estado;

    public Proyectos(int codigo, String nombre, int investigador, String fecha_ini, String fecha_fin, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.investigador = investigador;
        this.fecha_ini = fecha_ini;
        this.fecha_fin = fecha_fin;
        this.estado = estado;
    }
    
    Proyectos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getInvestigador() {
        return investigador;
    }

    public void setInvestigador(int investigador) {
        this.investigador = investigador;
    }

    public String getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(String fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
