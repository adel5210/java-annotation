package com.adel.javaannotation;

public class Car {

	@AnnoField
	private String engine;

	@AnnoField
	private String chair;

	@AnnoMethod
	private void carRun(){
		System.out.println("Car running...");
	}

}
