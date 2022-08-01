package com.aupup.sso.client;



import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@Slf4j
@RestController
public class DemoController {

    @GetMapping("/user")
    public Mono<Object> index() {
            return Mono.just("helloWorld");
    }

}
