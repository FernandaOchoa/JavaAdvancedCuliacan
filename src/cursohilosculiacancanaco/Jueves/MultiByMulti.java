package cursohilosculiacancanaco.Jueves;

/*
Multitasking por Multithreading
 */
public class MultiByMulti {

    public static void main(String[] args) {
        Ej t1 = new Ej();
        Ej2 t2 = new Ej2();

        t1.start();
        t2.start();
    }
}
class Ej extends Thread {

    public void run() {
        System.out.println("Tarea dos");
    }
}

class Ej2 extends Thread {

    public void run() {
        System.out.println("Tarea uno");
    }
}
