package Excepciones;

public class NumeroTarjetaInvalidoException extends IllegalArgumentException{

    public NumeroTarjetaInvalidoException() {
        super(
                "Número de tarjeta inválido."
        );
    }

    public NumeroTarjetaInvalidoException (String mensaje){
        super(mensaje);
    }

}
