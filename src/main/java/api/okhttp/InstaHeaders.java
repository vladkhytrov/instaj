package api.okhttp;

import api.Auth;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class InstaHeaders implements Interceptor {

    private final Auth auth;

    public InstaHeaders(Auth auth) {
        this.auth = auth;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        Request newRequest = original.newBuilder()
            .addHeader("Accept", "*/*")
            .addHeader("Accept-Language", "en-US,en;q=0.5")
            .addHeader("Accept-Encoding", "gzip, deflate, br")
            .addHeader("Connection", "keep-alive")
            .addHeader("Host", "www.instagram.com")
            .addHeader("Origin", "https://www.instagram.com")
            .addHeader("Referer", "https://www.instagram.com/")
            .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36")
            .addHeader("X-Instagram-AJAX", "1")
            .addHeader("Content-Type", "application/x-www-form-urlencoded")
            .addHeader("X-Requested-With", "XMLHttpRequest")
            .addHeader("X-CSRFToken", auth.getToken())
            .build();
        return chain.proceed(newRequest);
    }
}
