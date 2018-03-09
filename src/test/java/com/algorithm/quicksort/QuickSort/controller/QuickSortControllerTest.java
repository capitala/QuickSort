package com.algorithm.quicksort.QuickSort.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.algorithm.quicksort.QuickSort.service.AlgoPerformanceService;
import com.algorithm.quicksort.QuickSort.service.QuickSortService;

@RunWith(SpringRunner.class)
@WebMvcTest(AlgorithmController.class)
public class QuickSortControllerTest {

@MockBean
private QuickSortService service;

@MockBean
private AlgoPerformanceService algoPerformanceService;

@Autowired
private  MockMvc mockMvc;
@Test
public void quickSortControllerTest() throws Exception {
	Mockito.when(service.getSortedResults(Mockito.eq(new int[] {4,3,6,5,1,2}))).thenReturn(new int[]{1,2,3,4,5});
	mockMvc.perform(get("/quickSort?list=4,3,6,5,1,2")).andExpect(status().isOk()).andExpect(content().string("[1,2,3,4,5]"));
	
}
@Test
public void getQuickSortDemoResultsTest() throws Exception {
	Mockito.when(algoPerformanceService.getDemoResults(1, 3)).thenReturn(new int[][][] {{{1,3,2},{1,2,3}}});
	mockMvc.perform(get("/quickSortDemo/1/3")).andExpect(status().isOk()).andExpect(content().string("[[[1,3,2],[1,2,3]]]"));
}

}
