package api.okhttp;

import api.Api;
import api.Auth;
import api.Endpoints;
import okhttp3.*;

import java.io.IOException;

public class OkHttpApi implements Api {

    private final OkHttpClient client;

    public OkHttpApi(Auth auth) {
        client = new OkHttpClient.Builder()
            .addNetworkInterceptor(new InstaHeaders(auth))
            .build();
    }

    @Override
    public Response login(String userName, String password) throws IOException {
        RequestBody form = new FormBody.Builder()
                .add("username", userName)
                .add("password", password)
                .build();
        Request request = new Request.Builder()
                .url(Endpoints.LOGIN)
                .post(form)
                .build();
        return client.newCall(request).execute();
    }

    @Override
    public Response follow(String userName) throws IOException {
        Request request = new Request.Builder()
                .url(String.format(Endpoints.FOLLOW, userName))
                .build();
        return client.newCall(request).execute();
    }

    @Override
    public Response getUserFollowers(String userId) throws IOException {
        return null;
    }

}