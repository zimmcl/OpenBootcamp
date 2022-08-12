public class Main {
    public static void main(String[] args) {
        //Instanciamos objeto
        Coche micoche = new Coche(4);

        //Invocamos métodos
        micoche.get_puertas();
        micoche.set_puertas(1);
        micoche.get_puertas();
        micoche.set_puertas(2);
        micoche.get_puertas();

    }
}

//Definimos la clase Coche
class Coche {
    //Atributos
    private int puertas;

    //Constructor
    public Coche(int puertas) {
        this.puertas = puertas;
    }

    //Metodos
    public void set_puertas(int val) {
        this.puertas += val;
    }
    public void get_puertas() {
        System.out.println("Cantidad de puertas: " + this.puertas);
    }
}
