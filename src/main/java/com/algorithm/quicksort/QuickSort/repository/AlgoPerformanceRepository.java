package com.algorithm.quicksort.QuickSort.repository;

import org.springframework.data.repository.CrudRepository;

import com.algorithm.quicksort.QuickSort.entity.SortingAlgoEntity;

public interface AlgoPerformanceRepository extends CrudRepository<SortingAlgoEntity, Long>{

}
