package Excepciones;

public class AlturaInvalidaException extends IllegalArgumentException{

    public AlturaInvalidaException(){
        super(
                "La altura introducida no es valida."
        );
    }

    public AlturaInvalidaException(String mensaje){
        super(mensaje);
    }

}
