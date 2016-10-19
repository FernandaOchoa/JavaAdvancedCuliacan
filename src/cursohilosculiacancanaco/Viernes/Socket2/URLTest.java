package cursohilosculiacancanaco.Viernes.Socket2;
//La clase URL de java representa una URL (Uniform Resource Locator)

import java.net.URL;

public class URLTest {
    //Apunta a un recurso de la WWW(World Wide Web)

    public static void main(String[] args) {
        try {
            URL url = new URL("https://wwww.oracle.com/java");
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Nombre del Host: " + url.getHost());
            System.out.println("Numero del puerto: " + url.getPort());
            System.out.println("Nombre del archivo: " + url.getFile());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
