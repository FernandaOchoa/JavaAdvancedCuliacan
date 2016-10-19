package cursohilosculiacancanaco.Viernes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TransientT2Des {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\f.txt"));
        
        TransientTest es = (TransientTest) in.readObject();
        
        System.out.println(es.id + " " + es.nombre+" "+es.edad);
        
        in.close();
    }

}
