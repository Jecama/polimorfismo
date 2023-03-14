public class Persona {
    //declarar privadas para que cumpla con el método persona
    private String nombre;
    private String apellido;
    private int edad;

    Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void mostrarInformacion(){
        System.out.println("los datos son:"+nombre+" "+apellido+" "+edad);
    }
}
