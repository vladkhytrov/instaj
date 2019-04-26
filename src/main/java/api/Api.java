package api;

import okhttp3.Response;

import java.io.IOException;

public interface Api {

    Response login(String userName, String password) throws IOException;

    Response follow(String userName) throws IOException;

    Response getUserFollowers(String userId) throws IOException;

}