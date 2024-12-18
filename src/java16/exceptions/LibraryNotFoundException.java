package java16.exceptions;

import java16.models.Library;

public class LibraryNotFoundException extends RuntimeException {

    public LibraryNotFoundException(String message) {
        super(message);

    }
}