package Excepciones;

public class NombreInvalidoException extends IllegalArgumentException{

    public NombreInvalidoException(){
        super(
                "El nombre de la persona introducido no es correcto."
        );
    }

    public NombreInvalidoException(String mensaje){
        super(mensaje);
    }

}
