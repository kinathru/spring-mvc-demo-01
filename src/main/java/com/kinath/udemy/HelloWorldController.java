package com.kinath.udemy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController
{
    /**
     * Initial method to show the form.
     *
     * @return
     */
    @RequestMapping("/showForm")
    public String showForm()
    {
        return "helloworld-form";
    }

    /**
     * Process the form.
     *
     * @return
     */
    @RequestMapping("/processForm")
    public String processForm()
    {
        return "helloworld";
    }
}
