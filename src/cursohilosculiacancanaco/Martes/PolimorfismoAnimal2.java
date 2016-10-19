package cursohilosculiacancanaco.Martes;

public class PolimorfismoAnimal2 {

    void comer() {
        System.out.println("Animal comiendo");
    }

}

class Perro2 extends PolimorfismoAnimal2 {

    void comer() {
        System.out.println("El perro esta comiendo");
    }
}

class Cachorro1 extends Perro2 {

    public static void main(String[] args) {
        PolimorfismoAnimal2 a = new Cachorro1();
        a.comer();
    }
}
