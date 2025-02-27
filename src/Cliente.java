public class Cliente extends Persona{

    private TipoSuscripcion tipoSuscripcion;
    private Rutina rutina;
    private InterfazPago metodoPago;

    public Cliente(String nombre, int edad, double peso, double altura, TipoSuscripcion tipoSuscripcion) {
        super(nombre, edad, peso, altura);

        this.tipoSuscripcion = tipoSuscripcion;
        this.rutina = null;
        this.metodoPago = null;
    }

    private Rutina getRutina() {
        return rutina;
    }

    public TipoSuscripcion getTipoSuscripcion() {
        return tipoSuscripcion;
    }

    public void asignarRutina(Rutina rutina){
        this.rutina = rutina;
    }

    public void asignarMetodoPago(InterfazPago metodoPago){
        this.metodoPago = metodoPago;
        System.out.println("Método de pago establecido.");
    }

    @Override
    public String mostrarInformacion() {
        return "----------- CLIENTE : " + getNombre() + " -----------\n" +
                "EDAD: " + getEdad() +
                "\nPESO: " + getPeso() +
                "\nALTURA: " + getAltura() + "m." +
                "\nSUSCRIPCION: " + getTipoSuscripcion() +
                "\nRUTINA: " + (getRutina() != null ? getRutina() : "No tiene una rutina asignada.")
                ;
    }

}
