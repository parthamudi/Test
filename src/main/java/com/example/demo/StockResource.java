package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/rest")
public class StockResource {

   

    @GetMapping("/gg")
    public String getStock() {
return "partha";
       
    }

   
}
