package com.example.minimalcustomeventexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    private final HomePageServedEventPublisher publisher;

    public MyController(HomePageServedEventPublisher publisher) {
        this.publisher = publisher;
    }

    @GetMapping("/")
    public String getHomePage() {
        publisher.publishHomePageServedEvent();
        return "index";
    }

    @GetMapping("/about")
    public String getAboutPage() {
        return "about-page";
    }
}
