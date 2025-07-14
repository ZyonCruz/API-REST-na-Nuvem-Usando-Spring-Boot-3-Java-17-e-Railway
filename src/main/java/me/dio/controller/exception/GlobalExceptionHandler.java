package me.dio.controller.exception; // Seu pacote para o GlobalExceptionHandler

import java.util.NoSuchElementException; // Para quando um recurso não é encontrado
import org.springframework.http.HttpStatus; // Para códigos HTTP de resposta
import org.springframework.http.ResponseEntity; // Para construir a resposta HTTP
import org.springframework.web.bind.annotation.ControllerAdvice; // Marca a classe como um interceptador de exceções global
import org.springframework.web.bind.annotation.ExceptionHandler; // Mapeia métodos a tipos de exceção

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNotFoundException(NoSuchElementException notFoundException) {
        return new ResponseEntity<>("Resource not found.", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleBadRequestException(IllegalArgumentException badRequestException) {
        return new ResponseEntity<>(badRequestException.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handleUnexpectedException(Throwable unexpectedException) {
        return new ResponseEntity<>("An unexpected error occurred.", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}