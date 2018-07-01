package com.webapp.App;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppApplicationTests.class)
@WebAppConfiguration
public class AppApplicationTests {
	
	private static final String CONTENT_TYPE = "application.json;charset=UTF-8";

	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	public void setup() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		
	}
	
	@Test
	public void whenCreateEmployee_thenOk() throws Exception {
		System.out.println("Tested");
		
		/*String employeeJson = "{\"name\":\"john\"}";
		this.mockMvc.perform(post("/employees").contentType(CONTENT_TYPE).content(employeeJson)).andExpect(status().isCreated());
	    this.mockMvc.perform(get("/employees")).andExpect(status().isOk()).andExpect(content().contentType(CONTENT_TYPE)).andExpect(jsonPath("$",hasSize(2))).andExpect(jsonPath("$[0].name",is("ana"))).andExpect(jsonPath("$[1].name",is("john")));*/
	}

}
