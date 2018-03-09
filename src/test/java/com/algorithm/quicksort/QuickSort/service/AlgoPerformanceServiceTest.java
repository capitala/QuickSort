package com.algorithm.quicksort.QuickSort.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(AlgoPerformanceService.class)
public class AlgoPerformanceServiceTest {

	@MockBean
	private QuickSortService service;

	@Autowired
	private AlgoPerformanceService algoPerformanceService;

	@Test
	public void getDemoResults() {
		Mockito.when(service.getSortedResults(Mockito.any())).thenReturn(new int[] { 1, 2, 3 });
		int[][][] results = algoPerformanceService.getDemoResults(1, 3);
		assertEquals(results[0].length, 2);
		assertEquals(results[0][0].length, 3);
		assertEquals(results[0][1].length, 3);
	}

}
