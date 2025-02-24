package Excepciones;

public class PesoInvalidoException extends IllegalArgumentException{

    public PesoInvalidoException(){
        super(
                "El peso introducida no puede ser menor de 25kg."
        );
    }

    public PesoInvalidoException(String mensaje){
        super(mensaje);
    }

}
