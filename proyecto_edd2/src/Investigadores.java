
import java.io.Serializable;


public class Investigadores implements Serializable {
    int codigo;
    String NombreInvestigador="";
    String FechaIngreso="";
    String CodigoCarrera="";
    String estado;
    int RRN;

    public Investigadores(String NombreInvestigador,int codigo,String FechaIngreso,String CodigoCarrera,String estado,int RRN) {
        this.codigo = codigo;
        this.estado = estado;
        this.NombreInvestigador=NombreInvestigador;
        this.FechaIngreso=FechaIngreso;
        this.CodigoCarrera=CodigoCarrera;
        this.RRN=RRN;
    }

    Investigadores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
