package br.com.curso.springiniciante.controller;

import br.com.curso.springiniciante.service.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService service;

    @GetMapping
    public ResponseEntity<String> helloworld() {
        return ResponseEntity.status(HttpStatus.OK).body(service.helloWorld("Deise"));
    }
}
