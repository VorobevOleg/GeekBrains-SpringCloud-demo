package ru.gb.discoveryclientB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SampleController {

    private ClientA clientA;

    public SampleController(ClientA clientA) {
        this.clientA = clientA;
    }
//  Чтобы не прописывать это, можно использовать "OpenFeign" - "spring-cloud-starter-openfeign"
//    private RestTemplate restTemplate;
//
//    public SampleController(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }

//    @GetMapping("/A/greeting")
//    public String greetingFromA() {
//        return restTemplate.getForObject("http://eureka-client-A/greeting", String.class);
//    }

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello from eureka-client-B";
    }

    @GetMapping("/A/greeting")
    public String greetingFromA() {
        return clientA.greeting();
    }
}
