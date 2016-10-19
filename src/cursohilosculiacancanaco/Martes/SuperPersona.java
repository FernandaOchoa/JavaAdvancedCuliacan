
package cursohilosculiacancanaco.Martes;
//Super utilizado para invocar un metodo de la clase padre
public class SuperPersona {
    void mensaje (){
        System.out.println("Bienvenido");
    }
}

class Estudiante extends SuperPersona{
    void mensaje(){
        System.out.println("Bienvenidos todos");
    }
    
    void mostrar(){
        mensaje(); 
        super.mensaje();
    }
    
    public static void main (String [] args){
        Estudiante es = new Estudiante();
        es.mostrar();
    }
    
}

