package com.algorithm.quicksort.QuickSort.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SortingAlgoEntity {
	public SortingAlgoEntity(String input,String algorithm,long time) {
		this.input=input;
		this.algorithm=algorithm;
		this.timeTaken=time;
	}

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
private String input;

private String algorithm;

private long timeTaken;

public String getInput() {
	return input;
}

public void setInput(String input) {
	this.input = input;
}


public String getAlgorithm() {
	return algorithm;
}

public void setAlgorithm(String algorithm) {
	this.algorithm = algorithm;
}

public long getTimeTaken() {
	return timeTaken;
}

public void setTimeTaken(long timeTaken) {
	this.timeTaken = timeTaken;
}

}
