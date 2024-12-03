package com.zeta.zetagames.domain.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
    }

    @Test
    public void testUserSettersAndGetters() {
        user.setId("123e4567-e89b-12d3-a456-426614174000");
        user.setName("Juninho");
        user.setEmail("juninho@gmail.com");
        user.setPassword("password123");

        assertEquals("123e4567-e89b-12d3-a456-426614174000", user.getId());
        assertEquals("Juninho", user.getName());
        assertEquals("juninho@gmail.com", user.getEmail());
        assertEquals("password123", user.getPassword());
    }

    @Test
    public void testUserConstructor() {
        User newUser = new User("123e4567-e89b-12d3-a456-426614174000", "Juninho", "juninho@gmail.com", "1234");

        assertEquals("123e4567-e89b-12d3-a456-426614174000", newUser.getId());
        assertEquals("Juninho", newUser.getName());
        assertEquals("juninho@gmail.com", newUser.getEmail());
        assertEquals("1234", newUser.getPassword());
    }

    @Test
    public void testDefaultConstructor() {
        User defaultUser = new User();

        assertNull(defaultUser.getId());
        assertNull(defaultUser.getName());
        assertNull(defaultUser.getEmail());
        assertNull(defaultUser.getPassword());
    }
}
