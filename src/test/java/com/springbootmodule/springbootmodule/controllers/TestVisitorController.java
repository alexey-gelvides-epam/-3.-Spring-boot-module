package com.springbootmodule.springbootmodule.controllers;

import com.springbootmodule.springbootmodule.services.GuestService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles(profiles = "test")
public class TestVisitorController {
    @MockBean
    GuestService guestService;

    @Test
    public void getUserTestWasReturnedUser(){

    }
}
