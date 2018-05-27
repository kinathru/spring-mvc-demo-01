package com.kinath.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
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

    /**
     * Read from form data and add date to the model
     *
     * @return
     */
    @RequestMapping("processFormV2")
    public String letsShoutDude( HttpServletRequest request, Model model )
    {
        // read request param from html form
        String studentName = request.getParameter( "studentName" );

        //convert data to upper case
        studentName = studentName.toUpperCase();

        //create message
        String result = "Yo " + studentName;

        //add the message to the model
        model.addAttribute( "message", result );

        return "helloworld";
    }

    /**
     * Read from form data using @RequestParam
     *
     * @return
     */
    @RequestMapping("processFormV3")
    public String processFormV3( @RequestParam("studentName") String theName, Model model )
    {
        // read request param from html form
        String studentName = theName;

        //convert data to upper case
        studentName = studentName.toUpperCase();

        //create message
        String result = "Hey " + studentName;

        //add the message to the model
        model.addAttribute( "message", result );

        return "helloworld";
    }
}
