package com.example.exercise.controller;

import com.example.exercise.model.User;
import com.example.exercise.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class UserController {
    @Autowired
    private IUserService userService;
    @GetMapping("")
    public ModelAndView createForm(){
        ModelAndView modelAndView=new ModelAndView("/create");
        modelAndView.addObject("user",new User());
        return modelAndView;
    }
    @PostMapping("/create")
    public ModelAndView createUser(@Validated @ModelAttribute("user") User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ModelAndView("/create");
        }
        else {
           ModelAndView modelAndView=new ModelAndView("/view");
           modelAndView.addObject("user",  userService.save(user));
           return modelAndView;
        }
    }
}
