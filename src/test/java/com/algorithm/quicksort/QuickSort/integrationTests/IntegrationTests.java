package com.algorithm.quicksort.QuickSort.integrationTests;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.algorithm.quicksort.QuickSort.App;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = App.class)
@AutoConfigureMockMvc
public class IntegrationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void quickSortIntegrationTest() throws Exception {
		mockMvc.perform(get("/quickSort?list=4,3,6,5,1,2")).andExpect(status().isOk())
				.andExpect(content().string("[1,2,3,4,5,6]"));
	}

}
