package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(LevelController.class)
class LevelControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void should_return_basic_when_run_getLevel() throws Exception {
        MvcResult result = this.mockMvc
                .perform(get("/level"))
                .andReturn();
        assertEquals(result.getResponse().getContentAsString(), "basic");

    }
}