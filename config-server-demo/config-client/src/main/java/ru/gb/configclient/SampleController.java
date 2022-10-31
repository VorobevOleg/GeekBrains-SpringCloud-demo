package ru.gb.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Value("${config.name}")
    String name = "Oleg";

    @GetMapping
    public String hello() {
        return "Hello, " + name;
    }
}
