package com.example.teamproject3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JubeaController {

    @GetMapping("/jubae")
    public @ResponseBody String jubae() {
        return "Hello, jubae!!";
    }
    
}