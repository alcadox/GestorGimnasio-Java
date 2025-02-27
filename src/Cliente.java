public class Cliente extends Persona{

    private TipoSuscripcion tipoSuscripcion;

    public Cliente(String nombre, int edad, double peso, double altura, TipoSuscripcion tipoSuscripcion) {
        super(nombre, edad, peso, altura);

        this.tipoSuscripcion = tipoSuscripcion;

    }

    public TipoSuscripcion getTipoSuscripcion() {
        return tipoSuscripcion;
    }

    @Override
    public String mostrarInformacion() {
        return "----------- CLIENTE : " + getNombre() + " -----------\n" +
                "EDAD: " + getEdad() +
                "\nPESO: " + getPeso() +
                "\nALTURA: " + getAltura() + "m." +
                "\nSUSCRIPCION: " + getTipoSuscripcion()
        ;
    }

    public void asignarRutina(){

    }



}
