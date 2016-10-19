/*
Si una clase tiene multiples metodos con el mismo nombre pero diferentes parametros, se conoce como Sobrecarga de Metodos
Proporcionando asi mejor legibilidad del programa
 */
package cursohilosculiacancanaco.Lunes;

/*
 * Formas de sobrecargar un metodo
 *  Cambiando el numero de argumentos
*   cambiando el tipo de dato
 */
public class SobrecargaArgumentos {

    void suma(int a, int b) {
        System.out.println(a + b);
    }

    void suma(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        
        SobrecargaArgumentos objeto = new SobrecargaArgumentos();
        
        objeto.suma(20, 20);
        objeto.suma(10, 10, 10);
    }

}
