package org.launchcode.skilltracker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkillsController {
    @GetMapping("/")
    public String skillTracker(){
        return "<div>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Javascript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</h2>";
    }

    @GetMapping("/form")
    public String skillsForm() {
        return  "<html>" +
                "<body>" +
                "<div>" +
                "<h2>Name:<h2>" +
                "<form  action = '/form' method = 'post'>" +
                "<input type = 'text' name = 'name' />" +
                "<h3>My Favorite Language<h3>" +
                "<select name='fav1'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>Javascript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<h3>My Second Favorite Language<h3>" +
                "<select name='fav2'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>Javascript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<h3>My Third Favorite Language<h3>" +
                "<select name='fav3'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>Javascript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +
                "<div>" +
                "<input type = 'submit' value = 'submit' />" +
                "</div>" +
                "</form>" +
                "<div>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/form")
    public String personalizedFavorites(@RequestParam String name, @RequestParam String fav1, @RequestParam String fav2, @RequestParam String fav3) {
        return "<div>" +
                "<h1>"+name+"</h1>" +
                "<h2>" +
                "<ol>" +
                "<li>"+fav1+"</li>" +
                "<li>"+fav2+"</li>" +
                "<li>"+fav3+"</li>" +
                "</ol>" +
                "</h2>";
    }

}
