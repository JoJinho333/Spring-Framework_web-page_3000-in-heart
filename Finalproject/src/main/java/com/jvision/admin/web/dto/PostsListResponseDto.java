package com.jvision.admin.web.dto;

import com.jvision.admin.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String category;
    private String author;
    private String place;
    private String price;
    private String review;
    private String date;

    public PostsListResponseDto(Posts entity)
    {
        this.id=entity.getId();
        this.category= entity.getCategory();
        this.author= entity.getAuthor();
        this.place=entity.getPlace();
        this.price= entity.getPrice();
        this.review= entity.getReview();
        this.date= entity.getDate();
    }
}
