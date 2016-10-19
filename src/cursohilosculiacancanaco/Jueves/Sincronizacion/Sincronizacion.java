package cursohilosculiacancanaco.Jueves.Sincronizacion;

public class Sincronizacion {

    public static void main(String[] args) {
        Numero num = new Numero();
        MyHilo t1 = new MyHilo(num);
        MyHilo2 t2 = new MyHilo2(num);

        t1.start();
        t2.start();

    }

}
class Numero {

    synchronized void print(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);

            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyHilo extends Thread {

    Numero n;

    MyHilo(Numero n) {
        this.n = n;
    }

    public void run() {
        n.print(5);
    }
}

class MyHilo2 extends Thread {

    Numero n;

    MyHilo2(Numero n) {
        this.n = n;
    }

    public void run() {
        n.print(100);
    }
}


