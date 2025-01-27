package br.com.curso.springiniciante.controller;

import br.com.curso.springiniciante.domain.User;
import br.com.curso.springiniciante.service.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService service;

    @GetMapping
    public ResponseEntity<String> helloworld() {
        return ResponseEntity.status(HttpStatus.OK).body(service.helloWorld("Deise"));
    }

    // localhost:8080/hello-world/teste?filter=deise@gmail.com -> só dá certo porque padronizei que preciso receber a palavra FILTER
    @PostMapping("teste/{email}")
    public ResponseEntity<String> helloworld(@PathVariable("email") @RequestParam(value = "filter", defaultValue = "nenhum") String email ) {
        return ResponseEntity.status(HttpStatus.OK).body(service.helloWorld(email));
    }

    @PostMapping
    public ResponseEntity<String> helloworld(@RequestBody User userBody) {
        return ResponseEntity.status(HttpStatus.OK).body(service.helloWorld(userBody.getName()));
    }
}