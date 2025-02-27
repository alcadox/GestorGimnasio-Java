public class RutinaHipertrofia extends  Rutina{

    public RutinaHipertrofia(String nombreRutina) {
        super(nombreRutina);
    }

    @Override
    public void mostrarEjercicios() {
        System.out.println(
                "Press inclinado. \nDominadas. \nCurl de bíceps. "
        );
    }
}
