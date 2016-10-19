
package cursohilosculiacancanaco.Miercoles;

/*
 * Cuando la excepcion ocurre pero no es manejada
 * Caso 2
 */
public class ExcepcionesTestF2 {
    public static void main(String[] args) {
        try {
            int dato = 25/0;
            System.out.println(dato);
        }catch(NullPointerException npe){
            System.out.println(npe);
        }finally {
            System.out.println("El bloque final siempre se ejecuta");
        }
        System.out.println("Resto de codigo ");
    }
}
