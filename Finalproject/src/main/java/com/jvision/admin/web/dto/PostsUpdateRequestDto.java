package com.jvision.admin.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String category;
    private String content;

    public PostsUpdateRequestDto(String category, String content)
    {
        this.category=category;
        this.content=content;
    }
}
