/* Ciclo de Vida de un hilo
 *1.- New: El hilo no existe, se crea una instancia de la clase Thread, pero antes de la invocacion del metodo
start
2.- Runnable: El hilo no esta ejecutandose despues de la invocacion del metodo start()
3.- Running: El hilo esta ejecutandosesi el programador de tareas lo permite
4.- Non-Runnable (Blocked): Aqui sigue vivo, pero no es elegible para funcionar
5.- Terminated: El hilo es terminado o muerto... 
 */
package cursohilosculiacancanaco.Miercoles.Threads;

/*
 * Callbacks de Thread
 * public void run():
 *
 */
public class CallBacksThreads extends Thread {
    /*
     * public void run(){
        //Se utiliza para realizar la accion de un hilo
        }
        public void start(){
        //Inicia la ejecucion de un hilo, la JVM llama al metodo run() del hilo
    }
    public void sleep(/*long milisegundos ){
        //Hace que el hilo que se ejecute tenga un retraso dependiendo de la cantidad que sea determinada
        //en sus parametros
    }
  
    public void join(){
        //Espera que un hilo se muera
    }
    public void join(/*long milisec ){
        //Espera a que un hilo se muera en un determinado tiempo
    }
    public int getPriority(){
        //Regresa la prioridad del hilo
    }
    public int setPriority(){
        //Indica la prioridad del hilo
    }
    public String getName(){
        //Regresa el nombre del hilo
    }
    public void setName(){
        //Asigna el nombre del hilo
    }
    public Thread currentThread(){
        //Regresa la referencia exacta de donde se encuentra el hilo
    }
    public int getId(){
        //Regresa el id del hilo
    }
    public Thread.State getState(){
        //Regresa el estado o situacion actual del hilo
    }
    public boolean isAlive(){
        //Prueba si el hilo esta vivo
    }
    public void yield(){
        //Hace que el hilo que se ejecute en ese momento se pause para permitir que otros hilos
        //se ejecuten en ese momento, segun su prioridad
    }
    public void suspend(){
        //Esta deprecado Es usado para suspender el hilo actual
    }
    public void resume(){
        //Esta deprecado Se utiliza para reanudar el hilo
    }
    public void stop(){
        //Esta deprecado Se utiliza para detener el hilo
    }
    public boolean isDaemon(){
        //Prueba si el hilo es un hilo de sistema o de usuario
    }
    public void setDaemon(){
        //Prueba si el hilo es un demonio
    }
    public void interrupt(){
        //interrumpe el hilo
    }
    public boolean isInterrupted(){
        //Prueba si el hilo ha sido interrumpido
    }
    public static boolean interrupted(){
        //prueba si el hilo ha sido interrumpido
    }

     */
}
