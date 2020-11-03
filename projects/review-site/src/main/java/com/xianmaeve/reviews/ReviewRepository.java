package com.xianmaeve.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository

public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository() {
        Review dracula = new Review(1l,"Dracula", "/images/dracula.jpg", "vampire",
                "One of the OG modern vampires.  I've read and re-read this book so many times.",
                "2020", List.of("vampire", "classic", "book"));
        Review carmilla = new Review(2l, "Carmilla", "/images/carmilla.jpg", "vampire",
                "Another great OG vampire.  This one actually predates Dracula, and the story is very gay.",
                "2020", List.of("vampire", "classic", "Novel"));
        Review edward = new Review(3l, "Edward", "/images/edward.jpg", "vampire",
                "Kind of an annoying and cringy movie vampire.  Changing up the vampire \"Rules\" is fine and dandy, but a bit too much here.  Plus, I'd imagine that \"vegetarian\" vampires are likely quite annoying in real life.",
                "2020", List.of("vampire", "recent", "movie", "awful"));
        Review damon = new Review(4l, "Damon Salvatore", "/images/damon.jpg", "vampire",
                "A much better recent vampire.  I like it when vampire characters really embrace being vampires and everything that comes with it.  He's a good example of how to do that with a heroic character.",
                "2020", List.of("vampire", "recent", "TV", "not awful"));

        reviewList.put(dracula.getId(), dracula);
        reviewList.put(carmilla.getId(), carmilla);
        reviewList.put(edward.getId(), edward);
        reviewList.put(damon.getId(), damon);
    }

    public Review getOne(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> getAll() {
        return reviewList.values();
    }


}
