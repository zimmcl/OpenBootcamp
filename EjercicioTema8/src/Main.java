public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setEdad(18);
        persona1.setNombre("Emanuel");
        persona1.setTelefono("+34 123 456 789");
        Persona persona2 = new Persona(24, "Maria");
        System.out.println(persona1.getNombre() + " " + persona1.getEdad() + " " + persona1.getTelefono());
        System.out.println(persona2.getNombre() + " " + persona2.getEdad() + " " + persona2.getTelefono());
    }
}

//Clase Persona
class Persona {
//Atributos de clase
    private int edad;
    private String nombre;
    private String telefono;

//Constructores de clase
    public Persona(){}

    public Persona(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }

//Metodos de clase
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return telefono;
    }

}
