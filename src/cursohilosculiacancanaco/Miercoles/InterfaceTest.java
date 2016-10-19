/*
 * Interface -> Es un modelo de una clase, Tiene constantes estaticas y metodos abstractos
 * Una interfaz en java es un mecanismo que busca lograr una abstraccion
 * No se pueden crear instancias como clase abstracta
 * En las interfaces se especifica Qué se debe hacer pero NO su IMPLEMENTACION.
 * La clase que la implemente sera quien describa la logica del comportamiento de sus metodos.

   * Organizan el codigo
   * Permiten declarar constantes que estaran disponibles para todas las clases siempre y cuando se implemente
   * Obligamos a que ciertas clases utiicen los mismos métodos (Nombres y Parametros)
   * Establecer una relacion con clases no realacionadas

 -"http://docs.oracle.com/javase/tutorial/java/concepts/interface.html"
 */
package cursohilosculiacancanaco.Miercoles;

/*
 *
 * En otras palabras, los campos de la interfaz son publicos, estaticos y final, por defecto y los metodos son 
publics y abstractos
 */

//Declaro mi interfaz con el nombre InterfaceTest
interface InterfaceTest {
    //Declaro el uso de un metodo llamado print (Que va a hacer? - no se :/)
    void print();
    
}

//Declaro una clase llamada InterfaceTestC que implementa, es decir, va a usar una interfaz llamada InterfaceTest
class InterfaceTestC implements InterfaceTest {
    
    //Recuerdan el metodo que no sabiamos que hacia?, bueno aqui sabremos que hace... solo imprime caritas xD
    public void print(){
        //tambien un hola...
        System.out.println("Hola :D");
    }
    
    //Tengo mi metodo principal...string.. bla bla bla..
    
    /**
     * 
     * @param args <- Cualquier argumento de tipo String 
     */
    public static void main(String [] args){
        //Creo un objeto de tipo InterfaceTestC <- Osea mi clase ... la unica que tengo 
        InterfaceTestC obj = new InterfaceTestC();
        
        //Bueno uso mi objeto para acceder a la interface y traer el metodo print que esta dentro de mi interfaz
        obj.print();
    }
}
 





