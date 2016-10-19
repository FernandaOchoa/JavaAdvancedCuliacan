
package cursohilosculiacancanaco.Martes;
interface Print{
    
}
public class A implements Print {
    public void a(){
        System.out.println("metodo a");
    }
}
class B implements Print {
    public void b(){
        System.out.println("metodo b");
    }
}

class Llamadas {
    //Upcasting
    void llamar(Print p){
        if(p instanceof A){
            //Downcasting
            A a=(A)p;
            a.a();
        }
        if (p instanceof B){
            //Downcasting
            B b= (B)p;
            b.b();
        }
    }
}
class Test{
    public static void main(String[] args) {
        Print p = new B();
        Llamadas c = new Llamadas();
        c.llamar(p);
    }
}