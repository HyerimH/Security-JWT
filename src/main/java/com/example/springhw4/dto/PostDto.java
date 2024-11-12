package com.example.springhw4.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PostDto {

    private String title;

    private String content;

}
