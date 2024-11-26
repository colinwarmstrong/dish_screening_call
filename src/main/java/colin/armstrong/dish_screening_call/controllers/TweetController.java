package colin.armstrong.dish_screening_call.controllers;

import colin.armstrong.dish_screening_call.services.TweetService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tweets")
public class TweetController {

    public final TweetService tweetService;

    public TweetController(TweetService tweetService) {
        this.tweetService = tweetService;
    }

    @GetMapping
    public String getTweet() {
        return "Tweet: This is a tweet #SpringBoot";
    }

    @PostMapping
    public void postTweet(@RequestBody String tweet) throws Exception {
        tweetService.postTweet(tweet);
    }
}
