package com.algorithm.quicksort.QuickSort.service;

import org.springframework.stereotype.Service;

import com.algorithm.quicksort.QuickSort.performance.TimeTracker;

@Service
public class QuickSortService {
	private int[] inputList;
	
	private void sortArrayWithIndex(int startIndex,int endIndex) {
		int i=startIndex-1;
	        for(int k=endIndex;k>startIndex;k--) {
	    		int j=startIndex;
	        	int val=inputList[k];
	        	for(;j<k;j++)
	        	{
	        		if(inputList[j]<val)
	        		{i+=1;
	        		inputList[i]=inputList[i]+inputList[j];
	        		inputList[j]=inputList[i]-inputList[j];
	        		inputList[i]=inputList[i]-inputList[j];
	        		}
	        	}
	        	i+=1;
	    		inputList[k]=inputList[k]+inputList[i];
	    		inputList[i]=inputList[k]-inputList[i];
	    		inputList[k]=inputList[k]-inputList[i];
	        	
	        }
		
	}

@TimeTracker
	public int[] getSortedResults(int[] inputList) {
	this.inputList=inputList;
	sortArrayWithIndex(0,inputList.length-1);
	return inputList;
}

}
