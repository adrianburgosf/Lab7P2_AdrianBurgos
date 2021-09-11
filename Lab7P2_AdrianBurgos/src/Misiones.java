import java.io.Serializable;
import java.util.ArrayList;

public class Misiones implements Serializable{
    private String nombre;
    private ArrayList <Personas> astronautas = new ArrayList();
    private Naves nave;
    private Planetas planeta;

    public Misiones(String nombre, Naves nave, Planetas planeta) {
        this.nombre = nombre;
        this.nave = nave;
        this.planeta = planeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Personas> getAstronautas() {
        return astronautas;
    }

    public void setAstronautas(ArrayList<Personas> astronautas) {
        this.astronautas = astronautas;
    }

    public Naves getNave() {
        return nave;
    }

    public void setNave(Naves nave) {
        this.nave = nave;
    }

    public Planetas getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planetas planeta) {
        this.planeta = planeta;
    }
    
}
