package BEU;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Tour {

    private String codigo;
    private Calendar fechaSalida;
    private Calendar fechaRegreso;
    private float precio;    
    private Guia guia;
    private List<Cliente> cliente;   
    private List<Actividad> actividades = new ArrayList<>();
    private Transporte transporte;
    public Tour() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Calendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Calendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Calendar getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(Calendar fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
    // por cada actividad seleccionada toca sumar el costo, esa sume es  el precio del tour
    //en la activida se debe validar que la hora de inicio y fin no sean las mismas de otra actividad
    //las dos se hacen con un foreach
    

}
