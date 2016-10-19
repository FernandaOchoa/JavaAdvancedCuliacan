package cursohilosculiacancanaco.Martes;

public class UnionDinamica {

    void comer() {
        System.out.println("Animal comiendo");
    }
}

class Perro5 extends UnionDinamica {

    void comer() {
        System.out.println("El perro esta comiendo");
    }

    public static void main(String[] args) {
        UnionDinamica a = new Perro5();
        a.comer();
    }
}
