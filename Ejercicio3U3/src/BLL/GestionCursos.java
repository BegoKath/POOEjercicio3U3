package BLL;

import BEU.Curso;
import Cardenas.BasePersistencia;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;

public class GestionCursos extends BasePersistencia<Curso> {

    private List<Curso> cursos = new ArrayList<>();

    public GestionCursos() {
       
    }

    public List<Curso> getCursos() throws Exception {

        String contenido = this.leer("cursos", "cursos.json");
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        Type listType = new TypeToken<ArrayList<Curso>>() {
        }.getType();
        cursos = gson.fromJson(contenido, listType);
        return cursos;
    }

}
