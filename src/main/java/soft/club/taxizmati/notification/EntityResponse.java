package soft.club.taxizmati.notification;

import org.springframework.http.HttpStatus;

public class EntityResponse<T> {

    private boolean success;
    private String message;
    private T data;
    private int status;


    public EntityResponse(boolean success, String message, T data, HttpStatus status) {
        this.success = success;
        this.message = message;
        this.data = data;
        this.status = status.value();
    }

    public static <T> EntityResponse<T> success(T data, String message) {
        return new EntityResponse<>(true, message, data, HttpStatus.ACCEPTED);
    }

    public static <T> EntityResponse<T> error(String message, HttpStatus status) {
        return new EntityResponse<>(false, message, null, status);
    }
}
