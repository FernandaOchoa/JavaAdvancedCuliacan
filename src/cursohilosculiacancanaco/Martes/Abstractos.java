package cursohilosculiacancanaco.Martes;
/*
Una clase que se declara con la palabra reservada abstract se conoce como abstracta
Puede tener metodos abstractos y no abstractos

Abstraccion: Proceso para ocultar los detalles de implementacion, mostrando solo la funcionalidad
para el usuario.
La abstraccion permite centrarse en lo que hace el objeto sin pensar en como lo hace?

Formas de lograr una Abstraccion
Clase Abstract 
Interface
*/

//Necesita de una implementacion de tipo extends
//No se pueden crear instancias
abstract class Abstractos {
    //un metodo es declarado abstracto cuando no tiene una implementcion
    abstract void printS();
    
}

/*
En este ejemplo la clase bici es abstracta y contiene solo un metodo, la 
implementacion se da por medio de MarcaB
*/
abstract class Bici{
    abstract void run();
}

class MarcaB extends Bici {
    void run(){
        System.out.println("Corriendo...");
    }
    
    public static void main(String[] args) {
        Bici b = new MarcaB();
        b.run();
    }
} 
