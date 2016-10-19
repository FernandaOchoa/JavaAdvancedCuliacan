package cursohilosculiacancanaco.Viernes;

import java.io.Serializable;

public class Estudiante implements Serializable {

    int id;
    String nombre;

    public Estudiante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
