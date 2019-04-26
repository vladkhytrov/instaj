package result;

import java.util.List;

public class UserFollowers extends Result {

    private final List<String> followers;

    public UserFollowers(List<String> followers) {
        this.followers = followers;
    }

    public UserFollowers(Exception error) {
        super(error);
        this.followers = null;
    }

    public List<String> getFollowers() {
        return followers;
    }

}