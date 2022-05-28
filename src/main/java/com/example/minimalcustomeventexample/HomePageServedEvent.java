package com.example.minimalcustomeventexample;

import java.time.LocalDateTime;

public class HomePageServedEvent {

    private final LocalDateTime at;

    public HomePageServedEvent(LocalDateTime at) {
        this.at = LocalDateTime.of(at.toLocalDate(), at.toLocalTime());
    }

    public LocalDateTime getAt() {
        return LocalDateTime.of(at.toLocalDate(), at.toLocalTime());
    }
}
