
public class Investigadores {
    int codigo;
    String NombreInvestigador="";
    String FechaIngreso="";
    String CodigoCarrera="";
    char estado;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreInvestigador() {
        return NombreInvestigador;
    }

    public void setNombreInvestigador(String NombreInvestigador) {
        this.NombreInvestigador = NombreInvestigador;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public String getCodigoCarrera() {
        return CodigoCarrera;
    }

    public void setCodigoCarrera(String CodigoCarrera) {
        this.CodigoCarrera = CodigoCarrera;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
}
