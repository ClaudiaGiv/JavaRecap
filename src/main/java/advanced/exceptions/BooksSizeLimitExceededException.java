package advanced.exceptions;

public class BooksSizeLimitExceededException extends Exception{

    public BooksSizeLimitExceededException() {
        super("Number of books by genre is exceeded!");
    }

    public BooksSizeLimitExceededException(String message, Throwable cause) {
        super(message, cause);
    }
}
