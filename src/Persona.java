public abstract class Persona {

    private String nombre;
    private int edad;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public abstract String mostrarInformacion();

}
