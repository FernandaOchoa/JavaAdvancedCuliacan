package cursohilosculiacancanaco.Viernes;

import java.io.Serializable;

public class TransientTest implements Serializable{
    
    int id;
    String nombre;
    
    transient int edad;
    
    public TransientTest(int id, String nombre, int edad){
        this.id= id;
        this.edad = edad;
        this.nombre= nombre;
    }
    
}
