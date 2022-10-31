package ru.gb.discoveryclientA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/greeting")
    public String greeting() {
        return "Hello from eureka-client-A";
    }
}
