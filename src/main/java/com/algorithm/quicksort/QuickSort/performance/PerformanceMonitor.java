package com.algorithm.quicksort.QuickSort.performance;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.algorithm.quicksort.QuickSort.entity.SortingAlgoEntity;
import com.algorithm.quicksort.QuickSort.repository.AlgoPerformanceRepository;

@Aspect
@Configuration
public class PerformanceMonitor {
	@Autowired
	private AlgoPerformanceRepository repo;

@Around("@annotation(TimeTracker)")
public int[] around(ProceedingJoinPoint joinPoint) {
	int[] result=null;
	long startTime=System.currentTimeMillis();
	try {
		result=(int[]) joinPoint.proceed();
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	long duration=System.currentTimeMillis()-startTime;
	/*SortingAlgoEntity obj=new SortingAlgoEntity(input,Arrays.toString(result),"QuickSort",duration);*/
	SortingAlgoEntity obj=new SortingAlgoEntity(Integer.toString(result.length),"QuickSort",duration);
	repo.save(obj);
	System.out.println(joinPoint+" takes  in milisec" +duration);
	return result;
}

}
