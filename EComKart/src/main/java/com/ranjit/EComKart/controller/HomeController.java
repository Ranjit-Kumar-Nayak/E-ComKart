package com.ranjit.EComKart.controller;

import com.ranjit.EComKart.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public ApiResponse Display(){
       ApiResponse apiResponse= new ApiResponse();
       apiResponse.setMessage("hello world !!!!!!!!");
       return apiResponse;

    }
}
