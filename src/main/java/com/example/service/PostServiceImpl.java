package com.example.service;

import com.example.entity.Post;
import com.example.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    @Override
    public Post addPost(Post post) {
     Post savedPaost = postRepository.save(post);
        return savedPaost;
    }
}
