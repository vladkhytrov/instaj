package result;

public class FollowedUser extends Result {

    private final String username;

    public FollowedUser(String username) {
        super();
        this.username = username;
    }

    public FollowedUser(String username, Exception error) {
        super(error);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

}