package cursohilosculiacancanaco.Lunes;

/*
 *Anonimo significa que no tiene nombre
Un objeto que no tiene referencia se dice que es anonimo
 */
public class ObjetoAnonimo {
    
    void fact(int n) {
        int fact = 1;
        
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("El factorial es: " + fact);
    }
    
    public static void main(String args[]) {
        new ObjetoAnonimo().fact(5);
    }
    
}
