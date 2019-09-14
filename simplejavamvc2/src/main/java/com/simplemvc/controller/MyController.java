package com.simplemvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t1") int j) {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("display");
        mv.addObject("result",i+j);
        return mv;
    }

}