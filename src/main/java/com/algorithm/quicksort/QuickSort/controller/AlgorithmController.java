package com.algorithm.quicksort.QuickSort.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algorithm.quicksort.QuickSort.service.AlgoPerformanceService;
import com.algorithm.quicksort.QuickSort.service.QuickSortService;

@Controller
public class AlgorithmController {
	@Autowired
	private QuickSortService service;
	
	@Autowired
	private AlgoPerformanceService algoPerformanceService;
	@ResponseBody
	@RequestMapping("/quickSort")
	public int[] getQuickSortResults(@RequestParam("list") int[] list) {
		return service.getSortedResults(list);
	}
	@RequestMapping("/quickSortDemo/{testCases}/{n}")
	@ResponseBody
	public int[][][] getQuickSortDemoResults(@PathVariable int testCases,@PathVariable int n){
		return  algoPerformanceService.getDemoResults(testCases,n);
	} 

}
