package cursohilosculiacancanaco.Jueves.Sincronizacion;

/*
Sincronizacion en Java
    Es la capacidad de controlar el acceso de multiples hilos a cualquier recurso compartido
    Es la mejor opcion cuando queremos permitir un solo hilo para tener acceso al recurso que se comparte
    
    ventajas
    Previene la interferencia entre hilos
    Ayuda a prevenir problemas de consistencia
    
    tipos de sincronizacion
    Procesos
    Hilos
    
    Subprocesos
    Dos tipos de comunicacion: Exclusion Mutua y la Inter-Hilos
    
    1.- Exclusion Mutua con el metodo Synchronized
    2.- Synchronized block
    3.- Synchronized static
 */
//Cuando no hay sincronizacionTest = mesa
public class SincronizacionTest {

    public static void main(String[] args) {
        Mesa obj = new Mesa();
        Hilo t1 = new Hilo(obj);
        Hilo2 t2 = new Hilo2(obj);

        t1.start();
        t2.start();
    }

}

class Hilo extends Thread {

    Mesa s;

    Hilo(Mesa s) {
        this.s = s;
    }

    public void run() {
        s.imprimir(100);
    }
}
class Hilo2 extends Thread {
    Mesa s;

    Hilo2(Mesa s) {
        this.s = s;
    }

    public void run() {
        s.imprimir(5);
    }
}

class Mesa extends Thread {

    void imprimir(int n) {
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
