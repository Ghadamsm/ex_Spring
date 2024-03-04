package com.example.ex1_spring;


import jdk.jshell.Snippet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {



    @GetMapping(path ="/name1" )
    public String name (){
        return "My name is Ghada " ;

    }

    @GetMapping(path = "/age1")
    public String age (){
        return "My age is 24" ;
    }

    @GetMapping(path = "/check1")
    public Snippet.Status check (){
        return Snippet.Status.valueOf("Everything OK");
    }

    @GetMapping(path = "/health1")
    public String health (){
        return "Server health is up and running";
    }

    @GetMapping(path = "/names1")
    public String[] names (){

        return new String[]{"ghada " , "mohammad " , "latiffah"};
    }


}
