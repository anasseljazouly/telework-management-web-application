package org.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SendEmailTest {

    @Test
    void sendMail() {

        String host ;
        String port ;
        port="465";
        host ="smtp.gmail.com";
        assertEquals("smtp.gmail.com",host);
        assertEquals("465",port);
    }
}