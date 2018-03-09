package com.algorithm.quicksort.QuickSort.pointCut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class PointCuts {

@Pointcut("execution(* com.algorithm.quicksort.QuickSort.controller.*.*(..))")
public void getStartLogger() {}
@Pointcut("execution(* com.algorithm.quicksort.QuickSort.controller.*.*(..))")
public void getEndLogger() {}

}
