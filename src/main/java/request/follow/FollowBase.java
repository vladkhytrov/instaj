package request.follow;

import api.Api;
import error.InstagramError;
import okhttp3.Response;
import result.FollowedUser;

import java.io.IOException;

public class FollowBase implements Follow {

    private final Api api;

    public FollowBase(Api api) {
        this.api = api;
    }


    @Override
    public FollowedUser follow(String userId) {
        try {
            Response response = api.follow(userId);
            if (response.code() == 200) {
                return new FollowedUser(userId);
            } else {
                return new FollowedUser(userId, new InstagramError("" + response.code()));
            }
//            String result = new TextOf(response.body().bytes()).asString();
//            System.out.print(result);
        } catch (IOException e) {
            e.printStackTrace();
            return new FollowedUser(userId, e);
        }
    }
}