package ve.zlab.k.helper;

import javax.ws.rs.core.Response;
import ve.zlab.k.KException;

public class KExceptionHelper {

    public static KException notFound() {
        return new KException(Response.Status.NOT_FOUND, "Resource not found");
    }
    
    public static KException notFound(final String message) {
        return new KException(Response.Status.NOT_FOUND, message);
    }

    public static KException badRequest(final String message) {
        return new KException(Response.Status.BAD_REQUEST, message);
    }

    public static KException internalServerError() {
        return new KException(Response.Status.INTERNAL_SERVER_ERROR);
    }

    public static KException internalServerError(final String message) {
        return new KException(Response.Status.INTERNAL_SERVER_ERROR, message);
    }

    public static KException unauthorized(final String message) {
        return new KException(Response.Status.UNAUTHORIZED, message);
    }

    public static KException forbidden(final String message) {
        return new KException(Response.Status.FORBIDDEN, message);
    }

    public static KException createByStatusCode(final int statusCode, final String message) {
        switch (statusCode) {
            case 200:
                return new KException(Response.Status.OK, message);
            case 201:
                return new KException(Response.Status.CREATED, message);
            case 202:
                return new KException(Response.Status.ACCEPTED, message);
            case 204:
                return new KException(Response.Status.NO_CONTENT, message);
            case 301:
                return new KException(Response.Status.MOVED_PERMANENTLY, message);
            case 302:
                return new KException(Response.Status.FOUND, message);
            case 400:
                return new KException(Response.Status.BAD_REQUEST, message);
            case 401:
                return new KException(Response.Status.UNAUTHORIZED, message);
            case 402:
                return new KException(Response.Status.PAYMENT_REQUIRED, message);
            case 403:
                return new KException(Response.Status.FORBIDDEN, message);
            case 404:
                return new KException(Response.Status.NOT_FOUND, message);
            case 405:
                return new KException(Response.Status.METHOD_NOT_ALLOWED, message);
            case 429:
                return new KException(Response.Status.TOO_MANY_REQUESTS, message);
            case 500:
                return new KException(Response.Status.INTERNAL_SERVER_ERROR, message);
            case 502:
                return new KException(Response.Status.BAD_GATEWAY, message);
            default:
                return new KException(Response.Status.INTERNAL_SERVER_ERROR, message);
        }
    }
}
