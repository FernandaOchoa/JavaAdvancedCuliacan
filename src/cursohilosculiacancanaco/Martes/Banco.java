package cursohilosculiacancanaco.Martes;

//Tambien es ejemplo de polimorfismo
public class Banco {

    int RangoInteres() {
        return 0;
    }

}

class Bancomer extends Banco {

    int RangoInteres() {
        return 8;
    }
}

class Ixe extends Banco {

    int RangoInteres() {
        return 7;
    }
}

class BanCoppel extends Banco {

    int RangoInteres() {
        return 9;
    }
}

class Prueba {
    public static void main (String[] args){
        Bancomer bancomer = new Bancomer();
        Ixe ixe = new Ixe();
        BanCoppel bancoppel = new BanCoppel();
        
        System.out.println("Bancomer tasa de Interes:  "+bancomer.RangoInteres());
        System.out.println("Ixe tasa de Interes:  "+ixe.RangoInteres());
        System.out.println("BancCoppel tasa de Interes:  "+bancoppel.RangoInteres());
    }
}
















