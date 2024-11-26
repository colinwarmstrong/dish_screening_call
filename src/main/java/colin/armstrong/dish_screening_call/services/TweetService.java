package colin.armstrong.dish_screening_call.services;

import colin.armstrong.dish_screening_call.repository.Runner;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TweetService {

    private final Runner runner;

    public TweetService(Runner runner) {
        this.runner = runner;
    }

    public void postTweet(@RequestBody String tweet) throws Exception {
        runner.run(tweet);
    }
}
