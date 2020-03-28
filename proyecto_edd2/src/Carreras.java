
public class Carreras {
    int codigo;
    String nombre;
    String estado;

    public Carreras(int codigo, String nombre, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String toString() {
        return "Carreras{" + "codigo=" + codigo + ", nombre=" + nombre + ", estado=" + estado + '}';
    }
    
}
