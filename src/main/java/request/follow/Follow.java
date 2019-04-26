package request.follow;

import result.Result;

public interface Follow {

    Result<String> follow(String userId);

}