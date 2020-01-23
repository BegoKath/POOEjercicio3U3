package BLL;

import BEU.Guia;
import Cardenas.BasePersistencia;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GestionGuia extends BasePersistencia<Guia> {

    private List<Guia> Guia = new ArrayList<>();

    public GestionGuia() {

    }

    public List<Guia> getGuia() throws Exception {

        String contenido = this.leer("Guias", "Guias.json");
        GsonBuilder gb = new GsonBuilder();
        gb.setPrettyPrinting();
        Gson gson = gb.create();
        Type listType = new TypeToken<ArrayList<Guia>>() {
        }.getType();
        Guia = gson.fromJson(contenido, listType);
        return Guia;
    }
}
