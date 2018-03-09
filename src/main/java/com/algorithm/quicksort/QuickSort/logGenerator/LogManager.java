package com.algorithm.quicksort.QuickSort.logGenerator;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LogManager {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Before("com.algorithm.quicksort.QuickSort.pointCut.PointCuts.getStartLogger()")
	public void beforeMethod(JoinPoint joinPoint) {
		logger.info("In the {}",joinPoint);
	}
    @AfterReturning(value="com.algorithm.quicksort.QuickSort.pointCut.PointCuts.getEndLogger()" ,returning="result")
    public void afterMethod(JoinPoint joinPoint,Object result)
    {
    	logger.info("Completed the {} with {} result",joinPoint,result);
    }
    @AfterThrowing("com.algorithm.quicksort.QuickSort.pointCut.PointCuts.getEndLogger()")
    public void afterThrowing(JoinPoint joinPoint) {
    	logger.info("Got exception in {}",joinPoint);
    }
	public LogManager() {
		// TODO Auto-generated constructor stub
	}

}
