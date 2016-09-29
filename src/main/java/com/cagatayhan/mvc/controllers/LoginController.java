package com.cagatayhan.mvc.controllers;

import com.cagatayhan.mvc.form.LoginForm;
import com.cagatayhan.mvc.model.Users;
import com.cagatayhan.mvc.service.LoginService;
import com.sun.javafx.sg.prism.NGShape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by Çağatay Han on 16.09.2016.
 */
@Controller
public class LoginController {

    public static String username;

    @Autowired
    public LoginService loginService;

    @RequestMapping(value = "loginform", method = RequestMethod.GET)
    public String showForm(ModelMap modelMap) {
        modelMap.addAttribute("loginForm", new LoginForm());

        return "loginform";
    }

    @RequestMapping(value = "loginform", method = RequestMethod.POST)
    public String processForm(@Valid LoginForm loginForm, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "redirect:loginform";
        }

        boolean userExists = loginService.checkLogin(loginForm.getUserName(), loginForm.getPassword());
        username = loginForm.getUserName();

        if(userExists) {
            return "redirect:loginsuccess";
        }
        else {
            return "redirect:loginform";
        }
    }

    @RequestMapping(value = "loginsuccess", method = RequestMethod.GET)
    public String getLoginSuccess(ModelMap modelMap) {
        String successMsg = "Welcome " + username + " You have successfully logged in";
        modelMap.addAttribute("msg", successMsg);

        return "loginsuccess";
    }

    @RequestMapping(value = "loginfail", method = RequestMethod.GET)
    public String getLoginFail(ModelMap modelMap) {
        String failMsg = "Failed to logged in";
        modelMap.addAttribute("msg", failMsg);

        return "loginfail";
    }
}
