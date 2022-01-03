package ve.zlab.k;

import javax.ws.rs.core.Response.Status;

public class KException extends Exception {

    private final Status status;

    public KException(final Status status) {
        this.status = status;
    }
    
    public KException(final Status status, final String message) {
        super(message);
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }
}
