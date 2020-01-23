package BEU;

import Cardenas.Persona;

public class Guia extends Persona {

    private String licencia;
    private int calificacion;

    public Guia() {
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

}
