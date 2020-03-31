import java.util.ArrayList;

public class Publicaciones {
    int cod_public;
    int cod_proy;
    String fecha_publi;
    String revista_conf;
    ArrayList<Proyectos> proyectos = new ArrayList();

    public Publicaciones(int cod_public, int cod_proy, String fecha_publi, String revista_conf) {
        this.cod_public = cod_public;
        this.cod_proy = cod_proy;
        this.fecha_publi = fecha_publi;
        this.revista_conf = revista_conf;
    }

    public int getCod_public() {
        return cod_public;
    }

    public void setCod_public(int cod_public) {
        this.cod_public = cod_public;
    }

    public int getCod_proy() {
        return cod_proy;
    }

    public void setCod_proy(int cod_proy) {
        this.cod_proy = cod_proy;
    }

    public String getFecha_publi() {
        return fecha_publi;
    }

    public void setFecha_publi(String fecha_publi) {
        this.fecha_publi = fecha_publi;
    }

    public String getRevista_conf() {
        return revista_conf;
    }

    public void setRevista_conf(String revista_conf) {
        this.revista_conf = revista_conf;
    }

    @Override
    public String toString() {
        return "Publicaciones{" + "cod_public=" + cod_public + ", cod_proy=" + cod_proy + ", fecha_publi=" + fecha_publi 
                + ", revista_conf=" + revista_conf + '}';
    }
    
    
}
