package com.abhi.beans;

import org.springframework.stereotype.Component;

@Component
public class Chip {
	public Chip() {
		System.out.println("chip :: constructor");
	}
	public String ChipType() {
		return "32-bits";
	}

}
