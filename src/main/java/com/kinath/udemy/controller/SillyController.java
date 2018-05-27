package com.kinath.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/silly")
public class SillyController
{
    /**
     * Initial method to show the form.
     *
     * @return
     */
    @RequestMapping("/showForm")
    public String displayForm()
    {
        return "helloworld-form";
    }
}
