package cursohilosculiacancanaco.Martes;

/*
Si una subclase tiene el mismo metodo declarado en la clase padre es conocido como un metodo con sobre
escritura.
Reglas para Sobreescribir Metodos
1.- El metodo debe tener el mismo nombre que la clase padre
2.- El metodo debe tener la misma cantidad de parametros que la clase padre
3.- Debe ser heredado
 */
//Sobreescritura = vehiculo
public class Sobreescritura {

    void run() {
        System.out.println("El vehiculo esta corriendo");
    }
}

class Bicicleta extends Sobreescritura {

    void run() {
        System.out.println("La bicileta esta corriendo :D");
    }

    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        bici.run();
    }
}
