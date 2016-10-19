/*
*  Un constructor es un tipo especial de metodo utilizado para inicializar el objeto
* El constructor de java es invocado y se crea en el tiempo de ejecucion,

* Reglas para la creacion de un constructor en java
1.- El constructor debe tener el mismo nombre que la clase que lo contiene
2.- El constructor no debe tener un tipo especifico de retorno

Hay 2 tipos de constructores
Constructor por default (No tiene argumentos) - Un constructor sin parametros es el default
Parametrizados (Con argumentos)
 */
package cursohilosculiacancanaco.Lunes;

public class Constructores {
    
    Constructores(){
        System.out.println("Hola soy un Constructor por Default");
    }
    public static void main (String [] args){
        Constructores c = new Constructores();
    }
    
}
