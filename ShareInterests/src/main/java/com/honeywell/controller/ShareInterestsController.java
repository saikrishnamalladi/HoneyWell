package com.honeywell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shareInterest")
public class ShareInterestsController {
	
	@GetMapping("/")
    public String hello(Model model) {
        return "index";
    }

}
