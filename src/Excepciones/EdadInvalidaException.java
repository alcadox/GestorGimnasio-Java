package Excepciones;

public class EdadInvalidaException extends IllegalArgumentException{

    public EdadInvalidaException(){
        super(
                "La edad introducida no puede ser menor de 14 años."
        );
    }

    public EdadInvalidaException(String mensaje){
        super(mensaje);
    }

}
