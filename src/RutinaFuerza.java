public class RutinaFuerza extends  Rutina{

    public RutinaFuerza(String nombreRutina) {
        super(nombreRutina);
    }

    @Override
    public void mostrarEjercicios() {
        System.out.println(
                "Peso muerto. \nSentadillas. \nPress banca. "
        );
    }
}
