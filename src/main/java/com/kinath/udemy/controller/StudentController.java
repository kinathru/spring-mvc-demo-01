package com.kinath.udemy.controller;

import com.kinath.udemy.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController
{
    @RequestMapping("/showForm")
    public String showForm( Model model)
    {
        // Create Student
        Student student = new Student();

        //Add student attribute to the model
        model.addAttribute( "student", student );

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm( @ModelAttribute("student")Student theStudent)
    {
        System.out.println(String.format( "Received Student is : %s %s", theStudent.getFirstName(), theStudent.getLastName() ));
        return "student-confirmation";
    }
}
