package com.example.minimalcustomeventexample;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class HomePageServedEventPublisher {

    private final ApplicationEventPublisher publisher;

    public HomePageServedEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publishHomePageServedEvent() {
        HomePageServedEvent event = new HomePageServedEvent(LocalDateTime.now());
        publisher.publishEvent(event);
    }
}
