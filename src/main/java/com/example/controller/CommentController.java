package com.example.controller;

import com.example.entity.Comment;
import com.example.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {

    private  CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    // POST: http://localhost:8080/api/v1/comments
    @PostMapping
    public ResponseEntity<Comment> addComment(@RequestParam long postId, @RequestBody Comment comment) {
        Comment savedComment = commentService.addComment(postId, comment);
        return new ResponseEntity<>(savedComment, HttpStatus.CREATED);
    }
}
