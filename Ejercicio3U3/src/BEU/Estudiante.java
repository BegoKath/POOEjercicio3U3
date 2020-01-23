package BEU;

import Cardenas.Persona;
import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {

    private String carrera;
    private final List<String> clubes = new ArrayList<>();

    public List<String> getClubes() {
        return clubes;
    }
    public void addClub(String club){
        if(!club.isEmpty()){
        this.clubes.add(club);
        }
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

}
