import Excepciones.NumeroTarjetaInvalidoException;

public class PagoTarjeta implements InterfazPago{

    private String numeroTarjeta;

    public PagoTarjeta (String numeroTarjeta){

        if (numeroTarjeta.length() != 16){
            throw new NumeroTarjetaInvalidoException();
        }
        this.numeroTarjeta = numeroTarjeta;

    }

    private String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    @Override
    public void procesarPago() {
        System.out.println("Pago con tarjeta " + ocultarTarjeta() + " confirmado.");
    }

    private String ocultarTarjeta(){
        return "**** **** **** " + getNumeroTarjeta().substring(getNumeroTarjeta().length() - 4);
    }

}
