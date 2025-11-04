package com.example.day18springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController

public class Controller {
    @GetMapping("/myName")
    public String myName(){
        return "My name is: Mohammed Alrashedi";
    }
    @GetMapping("/myAge")
    public String myAge(){
        return "My age is: 23";
    }
    @GetMapping("/check/status")
    public String status(){
        return "Everything OK!";
    }
    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }
    @GetMapping("/names")
    public ArrayList<String> names(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Khaild");
        names.add("Abdullah");
        names.add("Turki");
        return names;
    }
    @GetMapping("/all")
    public String all(){
        return myName() +"\n" + myAge() +"\n"  + names() +"\n"  + status() +"\n"  + health();
    }
}

