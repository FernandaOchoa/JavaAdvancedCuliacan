package cursohilosculiacancanaco.Martes;

public class PolimorfismoAnimal {

    void comer() {
        System.out.println("Comiendo...");
    }
}

class Perro extends PolimorfismoAnimal {

    void comer() {
        System.out.println("Comiendo croquetas");
    }
}

class Cachorro extends Perro {

    void comer() {
        System.out.println("Tomando leche");
    }

    public static void main(String[] args) {
        PolimorfismoAnimal a1, a2, a3;

        a1 = new PolimorfismoAnimal();
        a2 = new Perro();
        a3 = new Cachorro();

        a1.comer();
        a2.comer();
        a3.comer();
    }
}
