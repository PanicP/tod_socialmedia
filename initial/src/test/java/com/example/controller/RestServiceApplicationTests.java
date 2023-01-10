package com.example.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class RestServiceApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void noParamGreetingShouldReturnDefaultMessage() throws Exception {

		this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$.content").value("Hello, World!"));
	}

	@Test
	public void paramGreetingShouldReturnTailoredMessage() throws Exception {

		this.mockMvc.perform(get("/greeting").param("name", "Spring Community"))
				.andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$.content").value("Hello, Spring Community!"));
	}

	@Test
	public void registerSuccess() throws Exception {

		this.mockMvc.perform(get("/register")).andDo(print()).andExpect(status().isOk());
		// .andExpect(jsonPath("$.content").value("Hello, World!"));
	}

	@Test
	@Disabled
	public void registerFailed() throws Exception {

		// this.mockMvc.perform(get("/register")).andDo(print()).andExpect(not((status().isOk()));
		// .andExpect(jsonPath("$.content").value("Hello, World!"));
	}

	@Test
	public void getPostSuccess() throws Exception {

		this.mockMvc
				.perform(get("/user/cb74bfe9-8a3b-4f8e-b737-d6b04d439984/post/cb74bfe9-8a3b-4f8e-b737-d6b04d439984"))
				.andDo(print()).andExpect(status().isOk());
	}

	@Test
	// @Disabled
	public void getPostFailedWrongUserId() throws Exception {

		this.mockMvc
				.perform(get("/user/cb74bfe9-8a3b-4f8e-b737/post/cb74bfe9-8a3b-4f8e-b737-d6b04d439984"))
				.andDo(print()).andExpect(status().is4xxClientError());
	}

	@Test
	public void postPostSuccessWrongPostId() throws Exception {

		this.mockMvc
				.perform(post("/user/cb74bfe9-8a3b-4f8e-b737-d6b04d439984/post/cb74bfe9-8a3b-4f8e-b737"))
				.andDo(print()).andExpect(status().is4xxClientError());
	}

	@Test
	public void postPostSuccess() throws Exception {

		this.mockMvc
				.perform(post("/user/cb74bfe9-8a3b-4f8e-b737-d6b04d439984/post/cb74bfe9-8a3b-4f8e-b737-d6b04d439984"))
				.andDo(print()).andExpect(status().isOk());
	}

	@Test
	public void postPostFailedWrongUserId() throws Exception {

		this.mockMvc
				.perform(post("/user/cb74bfe9-8a3b-4f8e-b737/post/cb74bfe9-8a3b-4f8e-b737-d6b04d439984"))
				.andDo(print()).andExpect(status().is4xxClientError());
	}

	@Test
	public void postPostFailedWrongPostId() throws Exception {

		this.mockMvc
				.perform(post("/user/cb74bfe9-8a3b-4f8e-b737-d6b04d439984/post/cb74bfe9-8a3b-4f8e-b737"))
				.andDo(print()).andExpect(status().is4xxClientError());
	}

	@Test
	public void putPostSuccess() throws Exception {

		this.mockMvc
				.perform(put("/user/cb74bfe9-8a3b-4f8e-b737-d6b04d439984/post/cb74bfe9-8a3b-4f8e-b737-d6b04d439984"))
				.andDo(print()).andExpect(status().isOk());
	}

	@Test
	public void putPostFailedWrongUserId() throws Exception {

		this.mockMvc
				.perform(put("/user/cb74bfe9-8a3b-4f8e-b737/post/cb74bfe9-8a3b-4f8e-b737-d6b04d439984"))
				.andDo(print()).andExpect(status().is4xxClientError());
	}

	@Test
	public void putPostFailedWrongPostId() throws Exception {

		this.mockMvc
				.perform(put("/user/cb74bfe9-8a3b-4f8e-b737-d6b04d439984/post/cb74bfe9-8a3b-4f8e-b737"))
				.andDo(print()).andExpect(status().is4xxClientError());
	}

	@Test
	public void deletePostSuccess() throws Exception {

		this.mockMvc
				.perform(delete("/user/cb74bfe9-8a3b-4f8e-b737-d6b04d439984/post/cb74bfe9-8a3b-4f8e-b737-d6b04d439984"))
				.andDo(print()).andExpect(status().isOk());
	}

	@Test
	public void deletePostFailedWrongUserId() throws Exception {

		this.mockMvc
				.perform(put("/user/cb74bfe9-8a3b-4f8e-b737/post/cb74bfe9-8a3b-4f8e-b737-d6b04d439984"))
				.andDo(print()).andExpect(status().is4xxClientError());
	}

	@Test
	public void deletePostFailedWrongPostId() throws Exception {

		this.mockMvc
				.perform(put("/user/cb74bfe9-8a3b-4f8e-b737-d6b04d439984/post/cb74bfe9-8a3b-4f8e-b737"))
				.andDo(print()).andExpect(status().is4xxClientError());
	}

}
