package com.sumin.curd_ex_mysql.controller;


import com.sumin.curd_ex_mysql.payload.CategoryDto;
import com.sumin.curd_ex_mysql.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")

public class CategoryController {

    private CategoryService categoryService;


    public CategoryController(CategoryService categoryService){

        this.categoryService = categoryService;

    }

    //카테고리 등록
    @PostMapping()
    public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto){
        return new ResponseEntity<>(categoryService.createCategroy(categoryDto), HttpStatus.CREATED);

    }

    //카테고리 불러오기(전체)
    @GetMapping("all")
    public ResponseEntity<List<CategoryDto>> getAllCategories(){

        return new ResponseEntity<>(categoryService.getAllCategories(),HttpStatus.OK);
    }

    //카테고리 불러오기(상세)
    @GetMapping("{id}")
    public ResponseEntity<CategoryDto> getCategoryById(@PathVariable(name = "id") long id){
        return new ResponseEntity<>(categoryService.getCategoryById(id),HttpStatus.OK);


    }



}
