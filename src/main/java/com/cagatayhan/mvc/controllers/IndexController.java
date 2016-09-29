package com.cagatayhan.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Çağatay Han on 28.09.2016.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String showIndex(ModelMap modelMap) {
        return "index";
    }
}
