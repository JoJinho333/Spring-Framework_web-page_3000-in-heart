package com.jvision.admin.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor

@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(length = 500, nullable = false)
    private String category;

    @Column(columnDefinition = "TEXT", nullable=false)
    private String content;

    @Column
    private String author;

    @Column
    private String place;

    @Column
    private String price;

    @Column
    private String review;

    @Column
    private String date;

    @Builder
    public Posts(String category, String content, String author, String place, String price, String review, String date)
    {
        this.category=category;
        this.content=content;
        this.author=author;
        this.place=place;
        this.price=price;
        this.review=review;
        this.date=date;
    }

    public void update(String category, String content)
    {
        this.category=category;
        this.content=content;
    }

}