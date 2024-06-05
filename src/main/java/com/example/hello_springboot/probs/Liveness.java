package com.example.hello_springboot.probs;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Liveness {

    @GetMapping("/health/liveness")
    public ResponseEntity<String> liveness() {
    	String text = "Liveness is success";
		System.out.println(text);
        return ResponseEntity.ok("Alive");
    }
}
