//extends Persona es para mostrar que se esta heredando de la clase padre
public class Trabajador extends Persona{
    private double salario;

    public Trabajador(String nombre,String apellido,int edad,double salario){
        super(nombre, apellido,edad);
        this.salario = salario;
    }

    /*se hereda y adicciona información del método de la clase padre. -- cuando no se deba adiccionar se
    coloca @override y después se llama el método -- mostrarInformación();  */
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println(" El salario del trabajador es: "+salario);
    }

}