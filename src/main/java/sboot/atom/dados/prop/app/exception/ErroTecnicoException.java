package sboot.atom.dados.prop.app.exception;

public class ErroTecnicoException extends RuntimeException {

    public ErroTecnicoException(String message) {
        super(message);
    }

    public ErroTecnicoException(String message, Throwable cause) {
        super(message, cause);
    }
}
