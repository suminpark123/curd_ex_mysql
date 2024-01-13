package com.sumin.curd_ex_mysql.payload;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PostDto {
    @NotEmpty
    @Size(min = 2,message = "post title should have at least 2 characters")
    private String title;

    @NotEmpty
    @Size(min = 10,message = "post description should have at least 10 characters")
    private String description;

    @NotEmpty
    @Size(min = 10,message = "post content should have at least 10 characters")
    private String content;

    private Long categoryId;
}
