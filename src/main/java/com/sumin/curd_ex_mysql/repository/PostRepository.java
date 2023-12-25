package com.sumin.curd_ex_mysql.repository;

import com.sumin.curd_ex_mysql.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
