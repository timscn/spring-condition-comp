package com.home;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
class B implements Process {
    B() {
        log.info("B");
    }

    @Override
    public void print() {
        log.info("print() from {}", B.class);
    }
}
