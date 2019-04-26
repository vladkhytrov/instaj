package result;

public abstract class Result {

    private final boolean successful;
    private final Exception error;

    public Result() {
        error = null;
        successful = true;
    }

    public Result(Exception error) {
        this.error = error;
        successful = false;
    }

    public Exception getError() {
        if (!successful) {
            return error;
        } else {
            throw new RuntimeException(
                "Result is successful and can't contain an error. Call isSuccessful() to check if result is successful."
            );
        }
    }

    public boolean isSuccessful() {
        return successful;
    }

}