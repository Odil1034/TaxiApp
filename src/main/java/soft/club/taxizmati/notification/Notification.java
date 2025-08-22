package soft.club.taxizmati.notification;

import org.springframework.http.HttpStatus;

public class Notification {
    private boolean success;
    private String message;
    private int status;

    public Notification(boolean success, String message, HttpStatus status) {
        this.success = success;
        this.message = message;
        this.status = status.value();
    }

    public static Notification success(String message) {
        return new Notification(true, message, HttpStatus.OK);
    }

    public static Notification error(String message, HttpStatus status) {
        return new Notification(false, message, status);
    }
}
