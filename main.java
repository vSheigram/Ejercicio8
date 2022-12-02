public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(10);
        persona.setNombre("Pedro");
        persona.setTelefono(46412575);
        System.out.println("La edad de la persona es: " + persona.getEdad() + " , su nombre es: " + persona.getNombre() + " y su teléfono es: " + persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;

    }
    public void setTelefono ( int telefono){
        this.telefono = telefono;
    }

    public int getTelefono () {
        return this.telefono;
    }

}
