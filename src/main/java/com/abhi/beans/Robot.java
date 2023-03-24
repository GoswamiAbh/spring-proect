package com.abhi.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	@Autowired
	private Chip chip;
	
	public Robot() {
		System.out.println("robot:: constructor");
	}
	public void doWork() {
		String type=chip.ChipType();
		if(type.equals("32-bits")) {
			System.out.println("performance is slow");
		}
	}

}
