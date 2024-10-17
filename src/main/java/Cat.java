import java.util.Objects;

public class Cat {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String massage) {
        this.message = massage;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(message);
    }
}
