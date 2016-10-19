package cursohilosculiacancanaco.Lunes;

public class Rectangulo {
    
    int alto;
    int ancho;
    
    void insertar(int a, int an){
        
        alto = a;
        ancho = an;
    }
    
    void calcularArea(){
        System.out.println(alto * ancho);
    }
    
    public static void main(String [] args){
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();
        
        //Definicion de multiples objetos
        Rectangulo r3 = new Rectangulo(), r4= new Rectangulo(), r5 = new Rectangulo();
        
        r3.insertar(2, 10);
               
        r1.insertar(11, 5);
        r2.insertar(3, 15);
        
        r1.calcularArea();
        r2.calcularArea();
        r3.calcularArea();
    }
    
}
