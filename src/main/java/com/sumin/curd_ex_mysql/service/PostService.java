package com.sumin.curd_ex_mysql.service;

import com.sumin.curd_ex_mysql.model.Post;
import com.sumin.curd_ex_mysql.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    List<Post> getAllPosts();

    PostDto getPostById(long id);

    PostDto updatePostById(long id, PostDto postDto);
    String delatePostById(long id);


}
