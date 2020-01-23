/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BEU.Curso;
import BEU.Estado;
import BEU.Estudiante;
import BEU.Matricula;
import Cardenas.BaseBllCrud;
import Cardenas.BasePersistencia;
import Cardenas.Util;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labctr
 */
public class GestionMatricula extends BasePersistencia<Matricula> implements BaseBllCrud<Matricula> {

    private Matricula matricula;
    private final String directorio = "matriculas";

    public GestionMatricula() {
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public String calificar(float valor) {
        String mensaje = "";
        int num = this.matricula.addCalificacion(valor);
        switch (num) {
            case 0:
                mensaje += "Todas las notas están registradas.\n";
                break;
            case 1:
                mensaje += "Calificación de la Unidad I ==> Registrada\n";
                break;
            case 2:
                mensaje += "Calificación de la Unidad II ==> Registrada\n";
                break;
            case 3:
                mensaje += "Calificación de la Unidad III ==> Registrada\n";
                break;
            default:
                mensaje += "Error al registrar la calificación;\n";
                break;
        }
        return mensaje;
    }

    public void promediar() {
        this.matricula.calculaPromedio();
    }

    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante: ").append(matricula.getEstudiante()).append("\n");
        sb.append("Curso: ").append(matricula.getCurso().getTitulo()).append("\n");
        //sb.append("Calificaciones:");
        sb.append("Promedio: ").append(matricula.getPromedio()).append("\n");

        return sb.toString();
    }

    public String Anular(boolean op) {
        String r = "";
        if (op == true) {
            matricula.setEstado(Estado.Anulada);
            r += "La matricula" + matricula.toString() + "ha sido anulada. \n";
        }
        return r;
    }

    public void archivar() throws Exception {
        this.escribir(directorio, matricula.getNumero(), matricula);
    }

    public void configurar(Curso cr, Estudiante est) {
        this.matricula.setCurso(cr);
        this.matricula.setEstudiante(est);
    }

    public List<Matricula> reportar(String titulo) throws Exception {
        List<Matricula> r = new ArrayList<>();
        List<String> contenidos = this.leerDirectorio(directorio, titulo);
        for (String texto : contenidos) {
            GsonBuilder gb = new GsonBuilder();
            gb.setPrettyPrinting();
            Gson gson = gb.create();
            try {
                Matricula m = gson.fromJson(texto, Matricula.class);
                r.add(m);
            } catch (JsonSyntaxException e) {
                Util.imprimir("El archivo no se convirtio en Matricula"+ e.toString());
            }

        }
        return r;
    }

    @Override
    public void crear() {
        matricula = new Matricula();
    }

    @Override
    public void consultar(String id) {
        String archivo = id + ".json";
        String contenido;
        try {
            contenido = this.leer(directorio, archivo);
            GsonBuilder gb = new GsonBuilder();
            gb.setPrettyPrinting();
            Gson gson = gb.create();
            matricula = gson.fromJson(contenido, Matricula.class);
        } catch (Exception ex) {
            Util.imprimir(ex.toString());
        }

    }

    @Override
    public void actualizar() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
