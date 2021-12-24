package com.softuni.ecommerce.backend.controller;

import com.softuni.ecommerce.backend.common.ApiResponse;
import com.softuni.ecommerce.backend.model.Category;
import com.softuni.ecommerce.backend.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @PostMapping("/create")
    public ResponseEntity<ApiResponse> create(@RequestBody Category category){
        categoryService.createCategory(category);
        return new ResponseEntity<>(new ApiResponse(true, "category has been created"), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    List<Category> listAllCategories(){
       return categoryService.listAllCategories();
    }


    @PostMapping("/update/{categoryId}")
    public ResponseEntity<ApiResponse> updateCategory(@PathVariable Long categoryId,  @RequestBody Category updateCategory){
        System.out.println("category id " + categoryId);
        if (!categoryService.findById(categoryId)) {
            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "not exists"), HttpStatus.NOT_FOUND);
        }
        categoryService.edit(categoryId, updateCategory);
        return new ResponseEntity<ApiResponse>(new ApiResponse(true, "category has been updated"), HttpStatus.OK);

    }

}
