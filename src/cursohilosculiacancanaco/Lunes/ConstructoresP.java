package cursohilosculiacancanaco.Lunes;

/*
Un constructor  que tiene parametros se conoce como parametrizado
Provee diferentes valores a distintos objetos
*/
public class ConstructoresP {
    
    int id;
    String nombre;
    
    ConstructoresP(int i, String n){
      id = i;
      nombre = n;
    }
    
    void mostrar(){
        System.out.println(id+" "+nombre);
    }
    
    public static void main (String[] args){
        
        ConstructoresP c1 = new ConstructoresP(1, "Fernanda");
        ConstructoresP c2 = new ConstructoresP(2,"Uriek");
        
        c1.mostrar();
        c2.mostrar();
    }
    
    
}
