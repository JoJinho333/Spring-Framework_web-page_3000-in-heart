package com.jvision.admin.web.dto;

import com.jvision.admin.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private Long id;
    private String category;
    private String content;
    private String author;
    private String place;
    private String price;
    private String review;
    private String date;

    public PostsResponseDto(Posts entity)
    {
        this.id= entity.getId();
        this.category= entity.getCategory();
        this.content=entity.getContent();
        this.author= entity.getAuthor();
        this.place=entity.getPlace();
        this.price= entity.getPrice();
        this.review= entity.getReview();
        this.date= entity.getDate();
    }
}
