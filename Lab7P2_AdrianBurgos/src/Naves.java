import java.io.Serializable;

public class Naves implements Serializable{
    private String nombre;
    private String identificador;
    private int maxtripulantes;
    private int despegue;
    private int aterrizaje;
    private int velocidad;
    private int distanciamax;
    private int combustiblekl;
    private int tanqueprincipal;
    private int tanquereserva;

    public Naves(String nombre, String identificador, int maxtripulantes, int despegue, int aterrizaje, int velocidad, int combustiblekl, int tanqueprincipal, int tanquereserva) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.maxtripulantes = maxtripulantes;
        this.despegue = despegue;
        this.aterrizaje = aterrizaje;
        this.velocidad = velocidad;
        this.combustiblekl = combustiblekl;
        this.tanqueprincipal = tanqueprincipal;
        this.tanquereserva = tanquereserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getMaxtripulantes() {
        return maxtripulantes;
    }

    public void setMaxtripulantes(int maxtripulantes) {
        this.maxtripulantes = maxtripulantes;
    }

    public int getDespegue() {
        return despegue;
    }

    public void setDespegue(int despegue) {
        this.despegue = despegue;
    }

    public int getAterrizaje() {
        return aterrizaje;
    }

    public void setAterrizaje(int aterrizaje) {
        this.aterrizaje = aterrizaje;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getDistanciamax() {
        return distanciamax;
    }

    public void setDistanciamax(int distanciamax) {
        this.distanciamax = distanciamax;
    }

    public int getCombustiblekl() {
        return combustiblekl;
    }

    public void setCombustiblekl(int combustiblekl) {
        this.combustiblekl = combustiblekl;
    }

    public int getTanqueprincipal() {
        return tanqueprincipal;
    }

    public void setTanqueprincipal(int tanqueprincipal) {
        this.tanqueprincipal = tanqueprincipal;
    }

    public int getTanquereserva() {
        return tanquereserva;
    }

    public void setTanquereserva(int tanquereserva) {
        this.tanquereserva = tanquereserva;
    }
    
}
