package com.home;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ServiceController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<String> get() {
        String output = "Hey team";
        log.info(output);
        return new ResponseEntity<>(output, HttpStatus.OK);
    }
}
