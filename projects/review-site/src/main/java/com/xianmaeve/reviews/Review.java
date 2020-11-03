package com.xianmaeve.reviews;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Resource

public class Review {
    Long id = 0L;
    String title = "";
    String imageUrl = "";
    String reviewCategory = "";
    String reviewContent = "";
    String reviewType = "";
    String reviewDate = "";
    List<String> reviewTags = new ArrayList<String>();

    public Review(Long ID, String title, String content) {
        
    }

    public Review(Long id, String title, String imageUrl, String reviewCategory, String reviewContent, String reviewDate, List<String> reviewTags) {
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.reviewCategory = reviewCategory;
        this.reviewContent = reviewContent;
        this.reviewType = reviewType;
        this.reviewDate = reviewDate;
        this.reviewTags = reviewTags;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getReviewCategory() {
        return reviewCategory;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public String getReviewType() {
        return reviewType;
    }

    public String getReviewDate() {
        return reviewDate;
    }

    public List<String> getReviewTags() {
        return reviewTags;
    }
}
