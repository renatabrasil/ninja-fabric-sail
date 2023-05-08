package br.com.ninja.controllers.test;


import br.com.ninja.domain.requests.UserRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
//@TestPropertySource(locations = "classpath:application-integrationtests.properties")
@Tag("integration")
class AdministratorControllerIntegrationTests {

    @Autowired
    private MockMvc mvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    void shouldReturnBadRequestWhenCreateUser() throws Exception {
        UserRequest userRequest = UserRequest.builder().build();

        mvc.perform(post("/admin/users").
                        content(mapper.writeValueAsBytes(userRequest))
                        .contentType("application/json"))
                .andExpect(status().isBadRequest());
    }

    @Test
    void verifyCreateUserSuccessfully() throws Exception {
        UserRequest userRequest = UserRequest.builder()
                .name("Renata")
                .username("renatabrasil")
                .token("12312313")
                .build();

        mvc.perform(post("/admin/users").
                        content(mapper.writeValueAsBytes(userRequest))
                        .contentType("application/json"))
                .andExpect(status().isCreated());
    }
}
