package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by rgofron on 2015-10-26.
 */
@Controller
public class DemoController {

    @RequestMapping("/test")
    public ModelAndView test(){
        return new ModelAndView("demo");
    }
}
