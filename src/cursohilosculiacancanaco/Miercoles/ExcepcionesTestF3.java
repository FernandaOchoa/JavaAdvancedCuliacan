package cursohilosculiacancanaco.Miercoles;

/**
 *
 * Caso 3 donde la excepcion si se maneja
 */
public class ExcepcionesTestF3 {

    public static void main(String[] args) {
        try {
            int dato = 25 / 0;
            System.out.println(dato);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        } finally {
            System.out.println("El bloque final siempre se ejecuta");
        }
        System.out.println("Resto de codigo...");
    }
}
