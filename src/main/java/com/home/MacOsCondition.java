package com.home;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Profile;
import org.springframework.core.type.AnnotatedTypeMetadata;

@Profile("Mac")
@Slf4j
public class MacOsCondition implements Condition, Process {

    public MacOsCondition() {
        log.info("Mac");
    }

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return context.getEnvironment().getProperty("os.name").contains("Mac OS X");
    }
}