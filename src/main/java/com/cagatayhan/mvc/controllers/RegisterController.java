package com.cagatayhan.mvc.controllers;

import com.cagatayhan.mvc.form.LoginForm;
import com.cagatayhan.mvc.form.RegisterForm;
import com.cagatayhan.mvc.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Çağatay Han on 28.09.2016.
 */
@Controller
public class RegisterController {

    @Autowired
    public RegisterService registerService;

    @RequestMapping(value = "registerform", method = RequestMethod.GET)
    public String showRegisterForm(ModelMap modelMap) {
        modelMap.addAttribute("registerForm", new RegisterForm());

        return "registerform";
    }

    @RequestMapping(value = "registerform", method = RequestMethod.POST)
    public String processForm(@Valid RegisterForm registerForm, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "redirect:registerform";
        }

        registerService.tryRegister(registerForm.getUserName(), registerForm.getPassword(), registerForm.getName(), registerForm.getSurname(), registerForm.getAddress());
        return "redirect:loginform";
    }
}
