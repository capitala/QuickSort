package com.algorithm.quicksort.QuickSort.performance;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceMonitor {

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
	System.out.println(joinPoint+" takes  in milisec" +(System.currentTimeMillis()-startTime));
	return result;
}

}
