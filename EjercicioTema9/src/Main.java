public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1, 18, "Juan", "+34 123 456 789", 155);
        Cliente cliente2 = new Cliente(2);
        Trabajador trabajador1 = new Trabajador(3, 25, "Emilio", "+34 987 654 321", 5000);
        Trabajador trabajador2 = new Trabajador(4);
        System.out.println("El cliente ID: " + cliente1.getID());
        System.out.println("Nombre: " + cliente1.getNombre() + " - Edad: " + cliente1.getEdad() + " - Telefono: " + cliente1.getTelefono() + " - Creditos: " + cliente1.getCredito());
        System.out.println("El cliente ID: " + cliente2.getID());
        System.out.println("Nombre: " + cliente2.getNombre() + " - Edad: " + cliente2.getEdad() + " - Telefono: " + cliente2.getTelefono() + " - Creditos: " + cliente2.getCredito());
        System.out.println("El trabajador ID: " + trabajador1.getID());
        System.out.println("Nombre: " + trabajador1.getNombre() + " - Edad: " + trabajador1.getEdad() + " - Telefono: " + trabajador1.getTelefono() + " - Creditos: " + trabajador1.getSalario());
        System.out.println("El trabajador ID: " + trabajador2.getID());
        System.out.println("Nombre: " + trabajador2.getNombre() + " - Edad: " + trabajador2.getEdad() + " - Telefono: " + trabajador2.getTelefono() + " - Creditos: " + trabajador2.getSalario());


    }
}

interface uniqueObject<I> {
    I getID();

}

class Persona implements uniqueObject<Integer> {
    //Atributos
    private Integer personaID;
    private int edad;
    private String nombre;
    private String telefono;

    //Constructores
    public Persona(Integer personaID) {
        this.personaID = personaID;
        edad = 99;
        nombre = "Anonimo_".concat(personaID.toString());
        telefono = personaID.toString();

    }

    public Persona(Integer personaID, int edad, String nombre, String telefono) {
        this.personaID = personaID;
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;

    }

    //Metodos
    @Override
    public Integer getID() {
        return personaID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    //Atributos
    private int credito;

    //Constructores
    public Cliente(Integer clienteID) {
        super(clienteID);
        this.credito = 999;
    }

    public Cliente(Integer clienteID, int edad, String nombre, String telefono, int credito) {
        super(clienteID, edad, nombre, telefono);
        this.credito = credito;
    }

    //Metodos
    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }
}

class Trabajador extends Persona {
    //Atributos
    private float salario;

    //Constructores
    public Trabajador(Integer clienteID) {
        super(clienteID);
        this.salario = 1595.25f;
    }

    public Trabajador(Integer clienteID, int edad, String nombre, String telefono, float salario) {
        super(clienteID, edad, nombre, telefono);
        this.salario = salario;
    }

    //Metodos
    public void setCredito(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }
}