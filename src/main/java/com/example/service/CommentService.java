package com.example.service;

import com.example.entity.Comment;

public interface CommentService {
    Comment addComment(Long postId, Comment comment);
}