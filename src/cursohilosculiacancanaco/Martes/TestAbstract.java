package cursohilosculiacancanaco.Martes;

/*
En este ejemplo la implementacion es dada po las clases Circulo y Rectangulo
No sabemos acerca de la clase de implementacion( oculta para el usuario final )
y el objeto de la clase de implementacion es proporcionado por em metodo que lo construye (factory)

Un metodo factory es aquel que devuelve la instancia de la clase.
Se invoca al metodo en este ejemplo, se crea la instancia de la clase Rectangulo, llamamos al metodo Dibujar
de la clase Rectangulo
*/
abstract class Sombra {
    abstract void dibujar();
}

//En un escenario real, la implementacion es dada por otros... usuario por ejemplo
class RectanguloA extends Sombra{
    void dibujar(){
        System.out.println("Dibujando un rectangulo");
    }
    
}
class Circulos extends Sombra {
    void dibujar (){
        System.out.println("Dibujando un circulo");
    }
}

//En un escenario real, el metodo es llamado por el desarrollador o el usuario

public class TestAbstract {
    public static void main(String[] args) {
        Sombra s = new Circulos();
        s.dibujar();
    }
    
}
