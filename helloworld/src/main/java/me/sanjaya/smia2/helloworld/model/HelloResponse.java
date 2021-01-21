package me.sanjaya.smia2.helloworld.model;

import java.util.Objects;

public class HelloResponse
{
    private final String message;

    private HelloResponse(String message) {
        Objects.requireNonNull(message);
        this.message = message;
    }

    public static HelloResponse of(String message) {
        return new HelloResponse(message);
    }

    public String getMessage()
    {
        return message;
    }
}
