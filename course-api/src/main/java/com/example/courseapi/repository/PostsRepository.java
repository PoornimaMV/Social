package com.example.courseapi.repository;

import com.example.courseapi.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostsRepository extends CrudRepository<Post, Long> {


}
