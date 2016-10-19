/*La Clase Java DatagramSocket representa una comunicacion de tipo Connection-Less
 * Para enviar y recibir paquetes de datagramas
 * Datagrama: Basicamente es informacion, pero no hay ninguna garantia de su contenido
 * o de tiempo de llegada
 * Paquete de datos que constituye el bloque minimo de informacion 
 * DatagramSocket es un mensaje que puede ser enviado o recibido.
 * Si se envian paquetes multiples, se puede llegar en cualquier orden.
 * Sin embargo, la entrega de paquetes no esta garantizada
 */
package cursohilosculiacancanaco.Viernes.Socket5;

//Envio de paquetes
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramSocketAndPacketTest {

    public static void main(String[] args) throws Exception {

        DatagramSocket ds = new DatagramSocket();
        String str = "Ya se nos acaba esto D:";
        InetAddress ip = InetAddress.getByName("127.0.0.1");

        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
        ds.send(dp);
        ds.close();
    }
}
