package BEU;

import Cardenas.Persona;
import Cardenas.Unidades;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

public class Matricula {

    //datos
    private final String numero;
    private Calendar fecha;
    private Estado estado;
    private Curso curso;
    private Estudiante estudiante;
    private final List<Calificacion> calificaciones = new ArrayList<>();
    //Información
    private float promedio;

    //métodos
    public Matricula() {
        fecha = Calendar.getInstance();
        estado = Estado.Registrada;
        UUID numeroAleatorio = UUID.randomUUID();
        this.numero = numeroAleatorio.toString();
    }

    public String getNumero() {
        return numero;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public void calculaPromedio() {
        if (this.calificaciones.isEmpty()) {
            return;
        }
        float suma = 0;
        for (Calificacion c : calificaciones) {
            suma += c.valor;// se puede acceder al tributo por que es una clase interna
        }
        int divisor = this.calificaciones.size();
        promedio = (float) suma / (float) divisor;
        if (divisor == 3) {
            if (promedio > 14) {
                this.estado = Estado.Aprobada;
            } else {
                this.estado = Estado.Reprobada;
            }
        }
    }

    public int addCalificacion(float v) {
        Calificacion cal = new Calificacion();
        int cuentaNotas = this.calificaciones.size();
        switch (cuentaNotas) {
            case 0:
                cal.setUnidad(Unidades.I);
                break;
            case 1:
                cal.setUnidad(Unidades.II);
                break;
            case 2:
                cal.setUnidad(Unidades.III);
                break;
            default:
                return 0;//Caso de tener todas las notas retorna 0
        }
        cal.setValor(v);
        cal.setFecha(Calendar.getInstance());
        this.calificaciones.add(cal);
        this.calculaPromedio();
        return this.calificaciones.size();
    }

    @Override
    public String toString() {
        return " N°" + numero + "\t" + estudiante.toString() + "\n";
    }

    public String toSave() {
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        return gson.toJson(this);
    }

    public String imprimirDetalle() {
        String str = "";
        str += "\n" + numero + "\t" + this.estudiante + "\t";
        for (Calificacion c : this.calificaciones) {
            str += "   \t " + c.getValor();
        }
        str += " \t " + promedio;
        return str;
    }

    //Clase Interna
    class Calificacion {

        private Calendar fecha;
        private float valor;
        private Unidades unidad;

        public Calificacion() {
        }

        public Calendar getFecha() {
            return fecha;
        }

        public void setFecha(Calendar fecha) {
            this.fecha = fecha;
        }

        public float getValor() {
            return valor;
        }

        public void setValor(float valor) {
            this.valor = valor;
        }

        public Unidades getUnidad() {
            return unidad;
        }

        public void setUnidad(Unidades unidad) {
            this.unidad = unidad;
        }

    }
}
