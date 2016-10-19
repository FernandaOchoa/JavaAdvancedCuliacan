package cursohilosculiacancanaco.Miercoles;

/*
 *Ejempllo donde la excepcion no ocurre
 * Caso 1
 */
public class ExcepcionesTestF {

    public static void main(String[] args) {
        try {
            int dato = 25 / 5;
            System.out.println(dato);
        } catch (NullPointerException npe) {
            System.out.println(npe);
        } finally {
            System.out.println("El bloque final siempre se ejecuta");
        }

        System.out.println("Resto de codigo..");
    }
}
