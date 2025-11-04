package com.example.day18springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;

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


    @GetMapping("/numbers")
    public ArrayList<Integer> numbers(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);
        return numbers;
    }
    @GetMapping("/numbersSorted")
    public ArrayList<Integer> numbersSorted( ArrayList<Integer> numbers){
        Collections.sort(numbers);
        return numbers;
    }
    @GetMapping("/randomElement")
    public int randomElement( ArrayList<Integer> numbers){
        Random radom  = new Random();
        int element = radom.nextInt(0,numbers.size());
        return numbers.get(element);
    }
    @GetMapping("/randomNumber")
    public int randomElement(){
        Random radom  = new Random();
        int element = radom.nextInt(0,1000);
        return element;
    }

    @GetMapping("/randomNumber")
    public ArrayList<Integer> randomArray(){
        ArrayList<Integer> returning = new ArrayList();
        Random radom  = new Random();
        int element = radom.nextInt(0,10);
        for(int i = 0; i < element; i++){
            returning.add(i);
        }
        return returning;
    }


    @GetMapping("/all")
    public String all(){
        return myName() +"\n" + myAge() +"\nArray of numbers: "  + numbers() +"\nSorted array: "  + numbersSorted(numbers()) +"\nRandom Element of the array: "+ randomElement(numbers())+"\nRandom numbers of the array: "+ randomArray();
    }
}
