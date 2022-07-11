package org.sid.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@ExtendWith(SpringExtension.class)
@WebMvcTest(UserServiceImpl.class)
class UserServiceImplintegrationTest {

    @Autowired
    private MockMvc mvc ;

    @Test
    void getUsers() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("api/users");
        MvcResult result = mvc.perform(request).andReturn();
    }
    @Test
    void getGroupes() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("api/groupes");
        MvcResult result = mvc.perform(request).andReturn();
    }
    @Test
    void getPlannings() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("api/plannings");
        MvcResult result = mvc.perform(request).andReturn();
    }
}