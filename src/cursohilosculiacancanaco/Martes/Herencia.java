package cursohilosculiacancanaco.Martes;

/*
 * Herencia es un mecanismo en que un objeto aquiere todas las propiedades
* y comportamientos de un objeto padre
 * Se usa principalmente para Sobreescribir y la reutilizacion del codigo

* La palabra xtends indica que estas haciendo una clase que deriva de una clase que ya existe
* en java lo anterior se dice Subclase

* Tipos de Herencia en Java
Existen 3 tipos de herencia: Unica, Multinivel, jerraquica
 */
public class Herencia {

    float salario = 40000;
}

class Heredado extends Herencia {

    int bono = 10000;

    public static void main(String[] args) {

        Heredado h = new Heredado();
        System.out.println("El salario heredado es: " + h.salario);
        System.out.println("El bono heredado es: " + h.bono);
    }
}
