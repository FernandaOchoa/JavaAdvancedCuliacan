package cursohilosculiacancanaco.Viernes;

public class Estudiante2 extends Persona {
    String curso;
    int control;
    
    public Estudiante2(int id, String nombre, String curso, int control){
        super(id,nombre);
        this.curso = curso;
        this.control =control;
    }
    
}
