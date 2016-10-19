package cursohilosculiacancanaco.Martes;
//Declarando variables finales en blanco, solo en el constructor hay que inicializarla
public class FinalEjemploS2 {
    final int limite;
    
    FinalEjemploS2(){
        limite=70;
        System.out.print(limite);
    }
    
    public static void main(String[] args) {
        new FinalEjemploS2();
    }
}
