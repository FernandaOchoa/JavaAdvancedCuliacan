package cursohilosculiacancanaco.Lunes;

public class Contador {
    int contador = 0;
    
    
    Contador(){
        contador++;
        System.out.println(contador);
    }
    public static void main (String [] args){
        Contador con1 = new Contador(), con2 = new Contador(), con3 = new Contador();
        
    }
    
}
