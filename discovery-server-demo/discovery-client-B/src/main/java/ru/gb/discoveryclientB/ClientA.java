package ru.gb.discoveryclientB;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client-A")
public interface ClientA {

    @GetMapping("/greeting")
    String greeting();
}
