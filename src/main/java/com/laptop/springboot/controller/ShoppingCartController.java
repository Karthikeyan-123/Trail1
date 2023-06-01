package com.laptop.springboot.controller;



import java.io.IOException;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ShoppingCartController {

	
	@GetMapping("/")
    public String goHome() {
    	System.out.println("I'm Running");
    	return "Home";
    }
    
    
    //Adding product into cart
    @GetMapping("/shoppingCart/addProduct")
    public String addProductToCart() throws IOException {
    	System.out.println("C:\\Users\\91908\\Desktop\\Batch\\Batch1.bat");
    	Runtime.getRuntime().exec("cmd /c start C:\\Users\\karthikeyan.k1\\Desktop\\Batch1.bat");
    	return "Categories";
    }

    
    
}
