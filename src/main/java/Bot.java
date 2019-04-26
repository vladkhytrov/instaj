import task.Task;

import java.util.ArrayList;
import java.util.List;

public class Bot {

    private final List<Task> requests = new ArrayList<>();

    public Bot(List<Task> requests) {
        this.requests.addAll(requests);
    }

    public Bot(Task request) {
        requests.add(request);
    }

    public void run() {
        for (Task r : requests) {
            r.execute();
        }
    }
}