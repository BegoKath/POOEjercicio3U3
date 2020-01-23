package BLL;

import BEU.Actividad;
import Cardenas.BasePersistencia;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GestionActividades extends BasePersistencia<Actividad>{
    
    private List<Actividad> actividades = new ArrayList<>();

    public GestionActividades() {
       
    }

    public List<Actividad> getActividades() throws Exception {

        String contenido = this.leer("actividades", "actividades.json");
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        Type listType = new TypeToken<ArrayList<Actividad>>() {
        }.getType();
        actividades = gson.fromJson(contenido, listType);
        return actividades;
    }
}
