package com.algorithm.quicksort.QuickSort.service;

import org.springframework.stereotype.Service;

import com.algorithm.quicksort.QuickSort.performance.TimeTracker;
import com.algorithm.quicksort.QuickSort.utility.GenerateTestData;

@Service
public class QuickSortService {
	private int[] inputList;

	private void sortArrayWithIndex(int startIndex, int endIndex) {
			int i = startIndex - 1;
			int k = endIndex;
			int temp;
			int val = inputList[k];
			for (int j = startIndex; j < k; j++) {
				if (inputList[j] < val) {
					i += 1;
					if (i != j) {
						temp=inputList[i];
						inputList[i]=inputList[j];
						inputList[j]=temp;
					}
				}
			}
			i += 1;
			if (i != k) 
			{temp = inputList[k] ;
			inputList[k] = inputList[i];
			inputList[i] = temp;}
			if (i - 1 > startIndex)
				sortArrayWithIndex(startIndex, i - 1);
			if (endIndex > i + 1)
				sortArrayWithIndex(i + 1, endIndex);

	}

	@TimeTracker
	public int[] getSortedResults(int[] inputList) {
		this.inputList = inputList;
		if(inputList.length>1)
		sortArrayWithIndex(0, inputList.length - 1);
		return inputList;
	}



}
