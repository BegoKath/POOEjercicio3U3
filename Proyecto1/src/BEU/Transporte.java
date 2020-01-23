package BEU;

public class Transporte {

    private int capacidad;
    private String placac;
    private String NombreConductor;
    private TipoTransporte tipoTransporte;

    public Transporte() {
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getPlacac() {
        return placac;
    }

    public void setPlacac(String placac) {
        this.placac = placac;
    }

    public String getNombreConductor() {
        return NombreConductor;
    }

    public void setNombreConductor(String NombreConductor) {
        this.NombreConductor = NombreConductor;
    }

    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(TipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }
    
}
