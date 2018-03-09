package com.algorithm.quicksort.QuickSort.utility;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GenerateTestData {
    int range;
	public GenerateTestData(int n) {
		this.range=n;
		// TODO Auto-generated constructor stub
	}

   public int[] getTestData() {
	   int array[]=new int[range];
	  List<Integer> result=IntStream.range(1, range+1).boxed().collect(Collectors.toList());
	 Collections.shuffle(result);
	 for(int i=0;i<result.size();i++)
		 array[i]=result.get(i);
	 return array;
	   
   }
}
