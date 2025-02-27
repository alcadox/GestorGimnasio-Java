import Excepciones.NumeroDeCuentaInvalidoException;

public class PagoTransferencia implements InterfazPago {

    private String numeroCuenta;

    public PagoTransferencia(String numeroCuenta){
        if (numeroCuenta.length() != 20){
            throw new NumeroDeCuentaInvalidoException();
        }

        this.numeroCuenta = numeroCuenta;

    }

    private String getNumeroCuenta() {
        return numeroCuenta;
    }

    @Override
    public void procesarPago() {
        System.out.println("Transferencia desde " + ocultarNumeroCuenta() + " realizada con éxito.");
    }

    private String ocultarNumeroCuenta(){
        return "****************" + getNumeroCuenta().substring( getNumeroCuenta().length() - 4);
    }

}
