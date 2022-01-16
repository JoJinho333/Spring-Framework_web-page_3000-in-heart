package com.jvision.admin.web.dto;

import com.jvision.admin.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String category;
    private String content;
    private String author;
    private String place;
    private String price;
    private String review;
    private String date;

    @Builder
    public PostsSaveRequestDto(String category, String content, String author, String place, String price, String review, String date)
    {
        this.category=category;
        this.content=content;
        this.author=author;
        this.place=place;
        this.price=price;
        this.review=review;
        this.date=date;
    }
    public Posts toEntity()
    {
        return Posts.builder()
                .category(category)
                .content(content)
                .author(author)
                .place(place)
                .price(price)
                .review(review)
                .date(date)
                .build();
    }
}
