package com.calculator.service.calcservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {

    @GetMapping("add/{x}/{y}")
    public Calculator add(@PathVariable int x, @PathVariable int y){

        //return x+y;
        return new Calculator(x, y, x+y);
    }

    @GetMapping("subtract/{x}/{y}")
    public Calculator subtract(@PathVariable int x, @PathVariable int y){

        //return x-y;
        return new Calculator(x, y, x-y);
    }

    @GetMapping("multiplication/{x}/{y}")
    public Calculator multiplication(@PathVariable int x, @PathVariable int y){

        //return x-y;
        return new Calculator(x, y, x*y);
    }

    @GetMapping("division/{x}/{y}")
    public Calculator division(@PathVariable int x, @PathVariable int y){

        //return x-y;
        return new Calculator(x, y, x/y);
    }

}
