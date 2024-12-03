package com.zeta.zetagames.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResponseDTOTest {

    @Test
    void testResponseDTO() {
        String expectedName = "testUser";
        String expectedToken = "abc123token";

        ResponseDTO responseDTO = new ResponseDTO(expectedName, expectedToken);

        assertEquals(expectedName, responseDTO.name(), "O nome deve ser igual");

        assertEquals(expectedToken, responseDTO.token(), "Token deve ser o mesmo");
    }
}
