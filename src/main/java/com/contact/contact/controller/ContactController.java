package com.contact.contact.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("contact")
public class ContactController {
    @GetMapping(value = "/")
    @ResponseStatus(HttpStatus.OK)
    public String GetAll(){
        return "Contact Get All";
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String GetContact(@PathVariable int id){
        return "Return One Contact "+id;
    }

    @PostMapping(value = "/")
    @ResponseStatus(HttpStatus.CREATED)
    public String Create(
            @RequestBody String test
    ){
        return test;
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String Update(
            @PathVariable int id
    ){
        return "Update Contact "+id;
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String Delete(
            @PathVariable int id
    ){
        return "Delete Contact "+id;
    }
}
