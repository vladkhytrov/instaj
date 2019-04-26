package task;

import api.Api;

import java.util.List;

public class FollowUsers implements Task {

    private final Api api;
    private final List<String> users;

    public FollowUsers(Api api, List<String> users) {
        this.api = api;
        this.users = users;
    }

    @Override
    public void execute() {

    }

}