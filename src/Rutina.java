import Excepciones.NombreInvalidoException;

public abstract class Rutina {

    private String nombreRutina;

    public Rutina(String nombreRutina) {
        if (nombreRutina.isBlank()){
            throw new NombreInvalidoException(
                    "El nombre de la rutina no puede estar vacío."
            );
        }
        this.nombreRutina = nombreRutina;
    }

    public String getNombreRutina() {
        return nombreRutina;
    }

    public abstract void mostrarEjercicios();

}
