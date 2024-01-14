package ru.savin.bezrukiy.shared.exception;

/**
 * Непроверяемое исключение для приложения "Безрукий".
 */
public class BezrukiyRuntimeException extends RuntimeException{
    public BezrukiyRuntimeException(String message) {
        super(message);
    }
}
