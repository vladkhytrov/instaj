import api.Api;
import okhttp3.Response;
import org.junit.Test;
import request.follow.FollowBase;
import request.follow.FollowLogged;
import result.FollowedUser;

import java.io.IOException;

import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FollowTest {

    @Test
    public void mustFollow() throws IOException {
        Api api = mock(Api.class);
        Response response = new Response.Builder()
            .code(200)
            .build();
        when(api.follow("vlad")).thenReturn(response);
        FollowedUser result = new FollowLogged(
            new FollowBase(api),
            r -> {}
        ).follow("vlad");
        assertTrue(result.isSuccessful());
    }

}