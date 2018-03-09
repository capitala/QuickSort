package com.algorithm.quicksort.QuickSort.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algorithm.quicksort.QuickSort.utility.GenerateTestData;
@Service
public class AlgoPerformanceService {
	@Autowired 
	private QuickSortService quickSortService;

	public int[][][] getDemoResults(int testCases, int n) {
		GenerateTestData t=new GenerateTestData(n);
		int[][][] results=new int[testCases][2][n];
		for(int i=0;i<testCases;i++)
		{
			int[] input=t.getTestData();
			int[] output=quickSortService.getSortedResults(input);
			results[i]=new int[][] {input,output};
		}
		// TODO Auto-generated method stub
		return results;
	}

}
