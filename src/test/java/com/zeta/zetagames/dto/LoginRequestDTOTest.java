package com.zeta.zetagames.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LoginRequestDTOTest {

    @Test
    void testLoginRequestDTO() {
        String expectedEmail = "juninho@gmail.com";
        String expectedPassword = "password123";

        LoginRequestDTO loginRequestDTO = new LoginRequestDTO(expectedEmail, expectedPassword);

        assertEquals(expectedEmail, loginRequestDTO.email(), "Email deve ser o mesmo");
        assertEquals(expectedPassword, loginRequestDTO.password(), "Password deve ser o mesmo");
    }

    @Test
    void testToString() {
        String expectedEmail = "juninho@gmail.com";
        String expectedPassword = "password123";

        LoginRequestDTO loginRequestDTO = new LoginRequestDTO(expectedEmail, expectedPassword);

        String expectedString = "LoginRequestDTO[email=juninho@gmail.com, password=password123]";
        assertEquals(expectedString, loginRequestDTO.toString(), "toString deve retornar o formato correto");
    }

    @Test
    void testEqualsAndHashCode() {
        String email = "juninho@gmail.com";
        String password = "password123";

        LoginRequestDTO loginRequestDTO1 = new LoginRequestDTO(email, password);
        LoginRequestDTO loginRequestDTO2 = new LoginRequestDTO(email, password);

        assertEquals(loginRequestDTO1, loginRequestDTO2, "Objects devem ser iguais");

        assertEquals(loginRequestDTO1.hashCode(), loginRequestDTO2.hashCode(), "HashCodes deve ser igual");
    }
}
