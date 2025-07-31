package com.discretebody.test.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class SampleRestController {



    @GetMapping(path = "/sample/{name}" )
    public String getSample(@PathVariable (value = "name") String name) {
        return "Hello, " + name + "!";
    }

    @PostMapping(path = "/sample")
    public String postSample( String name) {
        return "Hello, " + name + "!";
    }



}
