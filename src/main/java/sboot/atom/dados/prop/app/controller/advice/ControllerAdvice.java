package sboot.atom.dados.prop.app.controller.advice;

import br.com.atom.dados.prop.representation.ResponseError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import sboot.atom.dados.prop.app.exception.ErroTecnicoException;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseError> handleException(Exception e) {

        ResponseError responseError = new ResponseError();
        responseError.setCode("500");
        responseError.setDetail(e.getMessage());

        return ResponseEntity.status(500).body(responseError);
    }

    @ExceptionHandler(ErroTecnicoException.class)
    public ResponseEntity<ResponseError> handleErroTecnicoException(ErroTecnicoException e) {

        ResponseError responseError = new ResponseError();
        responseError.setCode("500");
        responseError.setDetail(e.getMessage());

        return ResponseEntity.status(500).body(responseError);
    }
}
