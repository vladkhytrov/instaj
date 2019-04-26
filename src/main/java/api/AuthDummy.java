package api;

public class AuthDummy implements Auth {

    public String token;

    @Override
    public String getToken() {
        return token;
    }

}