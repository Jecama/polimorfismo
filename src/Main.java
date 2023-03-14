import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // acá llamamos a la clase padre
        Persona persona1 = new Persona("Karen","Cortes",29);
        // acá llamamos a la clase hija
        Trabajador trabajador1 = new Trabajador("Maria","Castaño",30,2500000);
        Trabajador trabajador2 = new Trabajador("Wilmara","Ruiz",29,12000000);
        Trabajador trabajador3 = new Trabajador("Andre","Saavedra",20,25000000);
        Trabajador trabajador4 = new Trabajador ("Natalia", "Diaz",25,10000000);
        Trabajador trabajador5 = new Trabajador ("Aleyda","Anaya",23,200000000);

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(trabajador1);
        personas.add(trabajador2);
        personas.add(trabajador3);
        personas.add(trabajador4);
        personas.add(trabajador5);

        //toArray() hace el recorrido dentro del arreglo
        for (int i = 0; i < personas.toArray().length; i++){

            //de la lista de arreglos recibe el indice i y dependiendo el dato recibido, mostrará la información de esa iteración
            personas.get(i).mostrarInformacion();
        }

    }


}