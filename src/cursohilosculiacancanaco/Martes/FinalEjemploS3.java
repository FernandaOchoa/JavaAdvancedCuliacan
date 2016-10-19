package cursohilosculiacancanaco.Martes;
//Variable Estatica Final
// Una variable estatica que no es inicializada al momento de declararse se conoce como una variable en blanco final
// y solo puede ser inicializada en un bloque estatico

public class FinalEjemploS3 {

    static final int datos;

    static {
        datos = 50;
    }

    public static void main(String[] args) {
        System.out.println(FinalEjemploS3.datos);
    }

}
