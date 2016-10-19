package cursohilosculiacancanaco.Martes;

//Cuando Super no es Requerido
public class EjemploSuper5 {

    void mensaje() {
        System.out.println("Bienvenido");
    }
}

class Estudiante2 extends EjemploSuper5 {

    void mostrar() {
        mensaje();
    }

    public static void main(String[] args) {
        Estudiante2 es = new Estudiante2();
        es.mostrar();
    }

}
