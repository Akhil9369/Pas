package com.example.service;

import com.example.entity.Comment;
import com.example.entity.Post;
import com.example.repository.CommentRepository;
import com.example.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService{
    private  CommentRepository commentRepository;
    private PostRepository postRepository;

    public CommentServiceImpl(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
    }
    @Override
    public Comment addComment(Long postId, Comment comment) {
        Post post= postRepository.findById(postId).get();
        //Optional<Post> postOptional = postRepository.findById(postId);
        comment.setPost(post);
        return commentRepository.save(comment);

    }

    public static interface BusService {
    }
}
