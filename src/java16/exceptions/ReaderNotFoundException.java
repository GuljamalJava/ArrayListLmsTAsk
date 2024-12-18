package java16.exceptions;

public class ReaderNotFoundException extends RuntimeException {
    public ReaderNotFoundException(String message) {
        super(message);
    }
}
