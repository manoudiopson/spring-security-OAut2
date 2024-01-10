package com.example.springsecurityoauth2;

import com.example.springsecurityoauth2.web.LoginController;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringSecurityOauth2ApplicationTests {
    @Autowired
    private LoginController controller;
    @Test
    void contextLoads() {
        assertThat(controller).isNotNull();
    }

}
