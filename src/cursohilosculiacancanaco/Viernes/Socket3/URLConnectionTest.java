package cursohilosculiacancanaco.Viernes.Socket3;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
//La clase de java URL Connection representa un enlace de comunicacion entre la URL y la aplicacion
public class URLConnectionTest {
    //Esta clase se utiliza para leer y escribir datos en el recurso por la URL
    public static void main(String[] args) {
        try{
            URL url = new URL("http://www.oracle.com/java");
            URLConnection urlcon = url.openConnection();
            
            InputStream stream = urlcon.getInputStream();
            
            int i;
            while((i = stream.read())!=-1){
                System.out.println((char)i);
                
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
