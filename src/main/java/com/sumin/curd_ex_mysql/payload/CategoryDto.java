package com.sumin.curd_ex_mysql.payload;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CategoryDto {

    @NotEmpty
    @Size(min =2, message = "category name should have at least 2 characters")
    private String name;

    @NotEmpty
    @Size(min = 10, message ="category description should have at least 10 characters")
    private String description;




}
