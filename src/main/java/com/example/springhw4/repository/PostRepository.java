package com.example.springhw4.repository;

import com.example.springhw4.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
