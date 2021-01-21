package me.sanjaya.smia2.helloworld;

import me.sanjaya.smia2.helloworld.model.HelloResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloWorldController
{
    @GetMapping(value="/{firstName}")
    public HelloResponse sayHello(
            @PathVariable("firstName") String firstName,
            @RequestParam("lastName") String lastName) {
        return HelloResponse.of(String.format("Hello %s %s", firstName, lastName));
    }
}
