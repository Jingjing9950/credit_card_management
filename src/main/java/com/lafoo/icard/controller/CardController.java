package com.lafoo.icard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CardController {

    @GetMapping("/getCardListByUserId")
    public List<String> getCardListByUserId(@RequestParam(name = "userId") String userId) {
        return Arrays.asList("Master Card", "Visa Card");
    }

}
