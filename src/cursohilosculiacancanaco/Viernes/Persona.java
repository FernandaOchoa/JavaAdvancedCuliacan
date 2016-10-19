package cursohilosculiacancanaco.Viernes;

import java.io.Serializable;

public class Persona implements Serializable {

    int id;
    String nombre;

    Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

}
