package Excepciones;

public class NumeroDeCuentaInvalidoException extends IllegalArgumentException{

    public NumeroDeCuentaInvalidoException (){
        super("Número de la cuenta inválido.");
    }

    public NumeroDeCuentaInvalidoException(String mensaje){
        super(mensaje);
    }

}
