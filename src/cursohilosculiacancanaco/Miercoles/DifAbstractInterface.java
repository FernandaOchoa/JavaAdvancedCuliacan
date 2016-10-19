package cursohilosculiacancanaco.Miercoles;

/*
Diferencia entre la clase abstracta e interfaz
Ambas se utilizan para conseguir una abstraccion, podemos declarar los metodos abstractos.
Sin embargo de una clase abstracta y de una interfaz no se pueden crear instancias

Abstract
La clase Abstracta puede tener metodos Abstractos y No Abstractos
La clase Abstracta no soporta la herencia multiple
La clase Abstracta permite valores Final, Estaticos y No Estaticos
La clase Abstracta puede tener metodos Estaticos, Main y Constructor
La clase Abstracta puede proveer de la implementacion de una Interfaz
La palabra Abstract es usada para declarar una clase Abstracta

Ejemplo
public abstract class Sombra {
    public abstract void dibujar();
   }
}

Interface
La interface solo puede contener metodos abstractos
La interface si soporta la herencia multiple
La interface solo permite variables Final y Estaticas
La interface no puede contener metodos Estaticos, metodo Main o un Constructor
La interdace no puede proveer la implementacion de una clase abstracta
La palabra reservada interface solo es usada para declarar una interface

Ejemplo
public interface Dibujar {
    void dibuja();
}

 */
//Creo una interface con 4 metodos, por default aunque no lo especifique son publicos y abstractos
interface A {

    void a();

    void b();

    void c();

    void d();
}

//Creo una clase abstracta que implementa un metodo de la interface A
abstract class B implements A {

    public void c() {
        System.out.println("Hola soy una C");
    }
}

//Creo una subclase de una clase abstracta, ahora necesito proveer la implementacion de los metodos restantes
class M extends B {

    public void a() {
        System.out.println("Hola soy una A");
    }

    public void b() {
        System.out.println("Hola soy una B");
    }

    public void d() {
        System.out.println("Hola soy una D");
    }
}

public class DifAbstractInterface {

    public static void main(String[] args) {
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}














