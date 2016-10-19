
package cursohilosculiacancanaco.Miercoles;

import java.io.IOException;

/*
 *
 * 
 */
public class ExceptionTestTs {
    
    void m() throws IOException{
        throw new IOException("Error");
    }
    void n() throws IOException {
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("Excepcion capturada");
        }
    }
    
    public static void main(String[] args) {
        ExceptionTestTs obj = new ExceptionTestTs();
        obj.p();
        System.out.println("Flujo normal... resto de codigo");
    }
}
