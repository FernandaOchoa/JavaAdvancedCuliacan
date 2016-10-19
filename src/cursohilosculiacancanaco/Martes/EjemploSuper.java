package cursohilosculiacancanaco.Martes;

/*
La palabra reservada super es una variable de referencia que es usada como 
intermediario entre la clase padre y el objeto

Usos de la palabra Super
Super se utiliza para referirse al padre inmedianto de la variable de instancia
Super() se utiliza para invocar al constructor de la clase padre inmediata
Super se utiliza para invocar al metodo de la clase padre inmediata
 */

//Super como referencia del padre inmediato 
//EjemploSuper = vehiculo
public class EjemploSuper {

    int velocidad = 50;
}

class Bicicleta2 extends EjemploSuper {

    int velocidad = 100;

    void mostrar() {
        System.out.println(velocidad);
    }

    public static void main(String[] args) {
        Bicicleta2 bici2 = new Bicicleta2();
        bici2.mostrar();
    }
}
