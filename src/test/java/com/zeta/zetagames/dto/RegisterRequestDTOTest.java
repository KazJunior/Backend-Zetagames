package com.zeta.zetagames.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RegisterRequestDTOTest {

    @Test
    void testRegisterRequestDTO() {
        String expectedName = "Juninho";
        String expectedEmail = "juninho@gmail.com";
        String expectedPassword = "password123";

        RegisterRequestDTO registerRequestDTO = new RegisterRequestDTO(expectedName, expectedEmail, expectedPassword);

        assertEquals(expectedName, registerRequestDTO.name(), "Nome deve ser o mesmo");
        assertEquals(expectedEmail, registerRequestDTO.email(), "Email deve ser o mesmo");
        assertEquals(expectedPassword, registerRequestDTO.password(), "Senha deve ser a mesma");
    }
}
