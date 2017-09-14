package com.home;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class A implements Process {

    A() {
        log.info("A");
    }

    @Override
    public void print() {
        log.info("print() from {}", A.class);
    }
}
