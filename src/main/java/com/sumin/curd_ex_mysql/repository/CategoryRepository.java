package com.sumin.curd_ex_mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sumin.curd_ex_mysql.model.Category;
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
