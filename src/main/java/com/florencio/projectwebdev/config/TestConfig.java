package com.florencio.projectwebdev.config;

import com.florencio.projectwebdev.model.User;
import com.florencio.projectwebdev.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User("Maria Brown", "1234567890", "maria@gmail.com", "988888888");
        User u2 = new User("Alex Green", "0987654321", "alex@gmail.com", "977777777");
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
