
package cursohilosculiacancanaco.Martes;


public class Polimorfismo1 {
    void run(){
        System.out.println("corriendo...");
    }
}

class Principal extends Polimorfismo1 {
    void run(){
        System.out.println("corriendo a 60km");
    }
    /*
    Creamos dos clases Polimorfismo1 y Principal
    La clase Principal (que es una subclase de Polimorfismo1) extiende de Polimorfismo
    Llamamos en el metodo main la variable de referencia de la clase padre.
    Ya que se refiere al objeto y metodo de la subclase sobreescribe el metodo del padre por el de la subclase
    que se invoca en tiempo de ejecucion.
    A esto se le conoce como Polimorfismo de tiempo de ejecucion
    */
    public static void main(String[] args) {
        Polimorfismo1 p = new Principal();
        p.run();
    }
}
