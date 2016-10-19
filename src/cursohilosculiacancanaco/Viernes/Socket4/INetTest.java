package cursohilosculiacancanaco.Viernes.Socket4;

import java.net.InetAddress;

public class INetTest {
    //La clase Inet Address representa una direccion ip
    //La clase java.net.InetAddress proporciona los metodos para obtener la ip
    //de cualquier nombre de host, por ejemplo: www.oracle.com, www.google.com, www.facebook.com, etc

    public static void main(String[] args) {

        try {
            InetAddress ip = InetAddress.getByName("www.oracle.com");
            System.out.println("Nombre del Host: " + ip.getHostName());
            System.out.println("Direccion IP: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
