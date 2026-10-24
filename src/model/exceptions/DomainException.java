package model.exceptions;

import java.io.Serial;

public class DomainException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1;

    public DomainException(String msg){
        super(msg);
    }
}
