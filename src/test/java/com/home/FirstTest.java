package com.home;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
class FirstTest extends MainTest {
    @Test
    @DisplayName("justAssertTrue")
    void main() throws InterruptedException {
        log.info("testMe");
        assertTrue(true);
    }
}
