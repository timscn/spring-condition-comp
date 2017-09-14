package com.home;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class Config {

    @Bean(name = "process")
    @Conditional(WindowsCondition.class)
    public Process A() {
        return new A();
    }

    @Bean(name = "process")
    @Conditional(LinuxCondition.class)
    public Process B() {
        return new B();
    }

    @Bean
    @ConditionalOnMissingBean(String.class)
    public String printString() {
        String string = "testMeOrNot";
        log.info(string);
        return string;
    }
}
