package com.example.minimalcustomeventexample;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listeners {

    @EventListener
    public void homePageServedEventListener(HomePageServedEvent event) {
        System.out.println("Home page served at " + event.getAt());
    }
}
