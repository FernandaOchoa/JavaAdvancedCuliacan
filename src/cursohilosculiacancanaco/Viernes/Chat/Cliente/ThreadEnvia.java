package cursohilosculiacancanaco.Viernes.Chat.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;

//CLASE CLIENTE
public class ThreadEnvia implements Runnable{
    
    private final PrincipalCliente main;
    private ObjectOutputStream salida;
    private String mensaje;
    private Socket conexion;

    //manejar evento que ocurre en el campo de texto
    public ThreadEnvia(Socket conexion, final PrincipalCliente main){
        this.conexion = conexion;
        this.main = main;
        
        //Evento que ocurre
        main.campoTexto.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                mensaje = e.getActionCommand();
                //envio el mensaje
                enviarDatos(mensaje);
                
                //limpiamos el campo de texto
                main.campoTexto.setText(" ");
            }
        });
    }
    
    
    //Enviar un objeto al cliente
    private void enviarDatos(String mensaje) {
        try {
            salida.writeObject("Cliente: " + mensaje);
            salida.flush();
            main.mostrarMensaje("Cliente: " + mensaje);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //mostrar un mensaje
    public void mostrarMensaje(String mensaje) {
        main.areaTexto.append(mensaje);
    }

    //run
    public void run() {
        try {
            salida = new ObjectOutputStream(conexion.getOutputStream());
            salida.flush();

        } catch (SocketException se) {
            System.out.println(se);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        }
    }
    
}
