package cursohilosculiacancanaco.Viernes.Chat.Cliente;

//Clase CLIENTE
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.SocketException;

public class ThreadRecibe implements Runnable {

    private final PrincipalCliente main;
    private String mensaje;
    private ObjectInputStream entrada;
    private final Socket cliente;

    public ThreadRecibe(Socket cliente, PrincipalCliente main) {
        this.cliente = cliente;
        this.main = main;

    }

    public void mostrarMensaje(String mensaje) {
        main.areaTexto.append(mensaje);
    }

    public void run() {
        try {
            entrada = new ObjectInputStream(cliente.getInputStream());
        } catch (Exception e) {
            System.out.println(e);
        }
        do {
            //Procesar los mensajes enviados al servidor
            try {

                mensaje = (String) entrada.readObject();
                main.mostrarMensaje(mensaje);

            } catch (SocketException se) {
                System.out.println(se);

            } catch (EOFException eofe) {
                System.out.println(eofe);
            } catch (IOException ioe) {
                System.out.println(ioe);
            } catch (ClassNotFoundException cnfe) {
                System.out.println(cnfe);
            }
        } while (!mensaje.equals("Cliente stop"));

        try {
            entrada.close();
            cliente.close();

        } catch (IOException ioe) {
            main.mostrarMensaje("Fin de la Conexion");
            System.exit(0);
        }
    }
}
