import java.io.Serializable;

public class Personas implements Serializable{
    private String ID;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String tituloU;
    private String contextura;
    private int peso;
    private int misiones;

    public Personas(String ID, String nombre, String apellido, String nacionalidad, String tituloU, String contextura, int peso) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.tituloU = tituloU;
        this.contextura = contextura;
        this.peso = peso;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTituloU() {
        return tituloU;
    }

    public void setTituloU(String tituloU) {
        this.tituloU = tituloU;
    }

    public String getContextura() {
        return contextura;
    }

    public void setContextura(String contextura) {
        this.contextura = contextura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getMisiones() {
        return misiones;
    }

    public void setMisiones(int misiones) {
        this.misiones = misiones;
    }

    @Override
    public String toString() {
        return nombre+" "+apellido;
    }
    
}
