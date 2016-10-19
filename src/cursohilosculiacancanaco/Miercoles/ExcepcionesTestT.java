package cursohilosculiacancanaco.Miercoles;

/*
 * 
 *  Throws es una palabra usada para expresar que hay una excepcion
 */
public class ExcepcionesTestT {

    static void valido(int age) {
        if (age < 18) {
           
            throw new ArithmeticException("no es valido");

        } else {
            System.out.println("Bienvenido a las votaciones");
        }
    }

    public static void main(String[] args) {
        valido(18);
        System.out.println("Resto del codigo");
    }

}
