package com.helloworldapp.api;

import com.helloworldapp.model.Message;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@CrossOrigin
public class GreetController {

    @GetMapping
    public String greet(){
        return "Hello World..";
    }

    @GetMapping("/message")
    public Message getMessage(){

        Message message = new Message("Mark","Hello, how are you?", LocalDate.now());
        return message;

    }

    @PostMapping("/message")
    public Message sendMessage(@RequestBody Message message){
        return message;
    }

}
