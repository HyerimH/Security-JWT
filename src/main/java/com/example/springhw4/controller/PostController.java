package com.example.springhw4.controller;

import com.example.springhw4.dto.PostDto;
import lombok.Getter;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @GetMapping("/post")
    public String createpost() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

}
