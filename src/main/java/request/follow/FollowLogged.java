package request.follow;

import result.FollowedUser;

public class FollowLogged implements Follow {

    public interface LogTarget {
        void print(FollowedUser result);
    }

    private final Follow origin;
    private final LogTarget logTarget;

    public FollowLogged(Follow origin, LogTarget logTarget) {
        this.origin = origin;
        this.logTarget = logTarget;
    }

    @Override
    public FollowedUser follow(String userId) {
        FollowedUser result = origin.follow(userId);
        logTarget.print(result);
        return result;
    }

}