package com.algorithm.quicksort.QuickSort.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algorithm.quicksort.QuickSort.service.QuickSortService;

@Controller
public class AlgorithmController {
	@Autowired
	private QuickSortService service;

	@ResponseBody
	@RequestMapping("/quickSort")
	public int[] getQuickSortResults(@RequestParam("list") int[] list) {
		return service.getSortedResults(list);
	}

}
