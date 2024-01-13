package com.sumin.curd_ex_mysql.service;

import com.sumin.curd_ex_mysql.model.Post;
import com.sumin.curd_ex_mysql.payload.PostDto;
import com.sumin.curd_ex_mysql.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePostById(long id, PostDto postDto);
    String delatePostById(long id);


}
