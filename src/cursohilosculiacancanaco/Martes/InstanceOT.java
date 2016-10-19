package cursohilosculiacancanaco.Martes;

/*
Instance Of se utiliza para comprobar si el objeto es una instancia de un tipo especificado
(Clase o subclase de la interfaz)

Tambien se conoce como un tipo de comparacion, por que compara la instancia del tipo
Nos devuelve un verdadero o falso, si aplicamos el operador instanceof con cualquier variable que tiene
un valor nulo nos regresara un false
 */

public class InstanceOT {

    public static void main(String[] args) {
        InstanceOT s = new InstanceOT();
        System.out.println(s instanceof InstanceOT);
    }

}
