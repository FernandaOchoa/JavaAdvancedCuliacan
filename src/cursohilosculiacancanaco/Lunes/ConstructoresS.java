
package cursohilosculiacancanaco.Lunes;
/*
La sobrecarga de constructores es una tecnica en java donde cada clase puede tener 
n cantidad de constructores siempre y cuando cambien los parametros en tipo de dato o cantidad
*/
public class ConstructoresS {
    
    int id;
    String nombre;
    int edad;
    
    ConstructoresS(int i, String n){
        id = i;
        nombre = n;
    } 
    
    ConstructoresS(int i, String n, int e){
        id = i;
        nombre = n;
        edad = e;
    }
    void mostrar (){
        System.out.println(id+ " "+nombre+" "+edad);
    }
    
    public static void main (String[] args){
        ConstructoresS c1 = new ConstructoresS(1, "Fer");
        ConstructoresS c2 = new ConstructoresS(2,"Everardo",32);
        
        c1.mostrar();
        c2.mostrar();
    }
}
