package bank;

public class NotSufficientFundException extends RuntimeException {
    private String message;

    public NotSufficientFundException(String message) {
        this.message = message;
    }

    public NotSufficientFundException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
