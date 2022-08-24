package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class TelevisionController {

    package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class TelevisionController {

        @GetMapping("/televisions")
        public ResponseEntity<Object> getTelevisions(){
            return ResponseEntity.ok().body("ok");
        }

        @GetMapping("/televisions/{id}")
        public ResponseEntity<Object> getTelevision(@PathVariable int id){
            return ResponseEntity.ok();
        }

        @PostMapping("/televisions")
        public ResponseEntity<Object> postTelevision(@RequestBody String televisionname){
            return ResponseEntity.created();
        }

        @PutMapping("/televisions/{id}")
        public ResponseEntity<Object> putTelevision(@PathVariable int id, @RequestBody String televisionName){
            return ResponseEntity.ok();
        }

        @DeleteMapping("/televisions/{id}")
        public ResponseEntity<Object> deleteTelevision(@PathVariable int id){
            return ResponseEntity.noContent();
        }

/*
    een GET-request voor alle televisies
    een GET-request voor 1 televisie
    een POST-request voor 1 televisie
    een PUT-request voor 1 televisie
    een DELETE-request voor 1 televisie*/



    }

}
