package com.algorithm.quicksort.QuickSort.service;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(QuickSortService.class)
public class QuickSortServiceTest {
@Autowired
private QuickSortService  service;
@Test
public void getSortedResultsTest() {
	int[] results=service.getSortedResults(new int[] {1,4,3,5,6,2});
	assertArrayEquals(new int[] {1,2,3,4,5,6},results );
}

}
