package com.sumin.curd_ex_mysql.service;

import com.sumin.curd_ex_mysql.payload.CategoryDto;
import java.util.List;

public interface CategoryService {

    CategoryDto createCategroy(CategoryDto categoryDto);

    List<CategoryDto> getAllCategories();

    CategoryDto getCategoryById(long id);

    CategoryDto updateCategoryById(long id,CategoryDto categoryDto);

    String delateCategoryById(long id);
}
