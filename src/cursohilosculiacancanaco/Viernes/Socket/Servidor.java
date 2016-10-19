package cursohilosculiacancanaco.Viernes.Socket;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) {
        try {
            ServerSocket socket = new ServerSocket(6666);
            //Establecemos la conexion

            Socket s = socket.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());

            String str = (String) dis.readUTF();
            System.out.println("Mensaje: " + str);
            socket.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
