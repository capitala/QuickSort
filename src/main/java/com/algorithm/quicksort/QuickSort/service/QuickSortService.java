package com.algorithm.quicksort.QuickSort.service;

import org.springframework.stereotype.Service;

import com.algorithm.quicksort.QuickSort.performance.TimeTracker;

@Service
public class QuickSortService {
	private int[] inputList;

	private void sortArrayWithIndex(int startIndex, int endIndex) {
		if (startIndex != endIndex) {
			int i = startIndex - 1;
			int k = endIndex;
			int val = inputList[k];
			for (int j = startIndex; j < k; j++) {
				if (inputList[j] < val) {
					i += 1;
					if (i != j) {
						inputList[i] = inputList[i] + inputList[j];
						inputList[j] = inputList[i] - inputList[j];
						inputList[i] = inputList[i] - inputList[j];
					}
				}
			}
			i += 1;
			inputList[k] = inputList[k] + inputList[i];
			inputList[i] = inputList[k] - inputList[i];
			inputList[k] = inputList[k] - inputList[i];
			if (i - 1 > startIndex)
				sortArrayWithIndex(startIndex, i - 1);
			if (endIndex > i + 1)
				sortArrayWithIndex(i + 1, endIndex);
		} else
			return;

	}

	@TimeTracker
	public int[] getSortedResults(int[] inputList) {
		this.inputList = inputList;
		sortArrayWithIndex(0, inputList.length - 1);
		return inputList;
	}

}
