package com.example;

import com.example.model.Greeting;
import com.example.model.User;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@Component
public class Hello implements Function<User, Greeting> {
@Override
    public Greeting apply(User user) {
        return new Greeting("Hello, " + user.getName() + "!");
    }
   
}
