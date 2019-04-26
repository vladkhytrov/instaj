import api.Api;
import api.okhttp.OkHttpApi;
import api.AuthBasic;
import com.braintreegateway.Result;

public class Main {

    public static void main(String[] args) {
        String token = args[0];
        String username = args[1];
        Api api = new OkHttpApi(
            new AuthBasic(token)
        );
    }
}