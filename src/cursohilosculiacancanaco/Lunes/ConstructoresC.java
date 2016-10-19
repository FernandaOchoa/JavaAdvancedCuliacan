package cursohilosculiacancanaco.Lunes;

/*
No hay un constructor de copia en java sin embargo, 
podemos copiar los valores de un objeto a otro constructor de copia como en C++

Hay muchas maneras de copiar los valores de un objeto a otro en java
Por el constructor
Por asignacion de valores de un objeto a otro
Por  clone() de la clase Object
 */

public class ConstructoresC {

    int id;
    String nombre;

    ConstructoresC(int i, String n) {
        id = i;
        nombre = n;
    }

    ConstructoresC(ConstructoresC c) {
        id = c.id;
        nombre = c.nombre;
    }

    void mostrar() {
        System.out.println(id + " " + nombre);
    }

    public static void main(String[] args) {
        ConstructoresC c1 = new ConstructoresC(1, "Fernanda");
        ConstructoresC c2 = new ConstructoresC(c1);

        c1.mostrar();
        c2.mostrar();
    }

}
