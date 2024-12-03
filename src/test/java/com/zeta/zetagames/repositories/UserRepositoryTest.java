package com.zeta.zetagames.repositories;

import com.zeta.zetagames.domain.user.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserRepositoryTest {

    @Mock
    private UserRepository userRepository;

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User("123e4567-e89b-12d3-a456-426614174000", "Juninho", "juninho@gmail.com", "password123");
    }

    @Test
    public void testFindByEmail() {
        when(userRepository.findByEmail("juninho@gmail.com")).thenReturn(Optional.of(user));

        Optional<User> foundUser = userRepository.findByEmail("juninho@gmail.com");

        assertTrue(foundUser.isPresent());
        assertEquals("Juninho", foundUser.get().getName());
        assertEquals("juninho@gmail.com", foundUser.get().getEmail());

        verify(userRepository, times(1)).findByEmail("juninho@gmail.com");
    }

    @Test
    public void testFindByEmailNotFound() {
        when(userRepository.findByEmail("juninho@gmail.com")).thenReturn(Optional.empty());

        Optional<User> foundUser = userRepository.findByEmail("juninho@gmail.com");

        assertFalse(foundUser.isPresent());

        verify(userRepository, times(1)).findByEmail("juninho@gmail.com");
    }

    @Test
    public void testSaveUser() {
        when(userRepository.save(user)).thenReturn(user);

        User savedUser = userRepository.save(user);

        assertEquals("Juninho", savedUser.getName());
        assertEquals("juninho@gmail.com", savedUser.getEmail());

        verify(userRepository, times(1)).save(user);
    }
}
