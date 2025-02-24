import Excepciones.AlturaInvalidaException;
import Excepciones.EdadInvalidaException;
import Excepciones.NombreInvalidoException;
import Excepciones.PesoInvalidoException;

public abstract class Persona {

    private String nombre;
    private int edad;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, double peso, double altura) {

        if(nombre.isBlank() || nombre.length() < 3){
            throw new NombreInvalidoException();
        }
        if (edad < 14){
            throw new EdadInvalidaException();
        }
        if (peso <= 25){
            throw new EdadInvalidaException();
        }
        if(altura <= 60){
            throw new AlturaInvalidaException();
        }

        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public abstract String mostrarInformacion();



}
