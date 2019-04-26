package api;

public class AuthBasic implements Auth {

    private final String token;

    public AuthBasic(String token) {
        this.token = token;
    }

    @Override
    public String getToken() {
        return token;
    }
}